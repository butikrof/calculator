package com.company;

public class konverter2 { //
    public static String transform_number_to_roman_numeral(int number) {
        int[] roman_value_list = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_char_list = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < roman_value_list.length; i += 1) {
            while (number >= roman_value_list[i]){
                number -= roman_value_list[i];
                res.append(roman_char_list[i]);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int number_input = 987;
        String roman_numeral_output = transform_number_to_roman_numeral(number_input);
        System.out.println("number " + number_input + " equal to:" + roman_numeral_output);
    }
}
