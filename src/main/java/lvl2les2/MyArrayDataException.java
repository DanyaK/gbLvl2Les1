package lvl2les2;

public class MyArrayDataException extends NumberFormatException {

    int indexI = 0;
    int indexJ = 0;

    MyArrayDataException(int i, int j) {
        this.indexI = i;
        this.indexJ = j;
    }

    public void printInfo() {
        System.err.printf("MyArrayDataException: WRONG DATA; i=%s, j=%s\n", indexI, indexJ);
    }

}
