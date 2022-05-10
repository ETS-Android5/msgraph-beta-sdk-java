package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MediaSource implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Enumeration value that indicates the media content category. */
    private MediaSourceContentCategory _contentCategory;
    /**
     * Instantiates a new mediaSource and sets the default values.
     * @return a void
     */
    public MediaSource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mediaSource
     */
    @javax.annotation.Nonnull
    public static MediaSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaSource();
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
     * Gets the contentCategory property value. Enumeration value that indicates the media content category.
     * @return a mediaSourceContentCategory
     */
    @javax.annotation.Nullable
    public MediaSourceContentCategory getContentCategory() {
        return this._contentCategory;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MediaSource currentObject = this;
        return new HashMap<>(1) {{
            this.put("contentCategory", (n) -> { currentObject.setContentCategory(n.getEnumValue(MediaSourceContentCategory.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("contentCategory", this.getContentCategory());
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
     * Sets the contentCategory property value. Enumeration value that indicates the media content category.
     * @param value Value to set for the contentCategory property.
     * @return a void
     */
    public void setContentCategory(@javax.annotation.Nullable final MediaSourceContentCategory value) {
        this._contentCategory = value;
    }
}
