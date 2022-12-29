TRUNCATE TABLE t_limit;
ALTER TABLE t_limit ADD COLUMN limitexceeded_id int;
ALTER TABLE t_limit ADD CONSTRAINT fk_limit_exceeded
                foreign key (limitexceeded_id)
                references t_limitexceeded (id)