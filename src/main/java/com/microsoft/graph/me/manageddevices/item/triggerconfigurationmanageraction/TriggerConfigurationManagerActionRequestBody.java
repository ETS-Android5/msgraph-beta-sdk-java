package microsoft.graph.me.manageddevices.item.triggerconfigurationmanageraction;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ConfigurationManagerAction;
/** Provides operations to call the triggerConfigurationManagerAction method. */
public class TriggerConfigurationManagerActionRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Parameter for action triggerConfigurationManagerAction */
    private ConfigurationManagerAction _configurationManagerAction;
    /**
     * Instantiates a new triggerConfigurationManagerActionRequestBody and sets the default values.
     * @return a void
     */
    public TriggerConfigurationManagerActionRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a triggerConfigurationManagerActionRequestBody
     */
    @javax.annotation.Nonnull
    public static TriggerConfigurationManagerActionRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggerConfigurationManagerActionRequestBody();
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
     * Gets the configurationManagerAction property value. Parameter for action triggerConfigurationManagerAction
     * @return a configurationManagerAction
     */
    @javax.annotation.Nullable
    public ConfigurationManagerAction getConfigurationManagerAction() {
        return this._configurationManagerAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TriggerConfigurationManagerActionRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("configurationManagerAction", (n) -> { currentObject.setConfigurationManagerAction(n.getObjectValue(ConfigurationManagerAction::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("configurationManagerAction", this.getConfigurationManagerAction());
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
     * Sets the configurationManagerAction property value. Parameter for action triggerConfigurationManagerAction
     * @param value Value to set for the configurationManagerAction property.
     * @return a void
     */
    public void setConfigurationManagerAction(@javax.annotation.Nullable final ConfigurationManagerAction value) {
        this._configurationManagerAction = value;
    }
}
