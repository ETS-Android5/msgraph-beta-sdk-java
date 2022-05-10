package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OcrSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The isEnabled property */
    private Boolean _isEnabled;
    /** The maxImageSize property */
    private Integer _maxImageSize;
    /** The timeout property */
    private Period _timeout;
    /**
     * Instantiates a new ocrSettings and sets the default values.
     * @return a void
     */
    public OcrSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ocrSettings
     */
    @javax.annotation.Nonnull
    public static OcrSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OcrSettings();
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
        final OcrSettings currentObject = this;
        return new HashMap<>(3) {{
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("maxImageSize", (n) -> { currentObject.setMaxImageSize(n.getIntegerValue()); });
            this.put("timeout", (n) -> { currentObject.setTimeout(n.getPeriodValue()); });
        }};
    }
    /**
     * Gets the isEnabled property value. The isEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the maxImageSize property value. The maxImageSize property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxImageSize() {
        return this._maxImageSize;
    }
    /**
     * Gets the timeout property value. The timeout property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getTimeout() {
        return this._timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeIntegerValue("maxImageSize", this.getMaxImageSize());
        writer.writePeriodValue("timeout", this.getTimeout());
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
     * Sets the isEnabled property value. The isEnabled property
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the maxImageSize property value. The maxImageSize property
     * @param value Value to set for the maxImageSize property.
     * @return a void
     */
    public void setMaxImageSize(@javax.annotation.Nullable final Integer value) {
        this._maxImageSize = value;
    }
    /**
     * Sets the timeout property value. The timeout property
     * @param value Value to set for the timeout property.
     * @return a void
     */
    public void setTimeout(@javax.annotation.Nullable final Period value) {
        this._timeout = value;
    }
}
