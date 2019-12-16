package zadania_z_klasami;

import java.util.Random;
import java.util.UUID;

class UserParamsGenerator {
	static Random rd = new Random();

	static String generateLogin(String imie, String nazwisko){
		return imie.toLowerCase().charAt(0) + nazwisko.toLowerCase();
	}

	static String generatePassword(){
		return UUID.randomUUID().toString().replace("-", "").substring(0, 8);
	}

}
