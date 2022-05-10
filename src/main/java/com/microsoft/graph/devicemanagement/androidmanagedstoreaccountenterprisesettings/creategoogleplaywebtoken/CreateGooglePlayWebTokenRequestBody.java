package microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.creategoogleplaywebtoken;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the createGooglePlayWebToken method. */
public class CreateGooglePlayWebTokenRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The parentUri property */
    private String _parentUri;
    /**
     * Instantiates a new createGooglePlayWebTokenRequestBody and sets the default values.
     * @return a void
     */
    public CreateGooglePlayWebTokenRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createGooglePlayWebTokenRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateGooglePlayWebTokenRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateGooglePlayWebTokenRequestBody();
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
        final CreateGooglePlayWebTokenRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("parentUri", (n) -> { currentObject.setParentUri(n.getStringValue()); });
        }};
    }
    /**
     * Gets the parentUri property value. The parentUri property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentUri() {
        return this._parentUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("parentUri", this.getParentUri());
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
     * Sets the parentUri property value. The parentUri property
     * @param value Value to set for the parentUri property.
     * @return a void
     */
    public void setParentUri(@javax.annotation.Nullable final String value) {
        this._parentUri = value;
    }
}
