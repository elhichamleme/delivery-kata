CREATE SEQUENCE order_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE orders (
    id BIGINT PRIMARY KEY,
    customer_name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    delivery_mode VARCHAR(50) NOT NULL
);