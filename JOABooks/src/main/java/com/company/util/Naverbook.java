package com.company.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Naverbook {
	public void getBooks() {
		try {
		//#1. URL
		//	https://openapi.naver.com/v1/search/news.xml	xml
		//	https://openapi.naver.com/v1/search/news.json	json
		String apiurl="https://openapi.naver.com/v1/search/book.xml?query="
						+ URLEncoder.encode("이방인", "UTF-8");
			URL url = new URL(apiurl);
		
		//#2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		//#3. 요청파라미터
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "ECGnyVl0cYNSGGz2T4yQ");
			conn.setRequestProperty("X-Naver-Client-Secre", "ypWbpX4tos");
		
		//	GET	/ query
		//							주소?보낼 이름=값&이름=값
		//	> X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
		//	> X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
		
		//#4. 응답코드 - 200
			System.out.println(conn.getResponseCode());
		int code = conn.getResponseCode();
		BufferedReader br;
		if(code==200) {br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}else {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}

		//#5. 응답데이터 - xml/json/csv
			String line="";	StringBuffer sb = new StringBuffer();
			while((line=br.readLine())!=null) {sb.append(line + "\n");}
			System.out.println(sb.toString());
			br.close(); conn.disconnect();
		} catch(Exception e) { e.printStackTrace(); }
	}
}
