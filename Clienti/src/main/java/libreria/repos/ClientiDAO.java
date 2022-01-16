package libreria.repos;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import libreria.entities.Clienti;


@Repository
public interface ClientiDAO extends MongoRepository <Clienti, String>{
	
	
}

