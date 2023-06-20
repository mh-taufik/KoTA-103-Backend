package com.jtk.ps.api.dto.self_assessment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelfAssessmentResponse {
    @JsonProperty("participant_id")
    private Integer participantId;
    @JsonProperty("self_assessment_id")
    private Integer selfAssessmentId;
    @JsonProperty("start_date")
    private LocalDate startDate;
    @JsonProperty("finish_date")
    private LocalDate finishDate;
    private List<SelfAssessmentGradeDetailResponse> grade;
}
