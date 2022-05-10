package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceKey implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deviceId property */
    private String _deviceId;
    /** The keyMaterial property */
    private byte[] _keyMaterial;
    /** The keyType property */
    private String _keyType;
    /**
     * Instantiates a new deviceKey and sets the default values.
     * @return a void
     */
    public DeviceKey() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceKey
     */
    @javax.annotation.Nonnull
    public static DeviceKey createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceKey();
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
     * Gets the deviceId property value. The deviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceKey currentObject = this;
        return new HashMap<>(3) {{
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("keyMaterial", (n) -> { currentObject.setKeyMaterial(n.getByteArrayValue()); });
            this.put("keyType", (n) -> { currentObject.setKeyType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the keyMaterial property value. The keyMaterial property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getKeyMaterial() {
        return this._keyMaterial;
    }
    /**
     * Gets the keyType property value. The keyType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKeyType() {
        return this._keyType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeByteArrayValue("keyMaterial", this.getKeyMaterial());
        writer.writeStringValue("keyType", this.getKeyType());
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
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the keyMaterial property value. The keyMaterial property
     * @param value Value to set for the keyMaterial property.
     * @return a void
     */
    public void setKeyMaterial(@javax.annotation.Nullable final byte[] value) {
        this._keyMaterial = value;
    }
    /**
     * Sets the keyType property value. The keyType property
     * @param value Value to set for the keyType property.
     * @return a void
     */
    public void setKeyType(@javax.annotation.Nullable final String value) {
        this._keyType = value;
    }
}
