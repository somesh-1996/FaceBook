package com.FacebookR;

import java.io.IOException;

public class ConfigurationHelper {
	public static ConfigurationReader getInstance() throws IOException {
		ConfigurationReader cr=new ConfigurationReader();
		return cr;
	}
	private ConfigurationHelper() {
		
	}
}
