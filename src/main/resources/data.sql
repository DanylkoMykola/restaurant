INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (3, now() - interval '3 days', now() + interval '1 days', 'KG', 'Помідори', 50.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (5, now() - interval '1 days', now() + interval '2 days', 'KG', 'Картопля', 20.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (500, now() - interval '15 days', now() + interval '3 days', 'G', 'Фісташки', 70.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (100, now() - interval '5 days', now() + interval '5 hours', 'ML', 'Сирний соус', 25.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (2, now() - interval '2 days', now() + interval '5 hours', 'L', 'Молоко', 20.0);

INSERT INTO ingredients (amount, buy_date, expiration, measurement, name, price)
values (5, now() - interval '3 days', now() + interval '3 hours', 'KG', 'Капуста', 10.0);
