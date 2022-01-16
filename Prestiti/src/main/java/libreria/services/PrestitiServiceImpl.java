package libreria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libreria.entities.Prestiti;

import libreria.repos.PrestitiDAO;

@Service
public class PrestitiServiceImpl implements PrestitiService {
	
	@Autowired
	private PrestitiDAO repo;
	
	@Override
	public List<Prestiti> trovaTutti() {
		return repo.findAll();
	}
	
	@Override
	public Prestiti trovaUno(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public Prestiti addPrestito(Prestiti p) {
		return repo.save(p);
	}

	@Override
	public Prestiti updatePrestito(Prestiti prestito) {
		return repo.save(prestito);
	}

	@Override
	public void deletePrestito(int id) {
		repo.deleteById(id);
		
	}


}
