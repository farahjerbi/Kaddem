package tn.esprit.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name ="Events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Events implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEvent")
    private Long idEvent; // Clé primaire
    @Column(name="nomEvent")

    private String nomEvent;

    private String description ;

    @Temporal(TemporalType.DATE)
    private Date dateEvent ;

    private String location ;
    @Column(name="type")

    @Enumerated(EnumType.STRING)
    Typee type ;

    @JsonIgnore
    @ManyToOne
    Universite univ;

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public String getNomEvent() {
        return nomEvent;
    }

    public void setNomEvent(String nomEvent) {
        this.nomEvent = nomEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Date dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Typee getType() {
        return type;
    }

    public void setType(Typee type) {
        this.type = type;
    }

    public Universite getUniv() {
        return univ;
    }

    public void setUniv(Universite univ) {
        this.univ = univ;
    }
}
