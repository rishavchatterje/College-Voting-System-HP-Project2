import java.io.*;
import java.util.Scanner;
class votingMaching {
    public static void main(String args[]) {
        int pole = 1;
        votingProcess myVote = new votingProcess();
        Scanner insPole = new Scanner(System.in);
        while(pole != 0) {
            System.out.println("Whom you like to vote");
            myVote.listCandidate();
            System.out.println("Press the button number to vote your fav candidate or press '0' to exit");
            pole = Integer.parseInt(insPole.nextLine());
            if (pole != 0)
                myVote.processVoting(pole);
        }
        
        myVote.showWinnerCandidate();
    }
}
