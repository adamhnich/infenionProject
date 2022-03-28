package tn.esprit.infenion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tn.esprit.infenion.IService.IReservationService;
import tn.esprit.infenion.IService.IUserService;
import tn.esprit.infenion.IService.IVoyageService;
import tn.esprit.infenion.Repository.IReservationRepo;
import tn.esprit.infenion.model.Reservation;
import tn.esprit.infenion.model.User;
import tn.esprit.infenion.model.Voyage;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    IReservationService reservationService ;
    @Autowired
    IUserService userService ;
    @Autowired
    IVoyageService voyageService ;

        @GetMapping("/retrieve-reservationByUser/{idu}")
    @ResponseBody
    public List<Reservation> getReservationByUser(@PathVariable("idu") long idu) {
        List<Reservation> r = reservationService.retrieveAllReservationByUser(idu);
        return r;
    }

    @GetMapping("/retrieve-reservationByVoyage/{idu}")
    @ResponseBody
    public List<Reservation> getReservationByVoyage(@PathVariable("idu") long idu) {
        List<Reservation> r = reservationService.findReservationByVoyage(idu);
        return r;
    }
    //gestion de validator
    @PostMapping("/add-Reservation/{idu}/{idv}")
    @ResponseBody
    public Reservation addReservation(@RequestBody Reservation re,@PathVariable("idu")  long idu,@PathVariable("idv")  long idv) {
        User u = userService.findUserById(idu);
        Voyage v = voyageService.findVoyageById(idv);
        re.setIduser(u);
        re.setIdV(v);
        return reservationService.addReservation(re);
    }
    @DeleteMapping("/remove-reservation/{reservation-id}")
    @ResponseBody
    public void removeReservation(@PathVariable("reservation-id")  long reservation_id) {
        reservationService.DeleteReservation(reservation_id);

    }

    @PutMapping("/modify-Reservation")
    @ResponseBody
    public Reservation modifyReservation(@RequestBody Reservation cat) {
        return reservationService.updateReservation(cat);
    }

}
