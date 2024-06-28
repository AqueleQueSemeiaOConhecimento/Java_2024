package com.matheus.demonana.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.demonana.models.Sus;
import com.matheus.demonana.services.SusService;

@RestController
@RequestMapping("sus")
public class susController {
    private SusService susService;

    public susController(SusService susService) {
        this.susService = susService;
    }
    
    @PostMapping
    public ResponseEntity<Sus> createSus(@RequestBody Sus sus) {
        susService.createSus(sus);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Sus>> getSus() {
        return ResponseEntity.ok(susService.getSus());
    }
}
