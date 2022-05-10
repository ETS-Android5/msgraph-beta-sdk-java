package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TaskViewpoint implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined. */
    private java.util.List<String> _categories;
    /** The date and time for a reminder alert of the task to occur. */
    private DateTimeTimeZone _reminderDateTime;
    /**
     * Instantiates a new taskViewpoint and sets the default values.
     * @return a void
     */
    public TaskViewpoint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a taskViewpoint
     */
    @javax.annotation.Nonnull
    public static TaskViewpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskViewpoint();
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
     * Gets the categories property value. The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this._categories;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TaskViewpoint currentObject = this;
        return new HashMap<>(2) {{
            this.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("reminderDateTime", (n) -> { currentObject.setReminderDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the reminderDateTime property value. The date and time for a reminder alert of the task to occur.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getReminderDateTime() {
        return this._reminderDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeObjectValue("reminderDateTime", this.getReminderDateTime());
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
     * Sets the categories property value. The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined.
     * @param value Value to set for the categories property.
     * @return a void
     */
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._categories = value;
    }
    /**
     * Sets the reminderDateTime property value. The date and time for a reminder alert of the task to occur.
     * @param value Value to set for the reminderDateTime property.
     * @return a void
     */
    public void setReminderDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._reminderDateTime = value;
    }
}
