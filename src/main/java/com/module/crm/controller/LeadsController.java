package com.module.crm.controller;

import com.module.crm.entity.Deals;
import com.module.crm.service.DealsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class LeadsController {
    @Autowired
    public DealsService dealsService;

    /* Add row api */
    @RequestMapping(value = "/add-deals", method = RequestMethod.POST)
    public Deals addDeals(@RequestBody Deals deals) {
        return dealsService.addDeals(deals);
    }

    /* get all Deals rows api  */
    @RequestMapping(value = "/getAll-deals", method = RequestMethod.GET)
    public List<Deals> getAllDeals() {
        return dealsService.findDeals();
    }

    /* Delete Deals by id api */
    @RequestMapping(value = "/delete-deals", method = RequestMethod.DELETE)
    public String deleteDealsById(@RequestParam int deals_id) {
        return dealsService.deleteDeals(deals_id);
    }
}
