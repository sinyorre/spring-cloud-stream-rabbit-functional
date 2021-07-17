package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final StreamBridge streamBridge;

    @GetMapping("/producer")
    public ResponseEntity<String> values() {
        streamBridge.send("messageTopic", "message");
        return ResponseEntity.ok("ok");
    }
}
