package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExpressionEvaluationDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Represents expression which has been evaluated. */
    private String _expression;
    /** Represents the details of the evaluation of the expression. */
    private java.util.List<ExpressionEvaluationDetails> _expressionEvaluationDetails;
    /** Represents the value of the result of the current expression. */
    private Boolean _expressionResult;
    /** Defines the name of the property and the value of that property. */
    private PropertyToEvaluate _propertyToEvaluate;
    /**
     * Instantiates a new expressionEvaluationDetails and sets the default values.
     * @return a void
     */
    public ExpressionEvaluationDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a expressionEvaluationDetails
     */
    @javax.annotation.Nonnull
    public static ExpressionEvaluationDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpressionEvaluationDetails();
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
     * Gets the expression property value. Represents expression which has been evaluated.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExpression() {
        return this._expression;
    }
    /**
     * Gets the expressionEvaluationDetails property value. Represents the details of the evaluation of the expression.
     * @return a expressionEvaluationDetails
     */
    @javax.annotation.Nullable
    public java.util.List<ExpressionEvaluationDetails> getExpressionEvaluationDetails() {
        return this._expressionEvaluationDetails;
    }
    /**
     * Gets the expressionResult property value. Represents the value of the result of the current expression.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExpressionResult() {
        return this._expressionResult;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExpressionEvaluationDetails currentObject = this;
        return new HashMap<>(4) {{
            this.put("expression", (n) -> { currentObject.setExpression(n.getStringValue()); });
            this.put("expressionEvaluationDetails", (n) -> { currentObject.setExpressionEvaluationDetails(n.getCollectionOfObjectValues(ExpressionEvaluationDetails::createFromDiscriminatorValue)); });
            this.put("expressionResult", (n) -> { currentObject.setExpressionResult(n.getBooleanValue()); });
            this.put("propertyToEvaluate", (n) -> { currentObject.setPropertyToEvaluate(n.getObjectValue(PropertyToEvaluate::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the propertyToEvaluate property value. Defines the name of the property and the value of that property.
     * @return a propertyToEvaluate
     */
    @javax.annotation.Nullable
    public PropertyToEvaluate getPropertyToEvaluate() {
        return this._propertyToEvaluate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expression", this.getExpression());
        writer.writeCollectionOfObjectValues("expressionEvaluationDetails", this.getExpressionEvaluationDetails());
        writer.writeBooleanValue("expressionResult", this.getExpressionResult());
        writer.writeObjectValue("propertyToEvaluate", this.getPropertyToEvaluate());
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
     * Sets the expression property value. Represents expression which has been evaluated.
     * @param value Value to set for the expression property.
     * @return a void
     */
    public void setExpression(@javax.annotation.Nullable final String value) {
        this._expression = value;
    }
    /**
     * Sets the expressionEvaluationDetails property value. Represents the details of the evaluation of the expression.
     * @param value Value to set for the expressionEvaluationDetails property.
     * @return a void
     */
    public void setExpressionEvaluationDetails(@javax.annotation.Nullable final java.util.List<ExpressionEvaluationDetails> value) {
        this._expressionEvaluationDetails = value;
    }
    /**
     * Sets the expressionResult property value. Represents the value of the result of the current expression.
     * @param value Value to set for the expressionResult property.
     * @return a void
     */
    public void setExpressionResult(@javax.annotation.Nullable final Boolean value) {
        this._expressionResult = value;
    }
    /**
     * Sets the propertyToEvaluate property value. Defines the name of the property and the value of that property.
     * @param value Value to set for the propertyToEvaluate property.
     * @return a void
     */
    public void setPropertyToEvaluate(@javax.annotation.Nullable final PropertyToEvaluate value) {
        this._propertyToEvaluate = value;
    }
}
