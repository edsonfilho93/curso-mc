package br.com.edson.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Mapeia as requisições de localhost:8080/categorias/
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST está funcionando!";
	}
	
	public String adicionar() {
		return "Sei o que to fazendo";
	}
}
