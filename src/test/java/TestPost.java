import model.UserRequestModel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPost {
    StepUser stepUser = new StepUser();
    UserRequestModel model;

    @Test
    public void firstTest(){

        model = stepUser.createUser("name", "job");
        Assert.assertEquals(model.getJob(), "job");
        Assert.assertEquals(model.getName(), "nam4e");
    }
}
