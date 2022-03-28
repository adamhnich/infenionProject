package tn.esprit.infenion.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.infenion.model.Voyage;

@Repository
public interface VoyageRepo extends CrudRepository<Voyage,Long> {
}
