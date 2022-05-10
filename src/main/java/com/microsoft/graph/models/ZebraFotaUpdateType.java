package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum ZebraFotaUpdateType implements ValuedEnum {
    /** Custom update where the user selects specific BSP, OS version, and patch number to update to. */
    Custom("custom"),
    /** The latest released update becomes the target OS. Latest may update the device to a new Android version. */
    Latest("latest"),
    /** The device always looks for the latest package available in the repo and tries to update whenever a new package is available. This continues until the admin cancels the auto update. */
    Auto("auto"),
    /** Unknown future enum value. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ZebraFotaUpdateType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ZebraFotaUpdateType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "custom": return Custom;
            case "latest": return Latest;
            case "auto": return Auto;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
