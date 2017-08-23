
/* Drop Tables */

DROP TABLE IF EXISTS t_todo;
DROP TABLE IF EXISTS m_user;




/* Create Tables */

CREATE TABLE m_user
(
	id serial NOT NULL,
	user_name varchar(20) NOT NULL,
	mail_address varchar(256) NOT NULL UNIQUE,
	password varchar(128) NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE t_todo
(
	id serial NOT NULL,
	content text NOT NULL,
	limit_date date,
	status char(2) NOT NULL,
	priority smallint NOT NULL,
	user_id int NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE t_todo
	ADD FOREIGN KEY (user_id)
	REFERENCES m_user (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



