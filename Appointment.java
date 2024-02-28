
/**
 * Purpose:To display appointment details by the given scenario and given attributes
 * Programmer:Qib
 * Date:28/2/2024
 */

public class Appointment
{
    //instance variables
    private String patientName;
    private String apptDate;
    private String apptTime;
    private String dentistName;

    // Normal constructor without parameter
    public Appointment(){
        this.patientName = "";
        this.apptDate = "";
        this.apptTime = "";
        this.dentistName = "";        
    }
    
    // Normal constructor with parameter
    public Appointment(String patientName,String apptDate,String apptTime,String dentistName){
        this.patientName = patientName;
        this.apptDate = apptDate;
        this.apptTime = apptTime;
        this.dentistName = dentistName;
    }
    
    //retrievers (accessors / getters) for each data member
    public String getPatientName(){
        return patientName;
    }
    
    public String getApptDate(){
        return apptDate;
    }
    
    public String getApptTime(){
        return apptTime;
    }
    
    public String getDentistName(){
        return dentistName;
    }
    
    //Mutators (setters) that sets all data members
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public void setApptDate(String apptDate) {
        this.apptDate = apptDate;
    }
    
    public void setApptTime(String apptTime) {
        this.apptTime = apptTime;
    }
    
    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }
    
    //toString() method that displays all information about the appointment object
    @Override
    public String toString(){
        return "\nPatient Name:" + patientName + 
        "\nAppointment Date:" + apptDate + 
        "\nAppointment Time:" + apptTime + 
        "\nDentist Name: " + dentistName;
    }
}



