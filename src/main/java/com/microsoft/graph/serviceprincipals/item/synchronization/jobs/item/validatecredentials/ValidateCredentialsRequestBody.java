package microsoft.graph.serviceprincipals.item.synchronization.jobs.item.validatecredentials;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
/** Provides operations to call the validateCredentials method. */
public class ValidateCredentialsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The applicationIdentifier property */
    private String _applicationIdentifier;
    /** The credentials property */
    private java.util.List<SynchronizationSecretKeyStringValuePair> _credentials;
    /** The templateId property */
    private String _templateId;
    /** The useSavedCredentials property */
    private Boolean _useSavedCredentials;
    /**
     * Instantiates a new validateCredentialsRequestBody and sets the default values.
     * @return a void
     */
    public ValidateCredentialsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validateCredentialsRequestBody
     */
    @javax.annotation.Nonnull
    public static ValidateCredentialsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateCredentialsRequestBody();
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
     * Gets the applicationIdentifier property value. The applicationIdentifier property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationIdentifier() {
        return this._applicationIdentifier;
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
        final ValidateCredentialsRequestBody currentObject = this;
        return new HashMap<>(4) {{
            this.put("applicationIdentifier", (n) -> { currentObject.setApplicationIdentifier(n.getStringValue()); });
            this.put("credentials", (n) -> { currentObject.setCredentials(n.getCollectionOfObjectValues(SynchronizationSecretKeyStringValuePair::createFromDiscriminatorValue)); });
            this.put("templateId", (n) -> { currentObject.setTemplateId(n.getStringValue()); });
            this.put("useSavedCredentials", (n) -> { currentObject.setUseSavedCredentials(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the templateId property value. The templateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this._templateId;
    }
    /**
     * Gets the useSavedCredentials property value. The useSavedCredentials property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseSavedCredentials() {
        return this._useSavedCredentials;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationIdentifier", this.getApplicationIdentifier());
        writer.writeCollectionOfObjectValues("credentials", this.getCredentials());
        writer.writeStringValue("templateId", this.getTemplateId());
        writer.writeBooleanValue("useSavedCredentials", this.getUseSavedCredentials());
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
     * Sets the applicationIdentifier property value. The applicationIdentifier property
     * @param value Value to set for the applicationIdentifier property.
     * @return a void
     */
    public void setApplicationIdentifier(@javax.annotation.Nullable final String value) {
        this._applicationIdentifier = value;
    }
    /**
     * Sets the credentials property value. The credentials property
     * @param value Value to set for the credentials property.
     * @return a void
     */
    public void setCredentials(@javax.annotation.Nullable final java.util.List<SynchronizationSecretKeyStringValuePair> value) {
        this._credentials = value;
    }
    /**
     * Sets the templateId property value. The templateId property
     * @param value Value to set for the templateId property.
     * @return a void
     */
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this._templateId = value;
    }
    /**
     * Sets the useSavedCredentials property value. The useSavedCredentials property
     * @param value Value to set for the useSavedCredentials property.
     * @return a void
     */
    public void setUseSavedCredentials(@javax.annotation.Nullable final Boolean value) {
        this._useSavedCredentials = value;
    }
}
