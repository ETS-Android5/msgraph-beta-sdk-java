package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DelegatedAdminServiceManagementDetail extends Entity implements Parsable {
    /** The serviceId property */
    private String _serviceId;
    /** The URL of the management portal for the managed service. Read-only. */
    private String _serviceManagementUrl;
    /** The name of a managed service. Read-only. */
    private String _serviceName;
    /**
     * Instantiates a new delegatedAdminServiceManagementDetail and sets the default values.
     * @return a void
     */
    public DelegatedAdminServiceManagementDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a delegatedAdminServiceManagementDetail
     */
    @javax.annotation.Nonnull
    public static DelegatedAdminServiceManagementDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminServiceManagementDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DelegatedAdminServiceManagementDetail currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("serviceId", (n) -> { currentObject.setServiceId(n.getStringValue()); });
            this.put("serviceManagementUrl", (n) -> { currentObject.setServiceManagementUrl(n.getStringValue()); });
            this.put("serviceName", (n) -> { currentObject.setServiceName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the serviceId property value. The serviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceId() {
        return this._serviceId;
    }
    /**
     * Gets the serviceManagementUrl property value. The URL of the management portal for the managed service. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceManagementUrl() {
        return this._serviceManagementUrl;
    }
    /**
     * Gets the serviceName property value. The name of a managed service. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceName() {
        return this._serviceName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("serviceId", this.getServiceId());
        writer.writeStringValue("serviceManagementUrl", this.getServiceManagementUrl());
        writer.writeStringValue("serviceName", this.getServiceName());
    }
    /**
     * Sets the serviceId property value. The serviceId property
     * @param value Value to set for the serviceId property.
     * @return a void
     */
    public void setServiceId(@javax.annotation.Nullable final String value) {
        this._serviceId = value;
    }
    /**
     * Sets the serviceManagementUrl property value. The URL of the management portal for the managed service. Read-only.
     * @param value Value to set for the serviceManagementUrl property.
     * @return a void
     */
    public void setServiceManagementUrl(@javax.annotation.Nullable final String value) {
        this._serviceManagementUrl = value;
    }
    /**
     * Sets the serviceName property value. The name of a managed service. Read-only.
     * @param value Value to set for the serviceName property.
     * @return a void
     */
    public void setServiceName(@javax.annotation.Nullable final String value) {
        this._serviceName = value;
    }
}
