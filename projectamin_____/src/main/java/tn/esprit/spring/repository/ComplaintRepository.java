package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Complaint;
import tn.esprit.spring.entities.User;

import java.util.Date;

public interface ComplaintRepository extends JpaRepository<Complaint,Long> {
public boolean existsComplaintByComplainer(User user);

}
