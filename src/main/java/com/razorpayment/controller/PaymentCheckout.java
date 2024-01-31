package com.razorpayment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentCheckout {
    @GetMapping("/payment")
    public String showPaymentPage(){
        return "payment-request";
    }
}
