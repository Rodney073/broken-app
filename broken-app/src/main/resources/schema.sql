CREATE TABLE shares
(
  share_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,

  buy_date DATE,
  buy_price BIGINT,
  buy_cost BIGINT,
  sell_date DATE,
  sell_price BIGINT,
  sell_cost BIGINT,

  user_id BIGINT,
  currency VARCHAR (20)
);


CREATE TABLE users
(
  user_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR (50),
  password VARCHAR (50),
  enabled NUMERIC
);
