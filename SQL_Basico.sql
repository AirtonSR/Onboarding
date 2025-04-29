CREATE TABLE users (
    id INT IDENTITY (1,1) constraint PK_users PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE meter (
    id INT IDENTITY (1,1) constraint PK_meter PRIMARY KEY,
    user_id int not null,
    model VARCHAR(255) NOT NULL,
    number INT NOT NULL,
    firmware_version VARCHAR(255) NOT NULL,
    Isactive bit not null
    constraint FK_meter_user foreign key (user_id) references users(id)
);

insert into users ( first_name, last_name, email, password) values ('Airton', 'Rodrigues', 'airton.rodrigues@eletraenergy.com', '123456');

insert into meter (user_id, model, number, firmware_version, Isactive) values (1, 'ELETRA 500', 123456, '1.0.0', 1);

select * from users
join meter on meter.user_id = users.id
where first_name = 'Airton'





