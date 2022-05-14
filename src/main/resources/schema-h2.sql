DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS hotel;
DROP TABLE IF EXISTS rooms;
DROP TABLE IF EXISTS reservation;
DROP TABLE IF EXISTS hotel_customers;
DROP TABLE IF EXISTS hotel_rooms;
DROP TABLE IF EXISTS customer_rooms;
DROP TABLE IF EXISTS customer_reservation;
DROP TABLE IF EXISTS reservation_rooms;


CREATE TABLE rooms (
  id INT AUTO_INCREMENT,
    number INT not null,
    amenities varchar(200),
    description varchar(100),
    status varchar(50),
    price float(10),
    admitted_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (ID)    
);

CREATE TABLE reservation (
    id INT AUTO_INCREMENT,
        checkInDate DATE NOT NULL,
        checkOutDate DATE NOT NULL,
        checkInTime time(7),
        checkOutTime time(7),
        numOfRooms varchar(10),
        PRIMARY KEY (ID)
);

CREATE TABLE hotel (
  id INT AUTO_INCREMENT,
    name varchar(50),
    description varchar(50),
    address varchar(50),
    PRIMARY KEY (ID)
);


CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;

CREATE TABLE customers (
  id INT AUTO_INCREMENT,    
    CUST_ID VARCHAR(10),
    name VARCHAR(50),
    email VARCHAR(50),
    ph VARCHAR(50),
    PRIMARY KEY (ID)    
);

CREATE TABLE hotel_customers (
    id INT AUTO_INCREMENT,
        customer_id long,
        hotel_id long,
        primary key(id)
);

CREATE TABLE hotel_rooms (
    id INT AUTO_INCREMENT,
        hotel_id long,
        rooms_id long,
        primary key(id)
);

CREATE TABLE customer_rooms (
    id INT AUTO_INCREMENT,
        customer_id long,
        rooms_id long,
        primary key(id)
);

CREATE TABLE customer_reservation (
    id INT AUTO_INCREMENT,
        customer_id long,
        reservation_id long,
        primary key(id)
);

CREATE TABLE reservation_rooms (
    id INT AUTO_INCREMENT,
        reservation_id long,
        rooms_id long,
        primary key(id)
)
