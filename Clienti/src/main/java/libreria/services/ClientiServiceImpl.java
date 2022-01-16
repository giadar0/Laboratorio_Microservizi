package libreria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libreria.entities.Clienti;
import libreria.repos.ClientiDAO;

@Service
public class ClientiServiceImpl implements ClientiService {

	/*@Autowired
	private ClientiService cs;*/
	
	@Autowired
	private ClientiDAO repo;

	@Override
	public List<Clienti> trovaTutti() {
		return repo.findAll();
	}

	@Override
	public Clienti trovaUno(String id) {
		return repo.findById(id).get();
	}

	@Override
	public Clienti addCliente(Clienti l) {
		return repo.save(l);
	}

	@Override
	public Clienti updateCliente(Clienti clienti) {
		return repo.save(clienti);
	}

	@Override
	public void deleteCliente(String id) {		
		repo.deleteById(id);
	}








	



	



	


	



	

	
	
	

}
