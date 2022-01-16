package libreria.integration;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import libreria.entities.Libri;
import libreria.services.LibriService;

@RestController
@RequestMapping("/api/libri")

public class LibriREST {

	@Autowired
	private LibriService ls;
	
	@GetMapping("")
	List<Libri> getLibri(){
		
		List<Libri> trovaTutti = ls.trovaTutti();
		Collections.sort(trovaTutti);
		return trovaTutti;
	}
	
	
	@GetMapping("/{id}")
	Libri getLibro(@PathVariable int id) {
		return ls.trovaUno(id);
	}
	
	@PostMapping(path = "/addLibro", consumes = "application/json")
	Libri addLibro(@RequestBody Libri libro ) {
		Libri l = ls.addLibro(libro);
		return l;
	}
	@PutMapping("/{id}")
	Libri updateLibro(@PathVariable int id, @RequestBody Libri libro) {
		return ls.updateLibro(libro);
	}
	
	@DeleteMapping("/{id}")
	void delLibro(@PathVariable int id) {
		ls.deleteLibro(id);
	
	}
	
}
