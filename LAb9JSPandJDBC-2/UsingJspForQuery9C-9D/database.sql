CREATE DATABASE IF NOT EXISTS Employee;
USE Employee;
CREATE TABLE IF NOT EXISTS Emp (
    Emp_NO INT PRIMARY KEY,
    Emp_Name VARCHAR(100) NOT NULL,
    Basicsalary INT
);
INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES
(102, 'Ravi', 10000),
(104, 'seetha', 200000),
(105, 'Rajesh', 30000),
(256, 'shravya', 500000);
(344, 'ram', 76555),