package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics insight is the recomendation to improve the user experience analytics score. */
public class UserExperienceAnalyticsSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** True if Tenant attach is configured. If configured then SCCM tenant attached devices will show up in UXA reporting. */
    private Boolean _configurationManagerDataConnectorConfigured;
    /**
     * Instantiates a new userExperienceAnalyticsSettings and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsSettings
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsSettings();
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
     * Gets the configurationManagerDataConnectorConfigured property value. True if Tenant attach is configured. If configured then SCCM tenant attached devices will show up in UXA reporting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConfigurationManagerDataConnectorConfigured() {
        return this._configurationManagerDataConnectorConfigured;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsSettings currentObject = this;
        return new HashMap<>(1) {{
            this.put("configurationManagerDataConnectorConfigured", (n) -> { currentObject.setConfigurationManagerDataConnectorConfigured(n.getBooleanValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("configurationManagerDataConnectorConfigured", this.getConfigurationManagerDataConnectorConfigured());
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
     * Sets the configurationManagerDataConnectorConfigured property value. True if Tenant attach is configured. If configured then SCCM tenant attached devices will show up in UXA reporting.
     * @param value Value to set for the configurationManagerDataConnectorConfigured property.
     * @return a void
     */
    public void setConfigurationManagerDataConnectorConfigured(@javax.annotation.Nullable final Boolean value) {
        this._configurationManagerDataConnectorConfigured = value;
    }
}
