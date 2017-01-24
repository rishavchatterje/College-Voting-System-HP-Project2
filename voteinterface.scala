import scala.collection.JavaConversions._

trait voteInterface {

  def listCandidate(): Int

  def processVoting(id: Int): Int

  def showWinnerCandidate(): Int
}
