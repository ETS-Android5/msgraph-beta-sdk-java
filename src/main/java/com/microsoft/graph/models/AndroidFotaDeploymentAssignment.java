package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Describes deployment security group to assign a deployment to. The backend will expand the security Group ID to extract device serial numbers prior sending a create deployment request to Zebra. */
public class AndroidFotaDeploymentAssignment implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Key for the Android FOTA Assignment entity */
    private String _id;
    /** The AAD Group we are deploying firmware updates to */
    private AndroidFotaDeploymentAssignmentTarget _target;
    /**
     * Instantiates a new androidFotaDeploymentAssignment and sets the default values.
     * @return a void
     */
    public AndroidFotaDeploymentAssignment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidFotaDeploymentAssignment
     */
    @javax.annotation.Nonnull
    public static AndroidFotaDeploymentAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidFotaDeploymentAssignment();
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
        final AndroidFotaDeploymentAssignment currentObject = this;
        return new HashMap<>(2) {{
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(AndroidFotaDeploymentAssignmentTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the id property value. Key for the Android FOTA Assignment entity
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the target property value. The AAD Group we are deploying firmware updates to
     * @return a androidFotaDeploymentAssignmentTarget
     */
    @javax.annotation.Nullable
    public AndroidFotaDeploymentAssignmentTarget getTarget() {
        return this._target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("target", this.getTarget());
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
     * Sets the id property value. Key for the Android FOTA Assignment entity
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the target property value. The AAD Group we are deploying firmware updates to
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final AndroidFotaDeploymentAssignmentTarget value) {
        this._target = value;
    }
}
