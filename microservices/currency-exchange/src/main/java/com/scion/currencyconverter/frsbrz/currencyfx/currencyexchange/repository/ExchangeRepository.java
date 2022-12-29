package com.scion.currencyconverter.frsbrz.currencyfx.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scion.currencyconverter.frsbrz.currencyfx.currencyexchange.entity.CurrencyExchangeRate;

public interface ExchangeRepository extends JpaRepository<CurrencyExchangeRate, Long>
{
	CurrencyExchangeRate findByExchangeFromCurrencyAndExchangeToCurrency(String exchange_from_currency, String exchange_to_currency);
	
	
}
