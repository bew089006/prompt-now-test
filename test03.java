public class test03 {
  public static void main(String args[]) {
    int x=5;
    int side = x-1;
    int number_of_x = 1;

    for(int i = 1; i <= x ; i++) {
      System.out.println(
        ("O".repeat(side))+ 
        ("X".repeat(number_of_x)) + 
        ("O").repeat(side)
      );

      side--;
      number_of_x+=2;
    }
  }
}
