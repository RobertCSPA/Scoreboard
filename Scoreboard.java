public class Scoreboard
{
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;
    private String teamOne;
    private String teamTwo;
    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }
    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
    public void recordPlay(int score)
    {
        teamOneScore = score;
    }


}
