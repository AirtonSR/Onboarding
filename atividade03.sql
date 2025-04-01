
create table temperaturesteste
(
    id         bigserial,
    celsius    double precision        not null,
    id_test    integer                 not null,
    created_at timestamp default now() not null,
    time_sec   integer                 not null,
    num_frame  integer                 not null
);


SELECT create_hypertable('temperaturesteste', 'reading_time');


INSERT INTO temperatures (id, celsius, id_test, created_at, time_sec, num_frame) VALUES (7188924, 30.94, 14157, '2025-03-21 11:31:53.000000', 13, 4);
INSERT INTO temperatures (id, celsius, id_test, created_at, time_sec, num_frame) VALUES (7188923, 30.88, 14157, '2025-03-21 11:31:52.000000', 10, 3);
INSERT INTO temperatures (id, celsius, id_test, created_at, time_sec, num_frame) VALUES (7188922, 30.81, 14157, '2025-03-21 11:31:50.000000', 7, 2);
INSERT INTO temperatures (id, celsius, id_test, created_at, time_sec, num_frame) VALUES (7188921, 30.75, 14157, '2025-03-21 11:31:49.000000', 4, 1);
INSERT INTO temperatures (id, celsius, id_test, created_at, time_sec, num_frame) VALUES (7188920, 30.75, 14157, '2025-03-21 11:31:48.000000', 1, 0);
INSERT INTO temperatures (id, celsius, id_test, created_at, time_sec, num_frame) VALUES (7188919, 30.75, 14157, '2025-03-21 11:31:47.000000', 1, 0);

select * from temperaturesteste