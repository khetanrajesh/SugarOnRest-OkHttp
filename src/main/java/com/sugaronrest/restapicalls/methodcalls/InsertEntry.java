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

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sugaronrest.ErrorResponse;
import com.sugaronrest.okHttp.OkHttpClient;
import com.sugaronrest.restapicalls.responses.InsertEntryResponse;
import com.sugaronrest.utils.HttpStatus;
import com.sugaronrest.utils.JsonObjectMapper;

import okhttp3.Response;


public class InsertEntry {

    /**
     * Insert entry [SugarCRM REST method - set_entry].
     *
     *  @param url REST API Url.
     *  @param sessionId Session identifier.
     *  @param moduleName SugarCRM module name.
     *  @param entity The entity object to create.
     *  @param selectFields Selected field list.
     *  @return InsertEntryResponse object.
     */
    public static InsertEntryResponse run(String url, String sessionId, String moduleName, Object entity, List<String> selectFields)  {

        InsertEntryResponse insertEntryResponse = null;
        ErrorResponse errorResponse = null;

        String jsonRequest = new String();
        String jsonResponse = new String();

        ObjectMapper mapper = JsonObjectMapper.getMapper();

        try {
            Map<String, Object> requestData = new LinkedHashMap<String, Object>();
            requestData.put("session", sessionId);
            requestData.put("module_name", moduleName);
            requestData.put("name_value_list", EntityToNameValueList(entity, selectFields));

            String jsonRequestData = mapper.writeValueAsString(requestData);

            Map<String, Object> request = new LinkedHashMap<String, Object>();
            request.put("method", "set_entry");
            request.put("input_type", "json");
            request.put("response_type", "json");
            request.put("rest_data", requestData);

            jsonRequest = mapper.writeValueAsString(request);

            request.put("rest_data", jsonRequestData);

            Response response = OkHttpClient.post(url,request);

            if (response == null) {
                insertEntryResponse = new InsertEntryResponse();
                errorResponse = ErrorResponse.format("An error has occurred!", "No data returned.");
                insertEntryResponse.setStatusCode(HttpStatus.BAD_REQUEST.getCode());
                insertEntryResponse.setError(errorResponse);
            } else {

                jsonResponse = response.body().string();

                if (StringUtils.isNotBlank(jsonResponse)) {
                    // First check if we have an error
                    errorResponse = ErrorResponse.fromJson(jsonResponse);
                    if (errorResponse == null) {
                        insertEntryResponse = mapper.readValue(jsonResponse, InsertEntryResponse.class);
                    }
                }

                if (insertEntryResponse == null) {
                    insertEntryResponse = new InsertEntryResponse();
                    insertEntryResponse.setError(errorResponse);

                    insertEntryResponse.setStatusCode(HttpStatus.OK.getCode());
                    if (errorResponse != null) {
                        insertEntryResponse.setStatusCode(errorResponse.getStatusCode());
                    }
                } else {
                    insertEntryResponse.setStatusCode(HttpStatus.OK.getCode());
                }
            }
        }
        catch (Exception exception) {
            insertEntryResponse = new InsertEntryResponse();
            errorResponse = ErrorResponse.format(exception, exception.getMessage());
            insertEntryResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.getCode());
            errorResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.getCode());
            insertEntryResponse.setError(errorResponse);
        }

        insertEntryResponse.setJsonRawRequest(jsonRequest);
        insertEntryResponse.setJsonRawResponse(jsonResponse);

        return insertEntryResponse;
    }

    /**
     * Formats and return selected fields.
     *
     * @param entity Java object to update.
     * @param selectFields Selected fields.
     * @return Formatted selected fields.
     */
    private static Map<String, Object> EntityToNameValueList(Object entity, List<String> selectFields) {
        if (entity == null) {
            return null;
        }

        ObjectMapper mapper = JsonObjectMapper.getMapper();
        Map<String, Object> tempEntity = mapper.convertValue(entity, Map.class);

        if (tempEntity == null) {
            return null;
        }

        boolean useSelectedFields = (selectFields != null) && (selectFields.size() > 0);
        Map<String, Object> mappedEntity = new HashMap<String, Object>();
        for (Map.Entry<String, Object> mapEntry : tempEntity.entrySet()) {

            String key = mapEntry.getKey();
            if (useSelectedFields) {
                if (!selectFields.contains(key)) {
                    continue;
                }
            }

            if (key.equalsIgnoreCase("id")) {
                continue;
            }

            Map<String, Object> namevalueDic = new HashMap<String, Object>();
            namevalueDic.put("name", key);
            namevalueDic.put("value", mapEntry.getValue());

            mappedEntity.put(key, namevalueDic);
        }

        return mappedEntity;
    }
}
