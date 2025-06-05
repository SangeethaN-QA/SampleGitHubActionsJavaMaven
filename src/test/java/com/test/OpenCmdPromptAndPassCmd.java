package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OpenCmdPromptAndPassCmd {

	public static void main(String[] args) throws IOException, InterruptedException {

		//  String anyCommand="adp shell input text 1234";
		  String anyCommand = "ipconfig";
		//  String anyCommand = "javac";

	     
		    try {
		    	
		    	
		       Process process = Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);


		    } catch (IOException e) {
		        e.printStackTrace();
		    }
	}
	
}

