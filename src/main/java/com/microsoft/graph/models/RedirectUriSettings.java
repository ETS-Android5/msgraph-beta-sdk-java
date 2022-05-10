package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RedirectUriSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Identifies the specific URI within the redirectURIs collection in SAML SSO flows. Defaults to null. The index is unique across all the redirectUris for the application. */
    private Integer _index;
    /** Specifies the URI that tokens are sent to. */
    private String _uri;
    /**
     * Instantiates a new redirectUriSettings and sets the default values.
     * @return a void
     */
    public RedirectUriSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a redirectUriSettings
     */
    @javax.annotation.Nonnull
    public static RedirectUriSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectUriSettings();
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
        final RedirectUriSettings currentObject = this;
        return new HashMap<>(2) {{
            this.put("index", (n) -> { currentObject.setIndex(n.getIntegerValue()); });
            this.put("uri", (n) -> { currentObject.setUri(n.getStringValue()); });
        }};
    }
    /**
     * Gets the index property value. Identifies the specific URI within the redirectURIs collection in SAML SSO flows. Defaults to null. The index is unique across all the redirectUris for the application.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIndex() {
        return this._index;
    }
    /**
     * Gets the uri property value. Specifies the URI that tokens are sent to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUri() {
        return this._uri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeStringValue("uri", this.getUri());
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
     * Sets the index property value. Identifies the specific URI within the redirectURIs collection in SAML SSO flows. Defaults to null. The index is unique across all the redirectUris for the application.
     * @param value Value to set for the index property.
     * @return a void
     */
    public void setIndex(@javax.annotation.Nullable final Integer value) {
        this._index = value;
    }
    /**
     * Sets the uri property value. Specifies the URI that tokens are sent to.
     * @param value Value to set for the uri property.
     * @return a void
     */
    public void setUri(@javax.annotation.Nullable final String value) {
        this._uri = value;
    }
}
