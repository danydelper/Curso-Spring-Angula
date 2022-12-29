package br.com.delper.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delper.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
