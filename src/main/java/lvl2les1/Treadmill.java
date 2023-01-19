package lvl2les1;

public class Treadmill extends Obstacle {

    int length = 1;
    Treadmill(int value) {
        this.length = value;
    }
    Treadmill() {
    }

    @Override
    public int getLimit() {
        return this.length;
    }

    @Override
    public void showName() {
        System.out.println("\tTreadmill");
    }
}
