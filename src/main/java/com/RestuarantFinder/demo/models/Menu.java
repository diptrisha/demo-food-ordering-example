package com.RestuarantFinder.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="menu")
public class Menu {

    @Id
    private int mID;
    private int restuarantId;
    private String name;
    private int price;
}
