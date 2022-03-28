package tn.esprit.infenion.IService;

import tn.esprit.infenion.model.Voyage;

import java.util.List;

public interface IVoyageService {

    Voyage addVoyage(Voyage Voyage);

    String DeleteVoyage(long VoyageId);

    Voyage updateVoyage(Voyage Voyage);

    List<Voyage> retrieveAllVoyage();

    Voyage findVoyageById(long id);
}
