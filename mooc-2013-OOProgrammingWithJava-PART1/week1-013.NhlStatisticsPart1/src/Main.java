import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
       
        Scanner reader = new Scanner(System.in);
        
        System.out.println("top ten based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println();
        
        System.out.println("top 25 based on penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);   
        
         System.out.println();
        System.out.println("statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
         System.out.println();
        
        System.out.println("stats for PHI");
        NHLStatistics.teamStatistics("PHI");
         System.out.println();
        
        System.out.println("players in Anaheim Ducks by points");
       NHLStatistics.teamStatistics("ANA");
       NHLStatistics.sortByPoints();
        System.out.println();
        
    }
}
