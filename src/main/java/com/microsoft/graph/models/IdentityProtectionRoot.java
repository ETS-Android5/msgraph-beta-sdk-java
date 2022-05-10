package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityProtectionRoot implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Risk detection in Azure AD Identity Protection and the associated information about the detection. */
    private java.util.List<RiskDetection> _riskDetections;
    /** Azure AD service principals that are at risk. */
    private java.util.List<RiskyServicePrincipal> _riskyServicePrincipals;
    /** Users that are flagged as at-risk by Azure AD Identity Protection. */
    private java.util.List<RiskyUser> _riskyUsers;
    /** Represents information about detected at-risk service principals in an Azure AD tenant. */
    private java.util.List<ServicePrincipalRiskDetection> _servicePrincipalRiskDetections;
    /**
     * Instantiates a new IdentityProtectionRoot and sets the default values.
     * @return a void
     */
    public IdentityProtectionRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityProtectionRoot
     */
    @javax.annotation.Nonnull
    public static IdentityProtectionRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityProtectionRoot();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IdentityProtectionRoot currentObject = this;
        return new HashMap<>(4) {{
            this.put("riskDetections", (n) -> { currentObject.setRiskDetections(n.getCollectionOfObjectValues(RiskDetection::createFromDiscriminatorValue)); });
            this.put("riskyServicePrincipals", (n) -> { currentObject.setRiskyServicePrincipals(n.getCollectionOfObjectValues(RiskyServicePrincipal::createFromDiscriminatorValue)); });
            this.put("riskyUsers", (n) -> { currentObject.setRiskyUsers(n.getCollectionOfObjectValues(RiskyUser::createFromDiscriminatorValue)); });
            this.put("servicePrincipalRiskDetections", (n) -> { currentObject.setServicePrincipalRiskDetections(n.getCollectionOfObjectValues(ServicePrincipalRiskDetection::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the riskDetections property value. Risk detection in Azure AD Identity Protection and the associated information about the detection.
     * @return a riskDetection
     */
    @javax.annotation.Nullable
    public java.util.List<RiskDetection> getRiskDetections() {
        return this._riskDetections;
    }
    /**
     * Gets the riskyServicePrincipals property value. Azure AD service principals that are at risk.
     * @return a riskyServicePrincipal
     */
    @javax.annotation.Nullable
    public java.util.List<RiskyServicePrincipal> getRiskyServicePrincipals() {
        return this._riskyServicePrincipals;
    }
    /**
     * Gets the riskyUsers property value. Users that are flagged as at-risk by Azure AD Identity Protection.
     * @return a riskyUser
     */
    @javax.annotation.Nullable
    public java.util.List<RiskyUser> getRiskyUsers() {
        return this._riskyUsers;
    }
    /**
     * Gets the servicePrincipalRiskDetections property value. Represents information about detected at-risk service principals in an Azure AD tenant.
     * @return a servicePrincipalRiskDetection
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePrincipalRiskDetection> getServicePrincipalRiskDetections() {
        return this._servicePrincipalRiskDetections;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("riskDetections", this.getRiskDetections());
        writer.writeCollectionOfObjectValues("riskyServicePrincipals", this.getRiskyServicePrincipals());
        writer.writeCollectionOfObjectValues("riskyUsers", this.getRiskyUsers());
        writer.writeCollectionOfObjectValues("servicePrincipalRiskDetections", this.getServicePrincipalRiskDetections());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the riskDetections property value. Risk detection in Azure AD Identity Protection and the associated information about the detection.
     * @param value Value to set for the riskDetections property.
     * @return a void
     */
    public void setRiskDetections(@javax.annotation.Nullable final java.util.List<RiskDetection> value) {
        this._riskDetections = value;
    }
    /**
     * Sets the riskyServicePrincipals property value. Azure AD service principals that are at risk.
     * @param value Value to set for the riskyServicePrincipals property.
     * @return a void
     */
    public void setRiskyServicePrincipals(@javax.annotation.Nullable final java.util.List<RiskyServicePrincipal> value) {
        this._riskyServicePrincipals = value;
    }
    /**
     * Sets the riskyUsers property value. Users that are flagged as at-risk by Azure AD Identity Protection.
     * @param value Value to set for the riskyUsers property.
     * @return a void
     */
    public void setRiskyUsers(@javax.annotation.Nullable final java.util.List<RiskyUser> value) {
        this._riskyUsers = value;
    }
    /**
     * Sets the servicePrincipalRiskDetections property value. Represents information about detected at-risk service principals in an Azure AD tenant.
     * @param value Value to set for the servicePrincipalRiskDetections property.
     * @return a void
     */
    public void setServicePrincipalRiskDetections(@javax.annotation.Nullable final java.util.List<ServicePrincipalRiskDetection> value) {
        this._servicePrincipalRiskDetections = value;
    }
}
