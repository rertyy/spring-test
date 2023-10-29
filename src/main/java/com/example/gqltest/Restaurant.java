package com.example.gqltest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.lang.Nullable;

import java.util.Date;
import java.util.List;


@Document(collection = "restaurants")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    private ObjectId id;
    private Address address;
    private String borough;
    private String cuisine;

    public Restaurant(Address address, String borough, String cuisine, List<Grade> grades, String name, String restaurant_id) {
        this.address = address;
        this.borough = borough;
        this.cuisine = cuisine;
        this.grades = grades;
        this.name = name;
        this.restaurant_id = restaurant_id;
    }

    private List<Grade> grades;
    private String name;
    private String restaurant_id;

    @Data
    @AllArgsConstructor
    public static class Address {
        private String building;
        private List<Double> coord; // Represents [longitude, latitude]
        private String street;
        private String zipcode;

    }

    @Data
    @AllArgsConstructor
    public static class Grade {
        private String date;
        private String grade;
        private int score;
    }


}
