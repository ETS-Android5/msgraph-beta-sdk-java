package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum ComanagementEligibleType implements ValuedEnum {
    Comanaged("comanaged"),
    Eligible("eligible"),
    EligibleButNotAzureAdJoined("eligibleButNotAzureAdJoined"),
    NeedsOsUpdate("needsOsUpdate"),
    Ineligible("ineligible");
    public final String value;
    ComanagementEligibleType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ComanagementEligibleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "comanaged": return Comanaged;
            case "eligible": return Eligible;
            case "eligibleButNotAzureAdJoined": return EligibleButNotAzureAdJoined;
            case "needsOsUpdate": return NeedsOsUpdate;
            case "ineligible": return Ineligible;
            default: return null;
        }
    }
}
