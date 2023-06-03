import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseManagementTest {

    public ExerciseManagementTest(){
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());

    }

}
