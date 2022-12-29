package com.scion.currencyconverter.frsbrz.currencyfx.currencyexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.scion.currencyconverter.frsbrz.currencyfx.currencyexchange.entity.CurrencyExchangeRate;
import com.scion.currencyconverter.frsbrz.currencyfx.currencyexchange.repository.ExchangeRepository;

@RestController
public class CurrencyExchangeController 
{
	@Autowired
	Environment environment;
	@Autowired
	ExchangeRepository exchangeRepository;
	
	@GetMapping("/currency-service/from/{exchange_from_currency}/to/{exchange_to_currency}")
	public CurrencyExchangeRate GetCurrencyExchangeRate(@PathVariable String exchange_from_currency, @PathVariable  String exchange_to_currency)
	{
		CurrencyExchangeRate currencyExchangeRate = exchangeRepository.findByExchangeFromCurrencyAndExchangeToCurrency(exchange_from_currency, exchange_to_currency);
		currencyExchangeRate.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return currencyExchangeRate;
	}

}
