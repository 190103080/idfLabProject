create table t_limit (
    id serial primary key not null,
    limit_sum double precision,
    limit_datetime timestamp with time zone,
    limit_currency_shortname varchar(255)
);

insert into t_limit (limit_sum, limit_datetime, limit_currency_shortname)
    values
    (1000.0, '2022-01-10 00:00:00+06', 'USD')