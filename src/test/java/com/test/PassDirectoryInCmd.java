package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PassDirectoryInCmd {

	public static void main(String[] args) throws IOException {

		 try {
			 //cmd /c start cmd.exe /K \"C: && cd C:\Users\Sangeetha.Natarajan\""
		        Process process = Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"C: && cd C:\\Users\\Sangeetha.Natarajan && ipconfig\"");

		    } catch (IOException e) {
		        e.printStackTrace();
		    }


	}
}
