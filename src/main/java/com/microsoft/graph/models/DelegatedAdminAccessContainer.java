package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DelegatedAdminAccessContainer implements AdditionalDataHolder, Parsable {
    /** The identifier of the access container (for example, a security group). For 'securityGroup' access containers, this must be a valid ID of an Azure AD security group in the Microsoft partner's tenant. */
    private String _accessContainerId;
    /** The type of access container (for example, security group) that will be assigned one or more roles through a delegated admin relationship. The possible values are: securityGroup, unknownFutureValue. */
    private DelegatedAdminAccessContainerType _accessContainerType;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /**
     * Instantiates a new delegatedAdminAccessContainer and sets the default values.
     * @return a void
     */
    public DelegatedAdminAccessContainer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a delegatedAdminAccessContainer
     */
    @javax.annotation.Nonnull
    public static DelegatedAdminAccessContainer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminAccessContainer();
    }
    /**
     * Gets the accessContainerId property value. The identifier of the access container (for example, a security group). For 'securityGroup' access containers, this must be a valid ID of an Azure AD security group in the Microsoft partner's tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccessContainerId() {
        return this._accessContainerId;
    }
    /**
     * Gets the accessContainerType property value. The type of access container (for example, security group) that will be assigned one or more roles through a delegated admin relationship. The possible values are: securityGroup, unknownFutureValue.
     * @return a delegatedAdminAccessContainerType
     */
    @javax.annotation.Nullable
    public DelegatedAdminAccessContainerType getAccessContainerType() {
        return this._accessContainerType;
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
        final DelegatedAdminAccessContainer currentObject = this;
        return new HashMap<>(2) {{
            this.put("accessContainerId", (n) -> { currentObject.setAccessContainerId(n.getStringValue()); });
            this.put("accessContainerType", (n) -> { currentObject.setAccessContainerType(n.getEnumValue(DelegatedAdminAccessContainerType.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("accessContainerId", this.getAccessContainerId());
        writer.writeEnumValue("accessContainerType", this.getAccessContainerType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessContainerId property value. The identifier of the access container (for example, a security group). For 'securityGroup' access containers, this must be a valid ID of an Azure AD security group in the Microsoft partner's tenant.
     * @param value Value to set for the accessContainerId property.
     * @return a void
     */
    public void setAccessContainerId(@javax.annotation.Nullable final String value) {
        this._accessContainerId = value;
    }
    /**
     * Sets the accessContainerType property value. The type of access container (for example, security group) that will be assigned one or more roles through a delegated admin relationship. The possible values are: securityGroup, unknownFutureValue.
     * @param value Value to set for the accessContainerType property.
     * @return a void
     */
    public void setAccessContainerType(@javax.annotation.Nullable final DelegatedAdminAccessContainerType value) {
        this._accessContainerType = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
}
