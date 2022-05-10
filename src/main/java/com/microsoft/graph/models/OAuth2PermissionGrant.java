package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OAuth2PermissionGrant extends Entity implements Parsable {
    /** The id of the client service principal for the application which is authorized to act on behalf of a signed-in user when accessing an API. Required. Supports $filter (eq only). */
    private String _clientId;
    /** Indicates whether authorization is granted for the client application to impersonate all users or only a specific user. AllPrincipals indicates authorization to impersonate all users. Principal indicates authorization to impersonate a specific user. Consent on behalf of all users can be granted by an administrator. Non-admin users may be authorized to consent on behalf of themselves in some cases, for some delegated permissions. Required. Supports $filter (eq only). */
    private String _consentType;
    /** Currently, the end time value is ignored, but a value is required when creating an oAuth2PermissionGrant. Required. */
    private OffsetDateTime _expiryTime;
    /** The id of the user on behalf of whom the client is authorized to access the resource, when consentType is Principal. If consentType is AllPrincipals this value is null. Required when consentType is Principal. */
    private String _principalId;
    /** The id of the resource service principal to which access is authorized. This identifies the API which the client is authorized to attempt to call on behalf of a signed-in user. */
    private String _resourceId;
    /** A space-separated list of the claim values for delegated permissions which should be included in access tokens for the resource application (the API). For example, openid User.Read GroupMember.Read.All. Each claim value should match the value field of one of the delegated permissions defined by the API, listed in the publishedPermissionScopes property of the resource service principal. */
    private String _scope;
    /** Currently, the start time value is ignored, but a value is required when creating an oAuth2PermissionGrant. Required. */
    private OffsetDateTime _startTime;
    /**
     * Instantiates a new oAuth2PermissionGrant and sets the default values.
     * @return a void
     */
    public OAuth2PermissionGrant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a oAuth2PermissionGrant
     */
    @javax.annotation.Nonnull
    public static OAuth2PermissionGrant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OAuth2PermissionGrant();
    }
    /**
     * Gets the clientId property value. The id of the client service principal for the application which is authorized to act on behalf of a signed-in user when accessing an API. Required. Supports $filter (eq only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientId() {
        return this._clientId;
    }
    /**
     * Gets the consentType property value. Indicates whether authorization is granted for the client application to impersonate all users or only a specific user. AllPrincipals indicates authorization to impersonate all users. Principal indicates authorization to impersonate a specific user. Consent on behalf of all users can be granted by an administrator. Non-admin users may be authorized to consent on behalf of themselves in some cases, for some delegated permissions. Required. Supports $filter (eq only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConsentType() {
        return this._consentType;
    }
    /**
     * Gets the expiryTime property value. Currently, the end time value is ignored, but a value is required when creating an oAuth2PermissionGrant. Required.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiryTime() {
        return this._expiryTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OAuth2PermissionGrant currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("clientId", (n) -> { currentObject.setClientId(n.getStringValue()); });
            this.put("consentType", (n) -> { currentObject.setConsentType(n.getStringValue()); });
            this.put("expiryTime", (n) -> { currentObject.setExpiryTime(n.getOffsetDateTimeValue()); });
            this.put("principalId", (n) -> { currentObject.setPrincipalId(n.getStringValue()); });
            this.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
            this.put("scope", (n) -> { currentObject.setScope(n.getStringValue()); });
            this.put("startTime", (n) -> { currentObject.setStartTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the principalId property value. The id of the user on behalf of whom the client is authorized to access the resource, when consentType is Principal. If consentType is AllPrincipals this value is null. Required when consentType is Principal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
        return this._principalId;
    }
    /**
     * Gets the resourceId property value. The id of the resource service principal to which access is authorized. This identifies the API which the client is authorized to attempt to call on behalf of a signed-in user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Gets the scope property value. A space-separated list of the claim values for delegated permissions which should be included in access tokens for the resource application (the API). For example, openid User.Read GroupMember.Read.All. Each claim value should match the value field of one of the delegated permissions defined by the API, listed in the publishedPermissionScopes property of the resource service principal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScope() {
        return this._scope;
    }
    /**
     * Gets the startTime property value. Currently, the start time value is ignored, but a value is required when creating an oAuth2PermissionGrant. Required.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartTime() {
        return this._startTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("consentType", this.getConsentType());
        writer.writeOffsetDateTimeValue("expiryTime", this.getExpiryTime());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("scope", this.getScope());
        writer.writeOffsetDateTimeValue("startTime", this.getStartTime());
    }
    /**
     * Sets the clientId property value. The id of the client service principal for the application which is authorized to act on behalf of a signed-in user when accessing an API. Required. Supports $filter (eq only).
     * @param value Value to set for the clientId property.
     * @return a void
     */
    public void setClientId(@javax.annotation.Nullable final String value) {
        this._clientId = value;
    }
    /**
     * Sets the consentType property value. Indicates whether authorization is granted for the client application to impersonate all users or only a specific user. AllPrincipals indicates authorization to impersonate all users. Principal indicates authorization to impersonate a specific user. Consent on behalf of all users can be granted by an administrator. Non-admin users may be authorized to consent on behalf of themselves in some cases, for some delegated permissions. Required. Supports $filter (eq only).
     * @param value Value to set for the consentType property.
     * @return a void
     */
    public void setConsentType(@javax.annotation.Nullable final String value) {
        this._consentType = value;
    }
    /**
     * Sets the expiryTime property value. Currently, the end time value is ignored, but a value is required when creating an oAuth2PermissionGrant. Required.
     * @param value Value to set for the expiryTime property.
     * @return a void
     */
    public void setExpiryTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expiryTime = value;
    }
    /**
     * Sets the principalId property value. The id of the user on behalf of whom the client is authorized to access the resource, when consentType is Principal. If consentType is AllPrincipals this value is null. Required when consentType is Principal.
     * @param value Value to set for the principalId property.
     * @return a void
     */
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this._principalId = value;
    }
    /**
     * Sets the resourceId property value. The id of the resource service principal to which access is authorized. This identifies the API which the client is authorized to attempt to call on behalf of a signed-in user.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
    /**
     * Sets the scope property value. A space-separated list of the claim values for delegated permissions which should be included in access tokens for the resource application (the API). For example, openid User.Read GroupMember.Read.All. Each claim value should match the value field of one of the delegated permissions defined by the API, listed in the publishedPermissionScopes property of the resource service principal.
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final String value) {
        this._scope = value;
    }
    /**
     * Sets the startTime property value. Currently, the start time value is ignored, but a value is required when creating an oAuth2PermissionGrant. Required.
     * @param value Value to set for the startTime property.
     * @return a void
     */
    public void setStartTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startTime = value;
    }
}
