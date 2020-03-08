package Task02;

public class Task02_P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. Write a Java Program to Remove All Whitespaces from a String 
		String str = "I am a Wiproite";  
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
        System.out.println(noSpaceStr);  
      }

}
