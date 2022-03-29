package tn.esprit.infenion.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.infenion.model.Domaine;


@Repository
public interface IDomaineRepository extends CrudRepository<Domaine, Long> {
    Domaine findDomaineByNom(String nom);

}
