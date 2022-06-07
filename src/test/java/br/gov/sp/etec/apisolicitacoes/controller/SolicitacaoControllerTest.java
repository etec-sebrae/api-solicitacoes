/*
 * package br.gov.sp.etec.apisolicitacoes.controller;
 * 
 * 
 * 
 * import static org.junit.Assert.assertEquals; import static
 * org.mockito.Mockito.when;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.mockito.InjectMocks; import org.mockito.Mock; import
 * org.mockito.junit.MockitoJUnitRunner; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity;
 * 
 * import br.gov.sp.etec.apisolicitacoes.model.SolicitacaoDto; import
 * br.gov.sp.etec.apisolicitacoes.service.SolicitacaoService;
 * 
 * 
 * @RunWith(MockitoJUnitRunner.class) public class SolicitacaoControllerTest {
 * 
 * @InjectMocks SolicitacaoController solicitacaoController;
 * 
 * @Mock SolicitacaoService service;
 * 
 * @Test public void testarAdicionarSolicitacao() {
 * 
 * SolicitacaoDto dto = new SolicitacaoDto(); dto.setId(1L);
 * dto.setGrupoSolucionador("grupo"); dto.setDescricaoErro("erro");
 * 
 * when(service.adicionar(dto)).thenReturn(dto);
 * 
 * ResponseEntity<SolicitacaoDto> retorno =
 * solicitacaoController.adicionarSolicitacao(new SolicitacaoDto());
 * 
 * //assertEquals(retorno.getStatusCode().is2xxSuccessful(), true); }
 * 
 * }
 */