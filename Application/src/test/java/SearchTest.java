import org.testng.annotations.Test;

import java.io.IOException;

public class SearchTest extends FSBase{

    @Test(priority = 2, enabled = true)
    public void testSearch() throws InterruptedException, IOException {
        fsSearch();
    }

    @Test(priority = 3, enabled = true)
    public void testSearch2() throws InterruptedException, IOException {
        fsSearch();
    }

    @Test(priority = 1, enabled = true)
    public void testSearch3() throws InterruptedException, IOException {
        fsSearch();
    }

}
