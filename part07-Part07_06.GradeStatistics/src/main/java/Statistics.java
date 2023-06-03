import java.util.ArrayList;

public class Statistics {
    // arraylist for grades
    private ArrayList<Integer> grades;
    // initialize instance variables 
    public Statistics(){
        this.grades = new ArrayList<>(); // new arraylist
    }

    public void addGrade(int gradeAdd){
        // add grades as long as its above zero and below 101
        if(gradeAdd >= 0 && gradeAdd <= 100){
            this.grades.add(gradeAdd);
        }
    }
    // get average
    public String getStats(){
        double result = 0;
        int sum = 0;
        // cycle through grades
        for(int i : this.grades){
            sum += i; // the sum is all of them
        }
        // return the average of scores
        result = (sum * 1.0) / this.grades.size();
        return result + "";
    }
    // get total points of passing scores average
    public String getPoints(){

        double result = 0; // need to store results of item
        int sum = 0; // tally for sum
        int passing = 0; // variable for passing number and scores
        // cycle through grades
        for(int i : this.grades){
            if(i > 49){
                passing++; // tally passing scores above 49
                sum += i; // tally sum of those grades
            }
        }
        // result = sum / total number of passing scores
        result = (sum * 1.0) / passing;
        // if the sum equals zero, return blank
        if(sum == 0){
            return "-";
        }
        // else return passing numbers
        return result + "";
    }

    public String percent(){
        double result = 0;
        int total = 0;
        int passing = 0;
        for(int i: grades){
            total++;
            if(i > 49){
                passing++;
            }
            result = 100 / ((total * 1.0) / passing);
        }
        if(total == 0){
            return "-";
        }
        return result + "";
    }
    // grade distribution
    public void gradeDis(){
        int[] gradeLst = new int[6];
        for(int i: grades){
            
            // grade tables
            if(i >= 90){
                gradeLst[0]++;
            } else if(i < 90 && i >= 80){
                gradeLst[1]++;
            } else if(i < 80 && i >= 70){
                gradeLst[2]++;
            } else if(i < 70 && i >= 60){
                gradeLst[3]++;
            } else if(i < 60 && i >= 50){
                gradeLst[4]++;
            } else if(i < 50){
                gradeLst[5]++;
            }

        }

        System.out.println("Grade Distribution:");

        int gradeIndex = 5;
        // print stars in reverse order for grade tables
        for(int i: gradeLst){
            System.out.print(gradeIndex + ":");
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
            gradeIndex--;
        }
    }
    // print statement of things
    public void printAvg(){
        System.out.print(
          "Point average (all): " + getStats() + "\n"
        + "Point average (passing): " + getPoints() + "\n"
        + "Pass percentage: " + percent() + "\n");
        gradeDis();
    }
    
}
