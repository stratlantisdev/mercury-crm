package com.module.crm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Accounts {
    @Id
    private int accounts_id;
    private String name;
    private String email;
    private int phone;
    private String city;
    private String country;
    private String secondary_email;
    private String company;
    private String position;
    private String website;
    private String address;
    private String state;
    private int zip;
    private String default_language;
    private String description;
}
