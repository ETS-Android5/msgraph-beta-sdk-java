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
/** History Item contained in the Mobile App Troubleshooting Event. */
public class MobileAppTroubleshootingHistoryItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Time when the history item occurred. */
    private OffsetDateTime _occurrenceDateTime;
    /** Object containing detailed information about the error and its remediation. */
    private DeviceManagementTroubleshootingErrorDetails _troubleshootingErrorDetails;
    /**
     * Instantiates a new mobileAppTroubleshootingHistoryItem and sets the default values.
     * @return a void
     */
    public MobileAppTroubleshootingHistoryItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppTroubleshootingHistoryItem
     */
    @javax.annotation.Nonnull
    public static MobileAppTroubleshootingHistoryItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingHistoryItem();
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
        final MobileAppTroubleshootingHistoryItem currentObject = this;
        return new HashMap<>(2) {{
            this.put("occurrenceDateTime", (n) -> { currentObject.setOccurrenceDateTime(n.getOffsetDateTimeValue()); });
            this.put("troubleshootingErrorDetails", (n) -> { currentObject.setTroubleshootingErrorDetails(n.getObjectValue(DeviceManagementTroubleshootingErrorDetails::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the occurrenceDateTime property value. Time when the history item occurred.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOccurrenceDateTime() {
        return this._occurrenceDateTime;
    }
    /**
     * Gets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @return a deviceManagementTroubleshootingErrorDetails
     */
    @javax.annotation.Nullable
    public DeviceManagementTroubleshootingErrorDetails getTroubleshootingErrorDetails() {
        return this._troubleshootingErrorDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("occurrenceDateTime", this.getOccurrenceDateTime());
        writer.writeObjectValue("troubleshootingErrorDetails", this.getTroubleshootingErrorDetails());
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
     * Sets the occurrenceDateTime property value. Time when the history item occurred.
     * @param value Value to set for the occurrenceDateTime property.
     * @return a void
     */
    public void setOccurrenceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._occurrenceDateTime = value;
    }
    /**
     * Sets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @param value Value to set for the troubleshootingErrorDetails property.
     * @return a void
     */
    public void setTroubleshootingErrorDetails(@javax.annotation.Nullable final DeviceManagementTroubleshootingErrorDetails value) {
        this._troubleshootingErrorDetails = value;
    }
}
