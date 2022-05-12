# SimpleLogin
Add mysql-connector jar-file as external library beforehand

Make database beforehand: <br>
CREATE SCHEMA simplelogin;

Remember to write username and password in the DBConnection class!!!

Make a users table beforehand: <br>
CREATE TABLE users ( <br>
    id int primary key auto_increment, <br>
    username VARCHAR(50), <br>
    password VARCHAR(50) <br>
);

Make users beforehand:
INSERT INTO users (username, password) VALUES ('Thor', '1234');
