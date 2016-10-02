package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithoutNIOExample {
	public static void main(String[] args) {
		BufferedReader br = null;
		String sCurrentLine = null;
		try {
			br = new BufferedReader(new FileReader("/Users/johne/Documents/RTCOnesourceWorkspace/NIOTest/src/com/test/data.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}