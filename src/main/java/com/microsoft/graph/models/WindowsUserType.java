package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum WindowsUserType implements ValuedEnum {
    Administrator("administrator"),
    Standard("standard");
    public final String value;
    WindowsUserType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsUserType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "administrator": return Administrator;
            case "standard": return Standard;
            default: return null;
        }
    }
}
