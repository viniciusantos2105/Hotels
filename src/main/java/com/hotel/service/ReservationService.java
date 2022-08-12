package com.hotel.service;

import com.hotel.entites.Reservation;
import com.hotel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository repository;

    public Reservation makeReservation(Reservation reservation){
        if(reservation.getDateCheckout().after(reservation.getDateCheckin())){
            return repository.save(reservation);
        }
        else if(reservation.getDateCheckout().equals(reservation.getDateCheckout())){
            return null; //criar exception personalizada de erro
        }
        return null; //criar exception personalizada de erro
    }
}
