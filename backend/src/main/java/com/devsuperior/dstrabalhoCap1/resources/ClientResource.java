package com.devsuperior.dstrabalhoCap1.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dstrabalhoCap1.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L,"Erlon","22225554-11",2500.0,Instant.now(),2));
		list.add(new Client(2L,"Myrtes","12345678-10",3005.0,Instant.now(),1));
		list.add(new Client(3L,"Sara","987654321-12",2700.0,Instant.now(),0));
		return ResponseEntity.ok().body(list);
	}
	
	
}
