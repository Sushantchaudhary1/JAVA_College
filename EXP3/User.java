package Unit3;
class invalidAgeException extends Exception{
	public invalidAgeException(String str) {
		super(str);
	}
}
public class User {
   static void validate(int age) throws invalidAgeException{
	   if(age<18) {
		   throw new invalidAgeException("Age is not valid to vote");
	   }
	   else {
		   System.out.println("Welcome to give the vote");
	   }
   }
   public static void main(String[] args) {
	   try {
		   validate(16);
	   }catch(invalidAgeException ex){
		   System.out.println("Catch the Exception");
		   System.out.println(ex);
		   
	   }
	   // 65536
	   System.out.println("Rest of the code");
   }
} 

// server to keyboard reading of data, 