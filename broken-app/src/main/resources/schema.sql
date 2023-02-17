CREATE TABLE Shares
(
  shareId BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  type VARCHAR (50),
  currency VARCHAR (50),
  amount INT,
  buy_date DATE,
  buy_price INT,
  buy_case INT,
  sell_date DATE,
  sell_price INT
);