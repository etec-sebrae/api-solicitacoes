package br.gov.sp.etec.apisolicitacoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etec.apisolicitacoes.model.SolicitacaoDto;
import br.gov.sp.etec.apisolicitacoes.repository.SolicitacaoRepository;

@Service
public class SolicitacaoServiceImpl implements SolicitacaoService{

	@Autowired
	SolicitacaoRepository repository;

	@Override
	public SolicitacaoDto adicionar(SolicitacaoDto dto) {
		// TODO Auto-generated method stub
		return repository.save(dto);
	}
	
	

}
