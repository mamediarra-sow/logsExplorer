package com.example.logsExplorer.dao.services;

import com.example.logsExplorer.dao.repositories.LogsRepository;
import com.example.logsExplorer.entities.LogsObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogsServiceImpl implements LogsService {
    @Autowired
    private LogsRepository logsRepository;

    @Override
    public List<LogsObject> getAllLogs() {
        List<LogsObject> logs = new ArrayList<>();
        Iterable<LogsObject> logsObjects = logsRepository.findAll();
        logsObjects.forEach(logs::add);
        return logs;
    }
}
