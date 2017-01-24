
//remove if not needed
import scala.collection.JavaConversions._
class votingProcess extends council with voteInterface {
  def listCandidate(): Int = {
    for (party <- partyList) {
      println("\n\nButton: " + party.cId + " Party: " + party.partyName + 
        " Candiadate: " + 
        party.candidateName)
    }
    0
  }
  def processVoting(id: Int): Int = {
    for (party <- partyList if party.cId == id) {
      party.vote += 1
      println("Vote process completed!\n\n")
      //break
    }
    0
  }
  def showWinnerCandidate(): Int = {
    var flgPos = 0
    var flgCId = 0
    var flgVote = 0
    for (party <- partyList) {
      if (party.vote > flgVote) {
        flgVote = party.vote
        flgCId = flgPos
      }
      flgPos += 1
    }
    println("The winner is " + partyList(flgCId).candidateName + " by " + 
      partyList(flgCId).vote + 
      " vote")
    0
  }
}
