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
@Entity(name="restuarant")
public class Restuarant {

    @Id
    private int id;
    private String restuarantName;

    @OneToMany(targetEntity = Menu.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "res_fk", referencedColumnName = "mID")
    private List<Menu> menu_items;
}
