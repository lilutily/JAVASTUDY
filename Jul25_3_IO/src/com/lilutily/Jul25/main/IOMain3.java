package com.lilutily.Jul25.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOMain3 {
	public static void main(String[] args) {
		
		
			
			try {
				FileInputStream fis = new FileInputStream("C:\\javatest\\Jul28.txt");
				InputStreamReader isr = new InputStreamReader(fis, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String line = null;
				while((line =br.readLine()) != null) {
					System.out.println(line);
					br.close();
			} 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
