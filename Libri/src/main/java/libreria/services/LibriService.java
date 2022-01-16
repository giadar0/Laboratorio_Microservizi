package libreria.services;

import java.util.List;

import libreria.entities.Libri;

public interface LibriService {
	
	List<Libri> trovaTutti();
	Libri trovaUno(int id);
	Libri addLibro(Libri l);
	Libri updateLibro(Libri libro);
	void deleteLibro(int id);
	
}
