package ru.bondarev.java2.lesson3;

import java.util.*;

public class ArrayText {

    public static void main(String[] args) {

        String text = "Война — это путь обмана. Поэтому, если ты и можешь что-нибудь, показывай противнику,\n " +
                "будто не можешь; если ты и пользуешься чем-нибудь, показывай ему,\n " +
                "будто ты этим не пользуешься; хотя бы ты и был близко, показывай,\n " +
                "будто ты далеко; хотя бы ты и был далеко, показывай, будто ты близко ...";
        System.out.println("Текст: " + text);
        System.out.println("***********************");

        String[] text1 = text.replace(".", "").replace(",","").replace("— ", "").replace(";","").replace("\n","").split(" ");


        ArrayList<String> words = new ArrayList<String>();
        Collections.addAll(words, text1);


        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println("Слово - " + pair.getKey() + ", в количестве " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String word: list) {
            result.put(word, result.containsKey(word) ? result.get(word) + 1: 1);
        }
        return result;
    }












}
