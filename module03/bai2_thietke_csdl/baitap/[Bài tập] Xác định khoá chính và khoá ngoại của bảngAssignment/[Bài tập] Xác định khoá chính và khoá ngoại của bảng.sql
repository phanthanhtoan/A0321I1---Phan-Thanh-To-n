create database bank;

use `bank`;
create table `Customers`(
	customer_number int not null , 
    fullname varchar(100) not null,
    address varchar(200) not null,
    email varchar(100) not null,
    phone  varchar(10) not null,
    primary key(customer_number)
);

create table `Accounts`(
	account_number int not null ,
    account_type varchar(50) not null,
    `date` date not null,
    balance int not null,
    customer_number int not null,
    primary key(account_number, customer_number),
    foreign key (customer_number) references Customers(customer_number)
);

drop database `bank`;
create table `Transactions`(
	tran_number int not null auto_increment primary key,
    account_number int not null,
    `date` date,
    amounts int not null,
    foreign key (account_number) references Accounts(account_number)
);

