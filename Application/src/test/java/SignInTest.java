import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignInTest extends FSBase{

    @Test(priority = 1,enabled = true)
    public void testSignIn() throws InterruptedException {
        fsLogin();
    }

    @Test(priority = 2, enabled = false)
    public void testSearch() throws InterruptedException, IOException {
        fsSearch();
        Thread.sleep(5000);
        fsLogin();
    }
}
