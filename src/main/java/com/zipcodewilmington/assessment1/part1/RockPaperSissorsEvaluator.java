package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        if (handSign == "rock") {
            return "paper";
        } else if
            (handSign == "paper")
            return "scissor";
    else{
            return "rock";
        }
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        if (handSign == "paper") {
            return "rock";
        } else if
        (handSign == "scissor")
            return "paper";
        else{
            return "scissor";
        }
    }


    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
       String result ="";
        if (handSignOfPlayer1 == handSignOfPlayer2)
            result = "Tie";
        else if (handSignOfPlayer1 == "rock") {
            if (handSignOfPlayer2 == "scissor")
                result = "rock";
        } else if (handSignOfPlayer1 == "rock") {
            if (handSignOfPlayer2 == "paper")
                result = "paper";
        } else if (handSignOfPlayer1 == "paper") {
            if (handSignOfPlayer2 == "scissor")
                result = "scissors";
        } else if (handSignOfPlayer1 == "paper") {
            if (handSignOfPlayer2 == "rock")
                result = "paper";
        } else if (handSignOfPlayer1 == "scissor") {
            if (handSignOfPlayer2 == "paper")
                result = "scissors";
        } else if (handSignOfPlayer1 == "scissor") {
            if (handSignOfPlayer2 == "rock")
                result = "rock";
        }
    return result;}
}
