package com.bochra.secondService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/second")
@RequiredArgsConstructor
public class SecondController {
    @GetMapping("/get")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Here is your second service");
    }
}



