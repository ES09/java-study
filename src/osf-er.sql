
/* Drop Triggers */

DROP TRIGGER TRI_class_info_ci_num;
DROP TRIGGER TRI_student_info_si_num;



/* Drop Tables */

DROP TABLE student_info CASCADE CONSTRAINTS;
DROP TABLE class_info CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_class_info_ci_num;
DROP SEQUENCE SEQ_student_info_si_num;




/* Create Sequences */

CREATE SEQUENCE SEQ_class_info_ci_num INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_student_info_si_num INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE class_info
(
	ci_num number(2,0) NOT NULL,
	ci_name varchar2(100) NOT NULL UNIQUE,
	ci_cnt number(3,0) DEFAULT 0,
	ci_desc varchar2(4000),
	PRIMARY KEY (ci_num)
);


CREATE TABLE student_info
(
	si_num number(4,0) NOT NULL,
	si_id varchar2(100) NOT NULL UNIQUE,
	si_pwd varchar2(100) NOT NULL,
	si_name varchar2(100) NOT NULL,
	si_age number(3,0) NOT NULL,
	si_phone varchar2(15),
	ci_num number(2,0) NOT NULL,
	PRIMARY KEY (si_num)
);



/* Create Foreign Keys */

ALTER TABLE student_info
	ADD FOREIGN KEY (ci_num)
	REFERENCES class_info (ci_num)
;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_class_info_ci_num BEFORE INSERT ON class_info
FOR EACH ROW
BEGIN
	SELECT SEQ_class_info_ci_num.nextval
	INTO :new.ci_num
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_student_info_si_num BEFORE INSERT ON student_info
FOR EACH ROW
BEGIN
	SELECT SEQ_student_info_si_num.nextval
	INTO :new.si_num
	FROM dual;
END;

/




