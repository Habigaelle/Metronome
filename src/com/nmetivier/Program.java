package com.nmetivier;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		launchTempo();
		while (Console.canStop != true) {
			System.out.println("Entrer un nouveau tempo ou RETURN pour quitter : ");
			String userChoice = keyBoard.nextLine();
			if (userChoice.equals("RETURN")) {
				Console.canStop = true;
			} else {
				Console.bpm = Integer.parseInt(userChoice);
			}
		}
		keyBoard.close();
	}

	private static void launchTempo() {
		TempoThread tempo = new TempoThread();
		tempo.start();
	}
}
