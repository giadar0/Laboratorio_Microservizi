package libreria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libreria.entities.Libri;
import libreria.repos.LibriDAO;

@Service
public class LibriServiceImpl implements LibriService {

	@Autowired
	private LibriDAO repo;											;
	
	@Override
	public List<Libri> trovaTutti() {
		
		return repo.findAll();
	}

	@Override
	public Libri trovaUno(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Libri addLibro(Libri l) {
		return repo.save(l);
	}

	@Override
	public Libri updateLibro(Libri libri) {
		return repo.save(libri);
	}

	@Override
	public void deleteLibro(int id) {		
		repo.deleteById(id);
	}



}
