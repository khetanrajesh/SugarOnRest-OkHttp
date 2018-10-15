/**
 MIT License

 Copyright (c) 2017 Kola Oyewumi

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

package com.sugaronrest.restapicalls.methodcalls;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sugaronrest.ErrorResponse;
import com.sugaronrest.okHttp.OkHttpClient;
import com.sugaronrest.restapicalls.responses.ReadAvailableModulesResponse;
import com.sugaronrest.utils.HttpStatus;
import com.sugaronrest.utils.JsonObjectMapper;

import okhttp3.Response;


public class GetAvailableModules {

    /**
     *  Gets available module names [SugarCRM REST method - get_available_modules].
     *
     * @param url REST API Url.
     * @param sessionId Session identifier.
     * @return ReadAvailableModulesResponse object.
     * @throws Exception
     */
    public static ReadAvailableModulesResponse run(String url, String sessionId) throws Exception {

        ReadAvailableModulesResponse readAvailableModulesResponse = new ReadAvailableModulesResponse();
        ErrorResponse errorResponse = null;

        ObjectMapper mapper = JsonObjectMapper.getMapper();
        String jsonRequest = new String();
        String jsonResponse = new String();

        try {
            Map<String, Object> requestData = new LinkedHashMap<String, Object>();
            requestData.put("session", sessionId);
            requestData.put("filter", "all");

            String jsonRequestData = mapper.writeValueAsString(requestData);

            Map<String, Object> request = new LinkedHashMap<String, Object>();
            request.put("method", "get_available_modules");
            request.put("input_type", "json");
            request.put("response_type", "json");
            request.put("rest_data", requestData);

            jsonRequest = mapper.writeValueAsString(request);

            request.put("rest_data", jsonRequestData);

            Response response = OkHttpClient.post(url,request);

            if (response == null) {
                readAvailableModulesResponse = new ReadAvailableModulesResponse();
                errorResponse = ErrorResponse.format("An error has occurred!", "No data returned.");
                readAvailableModulesResponse.setStatusCode(HttpStatus.BAD_REQUEST.getCode());
                readAvailableModulesResponse.setError(errorResponse);
            } else {

                jsonResponse = response.body().string();

                if (StringUtils.isNotBlank(jsonResponse)) {
                    // First check if we have an error
                    errorResponse = ErrorResponse.fromJson(jsonResponse);
                    if (errorResponse == null) {
                        readAvailableModulesResponse = mapper.readValue(jsonResponse, ReadAvailableModulesResponse.class);
                    }
                }

                if (readAvailableModulesResponse == null) {
                    readAvailableModulesResponse = new ReadAvailableModulesResponse();
                    readAvailableModulesResponse.setError(errorResponse);

                    readAvailableModulesResponse.setStatusCode(HttpStatus.OK.getCode());
                    if (errorResponse != null) {
                        readAvailableModulesResponse.setStatusCode(errorResponse.getStatusCode());
                    }
                } else {
                    readAvailableModulesResponse.setStatusCode(HttpStatus.OK.getCode());
                }
            }
        }
        catch (Exception exception) {
            readAvailableModulesResponse = new ReadAvailableModulesResponse();
            errorResponse = ErrorResponse.format(exception, exception.getMessage());
            readAvailableModulesResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.getCode());
            errorResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.getCode());
            readAvailableModulesResponse.setError(errorResponse);
        }

        readAvailableModulesResponse.setJsonRawRequest(jsonRequest);
        readAvailableModulesResponse.setJsonRawResponse(jsonResponse);

        return readAvailableModulesResponse;
    }
}
