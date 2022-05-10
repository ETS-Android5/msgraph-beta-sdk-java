package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DowngradeJustification implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the downgrade is or is not justified. */
    private Boolean _isDowngradeJustified;
    /** Message that indicates why a downgrade is justified. The message will appear in administrative logs. */
    private String _justificationMessage;
    /**
     * Instantiates a new downgradeJustification and sets the default values.
     * @return a void
     */
    public DowngradeJustification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a downgradeJustification
     */
    @javax.annotation.Nonnull
    public static DowngradeJustification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DowngradeJustification();
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
        final DowngradeJustification currentObject = this;
        return new HashMap<>(2) {{
            this.put("isDowngradeJustified", (n) -> { currentObject.setIsDowngradeJustified(n.getBooleanValue()); });
            this.put("justificationMessage", (n) -> { currentObject.setJustificationMessage(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDowngradeJustified property value. Indicates whether the downgrade is or is not justified.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDowngradeJustified() {
        return this._isDowngradeJustified;
    }
    /**
     * Gets the justificationMessage property value. Message that indicates why a downgrade is justified. The message will appear in administrative logs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustificationMessage() {
        return this._justificationMessage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isDowngradeJustified", this.getIsDowngradeJustified());
        writer.writeStringValue("justificationMessage", this.getJustificationMessage());
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
     * Sets the isDowngradeJustified property value. Indicates whether the downgrade is or is not justified.
     * @param value Value to set for the isDowngradeJustified property.
     * @return a void
     */
    public void setIsDowngradeJustified(@javax.annotation.Nullable final Boolean value) {
        this._isDowngradeJustified = value;
    }
    /**
     * Sets the justificationMessage property value. Message that indicates why a downgrade is justified. The message will appear in administrative logs.
     * @param value Value to set for the justificationMessage property.
     * @return a void
     */
    public void setJustificationMessage(@javax.annotation.Nullable final String value) {
        this._justificationMessage = value;
    }
}
