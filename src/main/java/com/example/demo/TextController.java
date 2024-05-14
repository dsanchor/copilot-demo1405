package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @GetMapping("/api/reverse")
    public String reverse(@RequestParam String text) {
        System.out.println("Input: " + text);
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("Output: " + reversedText);
        return reversedText;
    }

    @GetMapping("/api/disemvowel")
    public String disemvowel(@RequestParam String text) {
        System.out.println("Input: " + text);
        String disemvoweledText = text.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Output: " + disemvoweledText);
        return disemvoweledText;
    }

    // operación validacion de un string si es palindromo
    @GetMapping("/api/palindrome")
    public String palindrome(@RequestParam String text) {
        System.out.println("Input: " + text);
        String palindromeText = text;
        String reversedText = new StringBuilder(text).reverse().toString();
        if (palindromeText.equals(reversedText)) {
            System.out.println("Output: " + "Es palindromo");
            return "Es palindromo";
        } else {
            System.out.println("Output: " + "No es palindromo");
            return "No es palindromo";
        }
    }
}