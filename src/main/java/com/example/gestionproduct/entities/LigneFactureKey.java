package com.example.gestionproduct.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class LigneFactureKey implements Serializable {
    @Column(name = "facture_id")
    private long facturId;
    @Column(name = "produit_id")
    private long produitId;
}
