# SimpleLogin
Add mysql-connector jar-file as external library beforehand

Make database beforehand
CREATE SCHEMA simplelogin;

Remember to write username and password in the DBConnection class!!!

Make a users table beforehand
CREATE TABLE users (
    id int primary key auto_increment,
    username VARCHAR(50),
    password VARCHAR(50)
);
