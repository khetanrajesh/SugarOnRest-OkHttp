package com.sugaronrest.okHttp;

import java.io.IOException;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by rajesh on 12/8/17.
 */

public class OkHttpClient {


    public static Response post(String url, Map<String, Object> request) throws IOException {
        okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
        RequestBody requestBody = getBodyBuilder(request).build();
        Request okHttpRequest = new Request.Builder()
                .url(url)
                .method("POST", RequestBody.create(null, new byte[0]))
                .post(requestBody)
                .build();
        return client.newCall(okHttpRequest).execute();
    }


    private static MultipartBody.Builder getBodyBuilder(Map<String, Object> request) {

        MultipartBody.Builder body = new MultipartBody.Builder();
        body.setType(MultipartBody.FORM);
        for (Map.Entry<String, Object> param : request.entrySet()) {
            body.addFormDataPart(param.getKey(), (param.getValue() == null) ? "" : param.getValue().toString());
        }

        return body;
    }

}
