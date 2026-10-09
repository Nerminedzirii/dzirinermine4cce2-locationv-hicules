package com.example.dzirinermine4cce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idReservation;

    LocalDate dateDebut;
    LocalDate dateFin;

    @Enumerated(value = EnumType.STRING)
    StatutReservation statut;
}