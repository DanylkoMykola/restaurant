INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (3, now() - interval '3 days', now() + interval '1 days', 'KG', 'Tomato', 50.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (5, now() - interval '1 days', now() + interval '2 days', 'KG', 'Potato', 20.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (500, now() - interval '15 days', now() + interval '3 days', 'G', 'Pistachios', 70.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (100, now() - interval '5 days', now() + interval '5 hours', 'ML', 'Cheese sauce', 25.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (2, now() - interval '2 days', now() + interval '5 hours', 'L', 'Milk', 20.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (5, now() - interval '3 days', now() + interval '3 hours', 'KG', 'Cabbage', 10.0);

insert into customer(discount, name)
values (0, 'Silpo');

insert into customer(discount, name)
values (0, 'ATB');

insert into customer(discount, name)
values (5, 'Puzata Hata');

insert into customer(discount, name)
values (10, 'Grand Hotel');

insert into goods( freshness_hours, price_per_unit, name_of_product, measurement_unit)
values (168, 25, 'Tomato', 'KG');

insert into goods(freshness_hours, price_per_unit, name_of_product, measurement_unit)
values (256, 5, 'Potato', 'KG');

insert into goods(freshness_hours, price_per_unit, name_of_product, measurement_unit)
values (120, 30, 'Milk', 'L');