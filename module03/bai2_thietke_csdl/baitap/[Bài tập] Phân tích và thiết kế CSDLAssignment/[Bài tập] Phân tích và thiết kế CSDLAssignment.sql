create database `seller_oto`;
drop database seller_oto;
use seller_oto;

create table `products`(
	product_Code varchar(15) not null ,
    product_Name varchar(70) not null,
    product_Scale varchar(10) not null,
    product_Vendor varchar(50) not null,
    product_Description text not null,
    quantity_InStock  int not null, 
    buy_Price float not null,
    MSRP float not null,
    primary key(product_Code)
    
);

alter table `products`
	add column product_Line varchar(50) not null;
alter table `products`
	add foreign key(product_Line) references  productline(product_Line);
    
create table `customers`(
	customer_Number int not null ,
    customer_Name varchar(50) not null,
    contact_LastName varchar(50) not null,
    phone varchar(10) not null,
    address_Line1 varchar(50) not null,
    address_Line2 varchar(50) null ,
    city varchar(50) not null,
    state varchar(50) not null,
    postal_Code varchar(15) not null,
    country varchar(50) not null,
    credit_Limit int null,
    employee_Number int not null,
    primary key(customer_number),
    foreign key (employee_Number) references employees(employee_Number)
);

create table `productline`(
	product_Line varchar(50) not null,
    text_Description text null,
    image text null,
	primary key (product_Line)
);

create table `orders` (
	order_Number int not null  ,
	order_Date  date not null,
    required_Date date not null,
    shipped_Date  date not null,
    `status` varchar(15) not null,
    comments text null,
	quantity_Ordered  int not null,
    priceEach float not null,
    customer_Number int not null,
    primary key(order_Number),
    foreign key (customer_Number) references customers(customer_Number)
);

create table `employees` (
	employee_Number int not null ,
    last_Name varchar(50) not null,
    first_Name varchar(50) not null,
	job_Title  varchar(50) not null,
    reportTo int not null,
    office_Code varchar(10) not null,
    primary key(employee_Number),
    foreign key(reportTo) references employees(employee_Number),
    foreign key(office_Code) references offices(office_Code)
);

create table `offices` (
	office_Code varchar(10) not null,
    city varchar(50) not null,
    phone varchar(50) not null, 
    address_Line1 varchar(50) not null,
    address_Line2 varchar(50) null,
    state varchar(50) not null,
    country varchar(50) not null,
    postal_Code varchar(15) not null,
    primary key (office_Code)
);

create table `payments`(
	customer_Number int not null,
    check_Number varchar(50) not null,
    paymentDate date not null,
    amount float not null,
    primary key(customer_Number),
    foreign key (customer_Number) references customers(customer_Number)
);

create table `OrderDetails`(
	order_Number int not null, 
    product_Code varchar(15) not null,
    foreign key (order_Number) references orders(order_Number),
    foreign key (product_Code) references products(product_Code)
);

