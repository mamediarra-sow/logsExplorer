package com.example.logsExplorer.dao.repositories;

import com.example.logsExplorer.entities.LogsObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LogsRepository extends CrudRepository<LogsObject, Long> {
    Iterable<LogsObject> findAll();
}
