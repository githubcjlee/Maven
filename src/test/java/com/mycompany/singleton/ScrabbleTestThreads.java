package com.mycompany.singleton;

public class ScrabbleTestThreads{

    public static void main(String[] args){

        // runnable?
        Runnable getTiles = new GetTheTiles();

        Runnable getTilesAgain = new GetTheTiles();

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();
    }
}