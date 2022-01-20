package com.breno.logisticapi.domain.repository;

import com.breno.logisticapi.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNomeContaining(String nome);
    Optional<Cliente> findByEmail(String email);
}
