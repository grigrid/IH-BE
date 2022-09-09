CREATE TABLE rating (
    id INT,
    app_name VARCHAR(255),
    app_size BIGINT,
    price DECIMAL(5,2),
    total_ratings DECIMAL(2,1),
    genre VARCHAR(50)
);
-- Now let's add some rows of data to this empty table!
INSERT INTO rating (id, app_name, app_size, price, total_ratings, genre) 
VALUES (281656475, "PAC-MAN Premium", 100788224, 3.99, 4.5, "Games");

-- Update existing rows in a table
UPDATE rating 
SET price = 0 
WHERE id = 281656475;

-- Delete rows from a table
DELETE FROM rating WHERE id=281656475;

-- Add some rows of data!
INSERT INTO rating (id, app_name, app_size, price, total_ratings, genre) 
VALUES (32165, "Centipede", 99632342, 5.99, 3.7, "Games");
 
INSERT INTO rating (id, app_name, app_size, price, total_ratings, genre)
VALUES (6549873, "Dracula", 10243, 1.99, 4.9, "Books");
     
-- Now that you have data in your table, we can use a SELECT statement to run a query.
SELECT * FROM rating;

-- If we only wanted specific columns, we could specify that instead of using the * wildcard character.
SELECT app_name, total_ratings, genre FROM rating;

-- If you wanted to only SELECT rows with a genre of "Games", you could do so with the below query.
SELECT app_name, total_ratings, genre 
FROM rating 
WHERE genre = "Games";

-- logical syntax to combine multiple conditions that must match. 
-- For example, if you only wanted "Games" with total_ratings higher than 4, you could use this query:
SELECT app_name, total_ratings, genre 
FROM rating 
WHERE genre = "Games" AND total_ratings > 4;

-- https://www.zentut.com/sql-tutorial/sql-aggregate-functions/

-- https://mode.com/sql-tutorial/sql-group-by/

/* Tasks to do
Find the sum of all of the prices of all of the applications within the rating table.
Find the maximum value of total_ratings of all of the applications within the rating table.
Find the average prices grouped by genre within the rating table. */