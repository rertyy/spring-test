package com.example.gqltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @QueryMapping
    public List<Restaurant> restaurants() {
        return restaurantService.findAll();
    }

//    @SchemaMapping
//    public Restaurant restaurant() {
//        return restaurantService.findRestaurantById(id);
//    }

}
