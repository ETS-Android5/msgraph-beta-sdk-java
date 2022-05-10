package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BaseTaskList extends Entity implements Parsable {
    /** The name of the task list. */
    private String _displayName;
    /** The collection of open extensions defined for the task list. Nullable. */
    private java.util.List<Extension> _extensions;
    /** The tasks in this task list. Read-only. Nullable. */
    private java.util.List<BaseTask> _tasks;
    /**
     * Instantiates a new baseTaskList and sets the default values.
     * @return a void
     */
    public BaseTaskList() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a baseTaskList
     */
    @javax.annotation.Nonnull
    public static BaseTaskList createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BaseTaskList();
    }
    /**
     * Gets the displayName property value. The name of the task list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the task list. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BaseTaskList currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(BaseTask::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the tasks property value. The tasks in this task list. Read-only. Nullable.
     * @return a baseTask
     */
    @javax.annotation.Nullable
    public java.util.List<BaseTask> getTasks() {
        return this._tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the displayName property value. The name of the task list.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the task list. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the tasks property value. The tasks in this task list. Read-only. Nullable.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    public void setTasks(@javax.annotation.Nullable final java.util.List<BaseTask> value) {
        this._tasks = value;
    }
}
