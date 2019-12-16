package zadania_z_klasami;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UserService {
	static Map<Integer, User> userMap = new HashMap <>();
	private static Integer index = 0;

	static void addUser(User user) throws Exception {
		checkUserData(user);
		for( Map.Entry < Integer, User > integerUserEntry : userMap.entrySet() ) {
			for( User userData: userMap.values()) {
				if( userData.getLogin().equals(user.getLogin()) ){
					throw new Exception("Ten login jest już zajęty");
				}
			}
		}
		userMap.put(index, user);
		index++;
	}

	static void displayUsers(){
		userMap.forEach(( key, value ) -> System.out.println(value.getUser()));
	}

	static void update(User userUpdate) throws Exception {
		Integer userKey = null;
		checkUserData(userUpdate);
		for( Map.Entry < Integer, User > integerUserEntry : userMap.entrySet() ) {
			for( User userData: userMap.values()) {
				if( userData.getLogin().equals(userUpdate.getLogin()) )
					userKey = integerUserEntry.getKey();
			}
		}
		userMap.replace(userKey, userUpdate);
	}

	static void search(String forNameOrName){
		List<User> listOfEqualFornameUsers = new ArrayList <>();
		userMap.values().stream().filter(user -> user.getImie().equals(forNameOrName)).forEach(user -> listOfEqualFornameUsers.add(user));

		List<User> listOfEqualNameUsers = new ArrayList <>();
		userMap.values().stream().filter(user -> user.getNazwisko().equals(forNameOrName)).forEach(user -> listOfEqualNameUsers.add(user));
//		COMMENT_1

		if( listOfEqualFornameUsers.size() > 0 ){
			System.out.println("Użytkownicy, których imię zgadza się z wytycznymi:");
			listOfEqualFornameUsers.forEach(user -> System.out.println(user.getUser()));
		}

		if( listOfEqualNameUsers.size() > 0 ){
			System.out.println("Użytkownicy, których nazwisko zgadza się z wytycznymi:");
			listOfEqualNameUsers.forEach(user -> System.out.println(user.getUser()));
		}

	}

	private static void checkUserData( User user) throws Exception {
		if( !user.isFilled() ) throw new Exception(( "Uzupełnij wszystkie dane nowego użytkownika" ));
		if( !user.isAdult() ) throw new Exception("Nie osiągnąłeś wymaganego wieku.");
	}

}

//	COMMENT_1
//		Te metody z soutują nam wszystkich użytkowników o takim imieniu lub nazwisku jakie podaliśmy prosto z mapy
//		System.out.println("Użytkownicy, których imię zgadza się z wytycznymi:");
//		userMap.values().stream().filter(user -> user.getImie().equals(forNameOrName)).forEach(user -> System.out.println(user.getUser()));
//		System.out.println("Użytkownicy, których nazisko zgadza się z wytycznymi:");
//		userMap.values().stream().filter(user -> user.getNazwisko().equals(forNameOrName)).forEach(user -> System.out.println(user.getUser()));
