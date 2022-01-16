package libreria.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import libreria.entities.Libri;

public interface LibriDAO extends JpaRepository <Libri, Integer>{
	
	List<Libri> findById(String id);
}

