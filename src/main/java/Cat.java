public class Cat implements Participant {

    int heightLimit = 0;
    int lengthLimit = 0;

    boolean status = true;

    Cat(int h, int l) {
        System.out.printf("\t\tCAT h = %s, l = %s \n", h, l);
        this.heightLimit = h;
        this.lengthLimit = l;
    }

    public void run () {
        System.out.println("Cat ran");
    }

    public void jump() {
        System.out.println("Cat jumped");
    }
    @Override
    public void myName() {
        System.out.printf("CAT h = %s, l = %s \n", heightLimit, lengthLimit);
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
