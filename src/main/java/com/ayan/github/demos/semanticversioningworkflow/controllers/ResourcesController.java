package com.ayan.github.demos.semanticversioningworkflow.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
public class ResourcesController {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("some resource");
    }

}
