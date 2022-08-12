package com.hotel.controller;


import com.hotel.dto.BedroomsDTO;
import com.hotel.entites.Bedrooms;
import com.hotel.entites.Hotel;
import com.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/register")
    public Hotel registerHotel(@RequestBody Hotel hotel){
       return hotelService.registerHotel(hotel);
    }

    @PatchMapping("/addRooms{id}")
    public Hotel addRooms(@PathVariable Long id, @RequestBody BedroomsDTO bedroomsDTO){
        return hotelService.addRooms(id, bedroomsDTO.getBedrooms());
    }

    @GetMapping("/bedroomsList{id}")
    public List<Bedrooms> bedroomsList(@PathVariable Long id){
        return hotelService.bedroomsList(id);
    }
}
