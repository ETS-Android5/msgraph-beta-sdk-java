package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkNetworkConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The default gateway is the path used to pass information when the destination is unknown to the device. */
    private String _defaultGateway;
    /** The network domain of the device, for example, contoso.com. */
    private String _domainName;
    /** The device name on a network. */
    private String _hostName;
    /** The IP address is a numerical label that uniquely identifies every device connected to the internet. */
    private String _ipAddress;
    /** True if DHCP is enabled. */
    private Boolean _isDhcpEnabled;
    /** True if the PC port is enabled. */
    private Boolean _isPCPortEnabled;
    /** A primary DNS is the first point of contact for a device that translates the hostname into an IP address. */
    private String _primaryDns;
    /** A secondary DNS is used when the primary DNS is not available. */
    private String _secondaryDns;
    /** A subnet mask is a number that distinguishes the network address and the host address within an IP address. */
    private String _subnetMask;
    /**
     * Instantiates a new teamworkNetworkConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkNetworkConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkNetworkConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkNetworkConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkNetworkConfiguration();
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
     * Gets the defaultGateway property value. The default gateway is the path used to pass information when the destination is unknown to the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultGateway() {
        return this._defaultGateway;
    }
    /**
     * Gets the domainName property value. The network domain of the device, for example, contoso.com.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return this._domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkNetworkConfiguration currentObject = this;
        return new HashMap<>(9) {{
            this.put("defaultGateway", (n) -> { currentObject.setDefaultGateway(n.getStringValue()); });
            this.put("domainName", (n) -> { currentObject.setDomainName(n.getStringValue()); });
            this.put("hostName", (n) -> { currentObject.setHostName(n.getStringValue()); });
            this.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
            this.put("isDhcpEnabled", (n) -> { currentObject.setIsDhcpEnabled(n.getBooleanValue()); });
            this.put("isPCPortEnabled", (n) -> { currentObject.setIsPCPortEnabled(n.getBooleanValue()); });
            this.put("primaryDns", (n) -> { currentObject.setPrimaryDns(n.getStringValue()); });
            this.put("secondaryDns", (n) -> { currentObject.setSecondaryDns(n.getStringValue()); });
            this.put("subnetMask", (n) -> { currentObject.setSubnetMask(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hostName property value. The device name on a network.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHostName() {
        return this._hostName;
    }
    /**
     * Gets the ipAddress property value. The IP address is a numerical label that uniquely identifies every device connected to the internet.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the isDhcpEnabled property value. True if DHCP is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDhcpEnabled() {
        return this._isDhcpEnabled;
    }
    /**
     * Gets the isPCPortEnabled property value. True if the PC port is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPCPortEnabled() {
        return this._isPCPortEnabled;
    }
    /**
     * Gets the primaryDns property value. A primary DNS is the first point of contact for a device that translates the hostname into an IP address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryDns() {
        return this._primaryDns;
    }
    /**
     * Gets the secondaryDns property value. A secondary DNS is used when the primary DNS is not available.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecondaryDns() {
        return this._secondaryDns;
    }
    /**
     * Gets the subnetMask property value. A subnet mask is a number that distinguishes the network address and the host address within an IP address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubnetMask() {
        return this._subnetMask;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultGateway", this.getDefaultGateway());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("hostName", this.getHostName());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeBooleanValue("isDhcpEnabled", this.getIsDhcpEnabled());
        writer.writeBooleanValue("isPCPortEnabled", this.getIsPCPortEnabled());
        writer.writeStringValue("primaryDns", this.getPrimaryDns());
        writer.writeStringValue("secondaryDns", this.getSecondaryDns());
        writer.writeStringValue("subnetMask", this.getSubnetMask());
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
     * Sets the defaultGateway property value. The default gateway is the path used to pass information when the destination is unknown to the device.
     * @param value Value to set for the defaultGateway property.
     * @return a void
     */
    public void setDefaultGateway(@javax.annotation.Nullable final String value) {
        this._defaultGateway = value;
    }
    /**
     * Sets the domainName property value. The network domain of the device, for example, contoso.com.
     * @param value Value to set for the domainName property.
     * @return a void
     */
    public void setDomainName(@javax.annotation.Nullable final String value) {
        this._domainName = value;
    }
    /**
     * Sets the hostName property value. The device name on a network.
     * @param value Value to set for the hostName property.
     * @return a void
     */
    public void setHostName(@javax.annotation.Nullable final String value) {
        this._hostName = value;
    }
    /**
     * Sets the ipAddress property value. The IP address is a numerical label that uniquely identifies every device connected to the internet.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the isDhcpEnabled property value. True if DHCP is enabled.
     * @param value Value to set for the isDhcpEnabled property.
     * @return a void
     */
    public void setIsDhcpEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isDhcpEnabled = value;
    }
    /**
     * Sets the isPCPortEnabled property value. True if the PC port is enabled.
     * @param value Value to set for the isPCPortEnabled property.
     * @return a void
     */
    public void setIsPCPortEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isPCPortEnabled = value;
    }
    /**
     * Sets the primaryDns property value. A primary DNS is the first point of contact for a device that translates the hostname into an IP address.
     * @param value Value to set for the primaryDns property.
     * @return a void
     */
    public void setPrimaryDns(@javax.annotation.Nullable final String value) {
        this._primaryDns = value;
    }
    /**
     * Sets the secondaryDns property value. A secondary DNS is used when the primary DNS is not available.
     * @param value Value to set for the secondaryDns property.
     * @return a void
     */
    public void setSecondaryDns(@javax.annotation.Nullable final String value) {
        this._secondaryDns = value;
    }
    /**
     * Sets the subnetMask property value. A subnet mask is a number that distinguishes the network address and the host address within an IP address.
     * @param value Value to set for the subnetMask property.
     * @return a void
     */
    public void setSubnetMask(@javax.annotation.Nullable final String value) {
        this._subnetMask = value;
    }
}
