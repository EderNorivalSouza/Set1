package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<LogEntry> set = new HashSet<>();
		
		
		System.out.print("How many students for course A? ");
		int studentsA = sc.nextInt();
		for(int i = 1; i<=studentsA; i++) {
			int codigoUnico = sc.nextInt();
			
			set.add(new LogEntry(codigoUnico));	
		}
		System.out.print("How many students for course B? ");
		int studentsB = sc.nextInt();
		for(int i = 1; i<=studentsB; i++) {
			int codigoUnico = sc.nextInt();
			
			set.add(new LogEntry(codigoUnico));	
		}
		System.out.print("How many students for course C? ");
		int studentsC = sc.nextInt();
		for(int i = 1; i<=studentsC; i++) {
			int codigoUnico = sc.nextInt();
			
			set.add(new LogEntry(codigoUnico));	
		}
		
		System.out.println(set.size());
		
		sc.close();
	}

}
