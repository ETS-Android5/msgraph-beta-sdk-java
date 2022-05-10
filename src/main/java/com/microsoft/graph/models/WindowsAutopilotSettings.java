package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsAutopilotSettings extends Entity implements Parsable {
    /** Last data sync date time with DDS service. */
    private OffsetDateTime _lastManualSyncTriggerDateTime;
    /** Last data sync date time with DDS service. */
    private OffsetDateTime _lastSyncDateTime;
    /** Indicates the status of sync with Device data sync (DDS) service. Possible values are: unknown, inProgress, completed, failed. */
    private WindowsAutopilotSyncStatus _syncStatus;
    /**
     * Instantiates a new windowsAutopilotSettings and sets the default values.
     * @return a void
     */
    public WindowsAutopilotSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsAutopilotSettings
     */
    @javax.annotation.Nonnull
    public static WindowsAutopilotSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutopilotSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsAutopilotSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("lastManualSyncTriggerDateTime", (n) -> { currentObject.setLastManualSyncTriggerDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("syncStatus", (n) -> { currentObject.setSyncStatus(n.getEnumValue(WindowsAutopilotSyncStatus.class)); });
        }};
    }
    /**
     * Gets the lastManualSyncTriggerDateTime property value. Last data sync date time with DDS service.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastManualSyncTriggerDateTime() {
        return this._lastManualSyncTriggerDateTime;
    }
    /**
     * Gets the lastSyncDateTime property value. Last data sync date time with DDS service.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the syncStatus property value. Indicates the status of sync with Device data sync (DDS) service. Possible values are: unknown, inProgress, completed, failed.
     * @return a windowsAutopilotSyncStatus
     */
    @javax.annotation.Nullable
    public WindowsAutopilotSyncStatus getSyncStatus() {
        return this._syncStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastManualSyncTriggerDateTime", this.getLastManualSyncTriggerDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeEnumValue("syncStatus", this.getSyncStatus());
    }
    /**
     * Sets the lastManualSyncTriggerDateTime property value. Last data sync date time with DDS service.
     * @param value Value to set for the lastManualSyncTriggerDateTime property.
     * @return a void
     */
    public void setLastManualSyncTriggerDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastManualSyncTriggerDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last data sync date time with DDS service.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the syncStatus property value. Indicates the status of sync with Device data sync (DDS) service. Possible values are: unknown, inProgress, completed, failed.
     * @param value Value to set for the syncStatus property.
     * @return a void
     */
    public void setSyncStatus(@javax.annotation.Nullable final WindowsAutopilotSyncStatus value) {
        this._syncStatus = value;
    }
}
