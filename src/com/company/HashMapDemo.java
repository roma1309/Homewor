package com.company;

import java.util.*;
import java.util.Set;

public class HashMapDemo{
    public static void main(String[] args) {



        Map<String, String> Vocabulary = new HashMap();
        Vocabulary.put("Барселона", "-лучший футбольный клуб");

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1. Вывести список слов на экран.\n" +

                            "2. Вывести значение слова.\n" +

                            "3. Добавить значение нового слова.\n" +

                            "Выбор:");
            int n = in.nextInt();
            switch (n) {
                case 1: {
                    Set<String> keys = Vocabulary.keySet();
                    System.out.println(keys);


                    System.out.println("---------------------");

                    continue;
                }


                case 2: {
                    Scanner scan = new Scanner(System.in);
                    String word = scan.nextLine();
                    String newKey = Vocabulary.get(word);
                    if (Vocabulary.containsKey(word) != true)
                     {

                        System.out.println(newKey);
                        break;
                    }else {

                        String key = Vocabulary.get(word);

                        System.out.println(key);

                        System.out.println("---------------------");

                    }
                    System.out.println("---------------------");
                }
                case 3: {
                    boolean t = true;

                    while (t) {

                        System.out.println("Введите новое слово:");
                        Scanner scan = new Scanner(System.in);
                        String a = scan.nextLine();
                        String newKey = Vocabulary.get(a);
                        if (Vocabulary.containsKey(a) == true) {

                            System.out.println("Такое слово есть в словаре.\n" );

                        } else {

                            System.out.println("Введите его значение:");

                            String b = scan.nextLine();
                            String newPut = Vocabulary.get(b);

                            Vocabulary.put(a, b);

                            System.out.println("Слово добавлено в словарь.");

                            System.out.println("---------------------");

                            t = false;

                        }
                    }
                }


            }


        }
    }
}