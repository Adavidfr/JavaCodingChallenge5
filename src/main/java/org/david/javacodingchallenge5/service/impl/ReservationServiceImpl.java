package org.david.javacodingchallenge5.service.impl;

import lombok.RequiredArgsConstructor;
import org.david.javacodingchallenge5.model.Reservation;
import org.david.javacodingchallenge5.repository.ReservationRepository;
import org.david.javacodingchallenge5.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> findById(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Optional<Reservation> update(Long id, Reservation reservation) {
        Optional<Reservation> reservationOptional = reservationRepository.findById(id);
        reservationOptional.ifPresent(reservation1 -> {
            reservation1.setCustomerName(reservation.getCustomerName());
            reservation1.setCheckInDate(reservation.getCheckInDate());
            reservation1.setCheckOutDate(reservation.getCheckOutDate());
            reservation1.setRoomType(reservation.getRoomType());
            reservation1.setStatus(reservation.getStatus());
            reservationRepository.save(reservation1);
        });

        return reservationOptional;
    }

    @Override
    public Reservation delete(Long id) {
        reservationRepository.deleteById(id);
        return null;
    }
}
