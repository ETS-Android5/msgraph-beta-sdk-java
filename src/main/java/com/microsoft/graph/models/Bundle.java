package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Bundle implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If the bundle is an [album][], then the album property is included */
    private Album _album;
    /** Number of children contained immediately within this container. */
    private Integer _childCount;
    /**
     * Instantiates a new bundle and sets the default values.
     * @return a void
     */
    public Bundle() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bundle
     */
    @javax.annotation.Nonnull
    public static Bundle createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Bundle();
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
     * Gets the album property value. If the bundle is an [album][], then the album property is included
     * @return a album
     */
    @javax.annotation.Nullable
    public Album getAlbum() {
        return this._album;
    }
    /**
     * Gets the childCount property value. Number of children contained immediately within this container.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getChildCount() {
        return this._childCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Bundle currentObject = this;
        return new HashMap<>(2) {{
            this.put("album", (n) -> { currentObject.setAlbum(n.getObjectValue(Album::createFromDiscriminatorValue)); });
            this.put("childCount", (n) -> { currentObject.setChildCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("album", this.getAlbum());
        writer.writeIntegerValue("childCount", this.getChildCount());
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
     * Sets the album property value. If the bundle is an [album][], then the album property is included
     * @param value Value to set for the album property.
     * @return a void
     */
    public void setAlbum(@javax.annotation.Nullable final Album value) {
        this._album = value;
    }
    /**
     * Sets the childCount property value. Number of children contained immediately within this container.
     * @param value Value to set for the childCount property.
     * @return a void
     */
    public void setChildCount(@javax.annotation.Nullable final Integer value) {
        this._childCount = value;
    }
}
