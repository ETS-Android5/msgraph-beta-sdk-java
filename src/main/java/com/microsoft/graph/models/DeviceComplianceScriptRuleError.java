package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceComplianceScriptRuleError extends DeviceComplianceScriptError implements Parsable {
    /** Setting name for the rule with error. */
    private String _settingName;
    /**
     * Instantiates a new deviceComplianceScriptRuleError and sets the default values.
     * @return a void
     */
    public DeviceComplianceScriptRuleError() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptRuleError
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceScriptRuleError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptRuleError();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceComplianceScriptRuleError currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("settingName", (n) -> { currentObject.setSettingName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the settingName property value. Setting name for the rule with error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this._settingName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("settingName", this.getSettingName());
    }
    /**
     * Sets the settingName property value. Setting name for the rule with error.
     * @param value Value to set for the settingName property.
     * @return a void
     */
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this._settingName = value;
    }
}
