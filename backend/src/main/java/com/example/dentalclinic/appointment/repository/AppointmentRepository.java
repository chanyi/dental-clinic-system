package com.example.dentalclinic.appointment.repository;

import com.example.dentalclinic.appointment.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long> {
}
