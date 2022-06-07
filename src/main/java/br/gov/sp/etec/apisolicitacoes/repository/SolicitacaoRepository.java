package br.gov.sp.etec.apisolicitacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.apisolicitacoes.model.SolicitacaoDto;

@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoDto, Long> {

}
