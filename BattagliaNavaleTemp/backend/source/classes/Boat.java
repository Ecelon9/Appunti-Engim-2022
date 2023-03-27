package classes;

public class Boat {

    // 1 casella

    private boolean floating;

    public Boat() {
        this.floating = true;
    }

    public void hullHit() {
        this.floating = false;
    }

    public boolean getStatus() {
        System.out.print("Ship status: ");
        if (this.floating) {
            System.out.print("still fighting.");

        } else {
            System.out.println("sank.");
        }
        return this.floating;

    }
}