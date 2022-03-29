package tn.esprit.infenion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tn.esprit.infenion.IService.IFlowService;
import tn.esprit.infenion.model.Flow;
import tn.esprit.infenion.model.Profile;

import javax.validation.Valid;

@RestController
public class FlowController {
    @Autowired
    IFlowService flowService ;


    @PostMapping("/add_flow/{idu}/{idp}")
    @ResponseBody
    public Flow addFlow(@PathVariable("idu")  long iduser , @PathVariable("idp")  long idprofil) {
        return flowService.addFolow(idprofil,iduser);

    }
    @DeleteMapping("/remove_flow/{profil-id}/{user-id}")
    @ResponseBody
    public void removeFlow(@PathVariable("profil-id")  long profilid,@PathVariable("user-id")  long userid) {
        flowService.DeleteFlow(profilid ,userid);

    }
}
