package tn.esprit.infenion.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.infenion.model.Reservation;
import tn.esprit.infenion.model.User;
import tn.esprit.infenion.model.Voyage;

import java.util.List;

@Repository
public interface IReservationRepo  extends CrudRepository<Reservation,Long> {

    List<Reservation> findReservationByIduser( User iduser );
    List<Reservation> findReservationByIdV( Voyage idv );
}
