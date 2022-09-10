CREATE TABLE rating (
    id INT,
    app_name VARCHAR(255),
    app_size BIGINT,
    price DECIMAL(5,2),
    total_ratings DECIMAL(2,1),
    genre VARCHAR(50)
);

INSERT INTO rating (id, app_name, app_size, price, total_ratings, genre) 
VALUES (281656475, "PAC-MAN Premium", 100788224, 5.99, 4.5, "Games");

INSERT INTO rating (id, app_name, app_size, price, total_ratings, genre) 
VALUES (32165, "Centipede", 99632342, 5.99, 3.7, "Games");
 
INSERT INTO rating (id, app_name, app_size, price, total_ratings, genre)
VALUES (6549873, "Dracula", 10243, 1.99, 4.9, "Books");

INSERT INTO rating (id, app_name, app_size, price, total_ratings, genre)
VALUES (12354234, "Batman", 1231, 22.99, 1.9, "Books");

DELETE FROM rating WHERE id=281656475;
SELECT * FROM  rating; 
SELECT app_name, genre FROM rating;

--Find the sum of all of the prices of all of the applications within the rating table.
SELECT SUM (price) FROM rating;
--Find the maximum value of total_ratings of all of the applications within the rating table.
SELECT MAX(total_ratings) FROM rating;
SELECT app_name, MIN(total_ratings) FROM rating;
--Find the average prices grouped by genre within the rating table.
SELECT genre, AVG(price) FROM rating WHERE genre = "Games";
SELECT genre, AVG(price) FROM rating WHERE genre = "Books";