package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateWindow implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** End of a time window during which agents can receive updates */
    private LocalTime _updateWindowEndTime;
    /** Start of a time window during which agents can receive updates */
    private LocalTime _updateWindowStartTime;
    /**
     * Instantiates a new updateWindow and sets the default values.
     * @return a void
     */
    public UpdateWindow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateWindow
     */
    @javax.annotation.Nonnull
    public static UpdateWindow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateWindow();
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
        final UpdateWindow currentObject = this;
        return new HashMap<>(2) {{
            this.put("updateWindowEndTime", (n) -> { currentObject.setUpdateWindowEndTime(n.getLocalTimeValue()); });
            this.put("updateWindowStartTime", (n) -> { currentObject.setUpdateWindowStartTime(n.getLocalTimeValue()); });
        }};
    }
    /**
     * Gets the updateWindowEndTime property value. End of a time window during which agents can receive updates
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getUpdateWindowEndTime() {
        return this._updateWindowEndTime;
    }
    /**
     * Gets the updateWindowStartTime property value. Start of a time window during which agents can receive updates
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getUpdateWindowStartTime() {
        return this._updateWindowStartTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalTimeValue("updateWindowEndTime", this.getUpdateWindowEndTime());
        writer.writeLocalTimeValue("updateWindowStartTime", this.getUpdateWindowStartTime());
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
     * Sets the updateWindowEndTime property value. End of a time window during which agents can receive updates
     * @param value Value to set for the updateWindowEndTime property.
     * @return a void
     */
    public void setUpdateWindowEndTime(@javax.annotation.Nullable final LocalTime value) {
        this._updateWindowEndTime = value;
    }
    /**
     * Sets the updateWindowStartTime property value. Start of a time window during which agents can receive updates
     * @param value Value to set for the updateWindowStartTime property.
     * @return a void
     */
    public void setUpdateWindowStartTime(@javax.annotation.Nullable final LocalTime value) {
        this._updateWindowStartTime = value;
    }
}
