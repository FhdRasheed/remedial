package java_new.lab;
import java.util.StringTokenizer;
public class StringTokenDemo {
	public static void main(String[] args) {
		int oddEven,oddcount=0,evencount=0;
		StringTokenizer obj=new StringTokenizer("1 55 7 8 3 6");
		while(obj.hasMoreElements()) {
		oddEven=Integer.parseInt(obj.nextToken());
		if(oddEven%2==0) {
			evencount++;
		}
		else {
			oddcount++;
		}
		}
		System.out.println("Count of odd numbers:"+oddcount);
		System.out.println("Count of even numbers:"+evencount);

	}

}
