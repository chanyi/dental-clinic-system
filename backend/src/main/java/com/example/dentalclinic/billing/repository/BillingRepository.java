package com.example.dentalclinic.billing.repository;

import com.example.dentalclinic.billing.entity.BillingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<BillingEntity, Long> {
}
