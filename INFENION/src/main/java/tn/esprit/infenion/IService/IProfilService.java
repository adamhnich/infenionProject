package tn.esprit.infenion.IService;

import tn.esprit.infenion.model.*;

import java.util.List;

public interface IProfilService {


    Profile addProfil(Profile p);

    String DeleteProfil(long idp);

    Profile updateProfil(Profile P);

    List<Profile> retrieveProfil();

    Profile retrieveProfilByUser(User u);

    UploadImageProfil saveImage(UploadImageProfil p);

    Profile AffecterDomaineToProfil(long idDom,long idProfil);


    Profile findProfilById(long id);
    public void poupilariteScud();

    public ReactiviteBadge Reactivite(Long id );
    public Poupilarite poupilarite(Long id);
}
