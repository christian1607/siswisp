/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  toshiba
 * Created: Jun 23, 2018
 */


create table users(
	username character(50) not null primary key,
	password character(100) not null,
	enabled boolean not null
);


create table authorities (
	username character(50) not null,
	authority character(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

insert into security.users values ('admin','$2a$10$uyQk1/XOgnFfDcjyV2VFIeYnfNNiK8.ehOLrg0WEmsDVJtxmfdq8a',true);
insert into security.authorities values ('admin','ADMIN');