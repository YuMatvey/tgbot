package ru.skillfactorydemo.tgbot.controllers;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CurrencyControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void TestWhenAskedAboutAllCurrencies() throws Exception {
        mockMvc.perform(get("/getCurrencies"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}