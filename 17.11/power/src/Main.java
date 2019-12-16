public class Main{
	public static void main(String[] args){
		Power power = new Power();
		power.start(10);
		System.out.println();
		Rower rower = new Rower();
		System.out.println(rower.fun(5));
	}


}
