package com.jackstewart.jwtdemo;

import com.jackstewart.jwtdemo.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtDemoApplication.class, args);
    }


    // send GET request to http://localhost:8080/test to see a 401

    // send POST request to http://localhost:8080/token with this JSON to receive JWT

//	{
//		"username": "Jstewart",
//		"password": "password"
//	}

    // send GET request to http://localhost:8080/test with the JWT from the previous request under the authorization tab (Bearer Token) to see protected resource

}
