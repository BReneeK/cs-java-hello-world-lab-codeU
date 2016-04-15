package com.flatironschool.javacs;

public class HelloWorld {
    public Double getVersion() {
    	String versionStr = System.getProperty("java.specification.version");
    	Double version = Double.parseDouble(versionStr);
    	return version;
    }

    public static void main(String[] args) {
	    
    }
}
