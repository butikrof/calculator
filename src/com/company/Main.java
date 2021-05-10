package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //String [] consoleArgs;
        String numz;
        String numzr;
        int cifra0;
        int cifra2;
        int rim1 = 0;
        int rim2 = 0;
      

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Формат ввода под этой надписью: X * X enter");
        args = br.readLine().split(" "); //Загоняем текст с консоли в массив

        //for (int i=0; i < args.length; i++) {}//присваиваем порядковые цифры строкам массиву



        if (((args[0].matches("\\d+")))&&((args[2].matches("\\d+")))){ // проверяем сразу 2 условия \\d+ - цывра от 1 до 9 через условие "&& - и" Если да то мы тут И работаем дальше"

            cifra0 = Integer.parseInt(args[0]);   //присвоил переменной цыфра строку AGRS1
            cifra2 = Integer.parseInt(args[2]);

            if (cifra0 > 10){
                System.out.println("Тз - значене не более 10 включительно.");
                System.exit(0);
            }

            if (cifra2 > 10){
                System.out.println("Тз - значене не более 10 включительно.");
                System.exit(0);
            }

            //String num0 = args[0];
            numz = args[1];
            //String num2 = args[2];

            if (numz.equals("+")) {
                int result = cifra0 + cifra2;
                System.out.println("= "+result);
                System.exit(0);
            } else//иначе
            if (numz.equals("-")) {
                int result = cifra0 - cifra2;
                System.out.println("= "+result);
                System.exit(0);
            } else
            if (numz.equals("*")) {
                int result = cifra0 * cifra2;
                System.out.println("= "+result);
                System.exit(0);
            } else
            if (numz.equals("/")) {
                int result = cifra0 / cifra2;
                System.out.println("= "+result);
                System.exit(0);
            } else
            {
                System.out.println("Тз - Используй только + - * / эти операторы" );
                System.exit(0);
            }

        }

        else if (((args[0].matches("\\d+")))|((args[2].matches("\\d+")))){ // Если хоть одно из условий не содержит цыфру то заходим сюда  "| - ИЛИ" . \\d+ -Соответствует цифрам. Эквивалентно [0-9].
            System.out.println("Тз - Использовать только римские или арабские.");
            System.exit(0);
        }




        if (args[0].equals("I")) {
               rim1=1;
           }

           if (args[0].equals("II")) {
               rim1=2;
           }

           if (args[0].equals("III")) {
               rim1=3;
           }

           if (args[0].equals("IV")) {
               rim1=4;
           }

           if (args[0].equals("V")) {
               rim1=5;
           }

           if (args[0].equals("VI")) {
               rim1=6;
           }

           if (args[0].equals("VII")) {
               rim1=7;
           }

           if (args[0].equals("VIII")) {
               rim1=8;
           }

           if (args[0].equals("IX")) {
               rim1=9;
           }

           if (args[0].equals("X")) {
               rim1=10;
           }
//////
           if (args[2].equals("I")) {
               rim2=1;
           }

           if (args[2].equals("II")) {
               rim2=2;
           }

           if (args[2].equals("III")) {
               rim2=3;
           }

           if (args[2].equals("IV")) {
               rim2=4;
           }

           if (args[2].equals("V")) {
               rim2=5;
           }

           if (args[2].equals("VI")) {
               rim2=6;
           }

           if (args[2].equals("VII")) {
               rim2=7;             
           }

           if (args[2].equals("VIII")) {
               rim2=8;              
           }

           if (args[2].equals("IX")) {
               rim2=9;              
           }

           if (args[2].equals("X")) {
               rim2=10;               
           }
// проверяем что ввели
        if (rim1 == 0){
            System.out.println("Тз - Используй только римские числа oт I до X");
            System.exit(0);
        }

        if (rim2 == 0){
            System.out.println("Тз - Используй только римские числа oт I до X");
            System.exit(0);
        }



           numzr = args[1];


        if (numzr.equals("+")) {
            int result = rim1 + rim2;
            String results;
            results = konverter2.transform_number_to_roman_numeral(result);
            System.out.print("= "+results);
            if (results.equals("")){
                System.out.println("0, или отрицательное римское число.");
            }
            System.exit(0);
        }else 
        if (numzr.equals("-")) {
            int result = rim1 - rim2;
            String results;
            results = konverter2.transform_number_to_roman_numeral(result);
            System.out.print("= "+results);
            if (results.equals("")){
                System.out.println("0, или отрицательное римское число");
            }
            System.exit(0);

        }else 
        if (numzr.equals("*")) {
            int result = rim1 * rim2;
            String results;
            results = konverter2.transform_number_to_roman_numeral(result);
            System.out.print("= "+results);
            if (results.equals("")){
                System.out.println("0, или отрицательное римское число");
            }
            System.exit(0);
        }else 
        if (numzr.equals("/")) {
            int result = rim1 / rim2;
            String results;
            results = konverter2.transform_number_to_roman_numeral(result);
            System.out.print("= "+results);
            if (results.equals("")){
                System.out.println("0, или отрицательное римское число");
            }
            System.exit(0);
        }else {
            System.out.println("Тз - Используйте только + - * / эти операторы" );
            System.exit(0);
        }
    }
}





/////////////////////////////////////// Образцы , описание, хлам



/*    *//* if (numzr.equals("+")) {
            resultr = rim1 + rim2;
            System.out.println("равно!!"+resultr);
        }

        if (numzr.equals("-")) {
            resultr = rim1 - rim2;
            System.out.println("равно!!"+resultr);
        }

        if (numzr.equals("*")) {
            resultr = rim1 * rim2;
            System.out.println("равно!!"+resultr);
        }

        if (numzr.equals("/")) {
            resultr = rim1 / rim2;
            System.out.println("равно!!"+resultr);
        }
*/


 /*  rim1 = Integer.parseInt(args[0]);   //присвоил переменной цыфра строку AGRS0
           rim2 = Integer.parseInt(args[2]);

*///for (args[1] = "+") {
//    args[3]=args[0]+args[2];
// System.out.print(args[3]);
// }
// Integer.parseInt(args[0]+args[2]); //IntToStr - .//




           /* for (int i=0; i < args.length; i++) {
            System.out.print(args[i]+"werty\n");
            }*/
//(numz.equals("/")) переменная равна этому значению?
//    (args[i].matches("\\d+"))  - соответствует регул условию \\d+ == от 0 до 9 ,\\D не цыфра
//if (args[i].matches("[+]|[-]|[*]|[/]"))   соответствует ли хоть одному условию. В квадратных скобках чтобы воспренимать как символ &-и | - или



//  if (args[0].matches("\\d+"))&&



          /* if (((args[0].matches("\\d+")))&&((args[2].matches("\\d+")))){   //Java matches() возвращает значение true если оно совпадает с ("условием")

            System.out.println("проверяем сразу 2 условия \\d+ - цывра от 1 до 9 через условие && - и");
        }
           else if (((args[0].matches("\\d+")))|((args[2].matches("\\d+")))){
               System.out.println("ипользуйте либо римские либо арабские через условие | - или");
           }*/


      /*  if (args[0].equals("I"))&&(args[1].equals("I")) {

        }

         /*int cifra0 = Integer.parseInt(args[0]);   //присвоил переменной цыфра строку AGRS1
        int cifra2 = Integer.parseInt(args[2]);*/


       /* if (args [0] <> 1..10) {

        }*/

/*System.out.print(args[0]);
        System.out.print(args[1]);
        System.out.println(args[2]);*/