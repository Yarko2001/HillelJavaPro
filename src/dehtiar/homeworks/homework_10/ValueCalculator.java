package dehtiar.homeworks.homework_10;

public class ValueCalculator {

  private final int length;
  private float[] arrayOne;
  private float[] arrayTwo;

  public ValueCalculator(int len) {
    this.length = len;
  }

  public void doCalculate() {

    long start = System.currentTimeMillis();

    int half = length / 2;
    float[] arr = getArray();

    splitArray(arr, half);

    runTwoThreads();

    mergeTwoArrays(arr, half);

    System.out.println("Run time = [" + (System.currentTimeMillis() - start) + " ms]");

  }

  private float[] getArray() {
    float[] arr = new float[length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
    return arr;
  }

  private void splitArray(float[] arr, int half) {
    arrayOne = new float[half];
    arrayTwo = new float[half];

    System.arraycopy(arr, 0, arrayOne, 0, half);
    System.arraycopy(arr, half, arrayTwo, 0, half);
  }

  private void runTwoThreads() {
    Thread thread1 = new Thread(new MyRunnable(arrayOne));
    Thread thread2 = new Thread(new MyRunnable(arrayTwo));

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  private void mergeTwoArrays(float[] arr, int half) {
    System.arraycopy(arrayOne, 0, arr, 0, half);
    System.arraycopy(arrayTwo, 0, arr, half, half);
  }

}
