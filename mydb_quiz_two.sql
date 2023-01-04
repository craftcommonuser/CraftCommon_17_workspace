create database MyDB;
use MyDB;

create table customers(
Cust_ID int auto_increment not null primary key,
Cust_FirstName varchar(30) not null,
Cust_LastName varchar(30) not null,
Cust_NickName varchar(30) not null,
Cust_Age int,
Cust_Gender char (30) not null,
Cust_Country varchar(30) not null,
Cust_Salary dec not null
);

alter table customers
add  bonus int not null;

alter table customers
modify column Cust_Age int not null;
-- delete column using alter
alter table customers
drop column Cust_NickName,
drop column bonus;

-- renaming
rename table customers to customer;

-- drop table

-- alter table customer
drop table  customer;

-- drop database
drop database mydb;

-- Recreate database

create database MyDB;
use MyDB;

create table customers(
Cust_ID int auto_increment not null primary key,
Cust_FirstName varchar(30) not null,
Cust_LastName varchar(30) not null,
Cust_NickName varchar(30) not null,
Cust_Age int,
Cust_Gender char (30) not null,
Cust_Country varchar(30) not null,
Cust_Salary dec not null
);

alter table customers
add  bonus int not null;

select * from customers




