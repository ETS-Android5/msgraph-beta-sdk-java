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
public class CloudPcOnPremisesConnectionStatusDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The end time of the connection health check. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _endDateTime;
    /** All checks that are done on the connection. */
    private java.util.List<CloudPcOnPremisesConnectionHealthCheck> _healthChecks;
    /** The start time of the connection health check. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _startDateTime;
    /**
     * Instantiates a new cloudPcOnPremisesConnectionStatusDetails and sets the default values.
     * @return a void
     */
    public CloudPcOnPremisesConnectionStatusDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcOnPremisesConnectionStatusDetails
     */
    @javax.annotation.Nonnull
    public static CloudPcOnPremisesConnectionStatusDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOnPremisesConnectionStatusDetails();
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
     * Gets the endDateTime property value. The end time of the connection health check. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcOnPremisesConnectionStatusDetails currentObject = this;
        return new HashMap<>(3) {{
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("healthChecks", (n) -> { currentObject.setHealthChecks(n.getCollectionOfObjectValues(CloudPcOnPremisesConnectionHealthCheck::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the healthChecks property value. All checks that are done on the connection.
     * @return a cloudPcOnPremisesConnectionHealthCheck
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcOnPremisesConnectionHealthCheck> getHealthChecks() {
        return this._healthChecks;
    }
    /**
     * Gets the startDateTime property value. The start time of the connection health check. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeCollectionOfObjectValues("healthChecks", this.getHealthChecks());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
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
     * Sets the endDateTime property value. The end time of the connection health check. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the healthChecks property value. All checks that are done on the connection.
     * @param value Value to set for the healthChecks property.
     * @return a void
     */
    public void setHealthChecks(@javax.annotation.Nullable final java.util.List<CloudPcOnPremisesConnectionHealthCheck> value) {
        this._healthChecks = value;
    }
    /**
     * Sets the startDateTime property value. The start time of the connection health check. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
}
