package microsoft.graph.devicemanagement.androiddeviceownerenrollmentprofiles.item.createtoken;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the createToken method. */
public class CreateTokenRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The tokenValidityInSeconds property */
    private Integer _tokenValidityInSeconds;
    /**
     * Instantiates a new createTokenRequestBody and sets the default values.
     * @return a void
     */
    public CreateTokenRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createTokenRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateTokenRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateTokenRequestBody();
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
        final CreateTokenRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("tokenValidityInSeconds", (n) -> { currentObject.setTokenValidityInSeconds(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the tokenValidityInSeconds property value. The tokenValidityInSeconds property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTokenValidityInSeconds() {
        return this._tokenValidityInSeconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("tokenValidityInSeconds", this.getTokenValidityInSeconds());
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
     * Sets the tokenValidityInSeconds property value. The tokenValidityInSeconds property
     * @param value Value to set for the tokenValidityInSeconds property.
     * @return a void
     */
    public void setTokenValidityInSeconds(@javax.annotation.Nullable final Integer value) {
        this._tokenValidityInSeconds = value;
    }
}
