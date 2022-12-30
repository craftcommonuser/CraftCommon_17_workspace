SELECT * FROM performing_dml.first_project;
-- create table
   create table first_Project(
           Cust_id int, 
           Cust_firstname varchar(50), 
           Cust_Lastname varchar(50), 
           Cust_Age varchar(50), 
           Cust_Gender char,
           Cust_Country varchar(50),
           Cust_salary numeric);
                    
insert into first_project value
 (111, 'Nick' , 'jone' , ' ', 'M', 'USA' ,20000000),
 (222,'Antony','Martial',' ','M','France',10000000),
 (333,'Ross','Geller',' ','M','uzbekistan',36000000),
 (444,'Chandler','Bing',' ','M','Unkown',34000000),
 (555,'Rachel','Green',' ','F','kazakhstan',400000),
 (666,'Nick','Jones',' ','M','USA',20000000),
 (777,'Poul','Pogba',' ','M','France',20000000),
 (888,'Joey','Tribbiani',' ','M','Ethiopia',70000000);
 
		-- 2 update 
-- cust_id = 333,444,555

update first_project
set Cust_Country = 'Ethiopia'
where id  (333 ,444 ,555);
       -- 3 Delete
-- cust_name =nick jones
-- whichcust_id is 666
delete from first_project
where Cust_firstname = 'Nick' and Cust_Lastname = 'jones';
-- insert into first_project value(('',' ',' ',' ','M','USA',20000000),



