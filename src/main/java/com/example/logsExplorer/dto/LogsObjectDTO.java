package com.example.logsExplorer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogsObjectDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String timestampSeconds;
    private String timestampNanos;
    private String severity;
    private String thread;
    private String logger;
    private String message;
    private String context;
}
