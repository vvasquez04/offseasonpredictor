/**
 * Represents a player with their contract and position information.
 */
public class Player {

    /** The player's full name */
    public String name;
    /** The player's position on the team */
    public String position;
    /** Number of remaining guaranteed years on the player's contract */
    public int remGuaranteedYears;
    /** Number of remaining option years on the player's contract */
    public int remOptionYears;
    /** Indicates if the player is a Restricted Free Agent (RFA) */
    public boolean isRFA;

    /**
     * Main method - currently empty.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {

    }

    /**
     * Default constructor that initializes a player with empty values.
     */
    public Player() {
        this.name = "";
        this.position = "";
        this.remGuaranteedYears = 0;
        this.remOptionYears = 0;
        this.isRFA = false;
    }

    /**
     * Constructs a player with specified attributes.
     * 
     * @param name The player's full name
     * @param position The player's position
     * @param remGuaranteedYears Number of remaining guaranteed contract years
     * @param remOptionYears Number of remaining option years
     * @param isRFA Whether the player is a Restricted Free Agent
     */
    public Player(String name, String position, int remGuaranteedYears, int remOptionYears, boolean isRFA) {
        this.name = name;
        this.position = position;
        this.remGuaranteedYears = remGuaranteedYears;
        this.remOptionYears = remOptionYears;
        this.isRFA = isRFA;
    }

    /**
     * Prints all information about the player including name, position,
     * contract details, and RFA status.
     */
    public void printPlayer() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Remaining Guaranteed Years: " + this.remGuaranteedYears);
        System.out.println("Remaining Option Years: " + this.remOptionYears);
        System.out.println("Is RFA: " + this.isRFA);
    }

    /**
     * Gets the player's name.
     * 
     * @return The player's full name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the player's position.
     * 
     * @return The player's position
     */
    public String getPosition() {
        return this.position;
    }
    
    /**
     * Gets the number of remaining guaranteed years on the player's contract.
     * 
     * @return The number of remaining guaranteed contract years
     */
    public int getRemGuaranteedYears() {
        return this.remGuaranteedYears;
    }

    /**
     * Gets the number of remaining option years on the player's contract.
     * 
     * @return The number of remaining option years
     */
    public int getRemOptionYears() {
        return this.remOptionYears;
    }

    /**
     * Gets the player's RFA (Restricted Free Agent) status.
     * 
     * @return true if the player is a Restricted Free Agent, false otherwise
     */
    public boolean getIsRFA() {
        return this.isRFA;
    }
}
