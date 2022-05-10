package microsoft.graph.deviceappmanagement.policysets.getpolicysets;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getPolicySets method. */
public class GetPolicySetsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The policySetIds property */
    private java.util.List<String> _policySetIds;
    /**
     * Instantiates a new getPolicySetsRequestBody and sets the default values.
     * @return a void
     */
    public GetPolicySetsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getPolicySetsRequestBody
     */
    @javax.annotation.Nonnull
    public static GetPolicySetsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetPolicySetsRequestBody();
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
        final GetPolicySetsRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("policySetIds", (n) -> { currentObject.setPolicySetIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the policySetIds property value. The policySetIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPolicySetIds() {
        return this._policySetIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("policySetIds", this.getPolicySetIds());
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
     * Sets the policySetIds property value. The policySetIds property
     * @param value Value to set for the policySetIds property.
     * @return a void
     */
    public void setPolicySetIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._policySetIds = value;
    }
}
