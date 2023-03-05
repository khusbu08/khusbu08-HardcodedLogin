
public class Lab {
    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */
    public boolean login(String username, String password){
        if (username.matches("user") && password.matches("password")) {
            // The username and password are correct, so permit the login
            return true;
        } else if(username.matches("admin") && password.matches("qwerty")) {
            return true;
        }else{
            return false;
        }
    }
}
