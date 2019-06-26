drop database if exists aiqc;
drop user if exists 'aiqc'@'localhost';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database aiqc default character set utf8mb4 collate utf8mb4_unicode_ci;
use aiqc;
create user 'aiqc'@'localhost' identified by 'aiqc123456';
grant all privileges on aiqc.* to 'aiqc'@'localhost';
flush privileges;