package tn.esprit.infenion.Serice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.infenion.IService.IFlowService;
import tn.esprit.infenion.IService.IProfilService;
import tn.esprit.infenion.IService.IUserService;
import tn.esprit.infenion.Repository.IFlowRepository;
import tn.esprit.infenion.Repository.UserRepo;
import tn.esprit.infenion.model.Flow;
import tn.esprit.infenion.model.Profile;
import tn.esprit.infenion.model.User;

@Service
public class FolowService implements IFlowService {

    @Autowired
    IUserService userService;
    @Autowired
    IProfilService profilService ;
    @Autowired
    IFlowRepository flowRepository;



    @Override
    public Flow addFolow(long idp, long idu) {

        Flow f = new Flow();
        Profile p = profilService.findProfilById(idp);
        User u = userService.findUserById(idu);

        f.setIduser(u);
        f.setIdProfilEnv(p);
        p.setFollowersNbr(p.getFollowersNbr()+1);
        profilService.addProfil(p);






        return flowRepository.save(f);
    }

    @Override
    public String DeleteFlow(Long idp, Long idu) {

        Profile p = profilService.findProfilById(idp);
        User u = userService.findUserById(idu);
        Flow f = flowRepository.findFlowByIdProfilEnvAndIduser(p,u);

        flowRepository.delete(f);
        return "Inflow";
    }
}
