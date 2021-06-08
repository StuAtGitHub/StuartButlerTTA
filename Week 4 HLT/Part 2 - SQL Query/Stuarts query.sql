/*
**********************************************
Create database and tables as per task
**********************************************
*/
create database Stuart;
use Stuart;
create table MANAGER
(
MName varchar(100),
SHIFT varchar(100),
SALARY double,
MID int ,
primary key(MID)
);

create table ITEM
(
ITEMID varchar(100),
DISH varchar(100),
PRICE double,
CATEGORY varchar(100),
primary key (ITEMID)
);

create table CORDER
(
ORDERID int not null auto_increment,
CNAME varchar(100),
PHONE varchar(100),
ADDRESS varchar(100),
ITEMID varchar(100),
QTY int,
TOTAL double,
CDATE varchar(100),
primary key(ORDERID),
foreign key(ITEMID) references ITEM(ITEMID)
);
/*
**********************************************
Q1. Insert minimum 10 rows per table
**********************************************
*/
insert into manager
values
("Steve White","Night",25000,121),
("John Brown","Day",24000,122),
("Sara Winter","Day",23000,123),
("Jane Boat","Swing",24000,124),
("Shaun Wild","Night",26000,125),
("Jack Burns","Night",21000,126),
("Sandra Winger","Day",27500,127),
("Judy Blue","Night",26550,128),
("Simon Wig","Swing",30000,129),
("Joe Bloggs","Swing",30000,130)
;
insert into item
values
("Pie001","Steak and Kidney Pie",2.50,"Main"),
("Pie002","Chicken and Mushroom Pie",2.50,"Main"),
("Pie003","Minced Beef Pie",2.50,"Main"),
("Pie004","Vegetarian Pie",2.50,"Main"),
("Mea001","Steak",7.99,"Main"),
("Mea002","Chicken Breast",5.99,"Main"),
("Mea003","Sausage",4.99,"Main"),
("Mea004","Spam",2.99,"Main"),
("Sta001","Prawn",0.99,"Starter"),
("Sta002","Tomato Soup",0.99,"Starter"),
("Sta003","Beef Soup",0.99,"Starter"),
("Sta004","Fish Soup",0.99,"Starter"),
("Sid001","Chips",1.99,"Side"),
("Sid002","Salad",0.99,"Side"),
("Sid003","Jacket Potato",0.50,"Side"),
("Sid004","Asparagus",2.99,"Side"),
("Des001","Vanilla Ice Cream",2.00,"Dessert"),
("Des002","Chocolate Ice Cream",2.50,"Dessert"),
("Des003","Strawberry Ice Cream",2.50,"Dessert"),
("Des004","Neopolitan Ice Cream",3.00,"Dessert"),
("Dri001","Coffee",1.99,"Drink"),
("Dri002","Tea",1.49,"Drink"),
("Dri003","Coke",1.25,"Drink"),
("Dri004","Diet Coke",1.25,"Drink")
;
insert into corder (CName,Phone,Address,ItemID,QTY,Total,CDate) 
values
("Adam Appel","01234 567890","Room 1","Dri001",3,5.97,"8/6/21"),
("Barry Banani","01234 987654","Room 2","Dri002",1,1.49,"8/6/21"),
("Cynthia Cheria","01234 555888","Room3","Dri003",1,1.25,"8/6/21"),
("Adam Appel","01234 567890","Room 1","Pie003",1,2.50,"8/6/21"),
("Barry Banani","01234 987654","Room 2","Pie002",1,2.50,"8/6/21"),
("Cynthia Cheria","01234 555888","Room3","Pie001",1,2.50,"8/6/21"),
("Adam Appel","01234 567890","Room 1","Sid001",1,1.99,"8/6/21"),
("Barry Banani","01234 987654","Room 2","Sid001",1,1.99,"8/6/21"),
("Cynthia Cheria","01234 555888","Room3","Sid001",1,1.99,"8/6/21"),
("Adam Appel","01234 567890","Room 1","Dri003",1,1.25,"9/6/21"),
("Barry Banani","01234 987654","Room 2","Dri002",1,1.49,"9/6/21"),
("Cynthia Cheria","01234 555888","Room3","Dri003",1,1.25,"9/6/21"),
("Adam Appel","01234 567890","Room 1","Mea001",1,7.99,"9/6/21"),
("Barry Banani","01234 987654","Room 2","Mea001",1,7.99,"9/6/21"),
("Cynthia Cheria","01234 555888","Room3","Mea001",1,7.99,"9/6/21")
;
/*
**********************************************
Q2. Display Average Salary of Manager
**********************************************
*/
select avg(salary) as 'Average Salary' from manager;
/*
**********************************************
Q3. Display number of orders placed in a day
**********************************************
*/
select count(orderid) as 'Number of Orders on 8/6/21' from corder where cdate="8/6/21";
/*
**********************************************
Q4. Display total amount of orders - assume this is total of total?
**********************************************
*/
select sum(total) as 'Total of all orders' from corder;
/*
**********************************************
Q5. Display total number of dishes served in hotel
**********************************************
*/
select count(dish) as 'Number of available dishes' from item;
/*
**********************************************
Q6. Display dishes as per category
**********************************************
*/
select (dish) as 'Mains'from item  where category="Main";
select (dish) as 'Starters' from Item where category="Starter";
select (dish) as 'Sides'from item  where category="Side";
select (dish) as 'Drinks'from item  where category="Drink";
select (dish) as 'Desserts'from item  where category="Dessert";

select * from item order by (category);