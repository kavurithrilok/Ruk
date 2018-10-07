package com.server.verizon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@SpringBootApplication
@EnableEurekaServer
public class Microserver {
	
 /*@Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Microserver.class);
	    }*/
		public static void main(String[] args) throws Exception{
			SpringApplication.run(Microserver.class, args);
			
			
			
			

	/*	class LogExample {

			    private final Logger LOG = LogManager.getLogger(Microserver.class);

			    public void main(String[] args) {

			        LOG.debug("This Will Be Printed On Debug");
			        LOG.info("This Will Be Printed On Info");
			        LOG.warn("This Will Be Printed On Warn");
			        LOG.error("This Will Be Printed On Error");
			        LOG.fatal("This Will Be Printed On Fatal");
			        LOG.info("Appending string: {}.", "Hello, World");
			    }

			}	*/
			System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");

			Logger log = LogManager.getLogger(Microserver.class.getName());
		}

	}

