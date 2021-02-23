package com.farmacia.farmacia.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.farmacia.Repository.categoriaRepository;
import com.farmacia.farmacia.model.categoria;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	private categoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<categoria>> FindAllCategoria(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<categoria> FindByIdCategoria(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<categoria>> FindByDescricaoCategoria(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(descricao));
	}
	@PostMapping
	public ResponseEntity<categoria> postCategoria (@RequestBody categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<categoria> putCategoria (@RequestBody categoria categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
		
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
