package org.myownstock.user.communities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.myownstock.user.cities.City;

@Entity
@Getter @Setter
public class Community {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String label;

    @Column(length = 10)
    private String street_number;
    @Column(length = 60)
    private String address;
    @Column(length = 60)
    private String addressDetail;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private City city;
}
