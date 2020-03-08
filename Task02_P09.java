package Task02;

import java.util.Arrays;

public class Task02_P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'c';
        String st = Character.toString(ch);
        // st = String.valueOf(ch);
        System.out.println("The string is: " + st);
        st="qwas";
        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
        
        String s="hello";  
        char c=s.charAt(0);
        System.out.println(c);  
	}

}
