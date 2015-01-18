set names utf8;
drop database if exists `edu_system`;
create database edu_system;
use edu_system;
 
drop table if exists t_student;
drop table if exists t_teacher;
drop table if exists t_course;
drop table if exists t_score;

create table t_student (
       stuno  varchar(20) primary key,
       stupwd  varchar(20),
       stuname  varchar(20),
       stusex  varchar(20)
) default charset=utf8;
insert into t_student values('0001','0001','0001','male');
insert into t_student values('0002','0002','0002','female');
insert into t_student values('0003','0003','0003','female');
insert into t_student values('0004','0004','0004','female');
insert into t_student values('0005','0005','0005','male');
insert into t_student values('0006','0006','0006','male');
insert into t_student values('0007','0007','0007','female');
insert into t_student values('0008','0008','0008','female');
insert into t_student values('0009','0009','0009','male');
insert into t_student values('0010','0010','0010','male');
create table t_teacher(
       teano  varchar(20) primary key,
       teapwd  varchar(20),
       teaname  varchar(20),
       teasex  varchar(20),
       title  varchar(20)
) default charset=utf8;
insert into t_teacher values('001','001','001','male','教授');
insert into t_teacher values('002','002','002','female','讲师');
insert into t_teacher values('003','003','003','male','副教授');
insert into t_teacher values('004','004','004','female','教授');
insert into t_teacher values('005','005','005','male','讲师');
insert into t_teacher values('006','006','006','male','讲师');
insert into t_teacher values('007','007','007','male','讲师');

create table t_course(
       courseno  varchar(20) primary key,
       coursename  varchar(20),
       credit  float,
       teano varchar(20)
) default charset=utf8;
insert into t_course values('001','a','5.0','003');
insert into t_course values('002','a','5.0','006');
insert into t_course values('003','a','5.0','007');
insert into t_course values('004','b','5.0','002');
insert into t_course values('005','c','5.0','002');
insert into t_course values('006','c','5.0','004');
insert into t_course values('007','d','5.0','004');
insert into t_course values('008','e','5.0','003');
insert into t_course values('009','e','5.0','001');
insert into t_course values('010','f','5.0','003');
insert into t_course values('011','f','5.0','001');
insert into t_course values('012','g','5.0','005');
insert into t_course values('013','h','5.0','005');
create table t_score (
       stuno    varchar(20),
       courseno    varchar(20),
       type  varchar(20),
       score  float,
       state  varchar(20)
) default charset=utf8;

commit;
