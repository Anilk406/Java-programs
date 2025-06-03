//Copy one array from another array
import java.util.*;
public class copyarray
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] a = new int[n];
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	    int [] b = new int[a.length];
	     for(int i=0;i<a.length;i++){
	            b[i]=a[i];
	            System.out.println(b[i]);
	    }
	}
}