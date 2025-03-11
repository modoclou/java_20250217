package com.company.java015_ex;

/*
	abstract 와 inferface의 공통점과 차이점은?
	공통점 - 자손객체를 통해서 코드를 구현해야 한다.
																 ---- 추상화, new 사용불가
	차이점 - 추상화 정도는 interface가 더 높음
	abstract(extends)는 		인스턴스 변수	, 인스턴스 메서드 	사용 가능  ---- 추상 메서드 모두 가질 수 있음
	interface(implements)는 	상수		, abstract 메서드	사용 가능		 ---- 추상 메서드만 가짐
	
		Vehicle (run)
		↑		↑
	MotorCycle	Car(run) @Override
*/

interface Vehicle{public void run();}
class MotorCycle implements Vehicle{
   @Override public void run()
   {System.out.println("오토바이가 달립니다.");}
   public void helmet() {System.out.println("헬멧을 착용합니다");}
}
class Car implements Vehicle{
   @Override public void run()
   {System.out.println("자동차가 달립니다.");}
} 

//추가class
class Driver{
	void drive(Vehicle a) {
		a.run();
		if(a instanceof MotorCycle) { ((MotorCycle) a).helmet(); }
	}
}

public class Coffee019 {
   public static void main(String[] args) {
      Driver driver = new Driver();
      MotorCycle MotorCycle = new MotorCycle();
      Car Car = new Car();
      
      driver.drive(Car);    //리턴값 메서드명(파라미터)
      						//아래 둘 다 담을 수 있는 것 : 부모 
      						//void drive(car)
      						//void drive(MotorCycle)
      System.out.println("\n\n>>자동차가 고장나서 교통수단을 바꿉니다");
      driver.drive(MotorCycle);
   }

}

/*
interface Vehicle{public void run();}
class MotorCycle implements Vehicle{
   @Override public void run()
   {System.out.println("오토바이가 달립니다.");}
   public void helmet() {System.out.println("헬멧을 착용합니다");}
}
class Car implements Vehicle{
   @Override public void run()
   {System.out.println("자동차가 달립니다.");}
}
public class Repeat001_oop_8_9 {

   public static void main(String[] args) {
      Driver driver = new Driver();
      
      MotorCycle motorCycle = new MotorCycle();
      Car car = new Car();
      
      driver.drive(car);
      
      System.out.println("\n\n>>자동차가 고장나서 교통수단을 바꿉니다");

      driver.drive(motorCycle);
   }

}
*/