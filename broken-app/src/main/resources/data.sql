INSERT INTO users (user_id, username, password) VALUES (101, 'Joe123', password);
INSERT INTO users (user_id, username, password) VALUES (102, 'Jane123', password);
INSERT INTO users (user_id, username, password) VALUES (103, 'DoeJ', password);
INSERT INTO users (user_id, username, password) VALUES (104, 'Tim123', password);


INSERT INTO shares (share_id, buy_date, buy_price, buy_cost, sell_date, sell_price, sell_cost, user_id, currency) VALUES (101, TO_DATE('17/12/2015', 'DD/MM/YYYY'), 1000, 2000, TO_DATE('10/10/2018', 'DD/MM/YYYY'), 3000, 4000, 103, 'USD');
INSERT INTO shares (share_id, buy_date, buy_price, buy_cost, sell_date, sell_price, sell_cost, user_id, currency) VALUES (102, TO_DATE('18/12/2016', 'DD/MM/YYYY'), 1500, 2200, TO_DATE('11/10/2019', 'DD/MM/YYYY'), 4000, 2000, 102, 'USD');
INSERT INTO shares (share_id, buy_date, buy_price, buy_cost, sell_date, sell_price, sell_cost, user_id, currency) VALUES (103, TO_DATE('19/12/2017', 'DD/MM/YYYY'), 1800, 3000, TO_DATE('12/10/220', 'DD/MM/YYYY'), 5000, 3000, 104, 'HUF');