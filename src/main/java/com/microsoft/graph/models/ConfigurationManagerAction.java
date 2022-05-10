package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Parameter for action triggerConfigurationManagerAction */
public class ConfigurationManagerAction implements AdditionalDataHolder, Parsable {
    /** The action type to trigger on Configuration Manager client. Possible values are: refreshMachinePolicy, refreshUserPolicy, wakeUpClient, appEvaluation, quickScan, fullScan, windowsDefenderUpdateSignatures. */
    private ConfigurationManagerActionType _action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /**
     * Instantiates a new configurationManagerAction and sets the default values.
     * @return a void
     */
    public ConfigurationManagerAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a configurationManagerAction
     */
    @javax.annotation.Nonnull
    public static ConfigurationManagerAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerAction();
    }
    /**
     * Gets the action property value. The action type to trigger on Configuration Manager client. Possible values are: refreshMachinePolicy, refreshUserPolicy, wakeUpClient, appEvaluation, quickScan, fullScan, windowsDefenderUpdateSignatures.
     * @return a configurationManagerActionType
     */
    @javax.annotation.Nullable
    public ConfigurationManagerActionType getAction() {
        return this._action;
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
        final ConfigurationManagerAction currentObject = this;
        return new HashMap<>(1) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(ConfigurationManagerActionType.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action type to trigger on Configuration Manager client. Possible values are: refreshMachinePolicy, refreshUserPolicy, wakeUpClient, appEvaluation, quickScan, fullScan, windowsDefenderUpdateSignatures.
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final ConfigurationManagerActionType value) {
        this._action = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
}
