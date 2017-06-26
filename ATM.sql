 create database db_atm; 
 create user 'springuser'@'localhost' identified by 'ThePassword';
grant all on db_atm.* to 'springuser'@'localhost';

use db_atm;
CREATE TABLE `db_atm`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `account_number` long NULL,
  `action` VARCHAR(50) NULL,
  `amount` double NULL,
  `balance` double NULL,
  `reason` varchar(50) NULL,  
  PRIMARY KEY (`id`));
  
  
select * from user;
