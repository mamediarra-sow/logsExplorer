package com.example.logsExplorer.controllers;

import com.example.logsExplorer.dao.services.LogsService;
import com.example.logsExplorer.dto.LogsObjectDTO;
import com.example.logsExplorer.entities.LogsObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class LogsExplorerController {
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private LogsService logsService;

    @RequestMapping(value = "/logs",method = RequestMethod.GET,produces = "application/json")
    public List<LogsObjectDTO> getAllLogs(){
        List<LogsObject> logsObjects = Objects.requireNonNull(logsService).getAllLogs();
        List<LogsObjectDTO> logsObjectDTOS = new ArrayList<>();
        logsObjects.forEach(logsObject -> logsObjectDTOS.add(objectMapper.convertValue(logsObject,LogsObjectDTO.class)));
        return logsObjectDTOS;
    }


}
