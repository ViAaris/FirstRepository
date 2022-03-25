import com.company.Cell;
import com.company.Status;
import com.company.Window;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StatusTest {
    @Test
    public void shouldChangeStatusStep1(){
        Status s = Status.NONE;
        s = s.step1(3);
        Assertions.assertEquals(Status.BORN, s);
        s = Status.LIVE;
        s = s.step1(1);
        Assertions.assertEquals(Status.DEAD, s);
    }

    @Test
    public void shouldBeEightCells(){
        Window w = new Window();
        w.initFrame();
        w.initBoxes();
        List<Cell> list = w.boxes[12][10].cell.near;
        Assertions.assertEquals(8, list.size());
    }
}
