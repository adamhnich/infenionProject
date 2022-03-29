package tn.esprit.infenion.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.infenion.model.Flow;
import tn.esprit.infenion.model.Profile;
import tn.esprit.infenion.model.User;

@Repository
public interface IFlowRepository extends CrudRepository<Flow, Long> {

    Flow findFlowByIdProfilEnvAndIduser(Profile profil , User user);
}
