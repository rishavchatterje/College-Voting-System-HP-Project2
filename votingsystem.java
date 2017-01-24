
import java.util.Scanner;
public class votingsystem extends VotingCouncil implements vote1
 {

	
	public int listCandidate(String name,int ID ) 
	{ 
	  int flag;	
	 for(Candidate Party:reg_party)
	 {
		if(ID==Party.cid){
			flag=0;
	 
			System.out.println("the details of the candidate are as follows"+Party.cid+Party.candidateName);
			break;
		}
	 
	 }
	 
	 return 0;
	    
		
	}

	
	public int processVoting(int ID) {
	
	
	for(Candidate Party:reg_party)
	 {
		if(ID==Party.cid){
			Party.vote++;
	                 			
	      	System.out.println("vote has been done");
	 }
	}
		return 0;
	}

	
	public int showWinnerCandidate()
		{    int cid=0,vote=0;
			for(  Candidate Party:reg_party)
		{	if(Party.vote>vote)
		 {cid=Party.cid;
		vote=Party.vote;}
		
		}System.out.println("the winner is"+cid);
		return 0;
	}

	
          
}
