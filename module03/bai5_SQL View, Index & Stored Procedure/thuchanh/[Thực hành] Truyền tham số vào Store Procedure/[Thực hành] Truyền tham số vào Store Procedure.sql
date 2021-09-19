use classicmodeles1;

--  Tham số loại IN
delimiter //
create procedure getCusByid
(in cusNum int(11))
begin
	select *from customers 
	where customerNumber = cusNum;
end //
delimiter ;
-- gọi stored procedure
call getCusByid(175);

-- Tham số loại OUT
delimiter //
create procedure GetCustomersCountByCity(
	in in_city varchar(50),
    out total int )
begin 
	select count(customerNumber)
    into total 
    from customers
    where city = in_city;
end //
delimiter ;
-- Gọi store procedure:
call GetCustomersCountByCity('Lyon',@total);

-- tham số loại inout
delimiter //
create procedure SetCounter(
	inout counter int,
    in inc int)
begin 
	set counter = counter +inc;
end //
delimiter ;

set @counter =1;
call SetCounter(@counter,1); 
call SetCounter(@counter,1); 
call SetCounter(@counter,5); 
select @counter; 
