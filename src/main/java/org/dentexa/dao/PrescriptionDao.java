package org.dentexa.dao;

import org.dentexa.entity.Prescription;

import java.util.List;

public interface PrescriptionDao extends CrudDao<Prescription, Long> {
    List<Prescription> findByConsultation(Long consultationId);
}
