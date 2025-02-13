package collectionframework.queueinterface.circularbuffersimulation;

public class CircularBufferMain {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        int[] currentBuffer = cb.getBuffer();
        System.out.println(java.util.Arrays.toString(currentBuffer));
    }
}
