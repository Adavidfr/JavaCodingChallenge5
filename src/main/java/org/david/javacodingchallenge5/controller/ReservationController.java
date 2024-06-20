package org.david.javacodingchallenge5.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.david.javacodingchallenge5.model.Reservation;
import org.david.javacodingchallenge5.service.ReservationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Reservations", description = "Manage all endpoints about Reservations")
@RestController
@RequestMapping("/api/reservations")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }

    @GetMapping
    public List<Reservation> listReservations() {
        return reservationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findReservationsById(@PathVariable Long id) {
        Optional<Reservation> reservationOptional = reservationService.findById(id);
        if (reservationOptional.isPresent()) {
            return ResponseEntity.ok(reservationOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public Optional<Reservation> updateReservation(@PathVariable Long id, @RequestBody Reservation reservation) {
        return reservationService.update(id, reservation);
    }

    @DeleteMapping("/{id}")
    public Reservation deleteReservation(@PathVariable Long id) {
        return reservationService.delete(id);
    }


}
