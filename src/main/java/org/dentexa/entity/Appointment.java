package org.dentexa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
    private Long id;
    private Long patientId;
    private Long dentistId;
    private LocalDateTime dateTime;
    private String status;
    private String reason;
}
