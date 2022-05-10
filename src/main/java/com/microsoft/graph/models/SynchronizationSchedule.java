package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationSchedule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Date and time when this job will expire. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _expiration;
    /** The interval between synchronization iterations. */
    private Period _interval;
    /** Possible values are: Active, Disabled. */
    private SynchronizationScheduleState _state;
    /**
     * Instantiates a new synchronizationSchedule and sets the default values.
     * @return a void
     */
    public SynchronizationSchedule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationSchedule
     */
    @javax.annotation.Nonnull
    public static SynchronizationSchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationSchedule();
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
     * Gets the expiration property value. Date and time when this job will expire. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiration() {
        return this._expiration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationSchedule currentObject = this;
        return new HashMap<>(3) {{
            this.put("expiration", (n) -> { currentObject.setExpiration(n.getOffsetDateTimeValue()); });
            this.put("interval", (n) -> { currentObject.setInterval(n.getPeriodValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(SynchronizationScheduleState.class)); });
        }};
    }
    /**
     * Gets the interval property value. The interval between synchronization iterations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getInterval() {
        return this._interval;
    }
    /**
     * Gets the state property value. Possible values are: Active, Disabled.
     * @return a synchronizationScheduleState
     */
    @javax.annotation.Nullable
    public SynchronizationScheduleState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expiration", this.getExpiration());
        writer.writePeriodValue("interval", this.getInterval());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the expiration property value. Date and time when this job will expire. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the expiration property.
     * @return a void
     */
    public void setExpiration(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expiration = value;
    }
    /**
     * Sets the interval property value. The interval between synchronization iterations.
     * @param value Value to set for the interval property.
     * @return a void
     */
    public void setInterval(@javax.annotation.Nullable final Period value) {
        this._interval = value;
    }
    /**
     * Sets the state property value. Possible values are: Active, Disabled.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final SynchronizationScheduleState value) {
        this._state = value;
    }
}
