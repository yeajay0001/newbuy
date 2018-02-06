package com.zz.newbuy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class newbuyApp 
{
	private static final Logger logger= LoggerFactory.getLogger(newbuyApp.class);
    public static void main( String[] args )
    {
    	logger.info("app start");
    	SpringApplication.run(newbuyApp.class, args);
    }
}
