package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the dataClassificationService singleton. */
public enum SensitiveTypeScope implements ValuedEnum {
    FullDocument("fullDocument"),
    PartialDocument("partialDocument");
    public final String value;
    SensitiveTypeScope(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SensitiveTypeScope forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "fullDocument": return FullDocument;
            case "partialDocument": return PartialDocument;
            default: return null;
        }
    }
}
