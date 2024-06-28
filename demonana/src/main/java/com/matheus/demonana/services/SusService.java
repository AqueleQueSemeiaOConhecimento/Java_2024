package com.matheus.demonana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.matheus.demonana.models.Sus;
import com.matheus.demonana.repositories.SusRepository;

@Service
public class SusService {
    @Autowired
    private SusRepository susRepository;

    public void createSus(Sus sus) {
        susRepository.save(sus);
    }

    public List<Sus> getSus() {
        return susRepository.findAll();
    }
}
