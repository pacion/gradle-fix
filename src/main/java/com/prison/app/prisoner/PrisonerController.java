package com.prison.app.prisoner;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrisonerController {

    @PostMapping
    String fetchPrisoner() {
        return "prisoner";
    }
}
