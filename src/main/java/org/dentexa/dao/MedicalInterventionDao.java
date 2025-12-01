package org.dentexa.dao;

import org.dentexa.entity.MedicalIntervention;

import java.util.List;

public interface MedicalInterventionDao extends CrudDao<MedicalIntervention, Long> {
    List<MedicalIntervention> findByConsultation(Long consultationId);
}
