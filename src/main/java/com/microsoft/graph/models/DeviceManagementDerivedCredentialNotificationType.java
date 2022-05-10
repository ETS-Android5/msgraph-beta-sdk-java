package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum DeviceManagementDerivedCredentialNotificationType implements ValuedEnum {
    /** None */
    None("none"),
    /** Company Portal */
    CompanyPortal("companyPortal"),
    /** Email */
    Email("email");
    public final String value;
    DeviceManagementDerivedCredentialNotificationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementDerivedCredentialNotificationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "companyPortal": return CompanyPortal;
            case "email": return Email;
            default: return null;
        }
    }
}
