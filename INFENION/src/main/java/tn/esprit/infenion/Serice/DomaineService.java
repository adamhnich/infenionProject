package tn.esprit.infenion.Serice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.infenion.IService.IDomaineService;
import tn.esprit.infenion.IService.IProfilService;
import tn.esprit.infenion.Repository.IDomaineRepository;
import tn.esprit.infenion.model.Domaine;
import tn.esprit.infenion.model.Profile;

import java.util.List;

@Service
public class DomaineService implements IDomaineService {

    @Autowired
    IDomaineRepository domaineRepository ;
    @Autowired
    IProfilService profilService ;

    @Override
    public Domaine add(Domaine p) {
        return domaineRepository.save(p);

    }

    @Override
    public String DeleteDomaine(long idp) {
        return null;
    }

    @Override
    public Domaine updateDomaine(Domaine P) {
        return domaineRepository.save(P);
    }

    @Override
    public List<Domaine> retrieveDomaine() {
        return (List<Domaine>) domaineRepository.findAll();
    }

    @Override
    public Domaine retrieveDomaineByNom(String nom) {
        Domaine D = domaineRepository.findDomaineByNom(nom);
        Domaine newdomaine = new Domaine();
        if (D ==null) {
            newdomaine.setNom(nom);
            add(newdomaine);
            return newdomaine;
        }
        else {
            return D;
        }
    }

    @Override
    public Domaine findDomaineById(long id) {
        return domaineRepository.findById(id).orElse(null);
    }
}
