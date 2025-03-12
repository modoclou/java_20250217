package com.company.java017_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class Milk{
	private int no;
	private String name;
	private int price;
	
	public Milk() {	super(); }
	public Milk(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	@Override public int hashCode() { return Objects.hash(name, no, price); }
	
	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Milk other = (Milk) obj;
		return Objects.equals(name, other.name) && no == other.no && price == other.price;
	}
}

public class Repeat002 {
	public static void main(String[] args) {
//2. dto 를 이용하여 ArrayList + Iterator  이용해서 만들기     >>> ArrayList<Milk> 
//	List : index O, 중복허용 O / add, get, size, remove, contains
		List<Milk> list = new ArrayList<>();
		list.add(new Milk(1, "white", 1000));
		list.add(new Milk(2, "choco", 1200));
		list.add(new Milk(3, "banana", 1300));
		
		System.out.print("======================\n" + "NO\tNAME\tPRICE\n" + "======================\n" );
		for(int i=0; i<list.size(); i++) {
			Milk temp = list.get(i); //0,1,2
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" + temp.getPrice());
		} System.out.println();
		
//3. dto 를 이용하여 HashSet   + Iterator  이용해서 만들기     >>> HashSet<Milk>
//	Set : index X, 중복허용 X / add, get(X), size, remove, contains
		HashSet<Milk> hash = new HashSet<>();
		hash.add(new Milk(1, "white", 1000));
		hash.add(new Milk(2, "choco", 1200));
		hash.add(new Milk(3, "banana", 1300));
		
		System.out.print("======================\n" + "NO\tNAME\tPRICE\n" + "======================\n" );
		Iterator <Milk> iter = hash.iterator();
		while(iter.hasNext()) {
			Milk milk = iter.next();
			System.out.println(milk.getNo() + "\t" + milk.getName() + "\t" + milk.getPrice());
		} System.out.println();
		
//4. dto 를 이용하여 HashMap   + Iterator  이용해서 만들기     >>> HashMap<Integer, Milk>    
//	Map : index X, 중복허용 X / add(X) put, get(X), size, remove, contains
		Map<Integer, Milk> map = new HashMap<>();
		map.put(1, new Milk(1, "white", 1000));
		map.put(2, new Milk(2, "choco", 1200));
		map.put(3, new Milk(3, "banana", 1300));
		
		System.out.print("======================\n" + "NO\tNAME\tPRICE\n" + "======================\n" );
//		System.out.println(map.entrySet());
//		[1=Milk [no=1, name=white, price=1000], 2=Milk [no=2, name=choco, price=1200], 3=Milk [no=3, name=banana, price=1300]]
		Iterator <Entry <Integer, Milk>> iter1 = map.entrySet().iterator();
//		Milk temp = iter.next();
		while(iter1.hasNext()) {
			Entry <Integer, Milk> temp = iter1.next();
		System.out.println(temp.getKey() + "\t" + temp.getValue());
		} System.out.println();
	}
}

/*
1. dto
class Milk{
	private int no;  private String name;  private int price;
}          

ㅁ 출력된결과   (3번이 나와야함)
======================
NO	NAME	PRICE
======================
1	white	1000
2	choco	1200
3	banana	1300
 */