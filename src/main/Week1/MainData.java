package main.Week1;

class MainData
{
    public static void main(String args[])
    {
        // Create objects for testing
        AverageScore averageScore =
                new AverageScore();
        CurrentScore currentScore =
                new CurrentScore();

        // Pass the displays to Cricket data
        CricketData cricketData = new CricketData(currentScore,
                averageScore);

        cricketData.dataChanged();

    }
}