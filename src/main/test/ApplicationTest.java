

@Test

public class ApplicationAndrewTest {


    String name;

    @Befor
    public void setUp() {
        this.name = new String("");

    }

    @After
    public void cleanUp() {

        this.name = null
    }

}
