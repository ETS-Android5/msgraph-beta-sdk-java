package microsoft.graph.trustframework.keysets.item.uploadsecret;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the uploadSecret method. */
public class UploadSecretRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The exp property */
    private Long _exp;
    /** The k property */
    private String _k;
    /** The nbf property */
    private Long _nbf;
    /** The use property */
    private String _use;
    /**
     * Instantiates a new uploadSecretRequestBody and sets the default values.
     * @return a void
     */
    public UploadSecretRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a uploadSecretRequestBody
     */
    @javax.annotation.Nonnull
    public static UploadSecretRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadSecretRequestBody();
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
     * Gets the exp property value. The exp property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExp() {
        return this._exp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UploadSecretRequestBody currentObject = this;
        return new HashMap<>(4) {{
            this.put("exp", (n) -> { currentObject.setExp(n.getLongValue()); });
            this.put("k", (n) -> { currentObject.setK(n.getStringValue()); });
            this.put("nbf", (n) -> { currentObject.setNbf(n.getLongValue()); });
            this.put("use", (n) -> { currentObject.setUse(n.getStringValue()); });
        }};
    }
    /**
     * Gets the k property value. The k property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getK() {
        return this._k;
    }
    /**
     * Gets the nbf property value. The nbf property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNbf() {
        return this._nbf;
    }
    /**
     * Gets the use property value. The use property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUse() {
        return this._use;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("exp", this.getExp());
        writer.writeStringValue("k", this.getK());
        writer.writeLongValue("nbf", this.getNbf());
        writer.writeStringValue("use", this.getUse());
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
     * Sets the exp property value. The exp property
     * @param value Value to set for the exp property.
     * @return a void
     */
    public void setExp(@javax.annotation.Nullable final Long value) {
        this._exp = value;
    }
    /**
     * Sets the k property value. The k property
     * @param value Value to set for the k property.
     * @return a void
     */
    public void setK(@javax.annotation.Nullable final String value) {
        this._k = value;
    }
    /**
     * Sets the nbf property value. The nbf property
     * @param value Value to set for the nbf property.
     * @return a void
     */
    public void setNbf(@javax.annotation.Nullable final Long value) {
        this._nbf = value;
    }
    /**
     * Sets the use property value. The use property
     * @param value Value to set for the use property.
     * @return a void
     */
    public void setUse(@javax.annotation.Nullable final String value) {
        this._use = value;
    }
}
