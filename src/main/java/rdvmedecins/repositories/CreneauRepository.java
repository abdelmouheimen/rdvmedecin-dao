package rdvmedecins.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import rdvmedecins.entities.Creneau;

public interface CreneauRepository extends CrudRepository<Creneau, Long> {
	// liste des crÃ©neaux horaires d'un mÃ©decin
	@Query("select c from Creneau c where c.medecin.id=?1")
	Iterable<Creneau> getAllCreneaux(long idMedecin);
}
