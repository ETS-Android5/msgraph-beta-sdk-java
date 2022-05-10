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
public class WorkingHours implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The days of the week on which the user works. */
    private java.util.List<DayOfWeek> _daysOfWeek;
    /** The time of the day that the user stops working. */
    private LocalTime _endTime;
    /** The time of the day that the user starts working. */
    private LocalTime _startTime;
    /** The time zone to which the working hours apply. */
    private TimeZoneBase _timeZone;
    /**
     * Instantiates a new workingHours and sets the default values.
     * @return a void
     */
    public WorkingHours() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workingHours
     */
    @javax.annotation.Nonnull
    public static WorkingHours createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkingHours();
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
     * Gets the daysOfWeek property value. The days of the week on which the user works.
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public java.util.List<DayOfWeek> getDaysOfWeek() {
        return this._daysOfWeek;
    }
    /**
     * Gets the endTime property value. The time of the day that the user stops working.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getEndTime() {
        return this._endTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkingHours currentObject = this;
        return new HashMap<>(4) {{
            this.put("daysOfWeek", (n) -> { currentObject.setDaysOfWeek(n.getCollectionOfEnumValues(DayOfWeek.class)); });
            this.put("endTime", (n) -> { currentObject.setEndTime(n.getLocalTimeValue()); });
            this.put("startTime", (n) -> { currentObject.setStartTime(n.getLocalTimeValue()); });
            this.put("timeZone", (n) -> { currentObject.setTimeZone(n.getObjectValue(TimeZoneBase::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the startTime property value. The time of the day that the user starts working.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getStartTime() {
        return this._startTime;
    }
    /**
     * Gets the timeZone property value. The time zone to which the working hours apply.
     * @return a timeZoneBase
     */
    @javax.annotation.Nullable
    public TimeZoneBase getTimeZone() {
        return this._timeZone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("daysOfWeek", this.getDaysOfWeek());
        writer.writeLocalTimeValue("endTime", this.getEndTime());
        writer.writeLocalTimeValue("startTime", this.getStartTime());
        writer.writeObjectValue("timeZone", this.getTimeZone());
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
     * Sets the daysOfWeek property value. The days of the week on which the user works.
     * @param value Value to set for the daysOfWeek property.
     * @return a void
     */
    public void setDaysOfWeek(@javax.annotation.Nullable final java.util.List<DayOfWeek> value) {
        this._daysOfWeek = value;
    }
    /**
     * Sets the endTime property value. The time of the day that the user stops working.
     * @param value Value to set for the endTime property.
     * @return a void
     */
    public void setEndTime(@javax.annotation.Nullable final LocalTime value) {
        this._endTime = value;
    }
    /**
     * Sets the startTime property value. The time of the day that the user starts working.
     * @param value Value to set for the startTime property.
     * @return a void
     */
    public void setStartTime(@javax.annotation.Nullable final LocalTime value) {
        this._startTime = value;
    }
    /**
     * Sets the timeZone property value. The time zone to which the working hours apply.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    public void setTimeZone(@javax.annotation.Nullable final TimeZoneBase value) {
        this._timeZone = value;
    }
}
