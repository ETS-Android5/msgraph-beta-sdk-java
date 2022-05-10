package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of application entities. */
public enum KerberosSignOnMappingAttributeType implements ValuedEnum {
    UserPrincipalName("userPrincipalName"),
    OnPremisesUserPrincipalName("onPremisesUserPrincipalName"),
    UserPrincipalUsername("userPrincipalUsername"),
    OnPremisesUserPrincipalUsername("onPremisesUserPrincipalUsername"),
    OnPremisesSAMAccountName("onPremisesSAMAccountName");
    public final String value;
    KerberosSignOnMappingAttributeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static KerberosSignOnMappingAttributeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userPrincipalName": return UserPrincipalName;
            case "onPremisesUserPrincipalName": return OnPremisesUserPrincipalName;
            case "userPrincipalUsername": return UserPrincipalUsername;
            case "onPremisesUserPrincipalUsername": return OnPremisesUserPrincipalUsername;
            case "onPremisesSAMAccountName": return OnPremisesSAMAccountName;
            default: return null;
        }
    }
}
