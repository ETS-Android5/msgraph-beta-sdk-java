package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum ManagedInstallerStatus implements ValuedEnum {
    /** Managed Installer is Disabled */
    Disabled("disabled"),
    /** Managed Installer is Enabled */
    Enabled("enabled");
    public final String value;
    ManagedInstallerStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedInstallerStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
