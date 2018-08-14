public class Sort {
  public static void main(String args[]) {
    //error-handling : no input
    if (args.length == 0) {
      System.out.println("Input array's numbers, separated with space");
      return;
    }

    int[] array = new int[args.length];

    //parse input to array
    for (int i = 0; i < args.length; i++) {
      array[i] = Integer.parseInt(args[i]);
    }

    //bubble sort
    for (int i = 0; i < array.length-1; i++) {
      for (int j = 0; j < array.length-i-1; j++) {
        if (array[j] > array[j+1]) {
          array[j] += array[j+1];
          array[j+1] = array[j]-array[j+1];
          array[j] -= array[j+1];
        }
      }
    }

    for (int number : array) {
      System.out.println(number);
    }
  }
}
