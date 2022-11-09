import model.UserRequestModel;

public class StepUser {

    APIuser apIuser = new APIuser();

    public UserRequestModel createUser(String name, String job){

        Root model = new Root(name, job);
        return apIuser.createUser(model);

    }
}
