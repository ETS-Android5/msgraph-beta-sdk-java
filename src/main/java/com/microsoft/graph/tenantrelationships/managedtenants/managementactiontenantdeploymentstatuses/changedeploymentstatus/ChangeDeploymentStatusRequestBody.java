package microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.changedeploymentstatus;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the changeDeploymentStatus method. */
public class ChangeDeploymentStatusRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The managementActionId property */
    private String _managementActionId;
    /** The managementTemplateId property */
    private String _managementTemplateId;
    /** The managementTemplateVersion property */
    private Integer _managementTemplateVersion;
    /** The status property */
    private String _status;
    /** The tenantGroupId property */
    private String _tenantGroupId;
    /** The tenantId property */
    private String _tenantId;
    /**
     * Instantiates a new changeDeploymentStatusRequestBody and sets the default values.
     * @return a void
     */
    public ChangeDeploymentStatusRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a changeDeploymentStatusRequestBody
     */
    @javax.annotation.Nonnull
    public static ChangeDeploymentStatusRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeDeploymentStatusRequestBody();
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
        final ChangeDeploymentStatusRequestBody currentObject = this;
        return new HashMap<>(6) {{
            this.put("managementActionId", (n) -> { currentObject.setManagementActionId(n.getStringValue()); });
            this.put("managementTemplateId", (n) -> { currentObject.setManagementTemplateId(n.getStringValue()); });
            this.put("managementTemplateVersion", (n) -> { currentObject.setManagementTemplateVersion(n.getIntegerValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("tenantGroupId", (n) -> { currentObject.setTenantGroupId(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managementActionId property value. The managementActionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementActionId() {
        return this._managementActionId;
    }
    /**
     * Gets the managementTemplateId property value. The managementTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementTemplateId() {
        return this._managementTemplateId;
    }
    /**
     * Gets the managementTemplateVersion property value. The managementTemplateVersion property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getManagementTemplateVersion() {
        return this._managementTemplateVersion;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the tenantGroupId property value. The tenantGroupId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantGroupId() {
        return this._tenantGroupId;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("managementActionId", this.getManagementActionId());
        writer.writeStringValue("managementTemplateId", this.getManagementTemplateId());
        writer.writeIntegerValue("managementTemplateVersion", this.getManagementTemplateVersion());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("tenantGroupId", this.getTenantGroupId());
        writer.writeStringValue("tenantId", this.getTenantId());
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
     * Sets the managementActionId property value. The managementActionId property
     * @param value Value to set for the managementActionId property.
     * @return a void
     */
    public void setManagementActionId(@javax.annotation.Nullable final String value) {
        this._managementActionId = value;
    }
    /**
     * Sets the managementTemplateId property value. The managementTemplateId property
     * @param value Value to set for the managementTemplateId property.
     * @return a void
     */
    public void setManagementTemplateId(@javax.annotation.Nullable final String value) {
        this._managementTemplateId = value;
    }
    /**
     * Sets the managementTemplateVersion property value. The managementTemplateVersion property
     * @param value Value to set for the managementTemplateVersion property.
     * @return a void
     */
    public void setManagementTemplateVersion(@javax.annotation.Nullable final Integer value) {
        this._managementTemplateVersion = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the tenantGroupId property value. The tenantGroupId property
     * @param value Value to set for the tenantGroupId property.
     * @return a void
     */
    public void setTenantGroupId(@javax.annotation.Nullable final String value) {
        this._tenantGroupId = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
