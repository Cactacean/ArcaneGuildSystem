package com.game.interfaces;

import com.game.character.Character;
//Abstract Method
    // there are NO curly braces { } and no code logic.
    // It ends with a semicolon (;). 
    // This tells Java: "Any class that implements SpecialMove MUST have a method 
    // called useSpecialMove that accepts a Character as a target."
public interface SpecialMove {
    void useSpecialMove(Character target);
}
