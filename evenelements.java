//Find even elements in an array
import java.util.*;
public class evenelements
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] a = new int[n];
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	     for(int i=0;i<a.length;i++){
	         if(a[i]%2==0){
	         	System.out.println(a[i]);
	      }
	    }
	}
}