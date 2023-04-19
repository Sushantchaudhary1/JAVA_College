package unit1;
import java.util.Scanner;
public class Room {
	 
	 
 public static void main(String[] args)
 {
	
Room1 R1 = new Room1();
R1.roomNo=207;
R1.roomType="non AC";
R1.roomArea=502.25f;
R1.ACmachine=2;
   R1.display();
 }
}
  class Room1{
	  int roomNo;
		 String roomType;
		 float roomArea;
		 int ACmachine;
		 

	void setData(int roomNo,String roomType,float roomArea, int ACmachine) {
		this.roomNo=roomNo;
		this.roomType="roomType";
		this.roomArea=roomArea;
		this.ACmachine=ACmachine;
			 
		 }
	 
	   void display() {
		   System.out.println(roomNo+" "+roomType+" "+roomArea+" "+ACmachine+" ");
		  
		  }
	 
 }