//Finding even&odd count of elements in an array
import java.util.*;
public class count
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] a = new int[n];
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	    int evencount=0;
	    int oddcount=0;
	     for(int i=0;i<a.length;i++){
	      if(a[i]%2==0){
	          evencount+=1;
	      }	
	      else{
	          oddcount+=1;
	      }
	    }
	    System.out.println("even count is"" = " +evencount);
	    System.out.println("odd count is "" = " +oddcount);
	}
}