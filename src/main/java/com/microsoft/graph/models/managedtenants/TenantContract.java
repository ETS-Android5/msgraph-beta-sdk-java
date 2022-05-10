package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantContract implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The type of relationship that exists between the managing entity and tenant. Optional. Read-only. */
    private Integer _contractType;
    /** The default domain name for the tenant. Required. Read-only. */
    private String _defaultDomainName;
    /** The display name for the tenant. Optional. Read-only. */
    private String _displayName;
    /**
     * Instantiates a new tenantContract and sets the default values.
     * @return a void
     */
    public TenantContract() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantContract
     */
    @javax.annotation.Nonnull
    public static TenantContract createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantContract();
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
     * Gets the contractType property value. The type of relationship that exists between the managing entity and tenant. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getContractType() {
        return this._contractType;
    }
    /**
     * Gets the defaultDomainName property value. The default domain name for the tenant. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultDomainName() {
        return this._defaultDomainName;
    }
    /**
     * Gets the displayName property value. The display name for the tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantContract currentObject = this;
        return new HashMap<>(3) {{
            this.put("contractType", (n) -> { currentObject.setContractType(n.getIntegerValue()); });
            this.put("defaultDomainName", (n) -> { currentObject.setDefaultDomainName(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("contractType", this.getContractType());
        writer.writeStringValue("defaultDomainName", this.getDefaultDomainName());
        writer.writeStringValue("displayName", this.getDisplayName());
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
     * Sets the contractType property value. The type of relationship that exists between the managing entity and tenant. Optional. Read-only.
     * @param value Value to set for the contractType property.
     * @return a void
     */
    public void setContractType(@javax.annotation.Nullable final Integer value) {
        this._contractType = value;
    }
    /**
     * Sets the defaultDomainName property value. The default domain name for the tenant. Required. Read-only.
     * @param value Value to set for the defaultDomainName property.
     * @return a void
     */
    public void setDefaultDomainName(@javax.annotation.Nullable final String value) {
        this._defaultDomainName = value;
    }
    /**
     * Sets the displayName property value. The display name for the tenant. Optional. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
}
