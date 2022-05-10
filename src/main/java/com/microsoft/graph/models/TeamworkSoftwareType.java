package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the updateSoftware method. */
public enum TeamworkSoftwareType implements ValuedEnum {
    AdminAgent("adminAgent"),
    OperatingSystem("operatingSystem"),
    TeamsClient("teamsClient"),
    Firmware("firmware"),
    PartnerAgent("partnerAgent"),
    CompanyPortal("companyPortal"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkSoftwareType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkSoftwareType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "adminAgent": return AdminAgent;
            case "operatingSystem": return OperatingSystem;
            case "teamsClient": return TeamsClient;
            case "firmware": return Firmware;
            case "partnerAgent": return PartnerAgent;
            case "companyPortal": return CompanyPortal;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
