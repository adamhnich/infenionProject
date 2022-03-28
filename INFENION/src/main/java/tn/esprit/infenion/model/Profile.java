package tn.esprit.infenion.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity

public class Profile {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idProfil;

    @NotBlank
    String nom ;

    @NotBlank
    String Prenom ;

    @OneToOne(mappedBy = "profile")
    private UploadImageProfil image ;
    @Enumerated
    public Domaine domaine ;

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    @ManyToOne
    @JoinColumn(name="iduser",referencedColumnName = "iduser")
    private User iduser;

    public UploadImageProfil getImage() {
        return image;
    }

    public void setImage(UploadImageProfil image) {
        this.image = image;
    }



    @NotBlank
    @Size(min=8, max=8)
    String Cin ;

    @Min(18)
    int age ;

    public Profile() {
    }

    public Long getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(Long idProfil) {
        this.idProfil = idProfil;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getCin() {
        return Cin;
    }

    public void setCin(String cin) {
        Cin = cin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User getIduser() {
        return iduser;
    }

    public void setIduser(User iduser) {
        this.iduser = iduser;
    }
}
