package com.example.gestionproduct.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)//oubligatiore de saisie c'est colum
    private String NomComplet;
    @Column(name = "client_tel")//spicifier le nom dans la base donneé
    private  String telephone;

    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   // @JoinColumn(name = "id_client")
    private List<Facture> factureList;
}
