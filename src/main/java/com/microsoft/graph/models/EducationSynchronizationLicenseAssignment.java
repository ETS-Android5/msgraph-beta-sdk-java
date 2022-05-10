package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationLicenseAssignment implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The user role type to assign to license. Possible values are: student, teacher, faculty. */
    private EducationUserRole _appliesTo;
    /** Represents the SKU identifiers of the licenses to assign. */
    private java.util.List<String> _skuIds;
    /**
     * Instantiates a new educationSynchronizationLicenseAssignment and sets the default values.
     * @return a void
     */
    public EducationSynchronizationLicenseAssignment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSynchronizationLicenseAssignment
     */
    @javax.annotation.Nonnull
    public static EducationSynchronizationLicenseAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationLicenseAssignment();
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
     * Gets the appliesTo property value. The user role type to assign to license. Possible values are: student, teacher, faculty.
     * @return a educationUserRole
     */
    @javax.annotation.Nullable
    public EducationUserRole getAppliesTo() {
        return this._appliesTo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSynchronizationLicenseAssignment currentObject = this;
        return new HashMap<>(2) {{
            this.put("appliesTo", (n) -> { currentObject.setAppliesTo(n.getEnumValue(EducationUserRole.class)); });
            this.put("skuIds", (n) -> { currentObject.setSkuIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the skuIds property value. Represents the SKU identifiers of the licenses to assign.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSkuIds() {
        return this._skuIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appliesTo", this.getAppliesTo());
        writer.writeCollectionOfPrimitiveValues("skuIds", this.getSkuIds());
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
     * Sets the appliesTo property value. The user role type to assign to license. Possible values are: student, teacher, faculty.
     * @param value Value to set for the appliesTo property.
     * @return a void
     */
    public void setAppliesTo(@javax.annotation.Nullable final EducationUserRole value) {
        this._appliesTo = value;
    }
    /**
     * Sets the skuIds property value. Represents the SKU identifiers of the licenses to assign.
     * @param value Value to set for the skuIds property.
     * @return a void
     */
    public void setSkuIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._skuIds = value;
    }
}
