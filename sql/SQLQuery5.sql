create database bank_sys

create table bank (
bank_code nvarchar(30) primary key ,
bank_address nvarchar(30) not null ,
bank_name nvarchar(30) not null 
)

create table bank_branch (
brank_num nvarchar(30) primary key ,
br_address nvarchar(30) not null ,
br_name nvarchar(30) not null ,
bank_code nvarchar(30) ,
constraint bank_fk foreign key (bank_code)
references bank (bank_code) 
)


create table account (
acc_num nvarchar(30) primary key ,
acc_balance nvarchar(30) not null ,
acc_type nvarchar(30) not null ,
br_num nvarchar(30) ,
constraint brank_fk foreign key (br_num)
references bank_branch (brank_num) 
)


create table customer (
customer_ssn nvarchar(30) primary key ,
customer_name nvarchar(30) not null ,
customer_phone nvarchar(30) not null ,
customer_address nvarchar(30) not null
)


create table customer_account (
acc_num nvarchar(30) ,
customer_ssn nvarchar(30) ,
constraint use_account foreign key (customer_ssn)
references customer (customer_ssn) ,
constraint used_by foreign key (acc_num)
references account (acc_num) 
)


create table loan (
loan_num nvarchar(30) primary key ,
loan_type nvarchar(30) not null ,
loan_amount nvarchar(30) not null ,
br_num nvarchar(30) ,
constraint br_fk foreign key (br_num)
references bank_branch (brank_num)
)

create table borrow (
customer_ssn nvarchar(30) ,
loan_num nvarchar(30) ,
constraint customer_fk foreign key (customer_ssn)
references customer (customer_ssn) ,
constraint loan_fk foreign key (loan_num)
references loan (loan_num) 
)