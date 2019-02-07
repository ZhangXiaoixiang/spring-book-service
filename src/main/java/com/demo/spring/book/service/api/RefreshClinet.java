package com.demo.spring.book.service.api;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * RefreshClinet
 *
 * @author 10905 2019/2/7
 * @version 1.0
 */
public class RefreshClinet {
    public static void main(String[] args) throws IOException {
        //    创建默认的客户端
        CloseableHttpClient httpClient = HttpClients.createDefault();
//        调用post服务
        HttpPost httpPost=new HttpPost("http://localhost:8080/actuator/refresh");
//        获取响应
        CloseableHttpResponse response = httpClient.execute(httpPost);
//        解析响应
        System.out.println("\n\n"+EntityUtils.toString(response.getEntity()));

    }

}
