create table testdemo.sessions
(
    idSession   int(5) unsigned auto_increment primary key,
    nameSession varchar(10) not null
);
create table testdemo.speakers
(
    idSpeaker   int(5) unsigned auto_increment primary key,
    nameSpeaker varchar(25) not null
);
create table testdemo.sessions_speakers
(
    idSessions_speakers int(5) unsigned auto_increment primary key,
    idSession int(5) unsigned,
    idSpeaker int(5) unsigned,
    foreign key (idSession) references testdemo.sessions(idSession),
    foreign key (idSpeaker) references testdemo.speakers(idSpeaker)

)