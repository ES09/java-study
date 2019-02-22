
/* Drop Tables */

DROP TABLE Board CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Board
(
	Num number(10,0) NOT NULL,
	Title varchar2(150) NOT NULL,
	Content varchar2(4000)
);



