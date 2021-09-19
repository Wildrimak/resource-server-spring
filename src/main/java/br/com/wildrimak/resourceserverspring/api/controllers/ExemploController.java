package br.com.wildrimak.resourceserverspring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wildrimak.resourceserverspring.api.responses.ExemploResponse;
import br.com.wildrimak.resourceserverspring.domain.services.ExemploService;

@RestController
@RequestMapping("/exemplos")
public class ExemploController {

    @Autowired
    private ExemploService exemploService;

    @GetMapping
    public List<ExemploResponse> getResponses() {

	return exemploService.getSimulateExemploResponses();

    }

}
