package IOT5;
import java.util.Scanner;
public class str_buld_ex001 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        StringBuilder sb = new StringBuilder(sc.nextLine());
	        System.out.println("String: " + sb);
	        System.out.println("Character at index 0: " + sb.charAt(0));
	        System.out.print("Enter new character: ");
	        char ch = sc.next().charAt(0);
	        sb.setCharAt(0, ch);
	        System.out.println("Updated String: " + sb);
	    }
	}

