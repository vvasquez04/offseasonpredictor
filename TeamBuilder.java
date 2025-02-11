import java.io.*;
import java.util.*;

/**
 * Runner program to process player data from CSV and organize into teams
 */
public class TeamBuilder {
    
    /** Map to store all teams with team name as key */
    private Map<String, Team> teams;
    
    /**
     * Constructor initializes the teams map
     */
    public TeamBuilder() {
        teams = new HashMap<>();
    }

    /**
     * Processes a CSV file containing player information
     * Expected CSV format: name,position,guaranteedYears,optionYears,isRFA,teamName
     * 
     * @param filename The path to the CSV file
     * @throws IOException If there's an error reading the file
     */
    public void processPlayerFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            // Skip header line if it exists
            br.readLine();
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 6) {
                    System.err.println("Invalid line: " + line);
                    continue;
                }

                // Parse player data
                String name = data[0].trim();
                String position = data[1].trim();
                int guaranteedYears = Integer.parseInt(data[2].trim());
                int optionYears = Integer.parseInt(data[3].trim());
                boolean isRFA = Boolean.parseBoolean(data[4].trim());
                String teamName = data[5].trim();

                // Create player object
                Player player = new Player(name, position, guaranteedYears, optionYears, isRFA);

                // Add player to appropriate team
                addPlayerToTeam(player, teamName);
            }
        }
    }

    /**
     * Adds a player to their team, creating a new team if it doesn't exist
     * 
     * @param player The player to add
     * @param teamName The team the player belongs to
     */
    private void addPlayerToTeam(Player player, String teamName) {
        Team team = teams.computeIfAbsent(teamName, k -> new Team());
        team.teamName = teamName;
        team.acronym = generateAcronym(teamName);

        // Assign player to appropriate position in team
        switch (player.getPosition().toUpperCase()) {
            case "QB":
                if (team.qb1.getName().isEmpty()) {
                    team.qb1 = player;
                } else {
                    team.addPositionOfNeed("QB2");
                }
                break;
            case "RB":
                if (team.rb1.getName().isEmpty()) {
                    team.rb1 = player;
                } else if (team.rb2.getName().isEmpty()) {
                    team.rb2 = player;
                } else {
                    team.addPositionOfNeed("RB3");
                }
                break;
            case "WR":
                if (team.wr1.getName().isEmpty()) {
                    team.wr1 = player;
                } else if (team.wr2.getName().isEmpty()) {
                    team.wr2 = player;
                } else {
                    team.addPositionOfNeed("WR3");
                }
                break;
            case "TE":
                if (team.te1.getName().isEmpty()) {
                    team.te1 = player;
                } else {
                    team.addPositionOfNeed("TE2");
                }
                break;
            default:
                System.err.println("Unknown position: " + player.getPosition());
        }
    }

    /**
     * Generates a simple acronym from team name
     * 
     * @param teamName The full team name
     * @return A 2-3 letter acronym
     */
    private String generateAcronym(String teamName) {
        StringBuilder acronym = new StringBuilder();
        String[] words = teamName.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(word.charAt(0));
            }
        }
        return acronym.toString().toUpperCase();
    }

    /**
     * Prints all teams and their rosters
     */
    public void printAllTeams() {
        for (Team team : teams.values()) {
            System.out.println("\n=============================");
            team.printTeam();
            System.out.println("=============================\n");
        }
    }

    /**
     * Main method to run the program
     * 
     * @param args Command line arguments - expects path to CSV file
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the path to the player data CSV file");
            return;
        }

        TeamBuilder builder = new TeamBuilder();
        try {
            builder.processPlayerFile(args[0]);
            builder.printAllTeams();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number in CSV: " + e.getMessage());
        }
    }
}
