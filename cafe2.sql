create database cafe2;

use cafe2;

create table `admin` (
	`id` int not null, 
    `username` varchar(80) default null,
    `password` varchar(50) default null,
    `s_ques` varchar(160) default null,
    `ans` varchar(50) default null,
    primary key (`id`)
);

create table `product` (
	`id` int not null auto_increment,
    `name` varchar(80) default null,
    `price` double default null,
    `image` mediumblob,
    primary key (`id`)
);

create table `cart` (
	`cid` int default null,
    `pid` int default null,
    `pName` varchar(80) default null,
    `qty` int default null,
    `price` double default null,
    `total` double default null
);

create table `payment` (
	`pid` int not null auto_increment,
    `cName` varchar(80) default null,
    `proid` varchar(80) default null,
    `pName` varchar(80) default null,
    `total` double default null,
    `pdate` date default null,
    primary key (`pid`)
);

select * from cafe2.admin;
select * from cafe2.product;
select * from cafe2.cart;
select * from cafe4.payment;
