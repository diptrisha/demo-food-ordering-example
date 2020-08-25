package com.RestuarantFinder.demo.controller;

import com.RestuarantFinder.demo.dto.OrderRequest;
import com.RestuarantFinder.demo.models.Restuarant;
import com.RestuarantFinder.demo.models.User;
import com.RestuarantFinder.demo.repository.MenuRepository;
import com.RestuarantFinder.demo.repository.RestuarantRepository;
import com.RestuarantFinder.demo.repository.UserRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestuarantRepository restuarantRepository;

    @Autowired
    private MenuRepository menuRepository;

    @PostMapping("/placeOrder")
    public User placeOrder(@RequestBody OrderRequest request)
    {
        return userRepository.save(request.getUser());
    }
    @GetMapping("/findAllRestuarants")
    public List<User> findAllRestuarants(){
        return userRepository.findAll();
    }

    @PostMapping("/createMenu")
    public Restuarant createMenu(@RequestBody OrderRequest request)
    {
        return restuarantRepository.save(request.getRestuarant());
    }

    @GetMapping("/findAllMenuItems")
    public List<Restuarant> findAllMenuItems(){
        return restuarantRepository.findAll();
    }
}
