package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum AndroidForWorkSyncStatus implements ValuedEnum {
    Success("success"),
    CredentialsNotValid("credentialsNotValid"),
    AndroidForWorkApiError("androidForWorkApiError"),
    ManagementServiceError("managementServiceError"),
    UnknownError("unknownError"),
    None("none");
    public final String value;
    AndroidForWorkSyncStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidForWorkSyncStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "credentialsNotValid": return CredentialsNotValid;
            case "androidForWorkApiError": return AndroidForWorkApiError;
            case "managementServiceError": return ManagementServiceError;
            case "unknownError": return UnknownError;
            case "none": return None;
            default: return null;
        }
    }
}
