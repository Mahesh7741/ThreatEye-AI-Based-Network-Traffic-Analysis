package com.network.security.network_threat_detection.controller;

import com.network.security.network_threat_detection.model.TrafficLog;
import com.network.security.network_threat_detection.service.TrafficLogService;
import com.network.security.network_threat_detection.service.TrafficLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/traffic-logs")
public class TrafficLogController {
    @Autowired
    private TrafficLogService service;

    @GetMapping
    public List<TrafficLog> getAllLogs() {
        return service.getAllLogs();
    }

    @PostMapping
    public void addLog(@RequestBody TrafficLog log) {
        service.saveLog(log);
    }
}
