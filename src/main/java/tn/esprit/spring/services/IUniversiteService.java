package tn.esprit.spring.services;
import tn.esprit.spring.entity.Departement;
import tn.esprit.spring.entity.Equipe;
import tn.esprit.spring.entity.Events;
import tn.esprit.spring.entity.Universite;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

public interface IUniversiteService {

    public Long ajouterUniversite(Universite u);
    public Iterable<Universite> retrieveAllUniversite();
    Optional< Universite > findUniversiteById(Long id);

   public void updateUniversite(Universite u , Long idUniversite);

    Universite retrieveUniversite (Long idUniversite);
    public void deleteUniversite(Long id);
    public void assignUniversiteToDepartement(Long idUniversite, Long idDepartement);
    public Set<Departement> retrieveDepartementsByUniversite(Long idUniversite);
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);

    /*public void assignUniversiteToEvent(Long idUniversite, Long idEvent);*/

 /*  public Set<Events> retrieveEventsByUniversite(Long idUniversite);*/
    public void AssignUnivToEvent( Long idUniversite , Long idEvent  );

    public Set<Events> retrieveEventsByUniversite(Long idUniversite);
}
