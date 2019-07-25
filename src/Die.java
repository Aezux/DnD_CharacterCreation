import java.security.SecureRandom;
import java.util.Random;

// Rolls a single die
public class Die {

    // random number generator
    private Random random = new SecureRandom();

    // rolls the die
    public int roll(String roll) {
        int dice = 1, sides = 6, modifier = 0;
        char[] characters = {'+', '-', 'x', '/'};
        char operation = ' ';

        roll = roll.toLowerCase().replaceAll("\\s", "");

        // get the amount of dice to roll
        int dLocation = roll.indexOf('d');
        if (dLocation != 0) {
            dice = Integer.parseInt(roll.substring(0, dLocation));
        }

        // checks if there is a modifier
        int modifierLocation = -1;
        for (char character : characters) {
            int index = roll.indexOf(character);
            if (index != -1) {
                operation = character;
                modifierLocation = index;
                break;
            }
        }

        // gets the side and modifier values
        if (modifierLocation != -1) {
            modifier = Integer.parseInt(roll.substring(modifierLocation + 1));
            sides = Integer.parseInt(roll.substring(dLocation + 1, modifierLocation));
        } else {
            sides = Integer.parseInt(roll.substring(dLocation + 1));
        }

        // roll the die
        int rollValue = 0;
        for (int i=1; i<=dice; ++i) {
            int diceRoll = random.nextInt(sides) + 1;
            rollValue += diceRoll;
        }

        // add the modifier to the result
        switch (operation) {
            case '+': rollValue += modifier; break;
            case '-': rollValue -= modifier; break;
            case 'x': rollValue *= modifier; break;
            case '/': rollValue /= modifier; break;
            default: break;
        }

        return rollValue;
    }

}
