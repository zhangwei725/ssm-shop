package com.smart.shop.controller;

import com.smart.shop.utils.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {
    @PostMapping("/")
    public ResponseEntity<String> pay() {
        return null;
    }

}
