package com.scion.currencyconverter.frsbrz.currencyconverter.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.scion.currencyconverter.frsbrz.currencyconverter.bean.CurrencyConversionBean;

/*@FeignClient(name= "exchange-service", url="localhost:8001")*/
@FeignClient(name= "exchange-service")
@RibbonClient(name="exchange-service")
public interface CurrencyExchangeServiceProxy 
{
	@GetMapping("/currency-service/from/{exchange_from_currency}/to/{exchange_to_currency}")
	public CurrencyConversionBean GetCurrencyExchangeRate(
			@PathVariable String exchange_from_currency, @PathVariable  String exchange_to_currency);

}
