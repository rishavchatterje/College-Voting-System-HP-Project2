import java.io._
import java.util.Scanner
//remove if not needed
import scala.collection.JavaConversions._

object votingMaching {

  def main(args: Array[String]) {
    var poll = 1
    val myVote = new votingProcess()
    val insPole = new Scanner(System.in)
    while (poll != 0) {
      println("Whom you like to vote")
      myVote.listCandidate()
      println("Press the button number to vote your fav candidate or press '0' to exit")
      poll = java.lang.Integer.parseInt(insPoll.nextLine())
      if (poll != 0) myVote.processVoting(poll)
    }
    myVote.showWinnerCandidate()
  }
}
