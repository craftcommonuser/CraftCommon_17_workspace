-- create adatabase MYcompany;
create database MYcompany;
-- create atable Employee;
 create table Employe(
 Employee_ID int primary key,
 Employee_firstname varchar(50) not null,
 Employee_lastname varchar(50) not null,
  Employee_gender character not null,
 Employee_country varchar(50) not null,
 Employee_salary decimal not null
 );
 
  -- add colomn using alter;
 alter table employe
 add Employee_ssn int not null;
 -- modify colomn using alter;
 alter table employe
 modify column Employee_country varchar(50) null;
 -- delete column using alter;
 alter table employe
 drop column Employee_ssn;
 rename table  
 employe to Employee;
 



 
 
 