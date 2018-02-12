drop table if exists shop;

create table shop (
    id int primary key not null,
    name varchar(10) not null unique,
    description varchar(250) not null unique
);