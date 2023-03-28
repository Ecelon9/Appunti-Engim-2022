package classes;

public class Coesion {

    private boolean floating;
    private boolean[] health;

    public Coesion(int shipLength) {
        this.floating = true;
        this.health = new boolean[shipLength];
        for (int i = 0; i < this.health.length; i++) {
            this.health[i] = true;

        }
    }

    public void hullHit(int location) {
        for (int i = 0; i < this.health.length; i++) {
            if (i == location) {
                this.health[i] = false;

            }
        }

        this.floating = isFloating();
    }

    public boolean isFloating() {
        boolean isFloating = false;

        for (boolean hull : this.health) {
            if (hull) {
                isFloating = true;

            } 
        }

        return isFloating;
    }

    public void getStatus() {
        for (int i = 0; i < this.health.length; i++) {
            if(this.health[i]) {
                System.out.println("intact hull");

            } else {
                System.out.println("damaged hull");
            }
        }

        System.out.print("Ship status: ");
        if (this.floating) {
            System.out.print("still fighting.");

        } else {
            System.out.println("sank.");
        }
    }

}
