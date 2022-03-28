package tn.esprit.infenion.Serice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.infenion.IService.IProfilService;
import tn.esprit.infenion.Repository.IProfilRepository;
import tn.esprit.infenion.Repository.IUploadImage;
import tn.esprit.infenion.model.Profile;
import tn.esprit.infenion.model.UploadImageProfil;
import tn.esprit.infenion.model.User;


import java.util.List;

@Service
public class ProfilService implements IProfilService {

    @Autowired
    IProfilRepository profilRepository ;


    @Autowired
    IUploadImage uploadImage ;

    @Override
    public Profile addProfil(Profile p) {
        return profilRepository.save(p);
    }

    @Override
    public String DeleteProfil(long idp) {
        profilRepository.delete(profilRepository.findById((long) idp).get());
        return "Deleted";
    }

    @Override
    public Profile updateProfil(Profile p) {
        return profilRepository.save(p);
    }

    @Override
    public List<Profile> retrieveProfil() {
        List<Profile> profils=(List<Profile>)profilRepository.findAll();
        return profils;
    }

    @Override
    public Profile retrieveProfilByUser(User u) {
        return profilRepository.findProfileByIduser(u);
    }

    @Override
    public UploadImageProfil saveImage(UploadImageProfil p) {
        return uploadImage.save(p);
    }

    @Override
    public Profile findProfilById(long id) {
        return this.profilRepository.findById(id).orElse(null);
    }
}
