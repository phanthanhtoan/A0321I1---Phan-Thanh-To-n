use classicmodels;

-- Sử dụng mệnh đề group by
select `status` from orders 
group by `status`;

--  Sử dụng các hàm tập hợp với mệnh đề group by
select `status`, count(*) as "So luong status"
from orders 
group by `status`;

-- Sử dụng group by với hàm tập hợp truy vấn trên hai bảng.
select `status`, sum(quantityOrdered * priceEach) as amount
from orders
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
group by `status`;

-- tính tổng tiền của từng đơn hàng, thực hiện lệnh truy vấn sau:
select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderNumber;

--  GROUP BY với mệnh đề HAVING
select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders 
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by `year`
having `year` > 2003