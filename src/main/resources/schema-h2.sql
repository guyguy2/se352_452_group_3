DROP TABLE IF EXISTS room;
DROP TABLE IF EXISTS guest;

CREATE TABLE room (
  id INT AUTO_INCREMENT,    
    number INT not null,
    features varchar(100),
    admitted_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (ID)    
);

CREATE TABLE guest (
  id INT AUTO_INCREMENT,    
    name varchar(50),
    email varchar(50),
    PRIMARY KEY (ID)    
);


