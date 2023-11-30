package trilha.testsjunit.barriga.service.repository;

import trilha.testsjunit.barriga.domain.Conta;

import java.util.List;


public interface ContaRepository {

    Conta salvar(Conta conta);

    List<Conta> obterContasPorUsuario(Long usuarioId);

    void delete(Conta conta);
}
