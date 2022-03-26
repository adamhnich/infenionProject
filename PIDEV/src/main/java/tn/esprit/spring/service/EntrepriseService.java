package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;
@Service
public class EntrepriseService implements IEntrepriseService {
	
	@Autowired
	EntrepriseRepository entrepriseRepo;

	@Override
	public List<Entreprise> retrieveAllEntreprises() {
		return  (List<Entreprise>) entrepriseRepo.findAll();
	
	}

	@Override
	public int addEntreprise(Entreprise e) {
		// TODO Auto-generated method stub
		entrepriseRepo.save(e);
		return e.getIdEntreprise();
	}

	@Override
	public void deleteEntreprise(int id) {
		entrepriseRepo.deleteById(id);
		
	}

	@Override
	public Entreprise updateEntreprise(Entreprise e,int idEntreprise) {
		e.setIdEntreprise(idEntreprise);
		entrepriseRepo.save(e);
		
		return null;
	}

	@Override
	public Entreprise retrieveEntreprise(int id) {
		
		return entrepriseRepo.findById(id).get();
	}

}
