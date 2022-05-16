DROP TABLE IF EXISTS customers CASCADE;
DROP TABLE IF EXISTS hotel CASCADE;
DROP TABLE IF EXISTS rooms CASCADE;
DROP TABLE IF EXISTS reservation CASCADE;
DROP TABLE IF EXISTS hotel_customers CASCADE;
DROP TABLE IF EXISTS hotel_rooms CASCADE;
DROP TABLE IF EXISTS customer_rooms CASCADE;
DROP TABLE IF EXISTS customer_reservation CASCADE;
DROP TABLE IF EXISTS reservation_rooms CASCADE;


CREATE TABLE rooms (
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

CREATE TABLE customers (
    id serial  PRIMARY KEY,
    CUST_ID VARCHAR(10),
    name VARCHAR(50),
    email VARCHAR(50),
    ph VARCHAR(50)
);

CREATE TABLE reservation (
        id serial  PRIMARY KEY,
        checkInDate DATE NOT NULL,
        checkOutDate DATE NOT NULL,
        checkInTime time(7),
        checkOutTime time(7),
        numOfRooms varchar(10)
);

CREATE TABLE hotel_customers (
    id serial  PRIMARY KEY,
        customer_id integer,
        hotel_id integer
);

CREATE TABLE hotel_rooms (
    id serial  PRIMARY KEY,
        hotel_id integer,
        rooms_id integer
);

CREATE TABLE customer_rooms (
    id serial  PRIMARY KEY,
        customer_id integer,
        rooms_id integer
);

CREATE TABLE customer_reservation (
   id serial  PRIMARY KEY,
        customer_id integer,
        reservation_id integer

);

CREATE TABLE reservation_rooms (
   id serial  PRIMARY KEY,
        reservation_id integer,
        rooms_id integer
);
