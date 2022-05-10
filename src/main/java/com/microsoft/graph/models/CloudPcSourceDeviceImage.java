package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcSourceDeviceImage implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The display name for the source image. */
    private String _displayName;
    /** The ID of the source image. */
    private String _id;
    /** The display name of subscription that hosts the source image. */
    private String _subscriptionDisplayName;
    /** The ID of subscription that hosts the source image. */
    private String _subscriptionId;
    /**
     * Instantiates a new cloudPcSourceDeviceImage and sets the default values.
     * @return a void
     */
    public CloudPcSourceDeviceImage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcSourceDeviceImage
     */
    @javax.annotation.Nonnull
    public static CloudPcSourceDeviceImage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSourceDeviceImage();
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
     * Gets the displayName property value. The display name for the source image.
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
        final CloudPcSourceDeviceImage currentObject = this;
        return new HashMap<>(4) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("subscriptionDisplayName", (n) -> { currentObject.setSubscriptionDisplayName(n.getStringValue()); });
            this.put("subscriptionId", (n) -> { currentObject.setSubscriptionId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The ID of the source image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the subscriptionDisplayName property value. The display name of subscription that hosts the source image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionDisplayName() {
        return this._subscriptionDisplayName;
    }
    /**
     * Gets the subscriptionId property value. The ID of subscription that hosts the source image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionId() {
        return this._subscriptionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("subscriptionDisplayName", this.getSubscriptionDisplayName());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
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
     * Sets the displayName property value. The display name for the source image.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the id property value. The ID of the source image.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the subscriptionDisplayName property value. The display name of subscription that hosts the source image.
     * @param value Value to set for the subscriptionDisplayName property.
     * @return a void
     */
    public void setSubscriptionDisplayName(@javax.annotation.Nullable final String value) {
        this._subscriptionDisplayName = value;
    }
    /**
     * Sets the subscriptionId property value. The ID of subscription that hosts the source image.
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    public void setSubscriptionId(@javax.annotation.Nullable final String value) {
        this._subscriptionId = value;
    }
}
