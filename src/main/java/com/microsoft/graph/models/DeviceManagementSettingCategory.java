package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingCategory extends Entity implements Parsable {
    /** The category name */
    private String _displayName;
    /** The category contains top level required setting */
    private Boolean _hasRequiredSetting;
    /** The setting definitions this category contains */
    private java.util.List<DeviceManagementSettingDefinition> _settingDefinitions;
    /**
     * Instantiates a new deviceManagementSettingCategory and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingCategory
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingCategory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingCategory();
    }
    /**
     * Gets the displayName property value. The category name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingCategory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("hasRequiredSetting", (n) -> { currentObject.setHasRequiredSetting(n.getBooleanValue()); });
            this.put("settingDefinitions", (n) -> { currentObject.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementSettingDefinition::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the hasRequiredSetting property value. The category contains top level required setting
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasRequiredSetting() {
        return this._hasRequiredSetting;
    }
    /**
     * Gets the settingDefinitions property value. The setting definitions this category contains
     * @return a deviceManagementSettingDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingDefinition> getSettingDefinitions() {
        return this._settingDefinitions;
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
        writer.writeBooleanValue("hasRequiredSetting", this.getHasRequiredSetting());
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
    }
    /**
     * Sets the displayName property value. The category name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the hasRequiredSetting property value. The category contains top level required setting
     * @param value Value to set for the hasRequiredSetting property.
     * @return a void
     */
    public void setHasRequiredSetting(@javax.annotation.Nullable final Boolean value) {
        this._hasRequiredSetting = value;
    }
    /**
     * Sets the settingDefinitions property value. The setting definitions this category contains
     * @param value Value to set for the settingDefinitions property.
     * @return a void
     */
    public void setSettingDefinitions(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingDefinition> value) {
        this._settingDefinitions = value;
    }
}
