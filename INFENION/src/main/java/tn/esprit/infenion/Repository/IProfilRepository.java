package tn.esprit.infenion.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.infenion.model.Profile;
import tn.esprit.infenion.model.User;

public interface IProfilRepository extends CrudRepository<Profile,Long> {
    Profile findProfileByIduser(User user);
}
