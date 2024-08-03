SET search_path TO testcase;
drop table if exists dreams;
drop table if exists users;

create table if not exists users  (
    userid serial  CONSTRAINT fk_userid primary key,  
	username varchar(50) unique not null,
	password varchar(50) not null
);


insert into users values
(default, 'Test', 'password'),
(default, 'Mark', '12345'),
(default, 'Olsen', '54321');


select * from users;


create table if not exists dreams  (
	id serial primary key,
	time_stamp timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    themes text[],
    archetypes smallint[],
    description text,
    image_name int,
    interpretation_ai text,
    interpretation_user text,
	fk_userid serial,
	FOREIGN KEY (fk_userid) REFERENCES users(userid) 
	
	
);

insert into dreams values
(default,default,'{flying,falling}','{1,2}', 'Dreamt of flying over mountains and then falling into a river.',1,'Possible interpretation of desire for freedom and fear of failure.','User interpretation of feeling trapped in daily routine.',1),
(default,default,'{chase,escape}','{3,4}', 'Dreamt of being chased by an unknown entity and escaping into a forest.',2,'Possible interpretation of running away from responsibilities.','User interpretation of anxiety about upcoming deadlines',1),
(default,default,'{water,calm}','{5,6}', 'Dreamt of calmly floating on a vast ocean under the clear sky.',3,'Possible interpretation of seeking inner peace and tranquility.','User interpretation of need for relaxation and mental clarity.',2);


select * from dreams;