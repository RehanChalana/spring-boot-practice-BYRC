package com.rehan.ch11ex1.proxy;

import com.rehan.ch11ex1.model.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments" , url = "${name.service.url}")
public interface PaymentsProxy {
    @PostMapping("/")
    Payment createPayment(@RequestHeader String requestId, @RequestBody Payment payment);
}
