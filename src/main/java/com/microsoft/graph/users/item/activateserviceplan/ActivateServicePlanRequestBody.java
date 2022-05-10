package microsoft.graph.users.item.activateserviceplan;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the activateServicePlan method. */
public class ActivateServicePlanRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The servicePlanId property */
    private String _servicePlanId;
    /** The skuId property */
    private String _skuId;
    /**
     * Instantiates a new activateServicePlanRequestBody and sets the default values.
     * @return a void
     */
    public ActivateServicePlanRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a activateServicePlanRequestBody
     */
    @javax.annotation.Nonnull
    public static ActivateServicePlanRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivateServicePlanRequestBody();
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
        final ActivateServicePlanRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("servicePlanId", (n) -> { currentObject.setServicePlanId(n.getStringValue()); });
            this.put("skuId", (n) -> { currentObject.setSkuId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the servicePlanId property value. The servicePlanId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanId() {
        return this._servicePlanId;
    }
    /**
     * Gets the skuId property value. The skuId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuId() {
        return this._skuId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
        writer.writeStringValue("skuId", this.getSkuId());
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
     * Sets the servicePlanId property value. The servicePlanId property
     * @param value Value to set for the servicePlanId property.
     * @return a void
     */
    public void setServicePlanId(@javax.annotation.Nullable final String value) {
        this._servicePlanId = value;
    }
    /**
     * Sets the skuId property value. The skuId property
     * @param value Value to set for the skuId property.
     * @return a void
     */
    public void setSkuId(@javax.annotation.Nullable final String value) {
        this._skuId = value;
    }
}
