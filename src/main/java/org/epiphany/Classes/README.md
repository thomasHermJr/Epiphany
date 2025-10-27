# Base classes for the Epiphany project.

## File Path

- **Attributes**:
    - `Levels.java`: Manages character levels and experience points.
    - `MainAttributes.java`: Defines primary attributes such as strength, agility, and intelligence. extends `Levels.java`
    - `DerivedAttributes.java`: Calculates secondary attributes based on primary attributes. extends `MainAttributes.java`
    - `Proficiencies.java`: Handles character skills and proficiencies. extends `DerivedAttributes.java`

- **Character**:
    - `Entity.java`: Base class for all entities in the game. extends `Proficiencies.java`
    - `Player.java`: Represents player-controlled characters. extends `Entity.java`
    - `NPC.java`: Represents non-player characters. extends `Entity.java`
    - `Enemy.java`: Represents enemy characters. extends `NPC.java`
