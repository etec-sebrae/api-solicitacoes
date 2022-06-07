package br.gov.sp.etec.apisolicitacoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_solicitacoes")
public class SolicitacaoDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String grupoSolucionador;
	private String descricaoErro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGrupoSolucionador() {
		return grupoSolucionador;
	}
	public void setGrupoSolucionador(String grupoSolucionador) {
		this.grupoSolucionador = grupoSolucionador;
	}
	public String getDescricaoErro() {
		return descricaoErro;
	}
	public void setDescricaoErro(String descricaoErro) {
		this.descricaoErro = descricaoErro;
	}
	
	

}
