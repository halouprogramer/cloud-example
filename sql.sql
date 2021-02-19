create database if not exists user_db default charset utf8;

use user_db;

create table user(
    id int not null auto_increment primary key,
    username varchar(20) not null default '' comment '用户名'
)Engine=InnoDB default charset utf8;


create database if not exists company_db default charset utf8;

use company_db;

create table company(
     id int not null auto_increment primary key,
     company_name varchar(20) not null default '' comment '公司名称'
)Engine=InnoDB default charset utf8 comment '公司';


create table company_user_ref(
    id int not null auto_increment primary key ,
    comany_id int not null default 0 comment '公司id',
    user_id int not null default 0 comment '用户id'
)Engine=InnoDB default charset utf8 comment '公司用户关联';
