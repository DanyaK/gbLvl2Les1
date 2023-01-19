public class Wall extends Obstacle {

    int height = 1;
    Wall() {
    }

    Wall(int value) {
        this.height = value;
    }

    @Override
    public int getLimit() {
        return this.height;
    }

    @Override
    public void showName() {
        System.out.println("\tWall");
    }
}
