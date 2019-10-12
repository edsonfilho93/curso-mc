package br.com.edson.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.edson.cursomc.domain.Categoria;
import br.com.edson.cursomc.domain.Cidade;
import br.com.edson.cursomc.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
