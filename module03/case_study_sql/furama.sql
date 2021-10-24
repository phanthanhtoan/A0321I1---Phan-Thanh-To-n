create database QLKND_Furama;
drop database  QLKND_Furama;

use QLKND_Furama;

create table Vitri
(IDViTri int auto_increment primary key,
TenVitri varchar(45));

create table TrinhDo
(IDTrinhDo int auto_increment primary key,
TenTrinhDo varchar(45));

create table BoPhan
(IDBoPhan int auto_increment primary key,
TenBoPhan varchar(45));


create table LoaiDichVu
(IDLoaiDichVu int auto_increment primary key,
TenLoaiDichVu varchar(45));

create table KieuThue
(IDKieuThue int auto_increment primary key,
TenKieuThue varchar(45),
Gia int);

create table LoaiKhach
(IDLoaiKhach int auto_increment primary key,
TenLoaiKhach varchar(45));


create table NhanVien
(IDNhanVien int auto_increment primary key,
HoTen varchar(45),
IDViTri int,
IDTrinhDo int,
IDBoPhan int,
NgaySinh date,
SoCMND varchar(45),
Luong varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key(IDViTri) references Vitri(IDViTri),
foreign key(IDTrinhDo ) references TrinhDo(IDTrinhDo ),
foreign key(IDBoPhan) references BoPhan(IDBoPhan));

create table KhachHang
(IDKhachHang int auto_increment primary key,
IDLoaiKhach int,
HoTen varchar(45),
NgaySinh date,
SoCMND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key (IDLoaiKhach) references LoaiKhach(IDLoaiKhach));

create table DichVu	
(IDDichVu int auto_increment primary key,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa  varchar(45),
ChiPhiThue  varchar(45),
IDKieuThue int,
IDLoaiDichVu int,
TrangThai  varchar(45),
foreign key (IDKieuThue) references KieuThue(IDKieuThue),
foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu));

create table DichVuDiKem
(IDDichVuDiKem int auto_increment primary key,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45));

create table HopDong
(IDHopDong int auto_increment primary key,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int,
foreign key (IDNhanVien) references NhanVien(IDNhanVien),
foreign key (IDKhachHang) references KhachHang(IDKhachHang),
foreign key (IDDichVu) references DichVu(IDDichVu));

create table HopDongChiTiet
(IDHopDongChiTiet int  auto_increment primary key,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int,
foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem),
foreign key (IDHopDong ) references HopDong (IDHopDong ));

--------------------------------------------------------------------
-- task1 --
insert into vitri
values
(1,'lễ tân'),
(2,'phục vụ'),
(3,'chuyên viên'),
(4,'giám sát'),
(5,'quản lí'),
(6,'giám đốc');

insert into trinhdo
values
(1,'trung cấp'),
(2,'cao đẳng'),
(3,'đại học'),
(4,'sau đại học');

insert into bophan
values
(1,'Sale – Marketing'),
(2,'Hành Chính'),
(3,'Phục vụ'),
(4,'Quản lý');

insert into nhanvien
values
(1,'Hồ Đình Khuê',6,4,2,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','Đà Nẵng'),
(2,'Nguyễn Văn Sơn',1,1,1,'1999-12-12',206764234,5000000,090534345,'nguyenson@gmail.com','Đà Nẵng'),
(3,'Nguyễn Văn An',1,1,3,'1988-04-13',206184291,5000000,0905768796,'vanan@gmail.com','Quảng Nam'),
(4,'Lê Thị Thu',2,3,4,'1995-02-12',206184291,10000000,0905453657,'lethu@gmail.com','Đà Nẵng'),
(5,'Trương Văn Tuấn',2,3,1,'1989-02-09',206915647,10000000,0909452456,'vantuan@gmail.com','Hồ Chí Minh'),
(6,'Trần Khánh Chi',3,3,2,'1991-12-17',202914563,20000000,0905567345,'tranchi@gmail.com','Hà Nội'),
(7,'Nguyễn Ngọc',3,3,1,'1988-02-12',206566914,20000000,09055467846,'nguyenngoc@gmail.com','Hai Phòng'),
(8,'La Thành',4,4,4,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','Đà Nẵng'),
(9,'Hồ Văn Chiến',6,4,2,'1978-02-18',20657478,30000000,0935678567,'vanchien@gmail.com','Đà Nẵng'),
(10,'Võ Anh Dũng',5,4,1,'1990-02-12',20656465,40000000,0905345768,'voanh@gmail.com','Quảng Nam');

insert into loaikhach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');	

insert into khachhang
values
(1,2,'Nguyễn Đoàn','1989-02-09','234345345','090543454','nguyendoan@gmail.com','Hai Phong'),
(2,3,'Nguyễn Anh','1991-12-17','223445398','095643457','nguyenanh@gmail.com','Quảng Bình'),
(3,1,'Lê Hùng','1990-02-12','342345456','0906456756','hung@gmail.com','Hai Dương'),
(4,4,'Đoàn Lĩnh','1978-02-12','234345665','0935678767','doanlinhgmail.com','Đà Nẵng'),
(5,5,'Tô Lâm','1995-02-12','323454345','090542546','tolam@gmail.com','Hà Nội');

insert into loaidichvu
values
(1,'Villa'),
(2,'House'),
(3,'Room');

insert into kieuthue
values
(1,'năm',90000000),
(2,'tháng',1200000),
(3,'ngày',2000000),
(4,'giờ',200000);

insert into dichvu
values
(1,'thuê view biển villa',200,2,'12',5000000,3,1,'tốt nhất'),
(2,'thuê view biển house',100,2,'9',4000000,3,2,'tốt nhất'),
(3,'thuê view biển room',30,2,'3',3000000,3,3,'tốt nhất'),
(4,'thuê view trung tâm villa',200,2,'12',4000000,3,1,'tốt nhất'),
(5,'thuê view trung tâm house',100,2,'9',3000000,3,2,'tốt nhất'),
(6,'thuê view trung tâm room',30,2,'3',2000000,3,3,'tốt nhất');

insert into hopdong
values
(1,2,1,1,'2020-12-12','2021-01-02',3000000,5000000),
(2,3,4,2,'2021-01-12','2021-01-20',400000,7000000),
(3,6,3,4,'2020-03-12','2021-03-22',5000000,10000000);

insert into dichvudikem
values
(1,'massage',500000,1,'hoàn thành'),
(2,'karaoke',400000,1,'một giờ'),
(3,'thức ăn',100000,1,'một khẩu phần'),
(4,'nước uống',20000,1,'chai'),
(5,'thuê xe di chuyển tham quan resort',1000000,1,'tour');

insert into hopdongchitiet
values
(1,1,2,3),
(2,2,1,2),
(3,3,4,2);
-- task2 --
select * from nhanvien
where hoten like 'h%' or hoten like 't%' or hoten like'k%' and character_length(hoten)<=15;
-- task3 --
select * from khachhang
where (timestampdiff(year,ngaysinh,curdate()) between 18 and 50)  and 
(diachi='quang tri' or diachi='da nang');
-- task4 --
select count(hopdong.IDKhachHang) as so_lan_dat ,khachhang.HoTen ,loaikhach.TenLoaiKhach from hopdong
inner join khachhang on khachhang.IDKhachHang=hopdong.IDKhachHang
inner join loaikhach on loaikhach.IDLoaiKhach=khachhang.IDLoaiKhach
where loaikhach.TenLoaiKhach='diamond'
order by so_lan_dat asc;
-- task5 --
select khachhang.IDKhachHang, khachhang.HoTen, loaikhach.TenLoaiKhach, hopdong.IDHopDong, TenDichVu, 
hopdong.NgayLamHopDong, hopdong.NgayKetThuc,
(dichvu.ChiPhiThue +hopdongchitiet.SoLuong*dichvudikem.Gia) as TongTien from hopdongchitiet

inner join dichvudikem on dichvudikem.IDDichVuDiKem=hopdongchitiet.IDDichVuDiKem
inner join   hopdong on hopdong.IDHopDong=hopdongchitiet.IDHopDong
inner join dichvu on dichvu.IDDichVu=hopdong.IDDichVu
inner join khachhang on khachhang.IDKhachHang=hopdong.IDKhachHang
inner join loaikhach on loaikhach.IDLoaiKhach=khachhang.IDLoaiKhach;

-- task6 --
select dichvu.IDDichVu, dichvu.TenDichVu, dichvu.DienTich, dichvu.ChiPhiThue, loaidichvu.TenLoaiDichVu ,hopdong.NgayLamHopDong from dichvu
inner join loaidichvu on loaidichvu.IDloaidichvu=dichvu.IDLoaiDichVu
inner join hopdong on hopdong.IDDichVu=dichvu.IDDichVu
where dichvu.IDDichVu not in (select hopdong.IDDichVu from hopdong 
 where month( NgayLamHopDong) in (01,02,03)  and year(NgayLamHopDong)=2019);
 -- task7 --
 select dichvu.IDDichVu, dichvu.TenDichVu, dichvu.DienTich, dichvu.SoNguoiToiDa, dichvu.ChiPhiThue, loaidichvu.TenLoaiDichVu,hopdong.NgayLamHopDong from dichvu
inner join loaidichvu on loaidichvu.IDloaidichvu=dichvu.IDLoaiDichVu
inner join hopdong on hopdong.IDDichVu=dichvu.IDDichVu
where year(NgayLamHopDong)=2018 and dichvu.IDDichVu not in (select hopdong.IDDichVu from hopdong 
 where   year(NgayLamHopDong)=2019  );
 -- task8 --
		--  cach 1---
select hoten from khachhang
union
select hoten from khachhang;
		-- cach 2 --
select distinct hoten from khachhang;
		-- cach 3--
select hoten from khachhang
group by HoTen;
-- task9 --
select count(hopdong.idkhachhang) as so_khach_hang , month (ngaylamhopdong) as thang,year(ngaylamhopdong) as nam from khachhang
inner join hopdong on hopdong.IDKhachHang=khachhang.IDKhachHang
where year(hopdong.ngaylamhopdong)='2019'
group by month (ngaylamhopdong);
-- task10 --
select  hopdong.IDHopDong,  hopdong.NgayLamHopDong,  hopdong.NgayKetthuc,  hopdong.TienDatCoc,count(hopdongchitiet.IDHopDongChiTiet) as SoLuongDichVuDiKem  from hopdong
inner join hopdongchitiet on hopdongchitiet.IDHopDong=hopdong.IDHopDong
group by IDHopDong;
-- task11 --
select loaikhach.TenLoaiKhach,khachhang.DiaChi,dichvudikem.TenDichVuDiKem,dichvudikem.Gia ,khachhang.HoTen from dichvudikem
inner join hopdongchitiet on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
inner join hopdong on hopdong.IDHopDong=hopdongchitiet.IDHopDong
inner join khachhang on khachhang.IDKhachHang=hopdong.IDKhachHang
inner join loaikhach on loaikhach.IDLoaiKhach=khachhang.IDLoaiKhach
where TenLoaiKhach='diamond' and (DiaChi='vinh' or DiaChi='quang tri');

-- task12 chua xong--
-- SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết)
select hopdong.IDHopDong, nhanvien.hoten, khachhang.HoTen, khachhang.SDT, dichvu.TenDichVu
 from hopdong
inner join khachhang on khachhang.IDKhachHang=hopdong.IDKhachHang
inner join nhanvien on nhanvien.IDNhanVien=hopdong.IDNhanVien
inner join dichvu on dichvu.IDDichVu=hopdong.IDDichVu
inner join hopdongchitiet on hopdongchitiet.IDHopDong=hopdong.IDHopDong;

 -- task 13 --

select dichvudikem.TenDichVuDiKem,dichvudikem.TrangThaiKhaDung,dichvudikem.Gia,dichvudikem.DonVi,hopdongchitiet.SoLuong from   dichvudikem
inner join hopdongchitiet on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
order by soluong desc;

-- task 14 --
 
 select hopdong.IDHopDong, loaidichvu.TenLoaiDichVu, dichvudikem.TenDichVuDiKem,count(dichvudikem.IDDichVuDiKem) as So_Lan_Su_Dung  from hopdong
 inner join dichvu on dichvu.IDDichVu=hopdong.IDDichVu
 inner join loaidichvu on loaidichvu.IDLoaiDichVu=dichvu.IDLoaiDichVu
 inner join hopdongchitiet on hopdongchitiet.IDHopDong=hopdong.IDHopDong
 inner join dichvudikem on dichvudikem.IDDichVuDiKem=hopdongchitiet.IDDichVuDiKem
 group by dichvudikem.IDDichVuDiKem
 having  So_Lan_Su_Dung=1;
-- task 15 --
select nhanvien.IDNhanVien, nhanvien.HoTen, TrinhDo.TenTrinhDo , bophan.TenBoPhan, nhanvien.SDT, nhanvien.DiaChi from nhanvien
inner join trinhdo on trinhdo.IDTrinhDo=nhanvien.IDTrinhDo
inner join bophan on bophan.IDBoPhan=nhanvien.IDBoPhan
inner join hopdong on hopdong.IDNhanVien=nhanvien.IDNhanVien
where year(hopdong.ngaylamhopdong)='2019' or year(hopdong.ngaylamhopdong)='2018'
group by hopdong.IDNhanVien
having count(IDHopDong) >=3;
-- task16 --
delete nv,hd from nhanvien nv
join hopdong  hd on hd.idnhanvien=nv.IDNhanVien
where  not (year(ngaylamhopdong)>=2017 and year(ngaylamhopdong)<=2019);
-- task18--
delete kh,hd from khachhang kh
join hopdong  hd on hd.IDKhachHang=kh.IDKhachHang
where  year(ngaylamhopdong)<=2016;
-- task20--
select IDNhanVien, HoTen, Email, Sdt, NgaySinh, DiaChi from nhanvien
union all
select IDKhachHang, HoTen, Email, Sdt, NgaySinh, DiaChi from khachhang