

@Test
public class ApplicationTest {

    String name;

    @Befor
    public void setUp() {
        this.name = new String("");
    }

    @After
    public void cleanUp() {
        this.name = null; 
    }
}
