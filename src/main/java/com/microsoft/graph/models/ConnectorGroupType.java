package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of application entities. */
public enum ConnectorGroupType implements ValuedEnum {
    ApplicationProxy("applicationProxy");
    public final String value;
    ConnectorGroupType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectorGroupType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "applicationProxy": return ApplicationProxy;
            default: return null;
        }
    }
}
