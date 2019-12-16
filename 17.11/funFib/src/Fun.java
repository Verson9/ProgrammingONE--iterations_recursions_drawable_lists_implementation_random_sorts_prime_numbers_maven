public class Fun{
	void vibes(int k){
		int pierwsza = 0;
		int druga = 1;

		for(int i = 2; i <= k; i++){
			int tmp = pierwsza + druga;
			pierwsza = druga;
			druga = tmp;
		}
		System.out.println(druga);
	}
}
