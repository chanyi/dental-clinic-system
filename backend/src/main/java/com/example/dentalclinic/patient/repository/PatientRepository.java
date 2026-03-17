package com.example.dentalclinic.patient.repository;

import com.example.dentalclinic.patient.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
}
