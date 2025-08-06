public class comparison {
    public static void main(String args[]) {
        String s1 = "varun";
        String s2 = "varun";
        String s3 = new String("varun");
        if(s1 == s2) {
            System.out.println("s1 is eqaual to s2");
        }else {
            System.out.println("s1 is not equal to s2");
        }
      //  if(s1 == s3) {
        //    System.out.println("s1 is eqaual to s3");
        //}else {
          //  System.out.println("s1 is not equal to s3");
        //}
        if(s1.equals(s3)) {
            System.out.println("s1 is eqaual to s3");
        }else {
            System.out.println("s1 is not equal to s3");
        }
    }
    
}
