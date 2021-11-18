package ru.ibs.spring.test.resttemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException {

        ApplicationContext context = new AnnotationConfigApplicationContext(RestTemplateJavaConfig.class);
        final RestTemplate restTemplate = context.getBean(RestTemplate.class);

     //   URI uri = new URI("http://localhost:8099/SpringWeb/show");
        URI uri = new URI("http://localhost:8099/SpringWeb/rest/post");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.TEXT_HTML);
        String postBody = "{\"input\" : 1}";

        HttpEntity<String> request = new HttpEntity<>(postBody, httpHeaders);

        final ResponseEntity<String> getRequest = restTemplate.postForEntity(uri, postBody, String.class);
        getRequest.getBody();


  //      final ResponseEntity<String> responseEntity = restTemplate.postForEntity(uri, request, String.class);
 //       final String body = responseEntity.getBody();


    }
}
