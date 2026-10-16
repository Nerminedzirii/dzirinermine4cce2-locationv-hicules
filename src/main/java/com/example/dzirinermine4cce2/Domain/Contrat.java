package com.example.dzirinermine4cce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idContrat;

    LocalDate dateSignature;
    BigDecimal montantTotal;
    boolean valide;
    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    Set<Paiement> paiements;

    @OneToOne
    Reservation reservation;
}