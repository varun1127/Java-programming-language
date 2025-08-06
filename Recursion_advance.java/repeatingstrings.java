public class repeatingstrings {
    public static void removeduplicates(String str, int index, StringBuilder newStr, boolean map[]) {
        if( index == str.length()) {
            System.out.println(newStr);
            return;
        }
        //kam
        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true) {
            //it is duplicate
            removeduplicates(str, index+1, newStr, map);
        }else {
            map[currChar - 'a'] = true;
            removeduplicates(str, index+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]) {
        String str = "vaaaaaarrrrruuuuunnnnn";
        removeduplicates(str, 0, new StringBuilder(" "), new boolean[26]);

    }
    
}
