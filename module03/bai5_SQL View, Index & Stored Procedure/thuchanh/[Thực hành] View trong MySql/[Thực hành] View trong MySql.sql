use classicmodels1;

-- Tạo View có tên customer_views truy vấn dữ liệu từ bảng customers để lấy các dữ liệu: 
-- customerNumber, customerName, phone bằng câu lệnh SELECT:
create view customer_view as 
select customerNumber, customerName, phone 
from customers;

select *from customer_view;

-- cập nhật view
create or replace view view_name as
select customerNumber, customerName,  contactFirstName, contactLastName, phone
from customers
where city = "Nantes";


-- xóa view
drop view customer_view;
