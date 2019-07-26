public class Main {
	
	public static void main(String[] args) {
		
		Die die = new Die();
		Character character = new Character();
		
		System.out.println("Class: " + character.getCharacterClass());
		System.out.println("Race: " + character.getCharacterRace());
		System.out.println("Background: " + character.getCharacterBackground());
		System.out.println("Stats: " + die.rollStats());
	}
	
}