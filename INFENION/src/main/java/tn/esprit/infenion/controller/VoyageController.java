package tn.esprit.infenion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tn.esprit.infenion.IService.IVoyageService;
import tn.esprit.infenion.Serice.MapValidationErrorService;
import tn.esprit.infenion.Validator.VoyageValidatore;
import tn.esprit.infenion.model.Voyage;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/voyage")
public class VoyageController {


    @Autowired
    IVoyageService VoyageService;

    @Autowired
    VoyageValidatore voyageValidatore ;
    @Autowired
    MapValidationErrorService mapValidationErrorService ;

    @GetMapping("/retrieve-all-Voyage")
    @ResponseBody
    //http://localhost:8080/SpringMVC/servlet/retrieve-all-Voyage 
    public List<Voyage> getVoyage() {
        List<Voyage> v = VoyageService.retrieveAllVoyage();
        return v ;
    }
    //gestion de validator
    @PostMapping("/add-Voyage")
    @ResponseBody
    public ResponseEntity<?> addVoyage( @Valid  @RequestBody Voyage a , BindingResult result) {
        voyageValidatore.validate(a,result);
        ResponseEntity<?> erroMap =mapValidationErrorService.MapValidationService(result);
        if(erroMap != null)return erroMap;
        Voyage newVoyage = VoyageService.addVoyage(a);
        return new ResponseEntity<Voyage>( newVoyage, HttpStatus.CREATED);

    }
    @DeleteMapping("/remove-Voyage/{Voyage-id}")
    @ResponseBody
    public void removeVoyage(@PathVariable("Voyage-id")  long VoyageId) {
        VoyageService.DeleteVoyage(VoyageId);

    }

    @PutMapping("/modify-Voyage")
    @ResponseBody
    public Voyage modifyVoyage(@RequestBody Voyage cat) {
        return VoyageService.updateVoyage(cat);
    }


    @GetMapping("/retrieve-Voyage/{Voyage-id}")
    @ResponseBody
    public Voyage retrieveVoyage(@PathVariable("Voyage-id") int VoyageId) {
        return VoyageService.findVoyageById(VoyageId);  }

}
