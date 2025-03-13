package com.company.java018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaIO005_buffered {
	public static void main(String[] args) {
		//#1. 경로 만들기
		String folder_rel="src/com/company/java018/";
	    String   file_rel="file005.txt";
	    
	    File folder = new File(folder_rel);
	    File file = new File(folder_rel + file_rel);
		
		//#2. 폴더 + 파일 만들기
	    try {
	    if(! folder.exists()) { folder.mkdir(); }
	    if(! file.exists()) { file.createNewFile(); }
	    } catch(Exception e) { e.printStackTrace(); }
	    /// folder + file 까지 만들고 마무리!
	    
		//#3. 파일 쓰기(byte)
		//	1) 읽어들이는 Stream	> [ Program ] > ## 쓰는 Stream #
		//		BufferedWriter(속도향상) -		OutputStreamWriter(단어)	-	FileOutputStream(byte)
	    try {
			BufferedWriter bw = 
							new BufferedWriter (new OutputStreamWriter(new FileOutputStream(file)));
			bw.write("1, white, 1200\n");
			bw.write("2, choco, 1500\n");
			bw.write("3, banana, 1800\n");
			bw.flush();
			bw.close();
			System.out.println("쓰기완료");
		} catch (Exception e) { e.printStackTrace();	}
	    /*
		 1	white	1200
		 2	choco	1500
		 3	banana	1800
		 */
	    
		//#4. 파일 읽기(byte)
		//	## 읽어들이는 Stream	> ## 쓰는 Stream 누구인지 체크?
		// InputStream (읽기) ## > [Program] > OutputStream (쓰기)
	    // BufferedReader(속도향상) -	InpurStreamReader(단어)	-	FileInputStream(byte)
	    try {
			BufferedReader br =
	    	new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//			System.out.println(br.readLine());
			String line="";
			StringBuffer sb =new StringBuffer(); //주소값 바뀌지 않음
			while((line=br.readLine()) != null) {  //readLine=줄단위로 읽어와서
				//String 문자열 누적을 사용하면 주소값이 바뀜
				sb.append(line + "\n");
			}
			System.out.println(sb.toString());
			br.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
}
