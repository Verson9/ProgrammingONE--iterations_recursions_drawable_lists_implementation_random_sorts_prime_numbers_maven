import java.util.Scanner;

public class NumbersConverter{
	public String binaryToDecimal(String binaryValue){
		binaryValue = new StringBuilder(binaryValue).reverse().toString();

		//Analogicznie:
//		StringBuilder sb = new StringBuilder(binaryValue);
//		sb=sb.reverse();
//		binaryValue=sb.toString();

		int sum = 0;
		for(int i = 0;i<binaryValue.length();i++){
			int multiplicator = Character.getNumericValue(binaryValue.charAt(i));
			sum += Math.pow(2, i)*multiplicator;
		}
		return String.valueOf(sum);
	}

	void start(){
		System.out.println("\nWitaj w konwerterze wartości binarnych na decymalne!");
		do{
			System.out.println("Podaj liczbę, którą chcesz przekonwertować.\n"
			                   + "END przerywa działanie");
			Scanner sc = new Scanner(System.in);
			String binaryNumber = sc.nextLine();
			if(binaryNumber.toLowerCase().equals("end")){
				return;
			}
			else if(binaryNumber.toLowerCase().contains("[a-z]+")){
				System.out.println("Błędny zapis.");
				continue;
			}
			else{
				System.out.println(binaryToDecimal(binaryNumber).toString());
			}
		}while(true);
	}
}
