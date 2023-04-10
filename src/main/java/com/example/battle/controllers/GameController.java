package com.example.battle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

@RestController
@RequestMapping("/game")
public class GameController {
    @GetMapping("/find")
    public String findGame(){
        var receiveDate = "not found";
        try {
            Socket clientSocket = new Socket("localhost",8687);
            InputStream is =clientSocket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
            receiveDate = bufferedReader.readLine();
            //create a service instead of this socket/try

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return receiveDate;
    }
}
