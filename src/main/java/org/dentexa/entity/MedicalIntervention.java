package org.dentexa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicalIntervention {
    private Long id;
    private Long consultationId;
    private Long actId;
    private String tooth;
    private double amount;
    private String description;
}
