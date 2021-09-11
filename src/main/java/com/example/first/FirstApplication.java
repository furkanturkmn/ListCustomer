package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.Random;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) throws JSONException {

            /*Customer CustomerArray[] = new Customer[5];
            JSONArray jsonlist = new JSONArray();

            for(int i = 0 ; i < 5 ; i++){
                    CustomerArray[i].name = generateRandomWords(4);
                    CustomerArray[i].surname = generateRandomWords(3);
                    CustomerArray[i].phonenumber = generateRandomWords(11);
                    jsonlist.put(CustomerArray[i]);
            }*/

            SpringApplication.run (FirstApplication.class, args);
    }
    /*public static String[] generateRandomWords(int numberOfWords)
    {
                String[] randomStrings = new String[numberOfWords];
                Random random = new Random();
                for(int i = 0; i < numberOfWords; i++)
                {
                        char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
                        for(int j = 0; j < word.length; j++)
                        {
                                word[j] = (char)('a' + random.nextInt(26));
                        }
                        randomStrings[i] = new String(word);
                }
                return randomStrings;
    }*/
}
