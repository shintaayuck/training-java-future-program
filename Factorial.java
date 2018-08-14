public class Factorial {
  public static void main(String args[]) {

    //error-handling : no month input
    if (args.length != 1) {
      System.out.println("Usage : Factorial <number>");
      return;
    }

    int number = Integer.parseInt(args[0]);
    int sum = 1;

    if (number < 0) {
      System.out.println("Must be >= 0");
      return;
    }
    for (int i = 1; i <= number; i++) {
      sum *= i;
    }

    System.out.println(number + "! = " + sum);
  }
}
