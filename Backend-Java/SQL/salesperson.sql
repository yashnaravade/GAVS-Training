drop table orderline;
drop table ordr;
drop table stock;
drop table salesperson


-- SQLINES LICENSE FOR EVALUATION USE ONLY
create table SalesPerson(SPId char(3) primary key,
SPName varchar(20),Age int);

-- SQLINES LICENSE FOR EVALUATION USE ONLY
create table Stock(ICode char(3) primary key,
IDesc varchar(20),UnitPrice numeric(8,2));
 
 -- SQLINES LICENSE FOR EVALUATION USE ONLY
 create table Ordr(ONum char(3) primary key,
 SId char(3),constraint fk_ordr 
 foreign key(sid) references salesperson(spid));
 
 -- SQLINES LICENSE FOR EVALUATION USE ONLY
 create table OrderLine(ONum char(3),ItemCode char(3),Qty int,
 constraint pk_orderline primary key(ONum,ItemCode),
 constraint fk_order foreign key(ONum) references Ordr(ONum),
 constraint fk_stock foreign key(ItemCode) references Stock(ICode)
 )
 
 -- SQLINES LICENSE FOR EVALUATION USE ONLY
 insert into salesperson values('SP1','Jo',45);
 -- SQLINES LICENSE FOR EVALUATION USE ONLY
 insert into salesperson values('SP2','Sally',24);
 -- SQLINES LICENSE FOR EVALUATION USE ONLY
 insert into salesperson values('SP3','Fred',36);
 
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into stock values('I23','Beer mat',0.56);
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into stock values('I45','Aspirin',1.95);
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into stock values('I02','Beer mug',3.67);
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into stock values('I14','Beer glass',0.55); 

-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into Ordr values('O1','SP1');
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into Ordr values('O3','SP2');
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into Ordr values('O2','SP2');

-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into OrderLine values('O1','I14',100);
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into OrderLine values('O3','I14',80);
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into OrderLine values('O2','I14',110);
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into OrderLine values('O2','I23',50);
-- SQLINES LICENSE FOR EVALUATION USE ONLY
insert into OrderLine values('O3','I45',10);



 