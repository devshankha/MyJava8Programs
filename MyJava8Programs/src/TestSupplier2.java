import java.time.Instant;
import java.util.function.Supplier;

class TokenService {
    private Supplier<Instant> instantSupplier;

    public TokenService(Supplier<Instant> instantSupplier) {
        this.instantSupplier = instantSupplier;
    }
    boolean isExpired(Instant expiryTime) {
        return instantSupplier.get().isAfter(expiryTime);
    }



}

public class TestSupplier2 {

    public static void main(String[] args) {
        TokenService tokenService = new TokenService(() -> Instant.parse("2026-07-17T10:00:00Z"));


    }
}
