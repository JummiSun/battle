package com.example.battle.Server;

import java.io.*;
import java.net.*;
import java.util.Random;

public class GameServer {
    public static final int SERVER_PORT = 8687;
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
            Socket gameParticipant = serverSocket.accept();
            DataOutputStream gameServerOutput = new DataOutputStream(gameParticipant.getOutputStream());
            Random random = new Random();
            int numbers = random.nextInt(10);
            for (int i = 0; i <= numbers; i++) {
                gameServerOutput.writeBytes(String.valueOf(numbers));
            }
            gameParticipant.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}