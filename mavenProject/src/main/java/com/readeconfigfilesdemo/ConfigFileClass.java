package com.readeconfigfilesdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConfigFileClass {

	public static void main(String[] agrs) {
		
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			prop.load(input);
			
			System.out.println(prop.getProperty("firstName"));
			System.out.println(prop.getProperty("lastName"));
			System.out.println(prop.getProperty("Age"));
		} catch( IOException e) {
			System.out.println("No such properties found");
		}
		
	}
}