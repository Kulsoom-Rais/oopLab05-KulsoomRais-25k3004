import java.util.Scanner;
public class TempRecords {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double[][] temp= new double[5][7];
        for(int i=0; i<5; i++){
            System.out.println("Enter the temp readings for patient" +(i+1)+":");
            for(int j=0; j<7; j++){
                System.out.println("temp reading of day" +(j+1)+":");
                temp[i][j]= sc.nextDouble();
                // temp below 95 replace with 95
                if(temp[i][j]<95){
                    temp[i][j]=95;
                }
            }
        }
        //calculate average temp of each patient
        double[] patientAvg = new double[5];
        for(int i=0; i<5; i++) {
            double sum = 0;
            for (int j = 0; j < 7; j++) {
                sum += temp[i][j];
            }
            patientAvg[i] = sum / 7;

            System.out.println("Average temp of patient " + (i + 1) + " is " + patientAvg[i]);
        }
            int maxPatient=0;
            for (int k =1; k<5; k++){
                if (patientAvg[k]> patientAvg[maxPatient]){
                    maxPatient=k;

                }
            }
            System.out.println("Patient with highest weekly average: Patient " + (maxPatient + 1));

        int countHighTemps = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (temp[i][j] > 100) {
                    countHighTemps++;
                }
            }
        }
        System.out.println("Number of times temperature exceeded 100°F: " + countHighTemps);
        System.out.println("\nCorrected Temperature Table:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Patient " + (i + 1) + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(temp[i][j] + " , ");
            }
            System.out.println();
        }

        sc.close();

    }
}
