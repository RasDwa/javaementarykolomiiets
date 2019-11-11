public class MyClass {
    public static void main(String args[]) {
      double x = 1705.0;
      double k = x/100;
      
      if (k % 1 == 0) {
    //целое
    int c = (int)k;
    System.out.println(c);
    }
    else {
        int q = (int)k;
    System.out.println(q+1);
        
    }

     
    }
}
