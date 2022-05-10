package microsoft.graph.users.item.calendargroups.item.calendars.item.calendarview.item.exceptionoccurrences.item.snoozereminder;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DateTimeTimeZone;
/** Provides operations to call the snoozeReminder method. */
public class SnoozeReminderRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The NewReminderTime property */
    private DateTimeTimeZone _newReminderTime;
    /**
     * Instantiates a new snoozeReminderRequestBody and sets the default values.
     * @return a void
     */
    public SnoozeReminderRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a snoozeReminderRequestBody
     */
    @javax.annotation.Nonnull
    public static SnoozeReminderRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SnoozeReminderRequestBody();
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
        final SnoozeReminderRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("newReminderTime", (n) -> { currentObject.setNewReminderTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the newReminderTime property value. The NewReminderTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getNewReminderTime() {
        return this._newReminderTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("newReminderTime", this.getNewReminderTime());
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
     * Sets the newReminderTime property value. The NewReminderTime property
     * @param value Value to set for the NewReminderTime property.
     * @return a void
     */
    public void setNewReminderTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._newReminderTime = value;
    }
}
