package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum DriverApprovalStatus implements ValuedEnum {
    /** This indicates a driver needs IT admin's review. */
    NeedsReview("needsReview"),
    /** This indicates IT admin has declined a driver. */
    Declined("declined"),
    /** This indicates IT admin has approved a driver. */
    Approved("approved"),
    /** This indicates IT admin has suspended a driver. */
    Suspended("suspended");
    public final String value;
    DriverApprovalStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DriverApprovalStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "needsReview": return NeedsReview;
            case "declined": return Declined;
            case "approved": return Approved;
            case "suspended": return Suspended;
            default: return null;
        }
    }
}
