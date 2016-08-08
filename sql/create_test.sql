CREATE DATABASE test_spring_boot;

use test_spring_boot;

CREATE TABLE user(
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(120) NOT NULL,
  `email` varchar(2000) NOT NULL,
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user VALUES (null, 'tom', 'tom@gmail.com');
INSERT INTO user VALUES (null, 'jack', 'jack@gmail.com');
INSERT INTO user VALUES (null, 'mike', 'mike@gmail.com');