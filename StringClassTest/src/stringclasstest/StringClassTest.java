/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringclasstest;

import java.io.*;
import java.util.*;
/**
 *
 * @author fsl97
 */
public class StringClassTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char word[]={'H','e','l','l','o'};
        String words = new String(word);
        System.out.println(words);
        String words_2 = new String(word,1,3);
        System.out.println(words_2);
        String words_3 = new String(words_2);
        System.out.println(words_3);
        
    }
    
}
