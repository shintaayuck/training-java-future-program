public class RecFactorial {
  public static void main(String args[]) {

    //error-handling : no month input
    if (args.length != 1) {
      System.out.println("Usage : Factorial <number>");
      return;
    }

    int number = Integer.parseInt(args[0]);

    if (number < 0) {
      System.out.println("Must be >= 0");
      return;
    }

    System.out.println(number + "! = " + factor(number));

  }

  public static int factor(int number) {
    if (number == 0) {
      return 1;
    } else {
      return number * factor(number-1);
    }
  }
}
