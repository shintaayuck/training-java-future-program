public class Score {
  public static void main (String args[]) {

    if (args.length != 1) {
      System.out.println("Usage : Score <score>");
      return;
    }
    
    int score = Integer.parseInt(args[0]);

    if (score > 100 || score < 0) {
      System.out.println("Error!");
    } else if (score > 80) {
      System.out.println("A");
    } else if (score > 60) {
      System.out.println("B");
    } else if (score > 40) {
      System.out.println("C");
    } else if (score > 20) {
      System.out.println("D");
    } else {
      System.out.println("E");
    }
  }
}
