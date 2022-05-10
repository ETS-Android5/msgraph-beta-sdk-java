package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SafeguardSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of safeguards to ignore per device. */
    private java.util.List<SafeguardProfile> _disabledSafeguardProfiles;
    /**
     * Instantiates a new safeguardSettings and sets the default values.
     * @return a void
     */
    public SafeguardSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a safeguardSettings
     */
    @javax.annotation.Nonnull
    public static SafeguardSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SafeguardSettings();
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
     * Gets the disabledSafeguardProfiles property value. List of safeguards to ignore per device.
     * @return a safeguardProfile
     */
    @javax.annotation.Nullable
    public java.util.List<SafeguardProfile> getDisabledSafeguardProfiles() {
        return this._disabledSafeguardProfiles;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SafeguardSettings currentObject = this;
        return new HashMap<>(1) {{
            this.put("disabledSafeguardProfiles", (n) -> { currentObject.setDisabledSafeguardProfiles(n.getCollectionOfObjectValues(SafeguardProfile::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("disabledSafeguardProfiles", this.getDisabledSafeguardProfiles());
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
     * Sets the disabledSafeguardProfiles property value. List of safeguards to ignore per device.
     * @param value Value to set for the disabledSafeguardProfiles property.
     * @return a void
     */
    public void setDisabledSafeguardProfiles(@javax.annotation.Nullable final java.util.List<SafeguardProfile> value) {
        this._disabledSafeguardProfiles = value;
    }
}
