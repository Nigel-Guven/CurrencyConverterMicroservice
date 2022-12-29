package com.scion.currencyconverter.frsbrz.currencyconverter.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.scion.currencyconverter.frsbrz.currencyconverter.bean.CurrencyConversionBean;

@RestController
public class CurrencyConversionCalculatorController 
{

	@GetMapping("currency-conversion/from/{fromCurrency}/to/{toCurrency}/quantity/{quantity}")
	public CurrencyConversionBean GetConversionDetails( 
			@PathVariable("fromCurrency") String fromCurrency, 
			@PathVariable("toCurrency") String toCurrency,
			@PathVariable("quantity") BigDecimal quantity) 
	{
		ResponseEntity<CurrencyConversionBean> responseEntity = null;
		Map<String, String> uriVariables = new HashMap<String, String>();
		
		uriVariables.put("from", fromCurrency);
		uriVariables.put("to", toCurrency);
		
		try 
		{
			responseEntity = new RestTemplate().getForEntity(
					"http://localhost:8001/currency-service/from/{from}/to/{to}", 
					CurrencyConversionBean.class, 
					uriVariables );
		}
		catch(RestClientException e)
		{
			e.printStackTrace();
		}
		
		CurrencyConversionBean response = responseEntity.getBody();
		
		return new CurrencyConversionBean(
				response.getId(), 
				fromCurrency, 
				toCurrency, 
				quantity, 
				response.getExchangeRate(), 
				quantity.multiply(response.getExchangeRate()), 
				response.getPort());
		
	}
}

