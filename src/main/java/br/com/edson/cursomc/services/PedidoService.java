package br.com.edson.cursomc.services;

import br.com.edson.cursomc.domain.Pedido;
import br.com.edson.cursomc.repositories.PedidoRepository;
import br.com.edson.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Pedido não encontrado Id:" + id));
    }
}
