package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(TextController.class)
public class TextControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testReverse() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/reverse")
                .param("text", "Hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("olleH"));
    }

    @Test
    public void testReverseWithEmptyText() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/reverse")
                .param("text", ""))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(""));
    }

    // test para operacion reverse con caracteres especiales
    @Test
    public void testReverseWithSpecialCharacters() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/reverse")
                .param("text", "Hello World!"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("!dlroW olleH"));
    }

    @Test
    public void testDisemvowel() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/disemvowel")
                .param("text", "Hello World"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hll Wrld"));
    }

    @Test
    public void testPalindrome() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/palindrome")
                .param("text", "racecar"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Es palindromo"));
    }
}
