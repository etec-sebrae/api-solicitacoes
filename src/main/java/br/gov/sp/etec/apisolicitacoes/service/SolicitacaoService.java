package br.gov.sp.etec.apisolicitacoes.service;

import java.util.List;

import br.gov.sp.etec.apisolicitacoes.model.SolicitacaoDto;

public interface SolicitacaoService {
	
	public SolicitacaoDto adicionar(SolicitacaoDto dto);
	
	public List<SolicitacaoDto> consultar();

}
