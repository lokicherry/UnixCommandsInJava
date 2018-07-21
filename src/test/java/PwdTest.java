import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PwdTest {

    @Test
    void presentWorkingDirectoryTest(){
        Pwd pwd = new Pwd();
        assertEquals("/Users/rlokesh/Documents/Projects/UnixSimpleCommandsInJava",pwd.presentWorkingDirectory());
    }
}
