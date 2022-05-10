package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleAssignment extends Entity implements Parsable {
    /** Description of the Role Assignment. */
    private String _description;
    /** The display or friendly name of the role Assignment. */
    private String _displayName;
    /** List of ids of role scope member security groups.  These are IDs from Azure Active Directory. */
    private java.util.List<String> _resourceScopes;
    /** Role definition this assignment is part of. */
    private RoleDefinition _roleDefinition;
    /** List of ids of role scope member security groups.  These are IDs from Azure Active Directory. */
    private java.util.List<String> _scopeMembers;
    /** Specifies the type of scope for a Role Assignment. Default type 'ResourceScope' allows assignment of ResourceScopes. For 'AllDevices', 'AllLicensedUsers', and 'AllDevicesAndLicensedUsers', the ResourceScopes property should be left empty. Possible values are: resourceScope, allDevices, allLicensedUsers, allDevicesAndLicensedUsers. */
    private RoleAssignmentScopeType _scopeType;
    /**
     * Instantiates a new roleAssignment and sets the default values.
     * @return a void
     */
    public RoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a roleAssignment
     */
    @javax.annotation.Nonnull
    public static RoleAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleAssignment();
    }
    /**
     * Gets the description property value. Description of the Role Assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display or friendly name of the role Assignment.
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
        final RoleAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("resourceScopes", (n) -> { currentObject.setResourceScopes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(RoleDefinition::createFromDiscriminatorValue)); });
            this.put("scopeMembers", (n) -> { currentObject.setScopeMembers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("scopeType", (n) -> { currentObject.setScopeType(n.getEnumValue(RoleAssignmentScopeType.class)); });
        }};
    }
    /**
     * Gets the resourceScopes property value. List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getResourceScopes() {
        return this._resourceScopes;
    }
    /**
     * Gets the roleDefinition property value. Role definition this assignment is part of.
     * @return a roleDefinition
     */
    @javax.annotation.Nullable
    public RoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the scopeMembers property value. List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getScopeMembers() {
        return this._scopeMembers;
    }
    /**
     * Gets the scopeType property value. Specifies the type of scope for a Role Assignment. Default type 'ResourceScope' allows assignment of ResourceScopes. For 'AllDevices', 'AllLicensedUsers', and 'AllDevicesAndLicensedUsers', the ResourceScopes property should be left empty. Possible values are: resourceScope, allDevices, allLicensedUsers, allDevicesAndLicensedUsers.
     * @return a roleAssignmentScopeType
     */
    @javax.annotation.Nullable
    public RoleAssignmentScopeType getScopeType() {
        return this._scopeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("resourceScopes", this.getResourceScopes());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeCollectionOfPrimitiveValues("scopeMembers", this.getScopeMembers());
        writer.writeEnumValue("scopeType", this.getScopeType());
    }
    /**
     * Sets the description property value. Description of the Role Assignment.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display or friendly name of the role Assignment.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the resourceScopes property value. List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     * @param value Value to set for the resourceScopes property.
     * @return a void
     */
    public void setResourceScopes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._resourceScopes = value;
    }
    /**
     * Sets the roleDefinition property value. Role definition this assignment is part of.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    public void setRoleDefinition(@javax.annotation.Nullable final RoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the scopeMembers property value. List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     * @param value Value to set for the scopeMembers property.
     * @return a void
     */
    public void setScopeMembers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._scopeMembers = value;
    }
    /**
     * Sets the scopeType property value. Specifies the type of scope for a Role Assignment. Default type 'ResourceScope' allows assignment of ResourceScopes. For 'AllDevices', 'AllLicensedUsers', and 'AllDevicesAndLicensedUsers', the ResourceScopes property should be left empty. Possible values are: resourceScope, allDevices, allLicensedUsers, allDevicesAndLicensedUsers.
     * @param value Value to set for the scopeType property.
     * @return a void
     */
    public void setScopeType(@javax.annotation.Nullable final RoleAssignmentScopeType value) {
        this._scopeType = value;
    }
}
