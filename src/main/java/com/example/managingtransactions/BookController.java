package com.example.managingtransactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired BookingService bookingService;

    @RequestMapping("/book")
    public String save() {
        bookingService.book("good", "nice");
        return "success";
    }
}
