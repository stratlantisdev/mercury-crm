package com.module.crm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Deals {
    @Id
    private int deals_id;
    private String	deal_owner;
    private String	deal_name;
    private String	account_name;
    private String	deal_type;
    private String	next_step;
    private String	lead_source;
    private String	contact_name;
    private int	amount;
    private String	closing_date;
    private String	stage;
    private int	probability;
    private int	expected_revenue;
    private String	campaign_source;
    private String	description;
    private String	created_at;
    private String	updated_at;
}
