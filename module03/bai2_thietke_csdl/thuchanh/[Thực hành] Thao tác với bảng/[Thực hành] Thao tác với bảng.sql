create database mydatabase;

use mydatabase;

CREATE TABLE `contacts`
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

create table suppliers(
supplier_id int(11) not null auto_increment,
supperlier_name varchar(50) not null,
account_rep varchar(30) not null default 'TBD',
constraint suppilers_pk primary key (supplier_id)
);

drop table suppliers;

alter table contacts
  add last_name varchar(40) not null
    after contact_id;
    
-- thêm cột mới
alter table contacts 
	add address varchar(50) not null
		after contact_id;

-- chỉnh sửa mô tả của một cột     
alter table contacts
	modify last_name varchar(50) null;
    
-- xóa một cột
ALTER TABLE contacts
  DROP COLUMN birthday;
  
-- thay đổi tên cột
ALTER TABLE contacts
  CHANGE COLUMN contact_id contact_type
    varchar(20) NOT NULL;
    
-- thay đổi tên bảng
alter table contacts
	rename to aaa;