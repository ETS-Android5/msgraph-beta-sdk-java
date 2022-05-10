package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceComplianceScriptRule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Data type specified in the rule. Possible values are: none, boolean, int64, double, string, dateTime, version, base64, xml, booleanArray, int64Array, doubleArray, stringArray, dateTimeArray, versionArray. */
    private DataType _dataType;
    /** Data type specified in the rule. Possible values are: none, boolean, int64, double, string, dateTime, version, base64, xml, booleanArray, int64Array, doubleArray, stringArray, dateTimeArray, versionArray. */
    private DeviceComplianceScriptRuleDataType _deviceComplianceScriptRuleDataType;
    /** Operator specified in the rule. Possible values are: none, and, or, isEquals, notEquals, greaterThan, lessThan, between, notBetween, greaterEquals, lessEquals, dayTimeBetween, beginsWith, notBeginsWith, endsWith, notEndsWith, contains, notContains, allOf, oneOf, noneOf, setEquals, orderedSetEquals, subsetOf, excludesAll. */
    private DeviceComplianceScriptRulOperator _deviceComplianceScriptRulOperator;
    /** Operand specified in the rule. */
    private String _operand;
    /** Operator specified in the rule. Possible values are: none, and, or, isEquals, notEquals, greaterThan, lessThan, between, notBetween, greaterEquals, lessEquals, dayTimeBetween, beginsWith, notBeginsWith, endsWith, notEndsWith, contains, notContains, allOf, oneOf, noneOf, setEquals, orderedSetEquals, subsetOf, excludesAll. */
    private Operator _operator;
    /** Setting name specified in the rule. */
    private String _settingName;
    /**
     * Instantiates a new deviceComplianceScriptRule and sets the default values.
     * @return a void
     */
    public DeviceComplianceScriptRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptRule
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceScriptRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptRule();
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
     * Gets the dataType property value. Data type specified in the rule. Possible values are: none, boolean, int64, double, string, dateTime, version, base64, xml, booleanArray, int64Array, doubleArray, stringArray, dateTimeArray, versionArray.
     * @return a dataType
     */
    @javax.annotation.Nullable
    public DataType getDataType() {
        return this._dataType;
    }
    /**
     * Gets the deviceComplianceScriptRuleDataType property value. Data type specified in the rule. Possible values are: none, boolean, int64, double, string, dateTime, version, base64, xml, booleanArray, int64Array, doubleArray, stringArray, dateTimeArray, versionArray.
     * @return a deviceComplianceScriptRuleDataType
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptRuleDataType getDeviceComplianceScriptRuleDataType() {
        return this._deviceComplianceScriptRuleDataType;
    }
    /**
     * Gets the deviceComplianceScriptRulOperator property value. Operator specified in the rule. Possible values are: none, and, or, isEquals, notEquals, greaterThan, lessThan, between, notBetween, greaterEquals, lessEquals, dayTimeBetween, beginsWith, notBeginsWith, endsWith, notEndsWith, contains, notContains, allOf, oneOf, noneOf, setEquals, orderedSetEquals, subsetOf, excludesAll.
     * @return a deviceComplianceScriptRulOperator
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptRulOperator getDeviceComplianceScriptRulOperator() {
        return this._deviceComplianceScriptRulOperator;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceComplianceScriptRule currentObject = this;
        return new HashMap<>(6) {{
            this.put("dataType", (n) -> { currentObject.setDataType(n.getEnumValue(DataType.class)); });
            this.put("deviceComplianceScriptRuleDataType", (n) -> { currentObject.setDeviceComplianceScriptRuleDataType(n.getEnumValue(DeviceComplianceScriptRuleDataType.class)); });
            this.put("deviceComplianceScriptRulOperator", (n) -> { currentObject.setDeviceComplianceScriptRulOperator(n.getEnumValue(DeviceComplianceScriptRulOperator.class)); });
            this.put("operand", (n) -> { currentObject.setOperand(n.getStringValue()); });
            this.put("operator", (n) -> { currentObject.setOperator(n.getEnumValue(Operator.class)); });
            this.put("settingName", (n) -> { currentObject.setSettingName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the operand property value. Operand specified in the rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperand() {
        return this._operand;
    }
    /**
     * Gets the operator property value. Operator specified in the rule. Possible values are: none, and, or, isEquals, notEquals, greaterThan, lessThan, between, notBetween, greaterEquals, lessEquals, dayTimeBetween, beginsWith, notBeginsWith, endsWith, notEndsWith, contains, notContains, allOf, oneOf, noneOf, setEquals, orderedSetEquals, subsetOf, excludesAll.
     * @return a operator
     */
    @javax.annotation.Nullable
    public Operator getOperator() {
        return this._operator;
    }
    /**
     * Gets the settingName property value. Setting name specified in the rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this._settingName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("dataType", this.getDataType());
        writer.writeEnumValue("deviceComplianceScriptRuleDataType", this.getDeviceComplianceScriptRuleDataType());
        writer.writeEnumValue("deviceComplianceScriptRulOperator", this.getDeviceComplianceScriptRulOperator());
        writer.writeStringValue("operand", this.getOperand());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeStringValue("settingName", this.getSettingName());
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
     * Sets the dataType property value. Data type specified in the rule. Possible values are: none, boolean, int64, double, string, dateTime, version, base64, xml, booleanArray, int64Array, doubleArray, stringArray, dateTimeArray, versionArray.
     * @param value Value to set for the dataType property.
     * @return a void
     */
    public void setDataType(@javax.annotation.Nullable final DataType value) {
        this._dataType = value;
    }
    /**
     * Sets the deviceComplianceScriptRuleDataType property value. Data type specified in the rule. Possible values are: none, boolean, int64, double, string, dateTime, version, base64, xml, booleanArray, int64Array, doubleArray, stringArray, dateTimeArray, versionArray.
     * @param value Value to set for the deviceComplianceScriptRuleDataType property.
     * @return a void
     */
    public void setDeviceComplianceScriptRuleDataType(@javax.annotation.Nullable final DeviceComplianceScriptRuleDataType value) {
        this._deviceComplianceScriptRuleDataType = value;
    }
    /**
     * Sets the deviceComplianceScriptRulOperator property value. Operator specified in the rule. Possible values are: none, and, or, isEquals, notEquals, greaterThan, lessThan, between, notBetween, greaterEquals, lessEquals, dayTimeBetween, beginsWith, notBeginsWith, endsWith, notEndsWith, contains, notContains, allOf, oneOf, noneOf, setEquals, orderedSetEquals, subsetOf, excludesAll.
     * @param value Value to set for the deviceComplianceScriptRulOperator property.
     * @return a void
     */
    public void setDeviceComplianceScriptRulOperator(@javax.annotation.Nullable final DeviceComplianceScriptRulOperator value) {
        this._deviceComplianceScriptRulOperator = value;
    }
    /**
     * Sets the operand property value. Operand specified in the rule.
     * @param value Value to set for the operand property.
     * @return a void
     */
    public void setOperand(@javax.annotation.Nullable final String value) {
        this._operand = value;
    }
    /**
     * Sets the operator property value. Operator specified in the rule. Possible values are: none, and, or, isEquals, notEquals, greaterThan, lessThan, between, notBetween, greaterEquals, lessEquals, dayTimeBetween, beginsWith, notBeginsWith, endsWith, notEndsWith, contains, notContains, allOf, oneOf, noneOf, setEquals, orderedSetEquals, subsetOf, excludesAll.
     * @param value Value to set for the operator property.
     * @return a void
     */
    public void setOperator(@javax.annotation.Nullable final Operator value) {
        this._operator = value;
    }
    /**
     * Sets the settingName property value. Setting name specified in the rule.
     * @param value Value to set for the settingName property.
     * @return a void
     */
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this._settingName = value;
    }
}
