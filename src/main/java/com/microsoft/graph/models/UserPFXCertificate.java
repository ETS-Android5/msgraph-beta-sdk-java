package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserPFXCertificate extends Entity implements Parsable {
    /** Date/time when this PFX certificate was imported. */
    private OffsetDateTime _createdDateTime;
    /** Encrypted PFX blob. */
    private byte[] _encryptedPfxBlob;
    /** Encrypted PFX password. */
    private String _encryptedPfxPassword;
    /** Certificate's validity expiration date/time. */
    private OffsetDateTime _expirationDateTime;
    /** Certificate's intended purpose from the point-of-view of deployment. Possible values are: unassigned, smimeEncryption, smimeSigning, vpn, wifi. */
    private UserPfxIntendedPurpose _intendedPurpose;
    /** Name of the key (within the provider) used to encrypt the blob. */
    private String _keyName;
    /** Date/time when this PFX certificate was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Padding scheme used by the provider during encryption/decryption. Possible values are: none, pkcs1, oaepSha1, oaepSha256, oaepSha384, oaepSha512. */
    private UserPfxPaddingScheme _paddingScheme;
    /** Crypto provider used to encrypt this blob. */
    private String _providerName;
    /** Certificate's validity start date/time. */
    private OffsetDateTime _startDateTime;
    /** SHA-1 thumbprint of the PFX certificate. */
    private String _thumbprint;
    /** User Principal Name of the PFX certificate. */
    private String _userPrincipalName;
    /**
     * Instantiates a new userPFXCertificate and sets the default values.
     * @return a void
     */
    public UserPFXCertificate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userPFXCertificate
     */
    @javax.annotation.Nonnull
    public static UserPFXCertificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserPFXCertificate();
    }
    /**
     * Gets the createdDateTime property value. Date/time when this PFX certificate was imported.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the encryptedPfxBlob property value. Encrypted PFX blob.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getEncryptedPfxBlob() {
        return this._encryptedPfxBlob;
    }
    /**
     * Gets the encryptedPfxPassword property value. Encrypted PFX password.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEncryptedPfxPassword() {
        return this._encryptedPfxPassword;
    }
    /**
     * Gets the expirationDateTime property value. Certificate's validity expiration date/time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserPFXCertificate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("encryptedPfxBlob", (n) -> { currentObject.setEncryptedPfxBlob(n.getByteArrayValue()); });
            this.put("encryptedPfxPassword", (n) -> { currentObject.setEncryptedPfxPassword(n.getStringValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("intendedPurpose", (n) -> { currentObject.setIntendedPurpose(n.getEnumValue(UserPfxIntendedPurpose.class)); });
            this.put("keyName", (n) -> { currentObject.setKeyName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("paddingScheme", (n) -> { currentObject.setPaddingScheme(n.getEnumValue(UserPfxPaddingScheme.class)); });
            this.put("providerName", (n) -> { currentObject.setProviderName(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("thumbprint", (n) -> { currentObject.setThumbprint(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the intendedPurpose property value. Certificate's intended purpose from the point-of-view of deployment. Possible values are: unassigned, smimeEncryption, smimeSigning, vpn, wifi.
     * @return a userPfxIntendedPurpose
     */
    @javax.annotation.Nullable
    public UserPfxIntendedPurpose getIntendedPurpose() {
        return this._intendedPurpose;
    }
    /**
     * Gets the keyName property value. Name of the key (within the provider) used to encrypt the blob.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKeyName() {
        return this._keyName;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date/time when this PFX certificate was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the paddingScheme property value. Padding scheme used by the provider during encryption/decryption. Possible values are: none, pkcs1, oaepSha1, oaepSha256, oaepSha384, oaepSha512.
     * @return a userPfxPaddingScheme
     */
    @javax.annotation.Nullable
    public UserPfxPaddingScheme getPaddingScheme() {
        return this._paddingScheme;
    }
    /**
     * Gets the providerName property value. Crypto provider used to encrypt this blob.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProviderName() {
        return this._providerName;
    }
    /**
     * Gets the startDateTime property value. Certificate's validity start date/time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the thumbprint property value. SHA-1 thumbprint of the PFX certificate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbprint() {
        return this._thumbprint;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name of the PFX certificate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeByteArrayValue("encryptedPfxBlob", this.getEncryptedPfxBlob());
        writer.writeStringValue("encryptedPfxPassword", this.getEncryptedPfxPassword());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeEnumValue("intendedPurpose", this.getIntendedPurpose());
        writer.writeStringValue("keyName", this.getKeyName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("paddingScheme", this.getPaddingScheme());
        writer.writeStringValue("providerName", this.getProviderName());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("thumbprint", this.getThumbprint());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the createdDateTime property value. Date/time when this PFX certificate was imported.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the encryptedPfxBlob property value. Encrypted PFX blob.
     * @param value Value to set for the encryptedPfxBlob property.
     * @return a void
     */
    public void setEncryptedPfxBlob(@javax.annotation.Nullable final byte[] value) {
        this._encryptedPfxBlob = value;
    }
    /**
     * Sets the encryptedPfxPassword property value. Encrypted PFX password.
     * @param value Value to set for the encryptedPfxPassword property.
     * @return a void
     */
    public void setEncryptedPfxPassword(@javax.annotation.Nullable final String value) {
        this._encryptedPfxPassword = value;
    }
    /**
     * Sets the expirationDateTime property value. Certificate's validity expiration date/time.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the intendedPurpose property value. Certificate's intended purpose from the point-of-view of deployment. Possible values are: unassigned, smimeEncryption, smimeSigning, vpn, wifi.
     * @param value Value to set for the intendedPurpose property.
     * @return a void
     */
    public void setIntendedPurpose(@javax.annotation.Nullable final UserPfxIntendedPurpose value) {
        this._intendedPurpose = value;
    }
    /**
     * Sets the keyName property value. Name of the key (within the provider) used to encrypt the blob.
     * @param value Value to set for the keyName property.
     * @return a void
     */
    public void setKeyName(@javax.annotation.Nullable final String value) {
        this._keyName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date/time when this PFX certificate was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the paddingScheme property value. Padding scheme used by the provider during encryption/decryption. Possible values are: none, pkcs1, oaepSha1, oaepSha256, oaepSha384, oaepSha512.
     * @param value Value to set for the paddingScheme property.
     * @return a void
     */
    public void setPaddingScheme(@javax.annotation.Nullable final UserPfxPaddingScheme value) {
        this._paddingScheme = value;
    }
    /**
     * Sets the providerName property value. Crypto provider used to encrypt this blob.
     * @param value Value to set for the providerName property.
     * @return a void
     */
    public void setProviderName(@javax.annotation.Nullable final String value) {
        this._providerName = value;
    }
    /**
     * Sets the startDateTime property value. Certificate's validity start date/time.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the thumbprint property value. SHA-1 thumbprint of the PFX certificate.
     * @param value Value to set for the thumbprint property.
     * @return a void
     */
    public void setThumbprint(@javax.annotation.Nullable final String value) {
        this._thumbprint = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name of the PFX certificate.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
