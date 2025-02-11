public class Player {

    public String name;
    public String position;
    public int remGuaranteedYears;
    public int remOptionYears;
    public boolean isRFA;

    public static void main(String[] args) {

    }

    public Player() {
        this.name = "";
        this.position = "";
        this.remGuaranteedYears = 0;
        this.remOptionYears = 0;
        this.isRFA = false;
    }

    public Player(String name, String position, int remGuaranteedYears, int remOptionYears, boolean isRFA) {
        this.name = name;
        this.position = position;
        this.remGuaranteedYears = remGuaranteedYears;
        this.remOptionYears = remOptionYears;
        this.isRFA = isRFA;
    }

    public void printPlayer() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Remaining Guaranteed Years: " + this.remGuaranteedYears);
        System.out.println("Remaining Option Years: " + this.remOptionYears);
        System.out.println("Is RFA: " + this.isRFA);
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }
    
    public int getRemGuaranteedYears() {
        return this.remGuaranteedYears;
    }

    public int getRemOptionYears() {
        return this.remOptionYears;
    }

    public boolean getIsRFA() {
        return this.isRFA;
    }
}
