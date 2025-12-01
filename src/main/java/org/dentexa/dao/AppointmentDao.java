package org.dentexa.dao;

import org.dentexa.entity.Appointment;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentDao extends CrudDao<Appointment, Long> {
    List<Appointment> findByDate(LocalDate date);
    List<Appointment> findByStatus(String status);
}
