package java_20210510;

public class VarArgDemo {
	public long sum(int...temp) {
		long sum = 0;
		for(int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		VarArgDemo v = new VarArgDemo();
		
		long s1 = v.sum(10);
		System.out.println(s1);
		long s2 = v.sum(30,40,50);
		System.out.println(s2);
		
		
	}
}
