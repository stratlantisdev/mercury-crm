package com.module.crm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data

public class Leads {
    @Id
    private int leads_id;
    private String	status;
    private String	source;
    private String	assigned;
    private String	first_name;
    private String	last_name;
    private String	position;
    private String	email;
    private String	website;
    private int	phone;
    private String	address;
    private String	city;
    private String	state;
    private String	country;
    private String	zip_code;
    private String	secondary_email;
    private String	default_language;
    private String	account_name;
    private String	description;
    private boolean	public_lead;
    private boolean	contacted_today;
    private String	created_at;
    private String	updated_at;
}
