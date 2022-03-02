package com.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//write a method to read the property file

public class ReadFile {

	public static Properties readprop(String path) throws IOException {
	FileInputStream f=new FileInputStream(new File(path));
	Properties prop=new Properties();
	prop.load(f);
	return prop;
	}
	
}
