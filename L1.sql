create database ProductManagement
use ProductManagement

create table tblUsers(
	userID varchar(10),
	fullName nvarchar(50),
	password varchar(50),
	status bit,
	PRIMARY KEY (userID),
)
go

create table tblCategories(
	categoryID varchar(10),
	categoryName nvarchar(50),
	description nvarchar(200),
	PRIMARY KEY (categoryID),
)
go



create table tblProducts(
	productID varchar(10),
	productName nvarchar(50),
	unit varchar(50),
	price float,
	quantity integer,
	categoryID varchar(10),
	PRIMARY KEY (productID),
	FOREIGN KEY (categoryid) REFERENCES tblCategories(categoryID),
)
go

insert tblUsers values('Duong','LHDuong','123',1)

select fullname, status
from tblUsers
where userID = 'hduong' and password = 123456


select categoryID,categoryName,description
from tblCategories

insert tblCategories values('New','HAHA','NewNew')



delete from tblCategories
where categoryID = 'New'

update tblCategories
set categoryName = 'cate3', description = 'cate'
where categoryID = 'CA3'

select productID,productName,unit,price,quantity,categoryid
from tblProducts

insert tblProducts values('P1','ProD','unit',1000.1,1,'Cate1')

delete from tblProducts
where productID = 'P1'

update tblProducts
set productName = 'Pr1', unit = 'unit', price = 1, quantity = 1, categoryid = 'Cate1'
where productID = 'P1'

select *
from tblUsers
where fullName like '%le%'