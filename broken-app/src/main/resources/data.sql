INSERT INTO users (user_id, username, password, enabled) VALUES (101, 'Joe123', 'password', 1);
INSERT INTO users (user_id, username, password, enabled) VALUES (102, 'Jane123', 'password', 1);
INSERT INTO users (user_id, username, password, enabled) VALUES (103, 'DoeJ', 'password', 1);
INSERT INTO users (user_id, username, password, enabled) VALUES (104, 'Tim123', 'password', 1);

INSERT INTO shares (share_id, buy_date, buy_price, buy_cost, sell_date, sell_price, sell_cost, user_id, currency) VALUES (101, '2015-12-17', 1000, 2000, '2015-12-17', 3000, 4000, 103, 'USD');
INSERT INTO shares (share_id, buy_date, buy_price, buy_cost, sell_date, sell_price, sell_cost, user_id, currency) VALUES (102, '2015-12-17', 1500, 2200, '2015-12-17', 4000, 2000, 102, 'USD');
INSERT INTO shares (share_id, buy_date, buy_price, buy_cost, sell_date, sell_price, sell_cost, user_id, currency) VALUES (103, '2015-12-17', 1800, 3000, '2015-12-17', 5000, 3000, 104, 'HUF');