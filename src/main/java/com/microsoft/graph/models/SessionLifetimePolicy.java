package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SessionLifetimePolicy implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The human-readable details of the conditional access session management policy applied to the sign-in. */
    private String _detail;
    /** If a conditional access session management policy required the user to authenticate in this sign-in event, this field describes the policy type that required authentication. The possible values are: rememberMultifactorAuthenticationOnTrustedDevices, tenantTokenLifetimePolicy, audienceTokenLifetimePolicy, signInFrequencyPeriodicReauthentication, ngcMfa, signInFrequencyEveryTime, unknownFutureValue. */
    private ExpirationRequirement _expirationRequirement;
    /**
     * Instantiates a new sessionLifetimePolicy and sets the default values.
     * @return a void
     */
    public SessionLifetimePolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sessionLifetimePolicy
     */
    @javax.annotation.Nonnull
    public static SessionLifetimePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SessionLifetimePolicy();
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
     * Gets the detail property value. The human-readable details of the conditional access session management policy applied to the sign-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetail() {
        return this._detail;
    }
    /**
     * Gets the expirationRequirement property value. If a conditional access session management policy required the user to authenticate in this sign-in event, this field describes the policy type that required authentication. The possible values are: rememberMultifactorAuthenticationOnTrustedDevices, tenantTokenLifetimePolicy, audienceTokenLifetimePolicy, signInFrequencyPeriodicReauthentication, ngcMfa, signInFrequencyEveryTime, unknownFutureValue.
     * @return a expirationRequirement
     */
    @javax.annotation.Nullable
    public ExpirationRequirement getExpirationRequirement() {
        return this._expirationRequirement;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SessionLifetimePolicy currentObject = this;
        return new HashMap<>(2) {{
            this.put("detail", (n) -> { currentObject.setDetail(n.getStringValue()); });
            this.put("expirationRequirement", (n) -> { currentObject.setExpirationRequirement(n.getEnumValue(ExpirationRequirement.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("detail", this.getDetail());
        writer.writeEnumValue("expirationRequirement", this.getExpirationRequirement());
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
     * Sets the detail property value. The human-readable details of the conditional access session management policy applied to the sign-in.
     * @param value Value to set for the detail property.
     * @return a void
     */
    public void setDetail(@javax.annotation.Nullable final String value) {
        this._detail = value;
    }
    /**
     * Sets the expirationRequirement property value. If a conditional access session management policy required the user to authenticate in this sign-in event, this field describes the policy type that required authentication. The possible values are: rememberMultifactorAuthenticationOnTrustedDevices, tenantTokenLifetimePolicy, audienceTokenLifetimePolicy, signInFrequencyPeriodicReauthentication, ngcMfa, signInFrequencyEveryTime, unknownFutureValue.
     * @param value Value to set for the expirationRequirement property.
     * @return a void
     */
    public void setExpirationRequirement(@javax.annotation.Nullable final ExpirationRequirement value) {
        this._expirationRequirement = value;
    }
}
