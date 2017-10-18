package com.bridgeit.Services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;

@Service
public class RedisService 
	{
	private final static Logger logger=Logger.getLogger(RedisService.class);
	Jedis jedis=new Jedis("localhost");
	
	public void sendtokenredis(String id,String token)
	{
		//jedis.set("key1","anibo");
		jedis.hset(id, "Token", token);
	}
	
	public void gettokenfromredis(String id)
	{
		String token=jedis.hget(id, "Token");
		logger.info(token);
	}
	
	}
