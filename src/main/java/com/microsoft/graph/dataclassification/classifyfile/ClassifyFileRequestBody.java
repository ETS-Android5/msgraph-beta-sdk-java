package microsoft.graph.dataclassification.classifyfile;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the classifyFile method. */
public class ClassifyFileRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The file property */
    private byte[] _file;
    /** The sensitiveTypeIds property */
    private java.util.List<String> _sensitiveTypeIds;
    /**
     * Instantiates a new classifyFileRequestBody and sets the default values.
     * @return a void
     */
    public ClassifyFileRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a classifyFileRequestBody
     */
    @javax.annotation.Nonnull
    public static ClassifyFileRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassifyFileRequestBody();
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
        final ClassifyFileRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("file", (n) -> { currentObject.setFile(n.getByteArrayValue()); });
            this.put("sensitiveTypeIds", (n) -> { currentObject.setSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the file property value. The file property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getFile() {
        return this._file;
    }
    /**
     * Gets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSensitiveTypeIds() {
        return this._sensitiveTypeIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("file", this.getFile());
        writer.writeCollectionOfPrimitiveValues("sensitiveTypeIds", this.getSensitiveTypeIds());
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
     * Sets the file property value. The file property
     * @param value Value to set for the file property.
     * @return a void
     */
    public void setFile(@javax.annotation.Nullable final byte[] value) {
        this._file = value;
    }
    /**
     * Sets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @param value Value to set for the sensitiveTypeIds property.
     * @return a void
     */
    public void setSensitiveTypeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._sensitiveTypeIds = value;
    }
}
