package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosLobAppProvisioningConfigurationAssignment extends Entity implements Parsable {
    /** The target group assignment defined by the admin. */
    private DeviceAndAppManagementAssignmentTarget _target;
    /**
     * Instantiates a new iosLobAppProvisioningConfigurationAssignment and sets the default values.
     * @return a void
     */
    public IosLobAppProvisioningConfigurationAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosLobAppProvisioningConfigurationAssignment
     */
    @javax.annotation.Nonnull
    public static IosLobAppProvisioningConfigurationAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosLobAppProvisioningConfigurationAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosLobAppProvisioningConfigurationAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the target property value. The target group assignment defined by the admin.
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this._target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the target property value. The target group assignment defined by the admin.
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this._target = value;
    }
}
