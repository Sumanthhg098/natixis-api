package junit.com.demo;

public class Factorial {
	public int check(int n) {
		if(n<0) {
			n = n * -1;
			int res=1;
			for(int i=1;i<=n;i++)
			{
				res= res*i;
			}
			return res*-1;
		}
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res= res*i;
		}
		return res;
	}
	public float check(float n) {
		float res=1.0f;
		for(float i=1.0f;i<=n;i++)
		{
			res= res*i;
		}
		return res;
	}
}
