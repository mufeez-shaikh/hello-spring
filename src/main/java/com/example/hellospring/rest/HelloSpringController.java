package com.example.hellospring.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for the app.
 */
@RestController
public class HelloSpringController {


    /**
     * health check
     * @return OK- string value
     */
    @GetMapping("/health")
    public final ResponseEntity<String> health() {
        return ResponseEntity.ok().body("OK");
    }
}
