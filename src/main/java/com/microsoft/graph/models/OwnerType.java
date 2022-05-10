package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the compliance singleton. */
public enum OwnerType implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** Owned by company. */
    Company("company"),
    /** Owned by person. */
    Personal("personal");
    public final String value;
    OwnerType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OwnerType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "company": return Company;
            case "personal": return Personal;
            default: return null;
        }
    }
}
