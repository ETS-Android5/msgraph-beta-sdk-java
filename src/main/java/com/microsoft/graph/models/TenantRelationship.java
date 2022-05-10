package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.managedtenants.ManagedTenant;
/** Provides operations to manage the tenantRelationship singleton. */
public class TenantRelationship extends Entity implements Parsable {
    /** The customer who has a delegated admin relationship with a Microsoft partner. */
    private java.util.List<DelegatedAdminCustomer> _delegatedAdminCustomers;
    /** The details of the delegated administrative privileges that a Microsoft partner has in a customer tenant. */
    private java.util.List<DelegatedAdminRelationship> _delegatedAdminRelationships;
    /** The operations available to interact with the multi-tenant management platform. */
    private ManagedTenant _managedTenants;
    /**
     * Instantiates a new tenantRelationship and sets the default values.
     * @return a void
     */
    public TenantRelationship() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantRelationship
     */
    @javax.annotation.Nonnull
    public static TenantRelationship createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantRelationship();
    }
    /**
     * Gets the delegatedAdminCustomers property value. The customer who has a delegated admin relationship with a Microsoft partner.
     * @return a delegatedAdminCustomer
     */
    @javax.annotation.Nullable
    public java.util.List<DelegatedAdminCustomer> getDelegatedAdminCustomers() {
        return this._delegatedAdminCustomers;
    }
    /**
     * Gets the delegatedAdminRelationships property value. The details of the delegated administrative privileges that a Microsoft partner has in a customer tenant.
     * @return a delegatedAdminRelationship
     */
    @javax.annotation.Nullable
    public java.util.List<DelegatedAdminRelationship> getDelegatedAdminRelationships() {
        return this._delegatedAdminRelationships;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantRelationship currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("delegatedAdminCustomers", (n) -> { currentObject.setDelegatedAdminCustomers(n.getCollectionOfObjectValues(DelegatedAdminCustomer::createFromDiscriminatorValue)); });
            this.put("delegatedAdminRelationships", (n) -> { currentObject.setDelegatedAdminRelationships(n.getCollectionOfObjectValues(DelegatedAdminRelationship::createFromDiscriminatorValue)); });
            this.put("managedTenants", (n) -> { currentObject.setManagedTenants(n.getObjectValue(ManagedTenant::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the managedTenants property value. The operations available to interact with the multi-tenant management platform.
     * @return a managedTenant
     */
    @javax.annotation.Nullable
    public ManagedTenant getManagedTenants() {
        return this._managedTenants;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("delegatedAdminCustomers", this.getDelegatedAdminCustomers());
        writer.writeCollectionOfObjectValues("delegatedAdminRelationships", this.getDelegatedAdminRelationships());
        writer.writeObjectValue("managedTenants", this.getManagedTenants());
    }
    /**
     * Sets the delegatedAdminCustomers property value. The customer who has a delegated admin relationship with a Microsoft partner.
     * @param value Value to set for the delegatedAdminCustomers property.
     * @return a void
     */
    public void setDelegatedAdminCustomers(@javax.annotation.Nullable final java.util.List<DelegatedAdminCustomer> value) {
        this._delegatedAdminCustomers = value;
    }
    /**
     * Sets the delegatedAdminRelationships property value. The details of the delegated administrative privileges that a Microsoft partner has in a customer tenant.
     * @param value Value to set for the delegatedAdminRelationships property.
     * @return a void
     */
    public void setDelegatedAdminRelationships(@javax.annotation.Nullable final java.util.List<DelegatedAdminRelationship> value) {
        this._delegatedAdminRelationships = value;
    }
    /**
     * Sets the managedTenants property value. The operations available to interact with the multi-tenant management platform.
     * @param value Value to set for the managedTenants property.
     * @return a void
     */
    public void setManagedTenants(@javax.annotation.Nullable final ManagedTenant value) {
        this._managedTenants = value;
    }
}
