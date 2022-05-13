# SimpleLogin
Add mysql-connector jar-file as external library beforehand

Make database beforehand: <br>
CREATE SCHEMA simplelogin;

Remember to write username and password in the DBConnection class!!!

Make a users table beforehand: <br>
CREATE TABLE users ( <br>
&nbsp;&nbsp;&nbsp; id INT PRIMARY KEY AUTO_INCREMENT, <br>
&nbsp;&nbsp;&nbsp; username VARCHAR(50), <br>
&nbsp;&nbsp;&nbsp; password VARCHAR(50) <br>
);

Make users beforehand: <br>
INSERT INTO users (username, password) VALUES ('Thor', '1234');
