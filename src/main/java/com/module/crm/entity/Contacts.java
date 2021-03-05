package com.module.crm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Contacts {

    @Id
    private int contacts_id;
    private String account_name;
    private int phone;
    private String website;
    private String groups;
    private String currency;
    private String default_language;
    private String address;
    private String city;
    private String state;
    private int zip_code;
    private String country;
    private String billing_street;
    private String billing_city;
    private String billing_state;
    private int billing_zip_code;
    private String billing_country;
    private String shipping_street;
    private String shipping_city;
    private String shipping_state;
    private int shipping_zip_code;
    private String shipping_country;
}
