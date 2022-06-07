package br.gov.sp.etec.apisolicitacoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.apisolicitacoes.model.SolicitacaoDto;
import br.gov.sp.etec.apisolicitacoes.service.SolicitacaoService;

@RestController
public class SolicitacaoController {
	
	@Autowired
	SolicitacaoService service;
	
	@PostMapping("adicionar")
	public ResponseEntity<SolicitacaoDto> adicionarSolicitacao(@RequestBody SolicitacaoDto solicitacao){
		
		SolicitacaoDto retorno = service.adicionar(solicitacao);
		
		return ResponseEntity.ok(retorno);
	}

}
