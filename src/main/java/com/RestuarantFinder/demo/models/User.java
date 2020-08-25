package com.RestuarantFinder.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="user")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;
    private String address;

    @OneToMany(targetEntity = Restuarant.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "id")
    private List<Restuarant> restuarants;
}
