create table person(id int primary key not null auto_increment, , name varchar(255)not null,lastname varchar(255)not null,address varchar(255)not null,city varchar(255)not null,mobile varchar(10)not null);

insert into person(id , name ,lastname,address,city,mobile)
values('sohil','khan','jhotwara','jaipur','9079007309');
select * from person;
