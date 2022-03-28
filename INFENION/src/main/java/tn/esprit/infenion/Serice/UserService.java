package tn.esprit.infenion.Serice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.infenion.IService.IUserService;
import tn.esprit.infenion.Repository.UserRepo;
import tn.esprit.infenion.model.User;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepo userRepo ;

    @Override
    public User findUserById(long id) {
        return this.userRepo.findById(id).orElse(null);
    }
}
