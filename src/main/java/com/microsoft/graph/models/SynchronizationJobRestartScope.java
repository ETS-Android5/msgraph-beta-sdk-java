package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the restart method. */
public enum SynchronizationJobRestartScope implements ValuedEnum {
    None("None"),
    ConnectorDataStore("ConnectorDataStore"),
    Escrows("Escrows"),
    Watermark("Watermark"),
    QuarantineState("QuarantineState"),
    Full("Full"),
    ForceDeletes("ForceDeletes");
    public final String value;
    SynchronizationJobRestartScope(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SynchronizationJobRestartScope forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "None": return None;
            case "ConnectorDataStore": return ConnectorDataStore;
            case "Escrows": return Escrows;
            case "Watermark": return Watermark;
            case "QuarantineState": return QuarantineState;
            case "Full": return Full;
            case "ForceDeletes": return ForceDeletes;
            default: return null;
        }
    }
}
