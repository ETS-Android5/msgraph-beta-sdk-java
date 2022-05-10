package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of chat entities. */
public enum ChatMessageImportance implements ValuedEnum {
    Normal("normal"),
    High("high"),
    Urgent("urgent");
    public final String value;
    ChatMessageImportance(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChatMessageImportance forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "normal": return Normal;
            case "high": return High;
            case "urgent": return Urgent;
            default: return null;
        }
    }
}
