package junit.com.demo;

public class Prime {
   public boolean check(int num) {
	   if(num<0) num= -1 * num;
	   int m =num/2,i;
	   if(num==0||num==1) {
		   return false;
	   }
	   for(i=2;i<=m;i++)
	   {
		   if(num%i==0) return false;
	   }
	   return true;
   }
}
