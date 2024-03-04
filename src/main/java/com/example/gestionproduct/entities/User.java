package com.example.gestionproduct.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String username;
    private  String password;

    @ManyToMany
    //pour spécéfier le nom d'association et le nom nta" colum li gadi ykono fiha
    @JoinTable(name = "user_rolse",
               joinColumns = @JoinColumn(name = "userId"),
               inverseJoinColumns = @JoinColumn(name = "roleId")
    )
    private List<Role> roles;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private UserProfile userProfile;
}
