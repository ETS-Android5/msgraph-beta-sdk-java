package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the usersRegisteredByFeature method. */
public enum AuthenticationMethodFeature implements ValuedEnum {
    SsprRegistered("ssprRegistered"),
    SsprEnabled("ssprEnabled"),
    SsprCapable("ssprCapable"),
    PasswordlessCapable("passwordlessCapable"),
    MfaCapable("mfaCapable");
    public final String value;
    AuthenticationMethodFeature(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AuthenticationMethodFeature forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ssprRegistered": return SsprRegistered;
            case "ssprEnabled": return SsprEnabled;
            case "ssprCapable": return SsprCapable;
            case "passwordlessCapable": return PasswordlessCapable;
            case "mfaCapable": return MfaCapable;
            default: return null;
        }
    }
}
