package com.zerobank.stepdefinitions;

import io.cucumber.java.en.Given;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shutdown_Restart {

    @Given("Shutdown")
    public void shutdown() {


            shutdownMac();
        }

        public static void shutdownMac() {
            String command = "osascript -e 'tell app \"System Events\" to shut down'";
            System.out.println("Executing command: " + command);
            executeCommand(command);
        }

        public static void restartMac() {
            String command = "osascript -e 'tell app \"System Events\" to restart'";
            System.out.println("Executing command: " + command);
            executeCommand(command);
        }

        private static void executeCommand(String command) {
            try {
                Process process = Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", command});

//            // Provide the password to sudo through standard input
//            System.out.print("Enter your password: ");
//            Scanner scanner = new Scanner(System.in);
//            String password = scanner.nextLine();
//            process.getOutputStream().write((password + "\n").getBytes());
//            process.getOutputStream().flush();

                // Capture output for additional logging
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                // Print error stream
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                while ((line = errorReader.readLine()) != null) {
                    System.err.println(line);
                }

                int exitCode = process.waitFor();

                if (exitCode == 0) {
                    System.out.println("Command executed successfully");
                } else {
                    System.out.println("Error executing command. Exit code: " + exitCode);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }



    @Given("Restart")
    public void restart() {

        restartMac();

    }
}
