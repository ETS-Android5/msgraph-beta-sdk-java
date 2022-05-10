package microsoft.graph.devicemanagement.deviceconfigurations.item.assign;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DeviceConfigurationAssignment;
import microsoft.graph.models.DeviceConfigurationGroupAssignment;
/** Provides operations to call the assign method. */
public class AssignRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignments property */
    private java.util.List<DeviceConfigurationAssignment> _assignments;
    /** The deviceConfigurationGroupAssignments property */
    private java.util.List<DeviceConfigurationGroupAssignment> _deviceConfigurationGroupAssignments;
    /**
     * Instantiates a new assignRequestBody and sets the default values.
     * @return a void
     */
    public AssignRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignRequestBody
     */
    @javax.annotation.Nonnull
    public static AssignRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignRequestBody();
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
     * Gets the assignments property value. The assignments property
     * @return a deviceConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the deviceConfigurationGroupAssignments property value. The deviceConfigurationGroupAssignments property
     * @return a deviceConfigurationGroupAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationGroupAssignment> getDeviceConfigurationGroupAssignments() {
        return this._deviceConfigurationGroupAssignments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceConfigurationAssignment::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationGroupAssignments", (n) -> { currentObject.setDeviceConfigurationGroupAssignments(n.getCollectionOfObjectValues(DeviceConfigurationGroupAssignment::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("deviceConfigurationGroupAssignments", this.getDeviceConfigurationGroupAssignments());
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
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceConfigurationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the deviceConfigurationGroupAssignments property value. The deviceConfigurationGroupAssignments property
     * @param value Value to set for the deviceConfigurationGroupAssignments property.
     * @return a void
     */
    public void setDeviceConfigurationGroupAssignments(@javax.annotation.Nullable final java.util.List<DeviceConfigurationGroupAssignment> value) {
        this._deviceConfigurationGroupAssignments = value;
    }
}
