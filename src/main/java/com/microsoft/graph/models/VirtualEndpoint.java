package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEndpoint extends Entity implements Parsable {
    /** Cloud PC audit event. */
    private java.util.List<CloudPcAuditEvent> _auditEvents;
    /** Cloud managed virtual desktops. */
    private java.util.List<CloudPC> _cloudPCs;
    /** The image resource on Cloud PC. */
    private java.util.List<CloudPcDeviceImage> _deviceImages;
    /** The gallery image resource on Cloud PC. */
    private java.util.List<CloudPcGalleryImage> _galleryImages;
    /** A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs. */
    private java.util.List<CloudPcOnPremisesConnection> _onPremisesConnections;
    /** The Cloud PC organization settings for a tenant. */
    private CloudPcOrganizationSettings _organizationSettings;
    /** Cloud PC provisioning policy. */
    private java.util.List<CloudPcProvisioningPolicy> _provisioningPolicies;
    /** Cloud PC service plans. */
    private java.util.List<CloudPcServicePlan> _servicePlans;
    /** Cloud PC snapshots. */
    private java.util.List<CloudPcSnapshot> _snapshots;
    /** Cloud PC supported regions. */
    private java.util.List<CloudPcSupportedRegion> _supportedRegions;
    /** Cloud PC user settings. */
    private java.util.List<CloudPcUserSetting> _userSettings;
    /**
     * Instantiates a new virtualEndpoint and sets the default values.
     * @return a void
     */
    public VirtualEndpoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEndpoint
     */
    @javax.annotation.Nonnull
    public static VirtualEndpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEndpoint();
    }
    /**
     * Gets the auditEvents property value. Cloud PC audit event.
     * @return a cloudPcAuditEvent
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcAuditEvent> getAuditEvents() {
        return this._auditEvents;
    }
    /**
     * Gets the cloudPCs property value. Cloud managed virtual desktops.
     * @return a cloudPC
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPC> getCloudPCs() {
        return this._cloudPCs;
    }
    /**
     * Gets the deviceImages property value. The image resource on Cloud PC.
     * @return a cloudPcDeviceImage
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcDeviceImage> getDeviceImages() {
        return this._deviceImages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VirtualEndpoint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("auditEvents", (n) -> { currentObject.setAuditEvents(n.getCollectionOfObjectValues(CloudPcAuditEvent::createFromDiscriminatorValue)); });
            this.put("cloudPCs", (n) -> { currentObject.setCloudPCs(n.getCollectionOfObjectValues(CloudPC::createFromDiscriminatorValue)); });
            this.put("deviceImages", (n) -> { currentObject.setDeviceImages(n.getCollectionOfObjectValues(CloudPcDeviceImage::createFromDiscriminatorValue)); });
            this.put("galleryImages", (n) -> { currentObject.setGalleryImages(n.getCollectionOfObjectValues(CloudPcGalleryImage::createFromDiscriminatorValue)); });
            this.put("onPremisesConnections", (n) -> { currentObject.setOnPremisesConnections(n.getCollectionOfObjectValues(CloudPcOnPremisesConnection::createFromDiscriminatorValue)); });
            this.put("organizationSettings", (n) -> { currentObject.setOrganizationSettings(n.getObjectValue(CloudPcOrganizationSettings::createFromDiscriminatorValue)); });
            this.put("provisioningPolicies", (n) -> { currentObject.setProvisioningPolicies(n.getCollectionOfObjectValues(CloudPcProvisioningPolicy::createFromDiscriminatorValue)); });
            this.put("servicePlans", (n) -> { currentObject.setServicePlans(n.getCollectionOfObjectValues(CloudPcServicePlan::createFromDiscriminatorValue)); });
            this.put("snapshots", (n) -> { currentObject.setSnapshots(n.getCollectionOfObjectValues(CloudPcSnapshot::createFromDiscriminatorValue)); });
            this.put("supportedRegions", (n) -> { currentObject.setSupportedRegions(n.getCollectionOfObjectValues(CloudPcSupportedRegion::createFromDiscriminatorValue)); });
            this.put("userSettings", (n) -> { currentObject.setUserSettings(n.getCollectionOfObjectValues(CloudPcUserSetting::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the galleryImages property value. The gallery image resource on Cloud PC.
     * @return a cloudPcGalleryImage
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcGalleryImage> getGalleryImages() {
        return this._galleryImages;
    }
    /**
     * Gets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     * @return a cloudPcOnPremisesConnection
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcOnPremisesConnection> getOnPremisesConnections() {
        return this._onPremisesConnections;
    }
    /**
     * Gets the organizationSettings property value. The Cloud PC organization settings for a tenant.
     * @return a cloudPcOrganizationSettings
     */
    @javax.annotation.Nullable
    public CloudPcOrganizationSettings getOrganizationSettings() {
        return this._organizationSettings;
    }
    /**
     * Gets the provisioningPolicies property value. Cloud PC provisioning policy.
     * @return a cloudPcProvisioningPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcProvisioningPolicy> getProvisioningPolicies() {
        return this._provisioningPolicies;
    }
    /**
     * Gets the servicePlans property value. Cloud PC service plans.
     * @return a cloudPcServicePlan
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcServicePlan> getServicePlans() {
        return this._servicePlans;
    }
    /**
     * Gets the snapshots property value. Cloud PC snapshots.
     * @return a cloudPcSnapshot
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcSnapshot> getSnapshots() {
        return this._snapshots;
    }
    /**
     * Gets the supportedRegions property value. Cloud PC supported regions.
     * @return a cloudPcSupportedRegion
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcSupportedRegion> getSupportedRegions() {
        return this._supportedRegions;
    }
    /**
     * Gets the userSettings property value. Cloud PC user settings.
     * @return a cloudPcUserSetting
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcUserSetting> getUserSettings() {
        return this._userSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("cloudPCs", this.getCloudPCs());
        writer.writeCollectionOfObjectValues("deviceImages", this.getDeviceImages());
        writer.writeCollectionOfObjectValues("galleryImages", this.getGalleryImages());
        writer.writeCollectionOfObjectValues("onPremisesConnections", this.getOnPremisesConnections());
        writer.writeObjectValue("organizationSettings", this.getOrganizationSettings());
        writer.writeCollectionOfObjectValues("provisioningPolicies", this.getProvisioningPolicies());
        writer.writeCollectionOfObjectValues("servicePlans", this.getServicePlans());
        writer.writeCollectionOfObjectValues("snapshots", this.getSnapshots());
        writer.writeCollectionOfObjectValues("supportedRegions", this.getSupportedRegions());
        writer.writeCollectionOfObjectValues("userSettings", this.getUserSettings());
    }
    /**
     * Sets the auditEvents property value. Cloud PC audit event.
     * @param value Value to set for the auditEvents property.
     * @return a void
     */
    public void setAuditEvents(@javax.annotation.Nullable final java.util.List<CloudPcAuditEvent> value) {
        this._auditEvents = value;
    }
    /**
     * Sets the cloudPCs property value. Cloud managed virtual desktops.
     * @param value Value to set for the cloudPCs property.
     * @return a void
     */
    public void setCloudPCs(@javax.annotation.Nullable final java.util.List<CloudPC> value) {
        this._cloudPCs = value;
    }
    /**
     * Sets the deviceImages property value. The image resource on Cloud PC.
     * @param value Value to set for the deviceImages property.
     * @return a void
     */
    public void setDeviceImages(@javax.annotation.Nullable final java.util.List<CloudPcDeviceImage> value) {
        this._deviceImages = value;
    }
    /**
     * Sets the galleryImages property value. The gallery image resource on Cloud PC.
     * @param value Value to set for the galleryImages property.
     * @return a void
     */
    public void setGalleryImages(@javax.annotation.Nullable final java.util.List<CloudPcGalleryImage> value) {
        this._galleryImages = value;
    }
    /**
     * Sets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     * @param value Value to set for the onPremisesConnections property.
     * @return a void
     */
    public void setOnPremisesConnections(@javax.annotation.Nullable final java.util.List<CloudPcOnPremisesConnection> value) {
        this._onPremisesConnections = value;
    }
    /**
     * Sets the organizationSettings property value. The Cloud PC organization settings for a tenant.
     * @param value Value to set for the organizationSettings property.
     * @return a void
     */
    public void setOrganizationSettings(@javax.annotation.Nullable final CloudPcOrganizationSettings value) {
        this._organizationSettings = value;
    }
    /**
     * Sets the provisioningPolicies property value. Cloud PC provisioning policy.
     * @param value Value to set for the provisioningPolicies property.
     * @return a void
     */
    public void setProvisioningPolicies(@javax.annotation.Nullable final java.util.List<CloudPcProvisioningPolicy> value) {
        this._provisioningPolicies = value;
    }
    /**
     * Sets the servicePlans property value. Cloud PC service plans.
     * @param value Value to set for the servicePlans property.
     * @return a void
     */
    public void setServicePlans(@javax.annotation.Nullable final java.util.List<CloudPcServicePlan> value) {
        this._servicePlans = value;
    }
    /**
     * Sets the snapshots property value. Cloud PC snapshots.
     * @param value Value to set for the snapshots property.
     * @return a void
     */
    public void setSnapshots(@javax.annotation.Nullable final java.util.List<CloudPcSnapshot> value) {
        this._snapshots = value;
    }
    /**
     * Sets the supportedRegions property value. Cloud PC supported regions.
     * @param value Value to set for the supportedRegions property.
     * @return a void
     */
    public void setSupportedRegions(@javax.annotation.Nullable final java.util.List<CloudPcSupportedRegion> value) {
        this._supportedRegions = value;
    }
    /**
     * Sets the userSettings property value. Cloud PC user settings.
     * @param value Value to set for the userSettings property.
     * @return a void
     */
    public void setUserSettings(@javax.annotation.Nullable final java.util.List<CloudPcUserSetting> value) {
        this._userSettings = value;
    }
}
