package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Complaint;
import tn.esprit.spring.entities.Topic;
import tn.esprit.spring.services.ComplaintService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Complaint")
public class ComplaintController {

    @Autowired
    ComplaintService cs;
    //http://localhost:8081/SpringMVC/reclamation/retrieve-all-reclamations
    @GetMapping("/retrieve-all-reclamations")
    @ResponseBody
    public List<Complaint> getReclamations() {
        return cs.retrieveAllReclamations();
    }
    // http://localhost:8081/SpringMVC/reclamation/retrieve-reclamation/1
    @GetMapping("/retrieve-reclamation/{reclamation-id}")
    @ResponseBody
    public Complaint retrieveReclamation(@PathVariable("reclamation-id") Long id) {
        return cs.retrieveReclamation(id);
    }

    @ResponseBody
    @PostMapping("/add/{id_complainer}/{id_complained}/{id_trip}")
    public Complaint add_complaint(@RequestBody Complaint c ,@PathVariable("id_complainer") Long Id_sender
            ,@PathVariable("id_complained") Long id_complained , @PathVariable ("id_trip") Long id_trip ){
        return cs.add_complaint(c, Id_sender, id_complained, id_trip);
    }


    @DeleteMapping("/delete/{id}")
    public void delete_complaint(@PathVariable("id") Long id_Complaint){
        cs.Delete_complaint(id_Complaint);
    }

    @GetMapping("/By/{topic}")
    public List<Complaint> FilterByTopic(@PathVariable("topic") Topic topic){
        return cs.FilterByTopic(topic);
    }

    @GetMapping("/most_topic")
    @ResponseBody
    public Topic most_topic_complained(){
        return cs.most_topic_complained();
    }

    @GetMapping("/triByUser")
    @ResponseBody
    public Map<Long, Long> triByUser(){
        return cs.triByUser();
    }
    @GetMapping("/nbr/{id}")
    @ResponseBody
    public Long nbr_complaints_recieved_each_week(@PathVariable("id") Long id_user){
      return   cs.nbr_complaints_recieved_each_week(id_user);
    }

    @ResponseBody
    @PostMapping("/attribute")
    public void attribute_employee_type(){
        cs.attribute_employee_type();
    }

    @ResponseBody
    @GetMapping("/month")
    public int Taux_complaints_each_month(){
        return cs.Taux_complaints_each_month();
    }

    }
