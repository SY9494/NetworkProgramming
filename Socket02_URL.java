package com.socket.exam;

import java.net.MalformedURLException;
import java.net.URL;

public class Socket02_URL {

	public static void main(String[] args) throws MalformedURLException {
		
		String path = "http://www.google.com:8080";
		path += "/depth1/page.jsp?param1=%EA%B0%921#123&param2=값2";
		URL url = new URL(path);
		
		System.out.println("URL 함수");
		print("전체경로", path);
		print("getHost", url.getHost());
		print("getPort", url.getPort());
		print("getPath", url.getPath());
		print("getFile", url.getFile());
		print("getQuery", url.getQuery());
		print("getAuthority", url.getAuthority());
		print("getRef", url.getRef());
		print("getDefaultPort", url.getDefaultPort());
		print("toExternalForm", url.toExternalForm());
		System.out.println();
		
	}

	private static void print(String string, int port) {
		System.out.println(string + " : " + port);
		
	}

	private static void print(String string, String path) {
		System.out.println(string + " : " + path);
		
	}
	
}
