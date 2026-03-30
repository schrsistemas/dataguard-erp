CREATE TABLE audit_result (
    id SERIAL PRIMARY KEY,
    rule_id INT,
    executed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(50),
    total_issues INT
);

CREATE TABLE audit_result_item (
    id SERIAL PRIMARY KEY,
    result_id INT,
    raw_data JSONB
);
