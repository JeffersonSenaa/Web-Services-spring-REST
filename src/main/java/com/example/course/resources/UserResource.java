package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

//Define que a classe é um recurso web controlado por um Controlador Rest
@RestController 
@RequestMapping(value = "/users")
public class UserResource {
	
	//Define que este método é uma resposta a uma requisição http
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Jeff", "Jeff@gmaiçl.com", "999888777", "12345678");
		return ResponseEntity.ok().body(u);
	}

}
