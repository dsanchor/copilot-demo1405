package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @GetMapping("/api/reverse")
    public String reverse(@RequestParam String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @GetMapping("/api/disemvowel")
    public String disemvowel(@RequestParam String text) {
        return text.replaceAll("[aeiouAEIOU]", "");
    }
}