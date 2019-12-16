package rozgrzewkowe;

import java.util.Scanner;

class NWD {
	private Scanner sc = new Scanner(System.in);

	void start (){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int nwd = 0;
		if( a==b )
			nwd = a;
		else if( a > b ) {
			for( int i = 1; i <= b; i++ ) {
				if( a % i != 0 && b%i !=0 || a % i == 0 && b%i !=0 || a % i != 0 && b%i ==0 )
					continue;
				else nwd = i;
			}
		}
		else if (b > a){
			for( int i = 1; i <= a; i++ ) {
				if( a % i != 0 && b%i !=0 || a % i == 0 && b%i !=0 || a % i != 0 && b%i ==0 )
					continue;
				else nwd = i;
			}
		}
		System.out.println(nwd);
	}
	void startButRecurention(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(result(a, b));
	}

	int result(int a , int b){
		int tmp;
		if( a < b ){
			tmp = b;
			b = a;
			a = tmp;
		}

		int nwd = 0;
		if( b == 0 )
			return a;
		else
			return result(b, a%b);
	}
}
