package com.example.gestionproduct.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class LigneFacture {
    @EmbeddedId
    private  LigneFactureKey id;

    @ManyToOne()
    @MapsId("facturId")
    @JoinColumn(name = "facture_id")
    private Facture facture;
    @JoinColumn(name = "produit_id")
    @MapsId("produitId")
    @ManyToOne()
    private Produit produit;

    private double quantite;
}
