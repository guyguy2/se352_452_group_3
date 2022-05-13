DROP TABLE IF EXISTS room CASCADE;
DROP TABLE IF EXISTS hotel CASCADE;
DROP TABLE IF EXISTS customer CASCADE;


CREATE TABLE room (
    id serial  PRIMARY KEY,
    number INT not null,
    amenities varchar(200),
    description varchar(100),
    status varchar(50),
    price float(10),
    admitted_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE hotel (
    id serial  PRIMARY KEY,
    name varchar(50),
    description varchar(50),
    address varchar(50)
);

DROP sequence IF EXISTS hibernate_sequence;
CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;

CREATE TABLE customer (
    id serial  PRIMARY KEY,
    CUST_ID VARCHAR(10),
    name VARCHAR(50),
    email VARCHAR(50),
    ph VARCHAR(50)
);

