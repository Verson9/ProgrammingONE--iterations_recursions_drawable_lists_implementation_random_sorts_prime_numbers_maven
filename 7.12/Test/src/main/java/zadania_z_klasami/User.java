package zadania_z_klasami;

import java.time.LocalDate;

class User {
	private String imie ;
	private String nazwisko ;
	private String login ;
	private String haslo ;
	private LocalDate dataUrodzenia ;

	User ( String imie, String nazwisko, String login, String haslo, String dataUrodzenia ) {
		this.imie          = imie;
		this.nazwisko      = nazwisko;
		this.login         = login;
		this.haslo         = haslo;
		this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
	}

	boolean isFilled(){
		return imie != null && nazwisko != null && login != null && haslo != null && dataUrodzenia != null;
	}

	boolean isPasswordGood(){
		return haslo != null && haslo.length() >= 8;
	}

	boolean isAdult() {
		if( LocalDate.now().getYear() - dataUrodzenia.getYear() >18 ||
		    (LocalDate.now().getYear() - dataUrodzenia.getYear() ==18  &&
		     LocalDate.now().getDayOfYear() - dataUrodzenia.getDayOfYear() >= 0) ) {
			return true;
		}
		return false;
	}
	String getUser (){
		return imie + " " + nazwisko + " " + login + " ******* " + dataUrodzenia;
	}
	String getImie () {	return imie; }

	String getNazwisko () {
		return nazwisko;
	}

	String getLogin () {
		return login;
	}

	String getHaslo () {
		return haslo;
	}

	LocalDate getDataUrodzenia () {
		return dataUrodzenia;
	}

	private void setImie ( String imie ) {
		this.imie = imie;
	}

	private void setNazwisko ( String nazwisko ) {
		this.nazwisko = nazwisko;
	}

	void setLogin ( String login ) {
		this.login = login;
	}

	void setHaslo ( String haslo ) {
		this.haslo = haslo;
	}

	public void setDataUrodzenia ( LocalDate dataUrodzenia ) {
		this.dataUrodzenia = dataUrodzenia;
	}
}
