import java.util.ArrayList;

/**
 * Represents a sports team with various player positions and team information.
 */
public class Team {

    /** The team's primary quarterback */
    public Player qb1;
    /** The team's primary running back */
    public Player rb1;
    /** The team's secondary running back */
    public Player rb2;
    /** The team's primary wide receiver */
    public Player wr1;
    /** The team's secondary wide receiver */
    public Player wr2;
    /** The team's primary tight end */
    public Player te1;
    /** The full name of the team */
    public String teamName;
    /** The team's abbreviated name or acronym */
    public String acronym;
    /** List of positions where the team needs improvement or additional players */
    public ArrayList<String> positionsOfNeed;

    /**
     * Default constructor that initializes a team with empty player objects and team information.
     */
    public Team() {
        qb1 = new Player();
        rb1 = new Player(); 
        rb2 = new Player();
        wr1 = new Player();
        wr2 = new Player();
        te1 = new Player();
        teamName = "";
        acronym = "";
        positionsOfNeed = new ArrayList<String>();
    }

    /**
     * Constructs a team with specified players and team information.
     * 
     * @param qb1 The primary quarterback
     * @param rb1 The primary running back
     * @param rb2 The secondary running back
     * @param wr1 The primary wide receiver
     * @param wr2 The secondary wide receiver
     * @param te1 The primary tight end
     * @param teamName The full name of the team
     * @param acronym The team's abbreviated name
     */
    public Team(Player qb1, Player rb1, Player rb2, Player wr1, Player wr2, Player te1, String teamName, String acronym) {
        this.qb1 = qb1;
        this.rb1 = rb1;
        this.rb2 = rb2;
        this.wr1 = wr1;
        this.wr2 = wr2;
        this.te1 = te1;
        this.teamName = teamName;
        this.acronym = acronym;
        this.positionsOfNeed = new ArrayList<String>();
    }

    /**
     * Prints all team information including team name, acronym, players, and positions of need.
     */
    public void printTeam() {
        System.out.println("Team Name: " + this.teamName);
        System.out.println("Acronym: " + this.acronym);
        System.out.println("QB1: " + this.qb1.getName());
        System.out.println("RB1: " + this.rb1.getName());
        System.out.println("RB2: " + this.rb2.getName());
        System.out.println("WR1: " + this.wr1.getName());
        System.out.println("WR2: " + this.wr2.getName());
        System.out.println("TE1: " + this.te1.getName());
        System.out.println("Positions of Need: " + this.positionsOfNeed);
    }

    /**
     * Adds a position to the team's list of positions needing improvement.
     * 
     * @param position The position to be added to positions of need
     */
    public void addPositionOfNeed(String position) {
        this.positionsOfNeed.add(position);
    }

    /**
     * Gets the team's primary quarterback.
     * 
     * @return The QB1 player object
     */
    public Player getQB1() {
        return this.qb1;
    }

    /**
     * Gets the team's primary running back.
     * 
     * @return The RB1 player object
     */
    public Player getRB1() {
        return this.rb1;
    }

    /**
     * Gets the team's secondary running back.
     * 
     * @return The RB2 player object
     */
    public Player getRB2() {
        return this.rb2;
    }

    /**
     * Gets the team's primary wide receiver.
     * 
     * @return The WR1 player object
     */
    public Player getWR1() {
        return this.wr1;
    }

    /**
     * Gets the team's secondary wide receiver.
     * 
     * @return The WR2 player object
     */
    public Player getWR2() {
        return this.wr2;
    }
    
    /**
     * Gets the team's primary tight end.
     * 
     * @return The TE1 player object
     */
    public Player getTE1() {
        return this.te1;
    }
}
