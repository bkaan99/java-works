package org.ders;

public class FootballPlayerTest {
    public static void main(String[] args) {
          FootballPlayer alex1 = new FootballPlayer();
          alex1.no = 10;
          alex1.name = "Alex de Souza";
          alex1.minutes = 0;
          alex1.inPlay = true;
          alex1.numberOfGoals = 0;

          alex1.play(90);
          alex1.score(2);


          System.out.println("number of goals: " + alex1.numberOfGoals);
          System.out.println("Played: " + alex1.minutes + " totally");

          alex1.play(60);
          alex1.score(2);

          System.out.println("number of goals: " + alex1.numberOfGoals);
          System.out.println("Played: " + alex1.minutes + " totally");


    }
}




