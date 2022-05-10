package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the triggerDeviceScopeAction method. */
public enum DeviceScopeActionStatus implements ValuedEnum {
    /** Indicates the device scope action failed to trigger. */
    Failed("failed"),
    /** Indicates the device scope action was successfully triggered. */
    Succeeded("succeeded"),
    /** Placeholder value for future expansion. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceScopeActionStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceScopeActionStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "failed": return Failed;
            case "succeeded": return Succeeded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
