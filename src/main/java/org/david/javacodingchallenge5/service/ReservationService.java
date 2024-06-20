package org.david.javacodingchallenge5.service;

import org.david.javacodingchallenge5.model.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> findAll();
    Optional<Reservation> findById(Long id);
    Reservation save(Reservation reservation);
    Optional<Reservation> update(Long id, Reservation reservation);
    Reservation delete(Long id);
}
