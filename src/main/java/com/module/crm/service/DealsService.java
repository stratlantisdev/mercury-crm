package com.module.crm.service;

import com.module.crm.entity.Deals;
import com.module.crm.repository.DealsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealsService {

    @Autowired
    private DealsRepository dealsRepository;

    public Deals addDeals(Deals deals) {
        return dealsRepository.save(deals);
    }

    public List<Deals> findDeals() {
        return dealsRepository.findAll();
    }

    public String deleteDeals(int deals_id) {
        dealsRepository.deleteById(deals_id);
        return ("Deals deleted "+deals_id);

    }
}
