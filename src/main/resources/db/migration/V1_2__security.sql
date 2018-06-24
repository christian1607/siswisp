/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  toshiba
 * Created: Jun 23, 2018
 */

create table "security".users(
	username character(50) not null primary key,
	password character(50) not null,
	enabled boolean not null
);


create table "security".authorities (
	username character(50) not null,
	authority character(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);