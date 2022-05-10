package microsoft.graph.serviceprincipals.item.synchronization.acquireaccesstoken;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
/** Provides operations to call the acquireAccessToken method. */
public class AcquireAccessTokenRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The credentials property */
    private java.util.List<SynchronizationSecretKeyStringValuePair> _credentials;
    /**
     * Instantiates a new acquireAccessTokenRequestBody and sets the default values.
     * @return a void
     */
    public AcquireAccessTokenRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a acquireAccessTokenRequestBody
     */
    @javax.annotation.Nonnull
    public static AcquireAccessTokenRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AcquireAccessTokenRequestBody();
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
     * Gets the credentials property value. The credentials property
     * @return a synchronizationSecretKeyStringValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationSecretKeyStringValuePair> getCredentials() {
        return this._credentials;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AcquireAccessTokenRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("credentials", (n) -> { currentObject.setCredentials(n.getCollectionOfObjectValues(SynchronizationSecretKeyStringValuePair::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("credentials", this.getCredentials());
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
     * Sets the credentials property value. The credentials property
     * @param value Value to set for the credentials property.
     * @return a void
     */
    public void setCredentials(@javax.annotation.Nullable final java.util.List<SynchronizationSecretKeyStringValuePair> value) {
        this._credentials = value;
    }
}
