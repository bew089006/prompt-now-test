public class test02 {
  public static void main(String args[]) {
    int x=10;
    
    for(int i = 1; i <= x ; i++) {
      System.out.println(("O".repeat(x-i) )+ ("X".repeat(i)));
    }
  }
}
