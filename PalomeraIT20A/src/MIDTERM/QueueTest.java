/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIDTERM;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Palomera
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue <String> arrivalpatients = new LinkedList <>();
        
        System.out.println("=== Arrival Order ===");
        arrivalpatients.offer("Anna (Severity: " + 3 + ")");
        arrivalpatients.offer("Bob (Severity: " + 1 + ")");
        arrivalpatients.offer("Carla (Severity: " + 2 + ")");
        arrivalpatients.offer("Dave (Severity:" + 1 + ")");
        
        
        System.out.println("Arrival Order: " + arrivalpatients);
        
         PriorityQueue <String> patients = new PriorityQueue <>(Comparator.comparingInt(
                 s-> Integer.parseInt(s.replaceAll("[^0-9]", ""))
         ));
         
         patients.addAll(arrivalpatients);
         
           System.out.println("\n=== Treatment Order ===");
         while(!patients.isEmpty()){
             System.out.println("Treating: " + patients.poll());
         }
    }
}
