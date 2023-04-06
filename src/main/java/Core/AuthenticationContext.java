package Core;
import Core.Authentification;

public class AuthenticationContext {
    private Authentification strategy;

    public AuthenticationContext(Authentification strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Authentification strategy) {
        this.strategy = strategy;
    }

    public boolean authenticateUser(String username, String password) {
        return strategy.authenticate(username, password);
    }
    public boolean Singup(String username, String password) {
        return strategy.Singip(username, password);
    }
}
