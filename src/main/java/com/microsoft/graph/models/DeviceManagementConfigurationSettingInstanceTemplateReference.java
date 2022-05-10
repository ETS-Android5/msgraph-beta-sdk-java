package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Setting instance template reference information */
public class DeviceManagementConfigurationSettingInstanceTemplateReference implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Setting instance template id */
    private String _settingInstanceTemplateId;
    /**
     * Instantiates a new deviceManagementConfigurationSettingInstanceTemplateReference and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationSettingInstanceTemplateReference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingInstanceTemplateReference
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingInstanceTemplateReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingInstanceTemplateReference();
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
        final DeviceManagementConfigurationSettingInstanceTemplateReference currentObject = this;
        return new HashMap<>(1) {{
            this.put("settingInstanceTemplateId", (n) -> { currentObject.setSettingInstanceTemplateId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the settingInstanceTemplateId property value. Setting instance template id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingInstanceTemplateId() {
        return this._settingInstanceTemplateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("settingInstanceTemplateId", this.getSettingInstanceTemplateId());
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
     * Sets the settingInstanceTemplateId property value. Setting instance template id
     * @param value Value to set for the settingInstanceTemplateId property.
     * @return a void
     */
    public void setSettingInstanceTemplateId(@javax.annotation.Nullable final String value) {
        this._settingInstanceTemplateId = value;
    }
}
