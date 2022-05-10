package microsoft.graph.devicemanagement.virtualendpoint.onpremisesconnections.item.updateaddomainpassword;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the updateAdDomainPassword method. */
public class UpdateAdDomainPasswordRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The adDomainPassword property */
    private String _adDomainPassword;
    /**
     * Instantiates a new updateAdDomainPasswordRequestBody and sets the default values.
     * @return a void
     */
    public UpdateAdDomainPasswordRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateAdDomainPasswordRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateAdDomainPasswordRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAdDomainPasswordRequestBody();
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
     * Gets the adDomainPassword property value. The adDomainPassword property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdDomainPassword() {
        return this._adDomainPassword;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdateAdDomainPasswordRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("adDomainPassword", (n) -> { currentObject.setAdDomainPassword(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adDomainPassword", this.getAdDomainPassword());
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
     * Sets the adDomainPassword property value. The adDomainPassword property
     * @param value Value to set for the adDomainPassword property.
     * @return a void
     */
    public void setAdDomainPassword(@javax.annotation.Nullable final String value) {
        this._adDomainPassword = value;
    }
}
