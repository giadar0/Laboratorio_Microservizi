package libreria.integration;

import java.util.Collections;
import java.util.List;
/*import java.util.stream.Collectors;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import libreria.entities.Clienti;
import libreria.services.ClientiService;


@RestController
@RequestMapping ("/api/clienti")

public class ClientiREST {

	@Autowired
	private ClientiService cs;

	@GetMapping(" ")
	List<Clienti> getClienti(){
		
		List<Clienti> trovaTutti = cs.trovaTutti();
		Collections.sort(trovaTutti);
		return trovaTutti;
	}
	
	@GetMapping("/{id}")
	Clienti getCliente(@PathVariable String id) {
		return cs.trovaUno(id);
	}
	
	@PostMapping(path = "/addCliente", consumes = "application/json")
	Clienti addCliente(@RequestBody Clienti cliente ) {
		Clienti c = cs.addCliente(cliente);
		return c;
	}
	
	@PutMapping("/{id}")
	Clienti updateCliente(@PathVariable String id, @RequestBody Clienti cliente) {
		return cs.updateCliente(cliente);
	}
	
	@DeleteMapping("/{id}")
	void delCliente(@PathVariable String id) {
		cs.deleteCliente(id);
	
	}
	
}

