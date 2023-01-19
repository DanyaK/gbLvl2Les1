package lvl2les2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    MyArraySizeException() {
    }

    public void printInfo() {
        System.err.printf("MyArraySizeDataException: WRONG SIZE;\n");
    }
}
