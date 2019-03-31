package com.example.demo;

import com.example.demo.reqbody.ReqBody;
import com.example.demo.responsebody.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @PostMapping("/add")
    public @ResponseBody
    Response
    addUser(@RequestBody ReqBody requestBody){
        Response responseBody = new Response();
        responseBody.setErrorCode("0000");
        responseBody.setUserId(UUID.randomUUID().toString());
        return responseBody;
    }

}
