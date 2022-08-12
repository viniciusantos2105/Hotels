package com.hotel.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateCheckin;
    private Date dateCheckout;
    private BigDecimal price;

    @OneToOne
    @JoinColumn(name = "tb_idBedrooms")
    private Bedrooms bedrooms;

    @OneToOne
    @JoinColumn(name = "tb_idHotel")
    private Hotel hotel;

    @OneToOne
    @JoinColumn(name = "tb_idClient")
    private Client client;
}
