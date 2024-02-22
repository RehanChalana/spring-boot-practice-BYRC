package com.rehan.ch11friends.controller;

import com.rehan.ch11friends.model.Friend;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class FriendController {

    private Logger logger = Logger.getLogger(FriendController.class.getName());
    @PostMapping("/best")
    public ResponseEntity<Friend> best(@RequestHeader String requestId) {
        Friend friend = new Friend();
        friend.setOnline(true);
        friend.setName("marilyn");
        friend.setAge(18);
        logger.info("received request with request id + "+ requestId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("requestId",requestId)
                .body(friend);
    }

}
