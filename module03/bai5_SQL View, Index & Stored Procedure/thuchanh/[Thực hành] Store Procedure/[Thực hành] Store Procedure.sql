use classicmodels1;

-- Tạo Mysql Stored Procedure đầu tiên
delimiter //
create procedure findAllCustomers()
begin
	select *from customers;
end //
delimiter ;

call findAllCustomers;


-- Sửa procedure
delimiter //
drop procedure if exists `findAllCustomers` //
	create procedure findAllCustomers()
	begin
		select *from customers
		where customerNumber = 175;
	end; //
	delimiter 