package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingInstance extends Entity implements Parsable {
    /** The ID of the setting definition for this instance */
    private String _definitionId;
    /** JSON representation of the value */
    private String _valueJson;
    /**
     * Instantiates a new deviceManagementSettingInstance and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingInstance();
    }
    /**
     * Gets the definitionId property value. The ID of the setting definition for this instance
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefinitionId() {
        return this._definitionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingInstance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("definitionId", (n) -> { currentObject.setDefinitionId(n.getStringValue()); });
            this.put("valueJson", (n) -> { currentObject.setValueJson(n.getStringValue()); });
        }};
    }
    /**
     * Gets the valueJson property value. JSON representation of the value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueJson() {
        return this._valueJson;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("definitionId", this.getDefinitionId());
        writer.writeStringValue("valueJson", this.getValueJson());
    }
    /**
     * Sets the definitionId property value. The ID of the setting definition for this instance
     * @param value Value to set for the definitionId property.
     * @return a void
     */
    public void setDefinitionId(@javax.annotation.Nullable final String value) {
        this._definitionId = value;
    }
    /**
     * Sets the valueJson property value. JSON representation of the value
     * @param value Value to set for the valueJson property.
     * @return a void
     */
    public void setValueJson(@javax.annotation.Nullable final String value) {
        this._valueJson = value;
    }
}
