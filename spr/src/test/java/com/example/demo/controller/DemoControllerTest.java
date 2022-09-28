package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoControllerTest {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void helloTest() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/hello", String.class);
        Mockito.eq(response.getBody().equals("Hello mate, this is Springboot Demo!"));
    }

    @Test
    public void hiTest() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/hi", String.class);
        Mockito.eq(response.getBody().equals("Hi mate, this is Springboot Demo!"));
    }
}
