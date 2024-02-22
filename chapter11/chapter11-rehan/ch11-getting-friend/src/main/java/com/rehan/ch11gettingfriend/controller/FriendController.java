package com.rehan.ch11gettingfriend.controller;

import com.rehan.ch11gettingfriend.model.Friend;
import com.rehan.ch11gettingfriend.proxy.FriendProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {
    private final FriendProxy friendProxy;

    @Autowired
    public FriendController(FriendProxy friendProxy) {
        this.friendProxy = friendProxy;
    }

    @PostMapping("/friend")
    public Friend getFriend(@RequestHeader String requestId) {
        return friendProxy.getFriend(requestId);
    }
}
