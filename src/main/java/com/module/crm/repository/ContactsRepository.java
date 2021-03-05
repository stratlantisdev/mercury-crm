package com.module.crm.repository;

import com.module.crm.entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts,Integer> {
}
