/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import jdk.nashorn.internal.objects.NativeArray;


/**
 *
 * @author Xiaomi
 */
public class CaesarWorker {
    private int offset = 0;
    private int alphabetModule = 0;
    public String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТФХЦЧШЩУЪЫЬЭЮЯ.,”:-!? ".toUpperCase();

    public CaesarWorker() {
        this.offset = 0;
    }
    
    public CaesarWorker(int xOffset) {
        this.offset = xOffset % alphabet.length();
    }
    /*
    зашифровка ключом, заданным при создании объекта
    */
    public String encryptByAlphabet(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            int ttPos = alphabet.indexOf(Character.toUpperCase(s.charAt(i)));
            if (ttPos != -1) {
                ttPos = ttPos + offset;
                if ((ttPos + 1)> alphabet.length()) ttPos = (ttPos)  % alphabet.length();
                sb.append(alphabet.charAt(ttPos));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    
    /*
    расшифровка ключом, заданным при создании объекта
    */
    public String decryptByAlphabet(String s) {
         StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            int ttPos = alphabet.indexOf(Character.toUpperCase(s.charAt(i)));
            if (ttPos != -1) {
                ttPos = ttPos - offset;
                if (ttPos < 0) ttPos = (alphabet.length() + ttPos);
                sb.append(alphabet.charAt(ttPos));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    
    /*
    расшифровка ключом, заданным параметром функции
    */
    public String decryptByAlphabet(String s, int xOffset) {
         StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            int ttPos = alphabet.indexOf(Character.toUpperCase(s.charAt(i)));
            if (ttPos != -1) {
                ttPos = ttPos - xOffset;
                if (ttPos < 0) ttPos = (alphabet.length() + ttPos);
                sb.append(alphabet.charAt(ttPos));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    
    /*
    расшифровака частотным анализом
    */
    public String decryptByCharFrequecy(StringBuilder xAlphabet, StringBuilder xText) {
        //составить list отсортированный по частоте использования букв из xAlphabet
        System.out.println("частота букв в документе - источнике");
        List<String> sortedAlphabet = getSymbolFrequescy(xAlphabet.toString());
        //составить лист отсортированный по частоте использования букв  в xText
        System.out.println("частота букв в зашифрованном тексте");
        List<String> sortedEncrypt = getSymbolFrequescy(xText.toString());
        //определим границу применимости 
        int ttSize = sortedAlphabet.size();
        if (sortedAlphabet.size() > sortedEncrypt.size()) ttSize = sortedEncrypt.size();
        //заменим одно на другое
        String ttRes = "";
        for(int i = 0; i < ttSize; i++) {
            ttRes =  xText.toString().toUpperCase().replace(sortedEncrypt.get(i), sortedAlphabet.get(i));
        }
        return ttRes;
    }
    
    public List<String> getSymbolFrequescy(String xString) {;
        HashMap<String, Integer> symbolMap = new HashMap<String, Integer>();
        for (int i = 0; i < xString.length(); i++) {
            String c = String.valueOf(xString.charAt(i)).toUpperCase();
            Integer val = symbolMap.get(c);
            if (alphabet.lastIndexOf(c) > -1) {
                if (val != null) {
                    symbolMap.put(c, new Integer(val + 1));
                }
                else {
                   symbolMap.put(c, 1);
                }    
            }
        }
        System.out.println("=================");
        System.out.println(symbolMap);
        List<String> ttRes = symbolMap.entrySet().stream()
            .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        System.out.println(ttRes);
        System.out.println("=================");
        return ttRes;
    }
}