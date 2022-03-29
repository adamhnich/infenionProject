package tn.esprit.infenion.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfilBadge {
ReactiviteBadge reactiviteBadge;
BadageQuizz badageQuizz;
Poupilarite poupilarite;


    public ReactiviteBadge getReactiviteBadge() {
        return reactiviteBadge;
    }

    public void setReactiviteBadge(ReactiviteBadge reactiviteBadge) {
        this.reactiviteBadge = reactiviteBadge;
    }

    public BadageQuizz getBadageQuizz() {
        return badageQuizz;
    }

    public void setBadageQuizz(BadageQuizz badageQuizz) {
        this.badageQuizz = badageQuizz;
    }

    public Poupilarite getPoupilarite() {
        return poupilarite;
    }

    public void setPoupilarite(Poupilarite poupilarite) {
        this.poupilarite = poupilarite;
    }
}
