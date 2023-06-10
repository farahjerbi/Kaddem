package tn.esprit.spring.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name ="Universite")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Universite implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Long idUniversite; // Clé primaire

    private String nomUniv;

    private String adresseUniv ;

    private String emailUniv ;

    private String numTelUniv ;


    @OneToMany
    private Set<Departement> departements;

    @OneToMany( mappedBy="univ")
    private Set<Events> event;

    public Long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    @OneToMany( mappedBy="universites")
    private Set<Partenaire> partenaires;

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }

    public String getAdresseUniv() {
        return adresseUniv;
    }

    public void setAdresseUniv(String adresseUniv) {
        this.adresseUniv = adresseUniv;
    }

    public String getEmailUniv() {
        return emailUniv;
    }

    public void setEmailUniv(String emailUniv) {
        this.emailUniv = emailUniv;
    }

    public String getNumTelUniv() {
        return numTelUniv;
    }

    public void setNumTelUniv(String numTelUniv) {
        this.numTelUniv = numTelUniv;
    }

    public Set<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(Set<Departement> departements) {
        this.departements = departements;
    }

    public Set<Events> getEvent() {
        return event;
    }

    public void setEvent(Set<Events> event) {
        this.event = event;
    }

    public Set<Partenaire> getPartenaires() {
        return partenaires;
    }

    public void setPartenaires(Set<Partenaire> partenaires) {
        this.partenaires = partenaires;
    }
}
