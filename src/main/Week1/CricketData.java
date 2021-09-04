package main.Week1;

class CricketData
{
    int runs, wickets;
    float overs;
    CurrentScore currentScore;
    AverageScore averageScore;

    // Constructor
    public CricketData(CurrentScore currentScore,
                       AverageScore averageScore)
    {
        this.currentScore = currentScore;
        this.averageScore = averageScore;
    }

    // Get latest runs from stadium
    private int getLatestRuns()
    {
        // return 90 for simplicity
        return 50;
    }

    // Get latest wickets from stadium
    private int getLatestWickets()
    {
        // return 2 for simplicity
        return 6;
    }

    // Get latest overs from stadium
    private float getLatestOvers()
    {
        // return 10.2 for simplicity
        return (float)10.2;
    }

    // This method is used update displays when data changes
    public void dataChanged()
    {
        // get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentScore.update(runs,wickets,overs);
        averageScore.update(runs,wickets,overs);
    }
}