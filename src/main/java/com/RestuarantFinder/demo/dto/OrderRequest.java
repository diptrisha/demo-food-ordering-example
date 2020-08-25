package com.RestuarantFinder.demo.dto;


import com.RestuarantFinder.demo.models.Restuarant;
import com.RestuarantFinder.demo.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private User user;
    private Restuarant restuarant;


}
