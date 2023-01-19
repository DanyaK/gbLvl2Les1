package lvl2les1;

public interface Participant {
    void jump();
    void run();
    void myName();

    boolean getStatus();

    void setStatus(boolean val);

    int getHeightLimit();
    int getLengthLimit();
}
