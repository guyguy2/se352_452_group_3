DROP TABLE IF EXISTS room;
DROP TABLE IF EXISTS guest;
DROP TABLE IF EXISTS hotel_customers;
DROP TABLE IF EXISTS hotel_rooms;
DROP TABLE IF EXISTS customer_rooms;
DROP TABLE IF EXISTS customer_reservations;
DROP TABLE IF EXISTS reservation_rooms;

CREATE TABLE room (
  id INT AUTO_INCREMENT,    
    number INT not null,
    amenities varchar(200),
    description varchaar(100),
    status varchar(50),
    price float(10),
    admitted_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (ID)    
);

CREATE TABLE guest (
  id INT AUTO_INCREMENT,    
    name varchar(50),
    email varchar(50),
    PRIMARY KEY (ID)    
);

CREATE TABLE hotel_customers (
    id INT AUTO_INCREMENT,
    course_id long,
    students_id long,
    primary key(id)
);


