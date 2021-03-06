package com.girish.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.girish.Model.Coin;
import com.girish.Repository.CoinRepository;

@Service
public class Test {
	@Autowired
	private CoinRepository coinRepository;
	
	public void getInfo()
	{
		
		RestTemplate rest=new RestTemplate();
		String url="https://api.binance.com/api/v3/trades?symbol=ETHUSDT&limit=1000";
		
	      ResponseEntity<Object[]> responseEntity  =  rest.getForEntity(url, Object[].class);
	                  
	      Object[] objects = responseEntity.getBody();
	      
	      ObjectMapper mapper=new ObjectMapper();
	      
	   List<Coin> list =  Arrays.stream(objects)
	       .map(object->mapper.convertValue(object, Coin.class))
	       .collect(Collectors.toList());
	      
	      for(Coin q:list)
	      {
	    	  coinRepository.save(q);
	    	  System.out.println(q.getPrice());
	      }
	                  
	                  
		
		
		
		
		
		
		
		
	}

}
