package libreria.services;

import java.util.List;

import libreria.entities.Prestiti;

public interface PrestitiService {

	
	List<Prestiti> trovaTutti();
	Prestiti trovaUno(int id);
	Prestiti addPrestito(Prestiti prestito);
	Prestiti updatePrestito(Prestiti prestito);
	void deletePrestito(int id);
	
	
}
