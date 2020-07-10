package com.smart.shop.controller;

import com.smart.shop.utils.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @GetMapping("ex")
    public ResponseEntity<String> testEx() {
        int i = 10 / 0;
        return ResponseEntity.success("测试异常");
    }
}
