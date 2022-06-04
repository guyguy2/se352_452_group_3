INSERT INTO rooms (number, description, amenities, status, price) VALUES
    (101, 'Standard Room, 1 Queen Bed, Park View', 'Wheelchair accessible, Bathrobes, Bathtub or Shower, 40-inch Smart TV', 'Available', 335.00),
    (102, 'Standard Room, 1 King Bed, Riverfront View', 'Wheelchair accessible, Bathrobes, Shower, 40-inch Smart TV, Minibar', 'Available', 435.50),
    (103, 'Standard Room, 2 Double Beds, City View', 'Refrigerator, Bathrobes, Shower, 40-inch Smart TV, Minibar', 'Available', 735.00),
    (201, 'Junior Suite, 2 Queen Beds, Park View', 'Sofa, Desk, TV features: remote control/55in/140cm/LCD screen, Non-smoking', 'Available', 643.00),
    (202, 'Junior Suite, 1 King Bed, Park View', 'Living/sitting area, Air conditioned, TV features: remote control/55in/140cm/LCD screen, Non-smoking', 'Available', 773.00),
    (203, 'Deluxe Guest Room, 1 King Bed, Park View', 'Refrigerator, Bathrobes, Shower, 40-inch Smart TV, Minibar', 'Available', 512.00),
    (204, 'Deluxe Guest Room, 2 Queen Beds, City View', 'Refrigerator, Bathrobes, Shower, 40-inch Smart TV, Minibar', 'Available', 630.00);


INSERT INTO hotel(name, description, address) VALUES
            ('Hilton', '4 stars', '123 main'),
            ('Hyatt', '3 stars', '123 Applewood');

INSERT INTO customers(cust_ID, name, email, ph) VALUES
            ('112233', 'Gordon Ramsey', 'gramsey@gordonramsey.com', '773-435-4455'),
            ('334455', 'Wolfgang Puck', 'wpuck@wolfgangpuck.com', '847-567-4323');

INSERT INTO reservation(check_In_Date, check_Out_Date) VALUES
            ('2022-07-01','2022-07-10');


INSERT INTO customer_rooms(rooms_id) select id from rooms;
INSERT INTO hotel_customers(customer_id) select id from customers;
INSERT INTO hotel_rooms(rooms_id) select id from rooms;
INSERT INTO customer_reservation(reservation_id) select id from reservation;
INSERT INTO reservation_rooms(rooms_id) select id from rooms;


