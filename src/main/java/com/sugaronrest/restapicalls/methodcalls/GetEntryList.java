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
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sugaronrest.ErrorResponse;
import com.sugaronrest.okHttp.OkHttpClient;
import com.sugaronrest.restapicalls.responses.ReadEntryListResponse;
import com.sugaronrest.utils.HttpStatus;
import com.sugaronrest.utils.JsonObjectMapper;

import okhttp3.Response;


public class GetEntryList {

    /**
     * Gets entries [SugarCRM REST method - get_entry_list].
     *
     * @param url REST API Url.
     * @param sessionId Session identifier.
     * @param moduleName SugarCRM module name.
     * @param selectFields Selected field list.
     * @param queryString Formatted query string.
     * @param maxCountResult Maximum number of entries to return.
     * @return ReadEntryListResponse object.
     * @throws Exception
     */
    public static ReadEntryListResponse run(String url, String sessionId, String moduleName, List<String> selectFields, String queryString, int maxCountResult) throws Exception {

        ReadEntryListResponse readEntryListResponse = null;
        ErrorResponse errorResponse = null;

        String jsonRequest = new String();
        String jsonResponse = new String();

        ObjectMapper mapper = JsonObjectMapper.getMapper();

        try {
            Map<String, Object> requestData = new LinkedHashMap<String, Object>();
            requestData.put("session", sessionId);
            requestData.put("module_name", moduleName);
            requestData.put("query", queryString);
            requestData.put("order_by", StringUtils.EMPTY);
            requestData.put("offset", 0);
            requestData.put("select_fields", selectFields);
            requestData.put("link_name_to_fields_array", StringUtils.EMPTY);
            requestData.put("max_results", maxCountResult);
            requestData.put("deleted", 0);
            requestData.put("favorites", false);

            String jsonRequestData = mapper.writeValueAsString(requestData);

            Map<String, Object> request = new LinkedHashMap<String, Object>();
            request.put("method", "get_entry_list");
            request.put("input_type", "json");
            request.put("response_type", "json");
            request.put("rest_data", requestData);

            jsonRequest = mapper.writeValueAsString(request);

            request.put("rest_data", jsonRequestData);

            Response response = OkHttpClient.post(url,request);

            if (response == null) {
                readEntryListResponse = new ReadEntryListResponse();
                errorResponse = ErrorResponse.format("An error has occurred!", "No data returned.");
                readEntryListResponse.setStatusCode(HttpStatus.BAD_REQUEST.getCode());
                readEntryListResponse.setError(errorResponse);
            } else {

                jsonResponse = response.body().string();

                if (StringUtils.isNotBlank(jsonResponse)) {
                    // First check if we have an error
                    errorResponse = ErrorResponse.fromJson(jsonResponse);
                    if (errorResponse == null) {
                        readEntryListResponse = mapper.readValue(jsonResponse, ReadEntryListResponse.class);
                    }
                }

                if (readEntryListResponse == null) {
                    readEntryListResponse = new ReadEntryListResponse();
                    readEntryListResponse.setError(errorResponse);

                    readEntryListResponse.setStatusCode(HttpStatus.OK.getCode());
                    if (errorResponse != null) {
                        readEntryListResponse.setStatusCode(errorResponse.getStatusCode());
                    }
                } else {
                    readEntryListResponse.setStatusCode(HttpStatus.OK.getCode());
                }
            }
        }
        catch (Exception exception) {
            readEntryListResponse = new ReadEntryListResponse();
            errorResponse = ErrorResponse.format(exception, exception.getMessage());
            readEntryListResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.getCode());
            errorResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.getCode());
            readEntryListResponse.setError(errorResponse);
        }

        readEntryListResponse.setJsonRawRequest(jsonRequest);
        readEntryListResponse.setJsonRawResponse(jsonResponse);

        return readEntryListResponse;
    }
}
