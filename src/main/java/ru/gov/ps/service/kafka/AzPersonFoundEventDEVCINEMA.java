package ru.gov.ps.service.kafka;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AzPersonFoundEventDEVCINEMA {

    private String dicStagsCode;
    private String actRecordNumber;
    private LocalDate actRecordDate;
    private Long actRecordVersion;
    private Long zagsMainId;
}
