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


import libreria.entities.Prestiti;
import libreria.services.PrestitiService;

@RestController
@RequestMapping ("/api/prestiti")

public class PrestitiREST {
	
	@Autowired
	private PrestitiService ps;
	
	@GetMapping("")
	List<Prestiti> getPrestiti(){
		
		List<Prestiti> trovaTutti = ps.trovaTutti();
		Collections.sort(trovaTutti);
		return trovaTutti;
	}
	
	@GetMapping("/{id}")
	Prestiti getPrestito(@PathVariable int id) {
		return ps.trovaUno(id);
	}
	
	@PostMapping(path = "/addPrestito", consumes = "application/json")
	Prestiti addPrestito(@RequestBody Prestiti prestito ) {
		Prestiti p = ps.addPrestito(prestito);
		return p;
	}
	
	@PutMapping("/{id}")
	Prestiti updatePrestito(@PathVariable int id, @RequestBody Prestiti prestito) {
		return ps.updatePrestito(prestito);
	}
	
	@DeleteMapping("/{id}")
	void delPrestito(@PathVariable int id) {
		ps.deletePrestito(id);
	
	}
	
	

}
