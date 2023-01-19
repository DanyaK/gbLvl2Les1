public class Human implements Participant {

    int heightLimit = 0;
    int lengthLimit = 0;

    boolean status = true;

    Human(int h, int l) {
        System.out.printf("\t\tHUMAN h = %s, l = %s \n", h, l);
        this.heightLimit = h;
        this.lengthLimit = l;
    }
    public void run () {
        System.out.println("Human ran");
    }

    public void jump() {
        System.out.println("Human jumped");
    }

    @Override
    public void myName() {
        System.out.printf("HUMAN h = %s, l = %s \n", heightLimit, lengthLimit);
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
