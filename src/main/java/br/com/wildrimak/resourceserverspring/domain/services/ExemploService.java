package br.com.wildrimak.resourceserverspring.domain.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.wildrimak.resourceserverspring.api.responses.ExemploResponse;

@Service
public class ExemploService {

    public List<ExemploResponse> getSimulateExemploResponses() {
	
	List<ExemploResponse> exemplos = new ArrayList<>();
	
	ExemploResponse ex1 = new ExemploResponse("ex1", "exemplo 1");
	ExemploResponse ex2 = new ExemploResponse("ex2", "exemplo 2");

	exemplos.add(ex1);
	exemplos.add(ex2);
	
	return exemplos;
    
    }

}
