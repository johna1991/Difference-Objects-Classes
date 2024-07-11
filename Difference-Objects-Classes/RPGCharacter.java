public class RPGCharacter {
    // Instance variables
    String job;
    int level; 

    public RPGCharacter(String job, int level) {
        this.job = job;
        this.level = level;
    }

    // Method to display character information
    public void displayInfo() {
        System.out.println("Job: " + job);
        System.out.println("Level: " + level);
    }

    public static void main(String[] args) {
        // Creating objects of class RPGCharacter
        RPGCharacter job1 = new RPGCharacter("Knight", 45);
        RPGCharacter job2 = new RPGCharacter("Ninja", 35);

        // Calling object methods
        job1.displayInfo();
        job2.displayInfo();
    }
}
