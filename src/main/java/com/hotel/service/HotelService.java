package com.hotel.service;

import com.hotel.dto.BedroomsDTO;
import com.hotel.entites.Bedrooms;
import com.hotel.entites.Hotel;
import com.hotel.repository.BedroomsRepository;
import com.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository repository;

    @Autowired
    private BedroomsRepository bedroomsRepository;

    public Hotel registerHotel(Hotel hotel){
        return repository.save(hotel);
    }

    public Hotel addRooms(Long idHotel, List<Bedrooms> bedroomsList){
        Bedrooms bedrooms = new Bedrooms();
        Hotel hotel = repository.findById(idHotel).get();
        Integer contador = bedroomsList.size() -1;
        while(contador >= 0){
            bedrooms.setPrice(bedroomsList.get(contador).getPrice());
            bedrooms.setType(bedroomsList.get(contador).getType());
            bedrooms.setEmpty(true);
            Bedrooms bedrooms1 = bedroomsRepository.save(bedrooms);
            hotel.getBedrooms().add(bedrooms);
            repository.save(hotel);
            contador -= 1;
        }
        return hotel;
    }

    public List<Bedrooms> bedroomsList(Long idHotel){
        Hotel hotel = repository.findById(idHotel).get();
        return hotel.getBedrooms();
    }
}
