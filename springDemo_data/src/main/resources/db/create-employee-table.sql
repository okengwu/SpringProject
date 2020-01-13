
use springDemoDB;

drop  table if exists employee;


create table `employee` (

 id INT NOT NULL AUTO_INCREMENT,
 `firstname` VARCHAR(45) default NULL,
 `lastname` VARCHAR(45) default NULL,
 `email` VARCHAR(45) default NULL,

  PRIMARY KEY (id)

 )ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
