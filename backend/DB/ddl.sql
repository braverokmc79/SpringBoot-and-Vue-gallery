
create database gallery character set=utf8;
create user `gallery`@`%` identified by 'gallery123';
grant all privileges on gallery.* to `gallery`@`%` ;

