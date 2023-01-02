-- create adatabase MYDB;
create database MYDB;
-- create atable customers;
 create table customers(
 cust_ID int primary key,
 cust_firstname varchar(50) not null,
 cust_lastname varchar(50) not null,
 cust_nickname varchar(50) not null,
 cust_age int,
 cust_gender character not null,
 cust_country varchar(50) not null,
 cust_salary decimal not null
 );
 -- add colomn using alter;
 alter table customers
 add bonus int not null;
 -- modify colomn using alter;
 alter table customers
 modify column age int not null;
 -- delete column using alter;
 alter table customers
 drop column cust_nickname;
 alter table customers
 drop column bonus;
 rename table  
 customers to customer;
 
 
 
 
 
 
 
 
 
 
 