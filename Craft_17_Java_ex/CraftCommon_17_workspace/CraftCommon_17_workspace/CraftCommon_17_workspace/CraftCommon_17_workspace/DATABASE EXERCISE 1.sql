-- Exercise 1 : Creating a database and use it 
create database teachers_db;
use teachers_db;
create table teachers (
Id int ,
first_name varchar (50) ,
last_name varchar (50) ,
school varchar  (100) ,
hire_date date ,
salary int
);

