package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private final Logger log = LoggerFactory.getLogger(TestController.class);
    private static long requestCount = 0;

    @GetMapping("/hello")
    public String greetings() {
        log.info("Total request per session: {}", requestCount++);
        return "App is running! Total request for today: " + requestCount;
    }
}
