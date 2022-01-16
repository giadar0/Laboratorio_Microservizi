package libreria.repos;




//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import libreria.entities.Prestiti;

public interface PrestitiDAO extends JpaRepository <Prestiti, Integer>{

	
	
	//List<Prestiti> findById(String id); //se clicco ctrl+JpaRepository apre i metodi crud
}
