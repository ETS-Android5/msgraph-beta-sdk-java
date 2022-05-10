package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum GroupPolicyOperationStatus implements ValuedEnum {
    /** Group Policy unknown operation status. */
    Unknown("unknown"),
    /** Group Policy in progress operation status. */
    InProgress("inProgress"),
    /** Group Policy successful operation status. */
    Success("success"),
    /** Group Policy failed operation status. */
    Failed("failed");
    public final String value;
    GroupPolicyOperationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicyOperationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inProgress": return InProgress;
            case "success": return Success;
            case "failed": return Failed;
            default: return null;
        }
    }
}
