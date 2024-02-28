/**
 * Program Description:To create dental booking system
 * Programmer:QIB
 * Date:28 February 2024
 */

import java.util.Scanner;

public class BookingSystem
{
    public static void main (String[] args){
        int i = 0,size = 3;
        String inputPatientName,inputApptDate,inputApptTime,inputDentistName;

        Appointment[] appointmentArr = new Appointment[size];
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter data for each appointment and store the objects in the array
        for (i = 0;i<size; i++){
            System.out.print("===========================================");
            System.out.print("\nWelcome to Dental Clinic Appointment System   ");
            System.out.print("\n===========================================");

            System.out.print("\nEnter Patient Name: ");
            inputPatientName = scanner.nextLine();

            System.out.print("Enter Appointment Date (DD/MM/YYYY): ");
            inputApptDate = scanner.nextLine();

            System.out.print("Enter Appointment Time (HH:MM AM/PM): ");
            inputApptTime = scanner.nextLine();

            System.out.print("Enter Dentist Name: ");
            inputDentistName = scanner.nextLine();

            appointmentArr[i] = new Appointment (inputPatientName,inputApptDate,inputApptTime,inputDentistName);

        }
        
        // Print all the appointment details that user already enter in the system
        System.out.println("\n==========All Appointment Details==========");
        for (i = 0; i < size; i++) {
            System.out.println(appointmentArr[i].toString());
        }

        // Search for appointment based on the date
        System.out.print("\n==========================================================");
        System.out.print("\nEnter the date of the appointment to search (DD/MM/YYYY): ");
        String apptDate = scanner.nextLine();
        System.out.print("==========================================================");

        boolean found = false;
        for (i = 0; i < appointmentArr.length; i++) {
            if (appointmentArr[i].getApptDate().equalsIgnoreCase(apptDate)) {
                System.out.print("\n==========================================================");
                System.out.println("\nThere is dentist appointments on this date");
                System.out.print("==========================================================");
                System.out.println("\nDetails of the appointments");
                System.out.println("\n"+ appointmentArr[i].toString());
                found = true;
                break;
            }
        }

        // Cancel the appointment
        if (found) {
            cancelAppointment(appointmentArr);
        } else {
            System.out.println("\nThere is no dentist appointment on this date");
        }
    }

    // Method to cancel a specific appointment
    public static void cancelAppointment(Appointment[] appointmentArr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the appointment date (DD/MM/YYYY) to cancel: ");
        String cancelDate = scanner.nextLine();

        boolean apptCancel = false;
        for (int i = 0; i < appointmentArr.length; i++) {
            if (appointmentArr[i] != null && appointmentArr[i].getApptDate().equals(cancelDate)) {
                appointmentArr[i] = null;
                apptCancel = true;
                break;
            }
        }
        if (apptCancel) {
            System.out.println("==========================================================");
            System.out.println("Appointment have been cancel successfully.");
            System.out.println("==========================================================");
        } else {
            System.out.println("==========================================================");
            System.out.println("No appointment found on " + cancelDate + ".");
            System.out.println("==========================================================");
        }
    }
}
