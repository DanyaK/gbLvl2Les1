package lvl2les1;

public class Robot implements Participant {
    int heightLimit = 0;
    int lengthLimit = 0;

    boolean status = true;

    Robot(int h, int l) {
        System.out.printf("\t\tROBOT h = %s, l = %s \n", h, l);
        this.heightLimit = h;
        this.lengthLimit = l;
    }
    public void run () {
        System.out.println("Robot ran");
    }

    public void jump() {
        System.out.println("Robot jumped");
    }

    @Override
    public void myName() {
        System.out.printf("ROBOT h = %s, l = %s \n", heightLimit, lengthLimit);
    }
    @Override
    public boolean getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(boolean val) {
        this.status = val;
    }

    @Override
    public int getHeightLimit() {
        return this.heightLimit;
    }

    @Override
    public int getLengthLimit() {
        return this.lengthLimit;
    }
}
