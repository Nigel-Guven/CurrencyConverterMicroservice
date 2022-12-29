CREATE TABLE currency_exchange_rate (
	ID          INTEGER PRIMARY KEY,
	exchange_from_currency VARCHAR(4) NOT NULL,
	exchange_to_currency VARCHAR(4) NOT NULL,
	EXCHANGE_RATE   BIGINT NOT NULL,
	PORT INT NOT NULL );
