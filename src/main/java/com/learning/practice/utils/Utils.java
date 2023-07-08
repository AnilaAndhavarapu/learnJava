package com.learning.practice.utils;

import com.learning.practice.vo.interfaces.ListInterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Utils {

    private static Random random = new Random();
    private static final String DICTIONARY_FILE_PATH = "src/main/resources/static/dictionary.txt";

    public static ArrayList<String> generateRandomStrings(int count){
        List<String> dictionary = loadDictionary();
        int dictionarySize = dictionary.size();
        ArrayList<String> generatedObjects = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(dictionarySize);
            String randomWord = dictionary.get(randomIndex);
            generatedObjects.add(randomWord);
        }

        return generatedObjects;
    }

    public static ArrayList<Integer> generateRandomIntegers(int count){
        ArrayList<Integer> generatedObjects = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            generatedObjects.add(random.nextInt(100));
        }
        return generatedObjects;
    }

    public static HashMap<Integer, String> generateRandomIntToStrMap(int count){
        HashMap<Integer, String> map = new HashMap<>();
        List<String> dictionary = loadDictionary();
        int dictionarySize = dictionary.size();
        IntStream.range(0, count).forEach(i -> map.put(i, dictionary.get(random.nextInt(dictionarySize))));
        return map;
    }

    public static HashMap<String, String> generateRandomStrToStrMap(int count){
        HashMap<String, String> map = new HashMap<>();
        List<String> dictionary = loadDictionary();
        int dictionarySize = dictionary.size();
        IntStream.range(0, count).forEach(i -> map.put(dictionary.get(random.nextInt(dictionarySize)), dictionary.get(random.nextInt(dictionarySize))));
        return map;
    }

    private static List<String> loadDictionary() {
        List<String> dictionary = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(DICTIONARY_FILE_PATH));
            String line;

            while ((line = reader.readLine()) != null) {
                dictionary.add(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dictionary;
    }

    public static int[][] getMatrix(){
        Random random = new Random();
        int i = 5;
        int j = 4;

        int[][] matrix = new int[i][j];

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                matrix[k][l] = random.nextInt(200);
            }
        }
        return matrix;
    }

    public static String getRandomSentence(int length){
        ArrayList<String> list = generateRandomStrings(length);
        String SPACE = " ";
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
            sb.append(SPACE);
        }
        return sb.toString().trim();
    }
    public static void print(String str){
        System.out.println(str);
    }

    public static <T> Consumer<T> print(){
        return x -> System.out.print(x + ", ");
    }

    public static <T> Consumer<T> printWithPrefix(String prefix){
        return x -> System.out.print(prefix + " " + x + ", ");
    }

    public static void print(ListInterface list) throws Exception {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.getAtIndex(i) + ", ");
        }
        System.out.println("Size : " + list.getSize());
    }
}

