package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AelloController {
    @RequestMapping("/aello")
    String home() {
        return "Hello ,spring boot!";
    }
}
