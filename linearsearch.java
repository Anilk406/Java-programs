//Linearsearch
import java.util.*;
public class linearsearch
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] a = new int[n];
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	    int m = sc.nextInt();
	     for(int i=0;i<a.length;i++){
	        	if(m==a[i]){
	        	    System.out.println(m+  "found at index"  +i);
	        	    System.exit(0);
	        	}
	    }
	    System.out.println( " not found ");
	}
}