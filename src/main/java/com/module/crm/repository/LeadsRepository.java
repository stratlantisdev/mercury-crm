package com.module.crm.repository;

import com.module.crm.entity.Leads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadsRepository extends JpaRepository<Leads,Integer> {
}
