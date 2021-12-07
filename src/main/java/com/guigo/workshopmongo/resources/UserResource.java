package com.guigo.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guigo.workshopmongo.domain.User;
import com.guigo.workshopmongo.services.UserService;

@RestController // Recurso REST
@RequestMapping(value = "/users") // Caminho do Endpoint
public class UserResource {


	
//	@GetMapping //mesma coisa @RequestMapping(method = RequestMethod.GET) // endpoint REST no caminho "/users" GET
//	public List<User> findAll() { //primeiro retorno simplificado
//		return list;}

	//Instanciamos user aqui para testar e ver se a requisição está ok; agora vamos instanciar direto do MongoDB
//	@RequestMapping(method = RequestMethod.GET) // endpoint REST no caminho "/users" GET
//	public ResponseEntity<List<User>> findAll() { //retorna objeto sofisticado; responseentitiy, encapsula toda uma estrutra necessaria para retornar respostas http com possiveis cabeçalhos, erros, assim por diante
//		User maria = new User("1", "Maria Silva", "maria@gmail.com");
//		User alex = new User("2", "Alex Ander", "alex@gmail.com");
//		List<User> list = new ArrayList<>();
//		list.addAll(Arrays.asList(maria, alex));
//		return ResponseEntity.ok(list);}

	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET) 
	public ResponseEntity<List<User>> findAll() { 
		List <User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
