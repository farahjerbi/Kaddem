package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.spring.entity.*;
import tn.esprit.spring.repositories.EventsRepository;
import tn.esprit.spring.repositories.UniversiteRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class EventsServiceImp implements IEventsService{
    EventsRepository eventsRepository;
UniversiteRepository universiteRepository;
    public Long addEvent(Events e) {
        eventsRepository.save(e);
        log.info("add event");
        return e.getIdEvent();
    }



    @Override
    public Iterable<Events> retrieveAllEvents() {return eventsRepository.findAll();}

    @Override
    public Optional<Events> findEventById(Long idEvent) {
        return eventsRepository.findById(idEvent);
    }

    @Override
    public void deleteEvent(Long idEvent) {
        eventsRepository.deleteById(idEvent);}

    @Override
    public void updateEvent(Events events, Long idEvent ) {
        Events u = eventsRepository.findById(idEvent).get();
        u.setDateEvent(events.getDateEvent());
        u.setType(events.getType());
        u.setNomEvent((events.getNomEvent()));
        u.setDescription(events.getDescription());
        u.setLocation(events.getLocation());
        eventsRepository.save(u);}

    @Override
    public Events retrieveEvent(Long idEvent) {
        return eventsRepository.findById(idEvent).get();
    }

    @Transactional
    public Events AddAndAssignEvent(Events e , Long idUniversite ){
        Universite univ = universiteRepository.findById(idUniversite).orElse(null);
        e.setUniv(univ);
        eventsRepository.save(e);
        return eventsRepository.save(e);

    }

    @Override
    public List<Events> ssearch(String nomEvent )
    {

        return eventsRepository.search(nomEvent);
    }
}
