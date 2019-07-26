import java.security.SecureRandom;
import java.util.Random;

public class Character {
	
	private String dnd_class;
	private String dnd_race;
	private String dnd_background;
	
	// Array of all possible classes, races, and backgrounds
	private String[] dnd_classes = {"Barbarian", "Bard", "Cleric", "Druid",
		"Fighter", "Monk", "Paladin", "Ranger",
		"Rogue", "Sorcerer", "Warlock", "Wizard"};
	
	private String[] dnd_races = {"Aarakocra", "Aasimar", "Aetherborn", "Aven", "Bugbear", "Centaur",
		"Changeling", "Dragonborn", "Dwarf", "Elf", "Firbolg", "Genasi",
		"Gith", "Gnome", "Goblin", "Goliath", "Grung", "Half-Elf",
		"Half-Orc", "Halfling", "Hobgoblin", "Human", "Kalashtar", "Kenku",
		"Khenra", "Kobold", "Kor", "Lizardfolk", "Loxodon", "Minotaur",
		"Naga", "Orc", "Shifter", "Simic Hybrid", "Siren", "Tabaxi",
		"Tiefling", "Tortle", "Triton", "Vampire"};
	
	private String[] dnd_backgrounds = {"Acolyte", "Anthropologist", "Azorius Functionary", "Black Fist Double Agent",
		"Boros Legionnaire", "Caravan Specialist", "Celebrity Adventurer's Scion",
		"Charlatan", "City Watch", "Clan Crafter", "Cloistered Scholar",
		"Cormanthor Refugee", "Courtier", "Criminal", "Dimir Operative", "Dissenter",
		"Dragon Casualty", "Earthspur Miner", "Entertainer", "Faction Agent",
		"Failed Merchant", "Far Traveler", "Fisher", "Folk Hero", "Gambler",
		"Gate Urchin", "Golgari Agent", "Gruul Anarch", "Guild Artisan", "Harborfolk",
		"Haunted One", "Hermit", "Hillsfar Merchant", "Hillsfar Smuggler", "House Agent",
		"Inheritor", "Initiate", "Inquisitor", "Iron Route Bandit", "Izzet Engineer",
		"Knight of the Order", "Marine", "Mercenary Veteran", "Mulmaster Aristocrat",
		"Noble", "Orzhov Representative", "Outlander", "Phlan Insurgent", "Phlan Refugee",
		"Plaintiff", "Rakdos Cultist", "Rival Intern", "Sage", "Sailor", "Secret Identity",
		"Selesnya Initiate", "Shade Fanatic", "Shipwright", "Simic Scientist", "Smuggler",
		"Soldier", "Stojanow Prisoner", "Ticklebelly Nomad", "Trade Sheriff",
		"Urban Bounty Hunter", "Urchin", "Uthgardt Tribe Member", "Vizier", "Waterdhavian Noble"};
	
	// random number generator
    private Random random = new SecureRandom();
    
    public Character() {
    	dnd_class = dnd_classes[random.nextInt(dnd_classes.length)];
    	dnd_race = dnd_races[random.nextInt(dnd_races.length)];
    	dnd_background = dnd_backgrounds[random.nextInt(dnd_backgrounds.length)];
    }

    public String getCharacterClass() {
    	return dnd_class;
    }
    
    public String getCharacterRace() {
    	return dnd_race;
    }
    
    public String getCharacterBackground() {
    	return dnd_background;
    }
    
}
