package tn.esprit.infenion.IService;

import tn.esprit.infenion.model.Profile;
import tn.esprit.infenion.model.UploadImageProfil;
import tn.esprit.infenion.model.User;
import tn.esprit.infenion.model.Voyage;

import java.util.List;

public interface IProfilService {


    Profile addProfil(Profile p);

    String DeleteProfil(long idp);

    Profile updateProfil(Profile P);

    List<Profile> retrieveProfil();

    Profile retrieveProfilByUser(User u);

    UploadImageProfil saveImage(UploadImageProfil p);


    Profile findProfilById(long id);
}
