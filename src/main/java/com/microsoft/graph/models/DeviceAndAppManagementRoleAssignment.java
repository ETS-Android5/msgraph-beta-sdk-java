package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceAndAppManagementRoleAssignment extends RoleAssignment implements Parsable {
    /** The list of ids of role member security groups. These are IDs from Azure Active Directory. */
    private java.util.List<String> _members;
    /** The set of Role Scope Tags defined on the Role Assignment. */
    private java.util.List<RoleScopeTag> _roleScopeTags;
    /**
     * Instantiates a new deviceAndAppManagementRoleAssignment and sets the default values.
     * @return a void
     */
    public DeviceAndAppManagementRoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceAndAppManagementRoleAssignment
     */
    @javax.annotation.Nonnull
    public static DeviceAndAppManagementRoleAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAndAppManagementRoleAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceAndAppManagementRoleAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("roleScopeTags", (n) -> { currentObject.setRoleScopeTags(n.getCollectionOfObjectValues(RoleScopeTag::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the members property value. The list of ids of role member security groups. These are IDs from Azure Active Directory.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMembers() {
        return this._members;
    }
    /**
     * Gets the roleScopeTags property value. The set of Role Scope Tags defined on the Role Assignment.
     * @return a roleScopeTag
     */
    @javax.annotation.Nullable
    public java.util.List<RoleScopeTag> getRoleScopeTags() {
        return this._roleScopeTags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("members", this.getMembers());
        writer.writeCollectionOfObjectValues("roleScopeTags", this.getRoleScopeTags());
    }
    /**
     * Sets the members property value. The list of ids of role member security groups. These are IDs from Azure Active Directory.
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._members = value;
    }
    /**
     * Sets the roleScopeTags property value. The set of Role Scope Tags defined on the Role Assignment.
     * @param value Value to set for the roleScopeTags property.
     * @return a void
     */
    public void setRoleScopeTags(@javax.annotation.Nullable final java.util.List<RoleScopeTag> value) {
        this._roleScopeTags = value;
    }
}
