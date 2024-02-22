package com.rehan.ch11gettingfriend.proxy;

import com.rehan.ch11gettingfriend.model.Friend;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="friends",url="${friends-api}")
public interface FriendProxy {
    @PostMapping("/best")
    public Friend getFriend(@RequestHeader String requestId);
}
