package com.Udemy.app.ws.mobile_app_ws.ui.controller;

import com.Udemy.app.ws.mobile_app_ws.ui.model.request.UserDetailsRequestModel;
import com.Udemy.app.ws.mobile_app_ws.ui.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class Controller {

    @GetMapping
    public String getUser(){
        return "get";
    }

    @PostMapping
    public UserRest CreateUser(@RequestBody UserDetailsRequestModel userDetails){
        return null;
    }


    @PutMapping
    public String UpdateUser(){
        return "update";
    }

    @DeleteMapping
    public String DeleteUser(){
        return "delete";
    }

    
}
