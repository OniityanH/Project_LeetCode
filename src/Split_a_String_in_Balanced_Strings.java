/* 
class Split_a_String_in_Balanced_Strings{
    public int balancedStringSplit(String s) {

        char letter;
        char next_letter;
        int split = 0;
        
        for (int i = 0; i< s.length()-1; i++){
            letter = s.charAt(i);
            next_letter = s.charAt(i+1);
            if (letter == next_letter){
            }
            else{
                split = split ++;
            }
        }

        
        return split;
    }


}

public static void main(String[] args){
    int res = balancedStringSplit("RLRRLLRLRL");
    System.out.println(res);
} */