package br.com.waldirep.springionicmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.waldirep.springionicmc.domain.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	

}
