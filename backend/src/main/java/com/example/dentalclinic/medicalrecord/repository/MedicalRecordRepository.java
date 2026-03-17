package com.example.dentalclinic.medicalrecord.repository;

import com.example.dentalclinic.medicalrecord.entity.MedicalRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecordEntity, Long> {
}
