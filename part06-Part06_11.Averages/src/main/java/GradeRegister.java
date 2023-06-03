
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointList; 

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointList = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.pointList.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    /*
     * Retunr double of grades average, if the list is empty than return -1 else
     * loop through the size of grades and create a sum of thoser grades
     * return su of grades divided by the size of the grades arraylist
     */
    public double averageOfGrades(){
        if(this.grades.isEmpty()){
            return -1;
        } else {
            double sum = 0;
            for(int i = 0; i < grades.size(); i++){
                sum += grades.get(i);
            }
            return sum / this.grades.size();
        }
    }
    public double averageOfPoints(){
        if(this.pointList.isEmpty()){
            return -1;
        } else { 
            double sum = 0;
            for(int i = 0; i < pointList.size(); i++){
                sum += pointList.get(i);
            }
            return sum / pointList.size();
        }
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
