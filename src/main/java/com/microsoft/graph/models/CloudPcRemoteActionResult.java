package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcRemoteActionResult implements AdditionalDataHolder, Parsable {
    /** The specified action. Supported values in the Microsoft Endpoint Manager portal are: Reprovision, Resize, Restore. Supported values in enterprise Cloud PC devices are: Reboot, Rename, Reprovision, Troubleshoot. */
    private String _actionName;
    /** State of the action. Possible values are: None, pending, canceled, active, done, failed, notSupported. Read-only. */
    private ActionState _actionState;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The ID of the Cloud PC device on which the remote action is performed. Read-only. */
    private String _cloudPcId;
    /** Last update time for action. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as '2014-01-01T00:00:00Z'. */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The ID of the Intune managed device on which the remote action is performed. Read-only. */
    private String _managedDeviceId;
    /** Time the action was initiated. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as '2014-01-01T00:00:00Z'. */
    private OffsetDateTime _startDateTime;
    /** The details of the Cloud PC status. */
    private CloudPcStatusDetails _statusDetails;
    /**
     * Instantiates a new cloudPcRemoteActionResult and sets the default values.
     * @return a void
     */
    public CloudPcRemoteActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcRemoteActionResult
     */
    @javax.annotation.Nonnull
    public static CloudPcRemoteActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcRemoteActionResult();
    }
    /**
     * Gets the actionName property value. The specified action. Supported values in the Microsoft Endpoint Manager portal are: Reprovision, Resize, Restore. Supported values in enterprise Cloud PC devices are: Reboot, Rename, Reprovision, Troubleshoot.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionName() {
        return this._actionName;
    }
    /**
     * Gets the actionState property value. State of the action. Possible values are: None, pending, canceled, active, done, failed, notSupported. Read-only.
     * @return a actionState
     */
    @javax.annotation.Nullable
    public ActionState getActionState() {
        return this._actionState;
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
     * Gets the cloudPcId property value. The ID of the Cloud PC device on which the remote action is performed. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudPcId() {
        return this._cloudPcId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcRemoteActionResult currentObject = this;
        return new HashMap<>(7) {{
            this.put("actionName", (n) -> { currentObject.setActionName(n.getStringValue()); });
            this.put("actionState", (n) -> { currentObject.setActionState(n.getEnumValue(ActionState.class)); });
            this.put("cloudPcId", (n) -> { currentObject.setCloudPcId(n.getStringValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("statusDetails", (n) -> { currentObject.setStatusDetails(n.getObjectValue(CloudPcStatusDetails::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. Last update time for action. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as '2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. The ID of the Intune managed device on which the remote action is performed. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the startDateTime property value. Time the action was initiated. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as '2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the statusDetails property value. The details of the Cloud PC status.
     * @return a cloudPcStatusDetails
     */
    @javax.annotation.Nullable
    public CloudPcStatusDetails getStatusDetails() {
        return this._statusDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionName", this.getActionName());
        writer.writeEnumValue("actionState", this.getActionState());
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeObjectValue("statusDetails", this.getStatusDetails());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionName property value. The specified action. Supported values in the Microsoft Endpoint Manager portal are: Reprovision, Resize, Restore. Supported values in enterprise Cloud PC devices are: Reboot, Rename, Reprovision, Troubleshoot.
     * @param value Value to set for the actionName property.
     * @return a void
     */
    public void setActionName(@javax.annotation.Nullable final String value) {
        this._actionName = value;
    }
    /**
     * Sets the actionState property value. State of the action. Possible values are: None, pending, canceled, active, done, failed, notSupported. Read-only.
     * @param value Value to set for the actionState property.
     * @return a void
     */
    public void setActionState(@javax.annotation.Nullable final ActionState value) {
        this._actionState = value;
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
     * Sets the cloudPcId property value. The ID of the Cloud PC device on which the remote action is performed. Read-only.
     * @param value Value to set for the cloudPcId property.
     * @return a void
     */
    public void setCloudPcId(@javax.annotation.Nullable final String value) {
        this._cloudPcId = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Last update time for action. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as '2014-01-01T00:00:00Z'.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. The ID of the Intune managed device on which the remote action is performed. Read-only.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the startDateTime property value. Time the action was initiated. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as '2014-01-01T00:00:00Z'.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the statusDetails property value. The details of the Cloud PC status.
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    public void setStatusDetails(@javax.annotation.Nullable final CloudPcStatusDetails value) {
        this._statusDetails = value;
    }
}
