package com.rehan.ch13ex1.controller;

import com.rehan.ch13ex1.model.Account;
import com.rehan.ch13ex1.model.TransferRequest;
import com.rehan.ch13ex1.service.TransferService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request) {
        transferService.transferMoney(request.getSenderAccountid(), request.getReceiverAccountid(), request.getAmount());
    }

    @GetMapping("/accounts")
    public List<Account> getALlAccounts() {
        return transferService.getAllAccounts();
    }
}
