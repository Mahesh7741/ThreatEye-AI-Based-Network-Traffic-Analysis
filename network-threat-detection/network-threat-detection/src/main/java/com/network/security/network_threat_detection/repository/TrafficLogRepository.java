package com.network.security.network_threat_detection.repository;

import com.network.security.model.TrafficLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrafficLogRepository extends JpaRepository<TrafficLog, Long> {
}
