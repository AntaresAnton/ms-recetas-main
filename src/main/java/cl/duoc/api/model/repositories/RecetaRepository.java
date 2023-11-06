package cl.duoc.api.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.api.model.entities.Receta;

public interface RecetaRepository extends JpaRepository<Receta, Integer>{
    
}
