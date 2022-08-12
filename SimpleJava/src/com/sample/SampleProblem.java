package com.sample;

import java.util.Scanner;

public class SampleProblem {

    static int red_limit=0;
    static int blue_limit=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int red_candy= scanner.nextInt();
        int blue_candy= scanner.nextInt();
        int not_adjacent= scanner.nextInt();

         red_limit=not_adjacent;
         blue_limit=not_adjacent;
        int ans=calculate(red_candy+blue_candy,red_candy,blue_candy,not_adjacent,not_adjacent);
        System.out.println(ans);
    }


    private static int calculate(int total_candy, int red_candy, int blue_candy, int r, int b) {
        System.out.println("Candies left");
        System.out.println(" total_candy"+ " red_candy"+" blue_candy"+" red limit"+" blue_limit");
        System.out.println(" " +total_candy+","+ red_candy+","+ blue_candy+" ,"+ r+","+ b);

        if((red_candy+blue_candy)==0){
            System.out.println("No Candies left");
            return 1;
        }
        //fill red
        int x=0;
        System.out.println("x "+x);
        if(red_candy>0&&r>0){
            System.out.println("Filling Red Candy");
            x=calculate(total_candy-1,red_candy-1,blue_candy,r-1,blue_limit);
            System.out.println("inside red x "+ x);
            }
        //fill blue
        int y=0;
        System.out.println("y "+y);
        if(blue_candy>0&&b>0){
            System.out.println("Filling Blue Candy");
            y=calculate(total_candy-1,red_candy,blue_candy-1,red_limit,b-1);
            System.out.println("inside blue y "+ y);

        }
        System.out.println("Returning sum");

        System.out.println(" total_candy"+ " red_candy"+" blue_candy"+" red limit"+" blue_limit");
        System.out.println(" " +total_candy+","+ red_candy+","+ blue_candy+" ,"+ r+","+ b);
        return x+y;
    }
}
