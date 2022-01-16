package libreria.services;

import java.util.List;

import libreria.entities.Clienti;

public interface ClientiService {
	List<Clienti> trovaTutti();
	Clienti trovaUno(String id);
	Clienti addCliente(Clienti c);
	Clienti updateCliente(Clienti libro);
	void deleteCliente(String id);
	
	
	
}
