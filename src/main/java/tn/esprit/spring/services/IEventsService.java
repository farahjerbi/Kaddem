package tn.esprit.spring.services;

import tn.esprit.spring.entity.Events;
import tn.esprit.spring.entity.Universite;

import java.util.List;
import java.util.Optional;

public interface IEventsService {

    public Long addEvent(Events e) ;

    public Iterable<Events> retrieveAllEvents();

    public Optional<Events> findEventById(Long idEvent);

    public void deleteEvent(Long idEvent);

    public void updateEvent(Events u , Long idEvent);

    public Events retrieveEvent(Long idEvent);
    public Events AddAndAssignEvent(Events e , Long idUniversite );
    public List<Events> ssearch(String nomEvent );
}
