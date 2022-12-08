--drop table if exists quizz;
 CREATE TABLE quizz (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    image VARCHAR(500),
    creation_date date NOT NULL DEFAULT current_date
 );
 --drop table if exists question;
 create table question (
 	id SERIAL primary key,
 	quizz_id int8 not null,
 	question varchar(500) not null,
 	answer1 varchar(100) not null,
 	answer2 varchar(100) not null,
 	answer3 varchar(100),
 	answer4 varchar(100),
 	correct_answer smallint not null,
 	constraint fk_que_qui foreign key (quizz_id) references quizz(id) on delete cascade
 );