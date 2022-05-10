package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementActionDeploymentStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The identifier for the management action. Required. Read-only. */
    private String _managementActionId;
    /** The management template identifier that was used to generate the management action. Required. Read-only. */
    private String _managementTemplateId;
    /** The managementTemplateVersion property */
    private Integer _managementTemplateVersion;
    /** The status of the management action. Possible values are: toAddress, completed, error, timeOut, inProgress, planned, resolvedBy3rdParty, resolvedThroughAlternateMitigation, riskAccepted, unknownFutureValue. Required. */
    private ManagementActionStatus _status;
    /** The collection of workload action deployment statues for the given management action. Optional. */
    private java.util.List<WorkloadActionDeploymentStatus> _workloadActionDeploymentStatuses;
    /**
     * Instantiates a new managementActionDeploymentStatus and sets the default values.
     * @return a void
     */
    public ManagementActionDeploymentStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementActionDeploymentStatus
     */
    @javax.annotation.Nonnull
    public static ManagementActionDeploymentStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementActionDeploymentStatus();
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
        final ManagementActionDeploymentStatus currentObject = this;
        return new HashMap<>(5) {{
            this.put("managementActionId", (n) -> { currentObject.setManagementActionId(n.getStringValue()); });
            this.put("managementTemplateId", (n) -> { currentObject.setManagementTemplateId(n.getStringValue()); });
            this.put("managementTemplateVersion", (n) -> { currentObject.setManagementTemplateVersion(n.getIntegerValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ManagementActionStatus.class)); });
            this.put("workloadActionDeploymentStatuses", (n) -> { currentObject.setWorkloadActionDeploymentStatuses(n.getCollectionOfObjectValues(WorkloadActionDeploymentStatus::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the managementActionId property value. The identifier for the management action. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementActionId() {
        return this._managementActionId;
    }
    /**
     * Gets the managementTemplateId property value. The management template identifier that was used to generate the management action. Required. Read-only.
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
     * Gets the status property value. The status of the management action. Possible values are: toAddress, completed, error, timeOut, inProgress, planned, resolvedBy3rdParty, resolvedThroughAlternateMitigation, riskAccepted, unknownFutureValue. Required.
     * @return a managementActionStatus
     */
    @javax.annotation.Nullable
    public ManagementActionStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the workloadActionDeploymentStatuses property value. The collection of workload action deployment statues for the given management action. Optional.
     * @return a workloadActionDeploymentStatus
     */
    @javax.annotation.Nullable
    public java.util.List<WorkloadActionDeploymentStatus> getWorkloadActionDeploymentStatuses() {
        return this._workloadActionDeploymentStatuses;
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
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("workloadActionDeploymentStatuses", this.getWorkloadActionDeploymentStatuses());
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
     * Sets the managementActionId property value. The identifier for the management action. Required. Read-only.
     * @param value Value to set for the managementActionId property.
     * @return a void
     */
    public void setManagementActionId(@javax.annotation.Nullable final String value) {
        this._managementActionId = value;
    }
    /**
     * Sets the managementTemplateId property value. The management template identifier that was used to generate the management action. Required. Read-only.
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
     * Sets the status property value. The status of the management action. Possible values are: toAddress, completed, error, timeOut, inProgress, planned, resolvedBy3rdParty, resolvedThroughAlternateMitigation, riskAccepted, unknownFutureValue. Required.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ManagementActionStatus value) {
        this._status = value;
    }
    /**
     * Sets the workloadActionDeploymentStatuses property value. The collection of workload action deployment statues for the given management action. Optional.
     * @param value Value to set for the workloadActionDeploymentStatuses property.
     * @return a void
     */
    public void setWorkloadActionDeploymentStatuses(@javax.annotation.Nullable final java.util.List<WorkloadActionDeploymentStatus> value) {
        this._workloadActionDeploymentStatuses = value;
    }
}
