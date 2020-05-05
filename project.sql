DROP Table Record;
DROP Table User;


Create Table User
(
	username varchar(30),
	password varchar(30)
);

Create Table Record
(
	username varchar(30) not null,
	besttime time,
	gamewon numeric
);

alter table USER
	add CONSTRAINT user_username_pk primary key (username);

alter table record
	add CONSTRAINT record_username_fk foreign key(username)
	references user(username);
	
alter table Record
	add CONSTRAINT record_username_pk primary key(username);

insert into users value('123','z842685');
insert into users value('jay123','z842685');