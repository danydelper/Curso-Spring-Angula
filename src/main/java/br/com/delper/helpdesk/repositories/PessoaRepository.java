package br.com.delper.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delper.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    
}
