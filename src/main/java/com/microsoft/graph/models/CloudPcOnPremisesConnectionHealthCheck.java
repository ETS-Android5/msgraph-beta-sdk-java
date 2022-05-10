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
public class CloudPcOnPremisesConnectionHealthCheck implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Additional details about the health check or the recommended action. */
    private String _additionalDetails;
    /** The display name for this health check item. */
    private String _displayName;
    /** The end time of the health check item. Read-only. */
    private OffsetDateTime _endDateTime;
    /** The type of error that occurred during this health check. */
    private CloudPcOnPremisesConnectionHealthCheckErrorType _errorType;
    /** The recommended action to fix the corresponding error. */
    private String _recommendedAction;
    /** The start time of the health check item. Read-only. */
    private OffsetDateTime _startDateTime;
    /** The status of the health check item. Possible values are: pending, running, passed, failed, unknownFutureValue. Read-only. */
    private CloudPcOnPremisesConnectionStatus _status;
    /**
     * Instantiates a new cloudPcOnPremisesConnectionHealthCheck and sets the default values.
     * @return a void
     */
    public CloudPcOnPremisesConnectionHealthCheck() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcOnPremisesConnectionHealthCheck
     */
    @javax.annotation.Nonnull
    public static CloudPcOnPremisesConnectionHealthCheck createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOnPremisesConnectionHealthCheck();
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
     * Gets the additionalDetails property value. Additional details about the health check or the recommended action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalDetails() {
        return this._additionalDetails;
    }
    /**
     * Gets the displayName property value. The display name for this health check item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the endDateTime property value. The end time of the health check item. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the errorType property value. The type of error that occurred during this health check.
     * @return a cloudPcOnPremisesConnectionHealthCheckErrorType
     */
    @javax.annotation.Nullable
    public CloudPcOnPremisesConnectionHealthCheckErrorType getErrorType() {
        return this._errorType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcOnPremisesConnectionHealthCheck currentObject = this;
        return new HashMap<>(7) {{
            this.put("additionalDetails", (n) -> { currentObject.setAdditionalDetails(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("errorType", (n) -> { currentObject.setErrorType(n.getEnumValue(CloudPcOnPremisesConnectionHealthCheckErrorType.class)); });
            this.put("recommendedAction", (n) -> { currentObject.setRecommendedAction(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CloudPcOnPremisesConnectionStatus.class)); });
        }};
    }
    /**
     * Gets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecommendedAction() {
        return this._recommendedAction;
    }
    /**
     * Gets the startDateTime property value. The start time of the health check item. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. The status of the health check item. Possible values are: pending, running, passed, failed, unknownFutureValue. Read-only.
     * @return a cloudPcOnPremisesConnectionStatus
     */
    @javax.annotation.Nullable
    public CloudPcOnPremisesConnectionStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additionalDetails", this.getAdditionalDetails());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeEnumValue("errorType", this.getErrorType());
        writer.writeStringValue("recommendedAction", this.getRecommendedAction());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the additionalDetails property value. Additional details about the health check or the recommended action.
     * @param value Value to set for the additionalDetails property.
     * @return a void
     */
    public void setAdditionalDetails(@javax.annotation.Nullable final String value) {
        this._additionalDetails = value;
    }
    /**
     * Sets the displayName property value. The display name for this health check item.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the endDateTime property value. The end time of the health check item. Read-only.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the errorType property value. The type of error that occurred during this health check.
     * @param value Value to set for the errorType property.
     * @return a void
     */
    public void setErrorType(@javax.annotation.Nullable final CloudPcOnPremisesConnectionHealthCheckErrorType value) {
        this._errorType = value;
    }
    /**
     * Sets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @param value Value to set for the recommendedAction property.
     * @return a void
     */
    public void setRecommendedAction(@javax.annotation.Nullable final String value) {
        this._recommendedAction = value;
    }
    /**
     * Sets the startDateTime property value. The start time of the health check item. Read-only.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. The status of the health check item. Possible values are: pending, running, passed, failed, unknownFutureValue. Read-only.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final CloudPcOnPremisesConnectionStatus value) {
        this._status = value;
    }
}
