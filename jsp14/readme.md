****************환경
1. windows 10
2. sts
3. tomcat 9.0
4. oracle 11g
5. lombok
6. jstl.jar
7. standard.jar
8. ojdbc6.jar
9. cos.jar


*******************db구조
create table board(num number(5) primary key,name varchar2(30), pass varchar2(30), email varchar2(30),title varchar2(50),content varchar2(1000),readcount number(4) default 0, writedate date default sysdate);
drop table board;

create SEQUENCE board_seq start with 1 INCREMENT by 1;

insert into board values(board_seq.NEXTVAL,'성윤정','pinksung@nate.com','1234','첫방문','반갑습니다');

insert into board(num,name,email,pass,title,content) values(board_seq.nextval,'성윤정','pinksung@name.com','1234','첫방문','반갑습니다');

insert into board(num,name,email,pass,title,content) values(board_seq.nextval,'성윤정','pinksung@name.com','1234','뭐라는거지','반갑습니다');


insert into board(num,name,email,pass,title,content) values(board_seq.nextval,'고길동','dorne@name.com','1234','응아니야','반갑습니다');


insert into board(num,name,email,pass,title,content) values(board_seq.nextval,'전수빈','ylrnew@name.com','1234','뭘봐','반갑습니다');


insert into board(num,name,email,pass,title,content) values(board_seq.nextval,'이무개','vozne@name.com','1234','으딜쳐다보누','반갑습니다');








***********특징
dbcp : <Resource auth="Container"
						driverClassName="oracle.jdbc.OracleDriver" maxIdle="10"
						maxTotal="20" maxWaitMillis="-1" name="jdbc/myoracle"
						password="tiger" type="javax.sql.DataSource"
						url="jdbc:oracle:thin:@127.0.0.1:1521:xe" username="scott" />