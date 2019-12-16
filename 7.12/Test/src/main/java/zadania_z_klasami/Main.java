package zadania_z_klasami;

public class Main {
	public static void main ( String[] args ) throws Exception {
		User user = new User("Janek", "Nowak", null, null, "2001-12-07");
		user.setLogin(UserParamsGenerator.generateLogin(user.getImie(), user.getNazwisko()));
		user.setHaslo(UserParamsGenerator.generatePassword());
		UserService.addUser(user);

		User user1 = new User("John", "Nowak", null, null, "2001-03-25");
		user1.setLogin(UserParamsGenerator.generateLogin(user1.getImie(), user1.getNazwisko()));
		user1.setLogin("xxxPussyDestroyer69xxx");
		String passy = UserParamsGenerator.generatePassword();
		user1.setHaslo(passy);
		UserService.addUser(user1);
		UserService.displayUsers();
		User user1Update = new User("Jan", "Nowacki", "xxxPussyDestroyer69xxx", passy, "2001-03-25" );
		UserService.update(user1Update);
		UserService.displayUsers();
		System.out.println();
		UserService.search("Jan");
		UserService.search("Nowak");
	}
}
