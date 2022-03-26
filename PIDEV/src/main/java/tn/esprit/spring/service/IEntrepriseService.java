package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Entreprise;

public interface IEntrepriseService {
	
	List<Entreprise> retrieveAllEntreprises();

	int addEntreprise(Entreprise e);

	void deleteEntreprise(int id);

	Entreprise updateEntreprise(Entreprise e, int idEntreprise);

	Entreprise retrieveEntreprise(int id);

}
