package com.example.logsExplorer.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "logs_object")
public class LogsObject implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(name = "timestamp_seconds")
    private String timestampSeconds;
    @Column(name = "timestamp_nanos")
    private String timestampNanos;
    @Column
    private String severity;
    @Column
    private String thread;
    @Column
    private String logger;
    @Column
    private String message;
    @Column
    private String context;

}