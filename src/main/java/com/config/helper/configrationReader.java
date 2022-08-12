package com.config.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configrationReader {

	public Properties p;
	
	public configrationReader() throws IOException {

	File f = new File ("C:\\Users\\VJ\\eclipse-workspace\\Cucumer_Project1\\src\\main\\java\\com\\config\\properties\\confogration.properties");
	FileInputStream fs = new FileInputStream(f);
	p = new Properties();
	
	p.load(fs);
	
	}
	
	
	public String getbrowsername() {
		String browser = p.getProperty("chrome");
		return browser;
	}
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getcreditscardno() {
		String creditcardno = p.getProperty("creditcard");
		return creditcardno;
	}
	
	public String getcvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	
}
