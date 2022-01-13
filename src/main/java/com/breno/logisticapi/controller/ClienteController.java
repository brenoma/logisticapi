package com.breno.logisticapi.controller;

import com.breno.logisticapi.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Breno");
        cliente1.setTelefone("85 98643-8449");
        cliente1.setEmail("brenoma@live.com");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("João");
        cliente2.setTelefone("88 91233-2449");
        cliente2.setEmail("joaoma@live.com");

        return Arrays.asList(cliente1, cliente2);
    }
}
