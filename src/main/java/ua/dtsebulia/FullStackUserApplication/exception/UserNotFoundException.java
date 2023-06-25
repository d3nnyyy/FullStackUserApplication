package ua.dtsebulia.FullStackUserApplication.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Integer id) {
        super("Couldn't found the user with id " + id);
    }
}
