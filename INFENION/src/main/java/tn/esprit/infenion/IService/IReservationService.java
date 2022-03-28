package tn.esprit.infenion.IService;

import tn.esprit.infenion.model.Reservation;
import tn.esprit.infenion.model.Reservation;

import java.util.List;

public interface IReservationService {


    Reservation addReservation(Reservation Reservation);

    String DeleteReservation(long ReservationId);

    Reservation updateReservation(Reservation Reservation);

    List<Reservation> retrieveAllReservationByUser(long idU);

    List<Reservation> findReservationByVoyage( long idV);}
