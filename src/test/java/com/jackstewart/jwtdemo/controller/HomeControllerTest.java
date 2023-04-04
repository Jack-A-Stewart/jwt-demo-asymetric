//package com.jackstewart.jwtdemo.controller;
//
//import com.jackstewart.jwtdemo.service.TokenService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest({HomeControllerTest.class, AuthController.class})
//@Import({SecurityException.class, TokenService.class})
//class HomeControllerTest {
//
//    @Autowired
//    MockMvc mvc;
//
//    @Test
//    void rootWhenUnauthenticatedThen401() throws Exception {
//        this.mvc.perform(get("/test"))
//                .andExpect(status().isUnauthorized());
//    }
//
//    @Test
//    void rootWhenAuthenticatedThenSaysHelloUser() throws Exception {
//        MvcResult mvcResult = this.mvc.perform(MockMvcRequestBuilders.post("/token")
//                        .with(httpBasic("Jstewart", "password")))
//                .andExpect(status().isOk())
//                .andReturn();
//
//        String token = mvcResult.getResponse().getContentAsString();
//
//        this.mvc.perform(get("/test")
//                        .header("Authorization", "Bearer " + token))
//                .andExpect(content().string("Hello, Jstewart"));
//    }
//
//    @Test
//    @WithMockUser
//    public void rootWithMockUserStatusIsOk() throws Exception {
//        this.mvc.perform(get("/test")).andExpect(status().isOk());
//    }
//
//}