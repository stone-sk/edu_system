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
insert into t_student values('0001','0001','流殇','男');
insert into t_student values('0002','0002','郭丽芳','女');
insert into t_student values('0003','0003','林金玉','女');
insert into t_student values('0004','0004','王丽华','女');
insert into t_student values('0005','0005','李星武','男');
insert into t_student values('0006','0006','何悦','男');
insert into t_student values('0007','0007','李丽晶','女');
insert into t_student values('0008','0008','邓丽财','女');
insert into t_student values('0009','0009','郑义进','男');
insert into t_student values('0010','0010','陈华博','男');
create table t_teacher(
       teano  varchar(20) primary key,
       teapwd  varchar(20),
       teaname  varchar(20),
       teasex  varchar(20),
       title  varchar(20)
) default charset=utf8;
insert into t_teacher values('001','001','符传谊','男','教授');
insert into t_teacher values('002','002','张红','女','讲师');
insert into t_teacher values('003','003','王刚','男','副教授');
insert into t_teacher values('004','004','范购','女','教授');
insert into t_teacher values('005','005','张新','男','讲师');
insert into t_teacher values('006','006','江海','男','讲师');
insert into t_teacher values('007','007','唐彪','男','讲师');

create table t_course(
       courseno  varchar(20) primary key,
       coursename  varchar(20),
       credit  float,
       teano varchar(20)
) default charset=utf8;
insert into t_course values('001','高等数学','5.0','003');
insert into t_course values('002','高等数学','5.0','006');
insert into t_course values('003','高等数学','5.0','007');
insert into t_course values('004','java','5.0','002');
insert into t_course values('005','计算机应用','5.0','002');
insert into t_course values('006','计算机应用','5.0','004');
insert into t_course values('007','电子商务','5.0','004');
insert into t_course values('008','大学物理','5.0','003');
insert into t_course values('009','大学物理','5.0','001');
insert into t_course values('010','电路','5.0','003');
insert into t_course values('011','电路','5.0','001');
insert into t_course values('012','哲学','5.0','005');
insert into t_course values('013','经济学','5.0','005');
create table t_score (
       stuno    varchar(20),
       courseno    varchar(20),
       type  varchar(20),
       score  float,
       state  varchar(20)
) default charset=utf8;

commit;
