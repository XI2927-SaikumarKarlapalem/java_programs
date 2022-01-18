package generics;

public class gbme{
	static String[] n= {"k","l"};
	static String[] k= {"l","k"};
	public String[] getN() {
		return n;
	}
	public String[] getK() {
		return k;
	}
	public gbme(String[] n, String[] k) {
		super();
		this.n = n;
		this.k = k;
	}
	
	public static <T>  boolean gets(T[] Array)
	{
		for(T x:Array)
		{
			System.out.println(x);
		}
		return true;
		
		
	}
	public static void main(String[]args)
	{
		System.out.println(gets(n));
		System.out.println(gets(k));
	}
}