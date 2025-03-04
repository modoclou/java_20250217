package com.company.java011_ex;
//public(아무데서나 사용) > protected(extends) > package(같은폴더) > private(걔가 갖고 있는 *클래스 내*에서만)
//															  getters/setters
public class Milk{  // java011_ex에 설정해주세요!
   private int  mno;   
   private String mname;  
   private  int mprice;
   @Override public String toString() { return "Milk [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]"; }
   
	public int getMno() { return mno; }
	public void setMno(int mno) { this.mno = mno; }
	public String getMname() { return mname; }
	public void setMname(String mname) { this.mname = mname; }
	public int getMprice() { return mprice; }
	public void setMprice(int mprice) {	this.mprice = mprice; }  
}