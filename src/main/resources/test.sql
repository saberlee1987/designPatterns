create table users
(
    id   bigint unsigned auto_increment primary key,
    name varchar(45) not null
) engine = InnoDB
  character set utf8;
#
# -- Section1
# create table events
# (
#     id          bigint unsigned auto_increment primary key,
#     name        varchar(255) not null ,
#     description text not null ,
#     date        datetime ,
#     created_at  timestamp default current_timestamp()
# );
# -- Section2
# create table event_user
# (
#     user_id  bigint unsigned  ,
#     event_id bigint unsigned  ,
#     constraint user_id_fk foreign key  (user_id) references users (id) on delete cascade ,
#     constraint event_id_fk foreign key  (event_id) references events (id)
# ) ;

-- Section1
create table events
(
    id          bigint unsigned auto_increment primary key,
    name        varchar(255) not null,
    description text not null,
    date        datetime not null,
    created_at  timestamp default current_timestamp()
)engine InnoDB DEFAULT charset utf8;

-- Section2
create table event_user
(
    user_id  bigint unsigned ,
    event_id bigint unsigned ,
    constraint user_id_fk foreign key (user_id) references users(id) on delete cascade,
    constraint event_id_fk foreign key (event_id) references events(id)
)engine InnoDB DEFAULT charset utf8;

