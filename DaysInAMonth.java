public class DaysInAMonth{
  public static void main(String args[]) {

    //error-handling : number of input don't match
    if (args.length != 2) {
      System.out.println("Usage : DaysInAMonth <year> <month>");
      return;
    }

    int year = Integer.parseInt(args[0]);
    int month = Integer.parseInt(args[1]);

    switch(month) {
      //for month with 31 days
      case 1 :
      case 3 :
      case 5 :
      case 7 :
      case 8 :
      case 10 :
      case 12 :
        System.out.println("31");
        break;
      //for month with 30 days
      case 4 :
      case 6 :
      case 9 :
      case 11 :
        System.out.println("30");
        break;
      //for february
      case 2 :
        if ( (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)) ) {
          System.out.println("29");
        } else {
          System.out.println("28");
        }
        break;
      }
    }
  }
