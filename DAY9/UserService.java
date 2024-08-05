package DAY9;

class UserAlreadyExistsException extends Exception{
    UserAlreadyExistsException(String e){
        super(e);
    }
}
class UserNotFoundException extends Exception{
    UserNotFoundException(String e){
        super(e);
    }
}

public class UserService {
    public static void main(String[] args) {
        String username = "testUser";
        try {
            registerUser(username);
        } catch (UserAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void registerUser(String username) throws UserAlreadyExistsException, UserNotFoundException {
        if (checkUserExistence(username)) {
            throw new UserAlreadyExistsException("User already exists: " + username);
        }
        System.out.println("User registered successfully: " + username);
    }

    public static boolean checkUserExistence(String username) throws UserNotFoundException {
        if ("existingUser".equals(username)) {
            return true;
        } else if ("nonExistentUser".equals(username)) {
            throw new UserNotFoundException("User not found: " + username);
        }
        return false;
    }
}