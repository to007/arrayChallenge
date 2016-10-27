package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList grades = new ArrayList();
        while(true)
        {
            System.out.println("Input a grade or input -1 for an average");
            double grade = input.nextDouble();
            if(grade == -1)
            {
                break;
            }
            grades.add(grade);
        }
        double sum = 0;
        double average;
        for(int i = 0; i < grades.size(); i++)
        {
            sum += (double)grades.get(i);
        }
        average =  sum / grades.size();
        System.out.println(average);

    }
}
