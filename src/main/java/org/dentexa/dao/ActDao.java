package org.dentexa.dao;

import org.dentexa.entity.Consultation;

import java.time.LocalDate;
import java.util.List;

public interface ConsultationDao extends CrudDao<Consultation, Long> {
    List<Consultation> findByPatient(Long patientId);
    List<Consultation> findByDate(LocalDate date);
}
