package br.gov.sp.etec.apisolicitacoes.model;

import org.junit.jupiter.api.Test;

public class SolicitacaoDtoTest {

	@Test
	public void testarSolicitacaoDTO() {
		SolicitacaoDto dto = new SolicitacaoDto();		
		dto.setId(1L);
		dto.setGrupoSolucionador("Grupo");
		dto.setDescricaoErro("erro");
		
		System.out.println(dto.getDescricaoErro());
		System.out.println(dto.getId());
		System.out.println(dto.getGrupoSolucionador());
	}
}
