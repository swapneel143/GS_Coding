package org.example;

import java.util.HashSet;

import static java.nio.file.Files.move;

public class problem4 {

    public static void main(String[] args) {
//        String s= "DOWN UP 2xRIGHT DOWN 3xLEFT";
        String s1=  "URRDDL";

//        System.out.println(coordinate(s));
        System.out.println(coordinate(s1));
    }
    public static String coordinate(String s)
    {
        int x =0;
        int y=0;
        String []tokens = s.split(" ");
        for(String token :tokens )
        {
            if(token.contains("x"))
            {
                String[] parts = token.split("x");
                int multiplier = Integer.parseInt(parts[0]);

                String direction = parts[1];
                int [] newCo = move(direction,multiplier,x,y);
                x=newCo[0];
                y=newCo[1];
            }
            else
            {
                int [] newCo = move(token,1,x,y);

                x=newCo[0];
                y=newCo[1];
            }
        }

       return "(" + x + ", " + y + ")";
    }

    private static int[] move(String direction, int times, int x, int y) {

            switch (direction)
            {
                case "UP":
                case "U":
                    y += times;
                    break;
                case "DOWN":
                case "D":
                    y -= times;
                    break;
                case "LEFT":
                case "L":
                    x -= times;
                    break;
                case "RIGHT":
                case "R":
                    x += times;
                    break;
                default:
                    System.out.println("Invalid direction: " + direction);

            }
            return new int[]{x,y};

          }



}

