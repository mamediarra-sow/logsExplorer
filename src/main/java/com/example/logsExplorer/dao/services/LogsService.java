package com.example.logsExplorer.dao.services;


import com.example.logsExplorer.entities.LogsObject;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LogsService {
List<LogsObject> getAllLogs();
}
