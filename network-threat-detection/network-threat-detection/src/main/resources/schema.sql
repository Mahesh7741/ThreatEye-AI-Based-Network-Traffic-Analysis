CREATE TABLE traffic_logs (
                              id SERIAL PRIMARY KEY,
                              source_ip VARCHAR(255),
                              destination_ip VARCHAR(255),
                              port INT,
                              protocol VARCHAR(50),
                              packet_size INT,
                              is_threat BOOLEAN,
                              timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE alerts (
                        id SERIAL PRIMARY KEY,
                        message TEXT,
                        severity VARCHAR(20),
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
