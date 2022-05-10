package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TargetPolicyEndpoints implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Use to filter the notification distribution to a specific platform or platforms. Valid values are Windows, iOS, Android and WebPush. By default, all push endpoint types (Windows, iOS, Android and WebPush) are enabled. */
    private java.util.List<String> _platformTypes;
    /**
     * Instantiates a new targetPolicyEndpoints and sets the default values.
     * @return a void
     */
    public TargetPolicyEndpoints() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a targetPolicyEndpoints
     */
    @javax.annotation.Nonnull
    public static TargetPolicyEndpoints createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetPolicyEndpoints();
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
        final TargetPolicyEndpoints currentObject = this;
        return new HashMap<>(1) {{
            this.put("platformTypes", (n) -> { currentObject.setPlatformTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the platformTypes property value. Use to filter the notification distribution to a specific platform or platforms. Valid values are Windows, iOS, Android and WebPush. By default, all push endpoint types (Windows, iOS, Android and WebPush) are enabled.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPlatformTypes() {
        return this._platformTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("platformTypes", this.getPlatformTypes());
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
     * Sets the platformTypes property value. Use to filter the notification distribution to a specific platform or platforms. Valid values are Windows, iOS, Android and WebPush. By default, all push endpoint types (Windows, iOS, Android and WebPush) are enabled.
     * @param value Value to set for the platformTypes property.
     * @return a void
     */
    public void setPlatformTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._platformTypes = value;
    }
}
