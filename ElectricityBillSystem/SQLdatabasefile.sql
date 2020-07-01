create database hotelproject;
use hotelproject;

create table login(username varchar(255) , password varchar(30));
show tables;

select * from login;
insert into login values("admin" , "1234");

create table employee(name varchar(30) , age varchar(10), gender varchar(15), job varchar(30), salary varchar(20), phone varchar(15), aadhar varchar(15), email varchar(15) );
select * from employee;
delete from employee where age="20";

create table room(room_number varchar(10), available varchar(20), status varchar(20),  price varchar(20), bed_type varchar(20) );
select * from room;
delete from room where room_number="101";

create table driver(name varchar(10) ,age varchar(10) ,gender varchar(20),company varchar(20),brand varchar(20),available varchar(20),location varchar(40));
select * from driver;
delete from driver where name="asd";

create table customer(id varchar(20), number varchar(20), name varchar(20), gender varchar(15), country varchar(20), room varchar(10), status varchar(20), deposit varchar(20) );
select * from customer;

create table department(dept varchar(40), budget varchar(40));
insert into department values("Marketing","110000" );

SET SQL_SAFE_UPDATES = 0;
DELETE FROM customer WHERE number="110";