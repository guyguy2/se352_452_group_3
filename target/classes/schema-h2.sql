DROP TABLE IF EXISTS customers;

CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;

CREATE TABLE customers (
  id INT AUTO_INCREMENT,    
    customerID VARCHAR(10),
    name VARCHAR(50),
    email VARCHAR(50),
    PRIMARY KEY (ID)    
);

