DROP TABLE IF EXISTS flights;

CREATE TABLE flights (
                         id SERIAL PRIMARY KEY,
                         airline VARCHAR(255) NOT NULL,
                         departure VARCHAR(255) NOT NULL,
                         destination VARCHAR(255) NOT NULL,
                         departure_time TIMESTAMP NOT NULL,
                         arrival_time TIMESTAMP NOT NULL,
                         price DECIMAL(10,2) NOT NULL
);
