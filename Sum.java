package co.nt.sum;

public class Sum {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,55,66};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[i]+a[j]==50) {
				System.out.println(a[i]+"+"+a[j]+"=="+50);
			
			}
			
		}
		
	}
	
}
}
