package bai_8_clean_code_va_refactoring.bai_tap.refactoring;

public class TennisGame {
    private static String howToCall = "";
    private static final int ZERO_POINTS = 0;
    private static final int ONE_POINTS = 1;
    private static final int TOW_POINTS = 2;
    private static final int THREE_POINTS = 3;

    public static String getScore(String player1Name, String player2Name, int pointPlayer1, int pointPlayer2) {
        howToCall = "";
        if (pointPlayer1 == pointPlayer2) {
            equal(pointPlayer1);
        } else if (pointPlayer1 >= 4 || pointPlayer2 >= 4) {
            considerAdvantages(pointPlayer1, pointPlayer2);
        } else {
            normalScore(pointPlayer1);
            howToCall += "-";
            normalScore(pointPlayer2);
        }

        return howToCall;
    }

    public static void normalScore(int points) {
        switch (points) {
            case ZERO_POINTS:
                howToCall += "Love";
                break;
            case ONE_POINTS:
                howToCall += "Fifteen";
                break;
            case TOW_POINTS:
                howToCall += "Thirty";
                break;
            case THREE_POINTS:
                howToCall += "Forty";
                break;
        }
    }

    public static void considerAdvantages(int pointPlayer1, int pointPlayer2) {
        int minusResult = pointPlayer1 - pointPlayer2;
        if (minusResult == 1) howToCall = "Advantage player1";
        else if (minusResult == -1) howToCall = "Advantage player2";
        else if (minusResult >= TOW_POINTS) howToCall = "Win for player1";
        else howToCall = "Win for player2";
    }

    public static void equal(int pointPlayer1) {
        switch (pointPlayer1) {
            case ZERO_POINTS:
                howToCall = "Love-All";
                break;
            case ONE_POINTS:
                howToCall = "Fifteen-All";
                break;
            case TOW_POINTS:
                howToCall = "Thirty-All";
                break;
            case THREE_POINTS:
                howToCall = "Forty-All";
                break;
            default:
                howToCall = "Deuce";
                break;
        }
    }
}
