CREATE TABLE logs (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      timestamp_seconds VARCHAR(255),
                      timestamp_nanos VARCHAR(255),
                      severity VARCHAR(50),
                      thread VARCHAR(255),
                      logger VARCHAR(255),
                      message TEXT,
                      context TEXT
);
