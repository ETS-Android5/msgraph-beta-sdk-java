package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeCardEntry implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The list of breaks associated with the timeCard. */
    private java.util.List<TimeCardBreak> _breaks;
    /** The clock-in event of the timeCard. */
    private TimeCardEvent _clockInEvent;
    /** The clock-out event of the timeCard. */
    private TimeCardEvent _clockOutEvent;
    /**
     * Instantiates a new timeCardEntry and sets the default values.
     * @return a void
     */
    public TimeCardEntry() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeCardEntry
     */
    @javax.annotation.Nonnull
    public static TimeCardEntry createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeCardEntry();
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
     * Gets the breaks property value. The list of breaks associated with the timeCard.
     * @return a timeCardBreak
     */
    @javax.annotation.Nullable
    public java.util.List<TimeCardBreak> getBreaks() {
        return this._breaks;
    }
    /**
     * Gets the clockInEvent property value. The clock-in event of the timeCard.
     * @return a timeCardEvent
     */
    @javax.annotation.Nullable
    public TimeCardEvent getClockInEvent() {
        return this._clockInEvent;
    }
    /**
     * Gets the clockOutEvent property value. The clock-out event of the timeCard.
     * @return a timeCardEvent
     */
    @javax.annotation.Nullable
    public TimeCardEvent getClockOutEvent() {
        return this._clockOutEvent;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeCardEntry currentObject = this;
        return new HashMap<>(3) {{
            this.put("breaks", (n) -> { currentObject.setBreaks(n.getCollectionOfObjectValues(TimeCardBreak::createFromDiscriminatorValue)); });
            this.put("clockInEvent", (n) -> { currentObject.setClockInEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
            this.put("clockOutEvent", (n) -> { currentObject.setClockOutEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("breaks", this.getBreaks());
        writer.writeObjectValue("clockInEvent", this.getClockInEvent());
        writer.writeObjectValue("clockOutEvent", this.getClockOutEvent());
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
     * Sets the breaks property value. The list of breaks associated with the timeCard.
     * @param value Value to set for the breaks property.
     * @return a void
     */
    public void setBreaks(@javax.annotation.Nullable final java.util.List<TimeCardBreak> value) {
        this._breaks = value;
    }
    /**
     * Sets the clockInEvent property value. The clock-in event of the timeCard.
     * @param value Value to set for the clockInEvent property.
     * @return a void
     */
    public void setClockInEvent(@javax.annotation.Nullable final TimeCardEvent value) {
        this._clockInEvent = value;
    }
    /**
     * Sets the clockOutEvent property value. The clock-out event of the timeCard.
     * @param value Value to set for the clockOutEvent property.
     * @return a void
     */
    public void setClockOutEvent(@javax.annotation.Nullable final TimeCardEvent value) {
        this._clockOutEvent = value;
    }
}
