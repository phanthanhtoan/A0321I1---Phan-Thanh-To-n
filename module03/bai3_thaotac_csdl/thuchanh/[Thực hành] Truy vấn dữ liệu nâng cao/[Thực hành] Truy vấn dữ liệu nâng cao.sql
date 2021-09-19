use classicmodels;

select productCode, productName, buyPrice, quantityInStock  
from productssds
where buyPrice > 56.76 and quantityInStock > 10;

-- inner join kết hợp producsts với productlines với điều kiện để kết nối 2 bảng
select productCode, productName, buyPrice, textDescription
from products
inner join productlines
	on products.productLine  = productLines.productLine
where buyPrice > 56.76 and buyPrice < 95.59;

select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast'