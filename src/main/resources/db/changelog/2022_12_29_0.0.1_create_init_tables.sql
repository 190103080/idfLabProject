create table t_exchangevalue (
    id SERIAL PRIMARY KEY NOT NULL,
    account_from bigint,
    account_to bigint,
    currency_shortname varchar(255),
    summ double precision,
    expense_category varchar(255),
    datetime timestamp with time zone
)