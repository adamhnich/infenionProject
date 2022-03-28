package tn.esprit.infenion.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.infenion.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
}
