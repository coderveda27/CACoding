package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String username = "";
    private String usernameError = null;
    private String password = "";
    private String passwordError = null;

    public ClearState(ClearState copy){
        username = copy.username;
        usernameError = copy.usernameError;
        password = copy.password;
        passwordError = copy.passwordError;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.

    public ClearState() {}

    public String getUsername() {
        return username;
    }

    public String getUsernameError() {
        return usernameError;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }
    @Override
    public String toString() {
        return "ClearState{" +
                "username='" + username + '\'' +
                '}';
    }
}

