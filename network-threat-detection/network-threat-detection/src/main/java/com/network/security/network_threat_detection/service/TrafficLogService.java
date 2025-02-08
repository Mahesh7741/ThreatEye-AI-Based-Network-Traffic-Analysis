package com.network.security.network_threat_detection.service;

import com.network.security.model.TrafficLog;
import com.network.security.network_threat_detection.repository.TrafficLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrafficLogService {
    @Autowired
    private TrafficLogRepository repository;

    public List<TrafficLog> getAllLogs() {
        return repository.findAll();
    }

    public void saveLog(TrafficLog log) {
        repository.save(log);
    }
}
