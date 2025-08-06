public class strchar {
    public static void printchar(String str) {
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String firstname = " varun";
        String lastname = "chaudhary";
        String fullname = firstname + " " + lastname;
        printchar(fullname);
    }
    
}
