package microsoft.graph.informationprotection.encryptbuffer;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the encryptBuffer method. */
public class EncryptBufferRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The buffer property */
    private byte[] _buffer;
    /** The labelId property */
    private String _labelId;
    /**
     * Instantiates a new encryptBufferRequestBody and sets the default values.
     * @return a void
     */
    public EncryptBufferRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a encryptBufferRequestBody
     */
    @javax.annotation.Nonnull
    public static EncryptBufferRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptBufferRequestBody();
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
     * Gets the buffer property value. The buffer property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getBuffer() {
        return this._buffer;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EncryptBufferRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("buffer", (n) -> { currentObject.setBuffer(n.getByteArrayValue()); });
            this.put("labelId", (n) -> { currentObject.setLabelId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the labelId property value. The labelId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabelId() {
        return this._labelId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("buffer", this.getBuffer());
        writer.writeStringValue("labelId", this.getLabelId());
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
     * Sets the buffer property value. The buffer property
     * @param value Value to set for the buffer property.
     * @return a void
     */
    public void setBuffer(@javax.annotation.Nullable final byte[] value) {
        this._buffer = value;
    }
    /**
     * Sets the labelId property value. The labelId property
     * @param value Value to set for the labelId property.
     * @return a void
     */
    public void setLabelId(@javax.annotation.Nullable final String value) {
        this._labelId = value;
    }
}
