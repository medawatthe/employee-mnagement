CREATE DATABASE 'demo';
USE demo;

create table users (
	nicid  int(3) NOT NULL,
	name varchar(120) NOT NULL,
	department varchar(220) NOT NULL,
	 designation varchar(120),
	 joined_date varchar(120),
	PRIMARY KEY (nicid)
);

