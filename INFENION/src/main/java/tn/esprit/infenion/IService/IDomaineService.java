package tn.esprit.infenion.IService;

import tn.esprit.infenion.model.*;

import java.util.List;

public interface IDomaineService {


    Domaine add(Domaine p);

    String DeleteDomaine(long idp);

    Domaine updateDomaine(Domaine P);

    List<Domaine> retrieveDomaine();

     Domaine retrieveDomaineByNom(String nom);




    Domaine findDomaineById(long id);

}
