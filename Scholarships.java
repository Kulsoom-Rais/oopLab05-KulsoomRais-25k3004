
public class Scholarships {
    public static void main(String[] args){
        int[] marks = {37, 98, 76, 80, 56, 95, 88, 67,90,65,34,87};
        for (int i=0; i<12; i++){
            if(marks[i]<40){
                marks[i]=40;
            }
        }
        // calculate class average
        double total=0;
        for(int m: marks ){
            total += m;
        }
        double classAvg= total/12;
        System.out.println("class Average= "+classAvg);

        //scholarship categories
        int fullSch= 0;
        int halfSch=0;
        int noSch=0;
        int belowAvg=0;

        for(int m: marks){
            if(m > 85){
              fullSch++;
            }
            else if(m >=70 && m<=85){
                halfSch++;
            }
            else{
                noSch++;
            }

            if(m < classAvg){
                belowAvg++;
            }
        }
        System.out.println("Full Scholarship Students= " +fullSch);
        System.out.println("Half Scholarship Students= " +halfSch);
        System.out.println("No Scholarship Students= " +noSch);
        System.out.println("Students below Class Average= " +belowAvg);

        System.out.print("Final marks after grace:");
        for (int m : marks){
            System.out.println(m+"");
        }

    }
}
