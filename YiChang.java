package lianxi;

public class YiChang {
	public static void main(String[] args){
		P str = new P();
		try {
			str.pp();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("执行了finally");
		}
	}
}
class P{
	public void pp()throws Exception{
		int[] arr = new int[3];
		System.out.println(arr[2]);
	}
}