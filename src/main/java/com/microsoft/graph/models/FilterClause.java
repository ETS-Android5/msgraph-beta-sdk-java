package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FilterClause implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the operator to be applied to the source and target operands. Must be one of the supported operators. Supported operators can be discovered. */
    private String _operatorName;
    /** Name of source operand (the operand being tested). The source operand name must match one of the attribute names on the source object. */
    private String _sourceOperandName;
    /** Values that the source operand will be tested against. */
    private FilterOperand _targetOperand;
    /**
     * Instantiates a new filterClause and sets the default values.
     * @return a void
     */
    public FilterClause() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a filterClause
     */
    @javax.annotation.Nonnull
    public static FilterClause createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilterClause();
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
        final FilterClause currentObject = this;
        return new HashMap<>(3) {{
            this.put("operatorName", (n) -> { currentObject.setOperatorName(n.getStringValue()); });
            this.put("sourceOperandName", (n) -> { currentObject.setSourceOperandName(n.getStringValue()); });
            this.put("targetOperand", (n) -> { currentObject.setTargetOperand(n.getObjectValue(FilterOperand::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the operatorName property value. Name of the operator to be applied to the source and target operands. Must be one of the supported operators. Supported operators can be discovered.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatorName() {
        return this._operatorName;
    }
    /**
     * Gets the sourceOperandName property value. Name of source operand (the operand being tested). The source operand name must match one of the attribute names on the source object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceOperandName() {
        return this._sourceOperandName;
    }
    /**
     * Gets the targetOperand property value. Values that the source operand will be tested against.
     * @return a filterOperand
     */
    @javax.annotation.Nullable
    public FilterOperand getTargetOperand() {
        return this._targetOperand;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("operatorName", this.getOperatorName());
        writer.writeStringValue("sourceOperandName", this.getSourceOperandName());
        writer.writeObjectValue("targetOperand", this.getTargetOperand());
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
     * Sets the operatorName property value. Name of the operator to be applied to the source and target operands. Must be one of the supported operators. Supported operators can be discovered.
     * @param value Value to set for the operatorName property.
     * @return a void
     */
    public void setOperatorName(@javax.annotation.Nullable final String value) {
        this._operatorName = value;
    }
    /**
     * Sets the sourceOperandName property value. Name of source operand (the operand being tested). The source operand name must match one of the attribute names on the source object.
     * @param value Value to set for the sourceOperandName property.
     * @return a void
     */
    public void setSourceOperandName(@javax.annotation.Nullable final String value) {
        this._sourceOperandName = value;
    }
    /**
     * Sets the targetOperand property value. Values that the source operand will be tested against.
     * @param value Value to set for the targetOperand property.
     * @return a void
     */
    public void setTargetOperand(@javax.annotation.Nullable final FilterOperand value) {
        this._targetOperand = value;
    }
}
