package com.module.crm.repository;

import com.module.crm.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts,Integer> {
}
