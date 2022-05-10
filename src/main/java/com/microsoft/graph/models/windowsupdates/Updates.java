package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class Updates extends Entity implements Parsable {
    /** Catalog of content that can be approved for deployment by the deployment service. Read-only. */
    private Catalog _catalog;
    /** Deployments created using the deployment service. Read-only. */
    private java.util.List<Deployment> _deployments;
    /** Assets registered with the deployment service that can receive updates. Read-only. */
    private java.util.List<UpdatableAsset> _updatableAssets;
    /**
     * Instantiates a new updates and sets the default values.
     * @return a void
     */
    public Updates() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updates
     */
    @javax.annotation.Nonnull
    public static Updates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Updates();
    }
    /**
     * Gets the catalog property value. Catalog of content that can be approved for deployment by the deployment service. Read-only.
     * @return a catalog
     */
    @javax.annotation.Nullable
    public Catalog getCatalog() {
        return this._catalog;
    }
    /**
     * Gets the deployments property value. Deployments created using the deployment service. Read-only.
     * @return a deployment
     */
    @javax.annotation.Nullable
    public java.util.List<Deployment> getDeployments() {
        return this._deployments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Updates currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("catalog", (n) -> { currentObject.setCatalog(n.getObjectValue(Catalog::createFromDiscriminatorValue)); });
            this.put("deployments", (n) -> { currentObject.setDeployments(n.getCollectionOfObjectValues(Deployment::createFromDiscriminatorValue)); });
            this.put("updatableAssets", (n) -> { currentObject.setUpdatableAssets(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the updatableAssets property value. Assets registered with the deployment service that can receive updates. Read-only.
     * @return a updatableAsset
     */
    @javax.annotation.Nullable
    public java.util.List<UpdatableAsset> getUpdatableAssets() {
        return this._updatableAssets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("catalog", this.getCatalog());
        writer.writeCollectionOfObjectValues("deployments", this.getDeployments());
        writer.writeCollectionOfObjectValues("updatableAssets", this.getUpdatableAssets());
    }
    /**
     * Sets the catalog property value. Catalog of content that can be approved for deployment by the deployment service. Read-only.
     * @param value Value to set for the catalog property.
     * @return a void
     */
    public void setCatalog(@javax.annotation.Nullable final Catalog value) {
        this._catalog = value;
    }
    /**
     * Sets the deployments property value. Deployments created using the deployment service. Read-only.
     * @param value Value to set for the deployments property.
     * @return a void
     */
    public void setDeployments(@javax.annotation.Nullable final java.util.List<Deployment> value) {
        this._deployments = value;
    }
    /**
     * Sets the updatableAssets property value. Assets registered with the deployment service that can receive updates. Read-only.
     * @param value Value to set for the updatableAssets property.
     * @return a void
     */
    public void setUpdatableAssets(@javax.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this._updatableAssets = value;
    }
}
