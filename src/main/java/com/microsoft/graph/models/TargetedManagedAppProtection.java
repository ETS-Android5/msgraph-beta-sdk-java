package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TargetedManagedAppProtection extends ManagedAppProtection implements Parsable {
    /** Public Apps selection: group or individual. Possible values are: selectedPublicApps, allCoreMicrosoftApps, allMicrosoftApps, allApps. */
    private TargetedManagedAppGroupType _appGroupType;
    /** Navigation property to list of inclusion and exclusion groups to which the policy is deployed. */
    private java.util.List<TargetedManagedAppPolicyAssignment> _assignments;
    /** Indicates if the policy is deployed to any inclusion groups or not. */
    private Boolean _isAssigned;
    /** The intended app management levels for this policy. Possible values are: unspecified, unmanaged, mdm, androidEnterprise. */
    private AppManagementLevel _targetedAppManagementLevels;
    /**
     * Instantiates a new targetedManagedAppProtection and sets the default values.
     * @return a void
     */
    public TargetedManagedAppProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a targetedManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static TargetedManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetedManagedAppProtection();
    }
    /**
     * Gets the appGroupType property value. Public Apps selection: group or individual. Possible values are: selectedPublicApps, allCoreMicrosoftApps, allMicrosoftApps, allApps.
     * @return a targetedManagedAppGroupType
     */
    @javax.annotation.Nullable
    public TargetedManagedAppGroupType getAppGroupType() {
        return this._appGroupType;
    }
    /**
     * Gets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @return a targetedManagedAppPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TargetedManagedAppProtection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appGroupType", (n) -> { currentObject.setAppGroupType(n.getEnumValue(TargetedManagedAppGroupType.class)); });
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
            this.put("isAssigned", (n) -> { currentObject.setIsAssigned(n.getBooleanValue()); });
            this.put("targetedAppManagementLevels", (n) -> { currentObject.setTargetedAppManagementLevels(n.getEnumValue(AppManagementLevel.class)); });
        }};
    }
    /**
     * Gets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this._isAssigned;
    }
    /**
     * Gets the targetedAppManagementLevels property value. The intended app management levels for this policy. Possible values are: unspecified, unmanaged, mdm, androidEnterprise.
     * @return a appManagementLevel
     */
    @javax.annotation.Nullable
    public AppManagementLevel getTargetedAppManagementLevels() {
        return this._targetedAppManagementLevels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("appGroupType", this.getAppGroupType());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
        writer.writeEnumValue("targetedAppManagementLevels", this.getTargetedAppManagementLevels());
    }
    /**
     * Sets the appGroupType property value. Public Apps selection: group or individual. Possible values are: selectedPublicApps, allCoreMicrosoftApps, allMicrosoftApps, allApps.
     * @param value Value to set for the appGroupType property.
     * @return a void
     */
    public void setAppGroupType(@javax.annotation.Nullable final TargetedManagedAppGroupType value) {
        this._appGroupType = value;
    }
    /**
     * Sets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this._isAssigned = value;
    }
    /**
     * Sets the targetedAppManagementLevels property value. The intended app management levels for this policy. Possible values are: unspecified, unmanaged, mdm, androidEnterprise.
     * @param value Value to set for the targetedAppManagementLevels property.
     * @return a void
     */
    public void setTargetedAppManagementLevels(@javax.annotation.Nullable final AppManagementLevel value) {
        this._targetedAppManagementLevels = value;
    }
}
