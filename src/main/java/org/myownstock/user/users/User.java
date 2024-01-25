package org.myownstock.user.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 75, nullable = false)
    private String lastname;
    @Column(length = 75)
    private String firstname;
    @Column(nullable = false)
    private LocalDate birthdate;

    @ManyToOne
    private Role role;
}
