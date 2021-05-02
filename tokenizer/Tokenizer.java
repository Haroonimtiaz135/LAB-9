/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;


import java.util.StringTokenizer;

public class Tokenizer extends StringTokenizer {
    private String s;

    public Tokenizer(String s) {
        super(s);
        this.s = s;
    }

    @Override
    public int countTokens() {
        int count = 0;
        String[] str1 = s.split(" ");
        for (String str : str1) {
            count++;
            for (int j = 0; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j))) {
                    count--;
                    break;
                }

            }
        }

        return count;
    }





    public static void main(String[] args) {
        StringTokenizer s= new Tokenizer("my name 12 is haroon");
        System.out.println(s.countTokens());
        
        StringTokenizer s1= new Tokenizer("my name 12");
        System.out.println(s1.countTokens());
    }
    
}
