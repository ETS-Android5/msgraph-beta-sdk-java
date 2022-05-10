package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsWorkFromAnywhereModelPerformance extends Entity implements Parsable {
    /** The user experience work from anywhere's cloud identity score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _cloudIdentityScore;
    /** The user experience work from anywhere's cloud management score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _cloudManagementScore;
    /** The user experience work from anywhere's cloud provisioning score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _cloudProvisioningScore;
    /** The health state of the user experience analytics work from anywhere model. Possible values are: unknown, insufficientData, needsAttention, meetingGoals. */
    private UserExperienceAnalyticsHealthState _healthStatus;
    /** The user experience work from anywhere's manufacturer name of the devices. */
    private String _manufacturer;
    /** The user experience work from anywhere's model name of the devices. */
    private String _model;
    /** The user experience work from anywhere's devices count for the model. Valid values -2147483648 to 2147483647 */
    private Integer _modelDeviceCount;
    /** The user experience work from anywhere windows score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _windowsScore;
    /** The user experience work from anywhere overall score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _workFromAnywhereScore;
    /**
     * Instantiates a new userExperienceAnalyticsWorkFromAnywhereModelPerformance and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsWorkFromAnywhereModelPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsWorkFromAnywhereModelPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereModelPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereModelPerformance();
    }
    /**
     * Gets the cloudIdentityScore property value. The user experience work from anywhere's cloud identity score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCloudIdentityScore() {
        return this._cloudIdentityScore;
    }
    /**
     * Gets the cloudManagementScore property value. The user experience work from anywhere's cloud management score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCloudManagementScore() {
        return this._cloudManagementScore;
    }
    /**
     * Gets the cloudProvisioningScore property value. The user experience work from anywhere's cloud provisioning score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCloudProvisioningScore() {
        return this._cloudProvisioningScore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsWorkFromAnywhereModelPerformance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("cloudIdentityScore", (n) -> { currentObject.setCloudIdentityScore(n.getDoubleValue()); });
            this.put("cloudManagementScore", (n) -> { currentObject.setCloudManagementScore(n.getDoubleValue()); });
            this.put("cloudProvisioningScore", (n) -> { currentObject.setCloudProvisioningScore(n.getDoubleValue()); });
            this.put("healthStatus", (n) -> { currentObject.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("modelDeviceCount", (n) -> { currentObject.setModelDeviceCount(n.getIntegerValue()); });
            this.put("windowsScore", (n) -> { currentObject.setWindowsScore(n.getDoubleValue()); });
            this.put("workFromAnywhereScore", (n) -> { currentObject.setWorkFromAnywhereScore(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the healthStatus property value. The health state of the user experience analytics work from anywhere model. Possible values are: unknown, insufficientData, needsAttention, meetingGoals.
     * @return a userExperienceAnalyticsHealthState
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this._healthStatus;
    }
    /**
     * Gets the manufacturer property value. The user experience work from anywhere's manufacturer name of the devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. The user experience work from anywhere's model name of the devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the modelDeviceCount property value. The user experience work from anywhere's devices count for the model. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getModelDeviceCount() {
        return this._modelDeviceCount;
    }
    /**
     * Gets the windowsScore property value. The user experience work from anywhere windows score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWindowsScore() {
        return this._windowsScore;
    }
    /**
     * Gets the workFromAnywhereScore property value. The user experience work from anywhere overall score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWorkFromAnywhereScore() {
        return this._workFromAnywhereScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("cloudIdentityScore", this.getCloudIdentityScore());
        writer.writeDoubleValue("cloudManagementScore", this.getCloudManagementScore());
        writer.writeDoubleValue("cloudProvisioningScore", this.getCloudProvisioningScore());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeIntegerValue("modelDeviceCount", this.getModelDeviceCount());
        writer.writeDoubleValue("windowsScore", this.getWindowsScore());
        writer.writeDoubleValue("workFromAnywhereScore", this.getWorkFromAnywhereScore());
    }
    /**
     * Sets the cloudIdentityScore property value. The user experience work from anywhere's cloud identity score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudIdentityScore property.
     * @return a void
     */
    public void setCloudIdentityScore(@javax.annotation.Nullable final Double value) {
        this._cloudIdentityScore = value;
    }
    /**
     * Sets the cloudManagementScore property value. The user experience work from anywhere's cloud management score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudManagementScore property.
     * @return a void
     */
    public void setCloudManagementScore(@javax.annotation.Nullable final Double value) {
        this._cloudManagementScore = value;
    }
    /**
     * Sets the cloudProvisioningScore property value. The user experience work from anywhere's cloud provisioning score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudProvisioningScore property.
     * @return a void
     */
    public void setCloudProvisioningScore(@javax.annotation.Nullable final Double value) {
        this._cloudProvisioningScore = value;
    }
    /**
     * Sets the healthStatus property value. The health state of the user experience analytics work from anywhere model. Possible values are: unknown, insufficientData, needsAttention, meetingGoals.
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    public void setHealthStatus(@javax.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this._healthStatus = value;
    }
    /**
     * Sets the manufacturer property value. The user experience work from anywhere's manufacturer name of the devices.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. The user experience work from anywhere's model name of the devices.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the modelDeviceCount property value. The user experience work from anywhere's devices count for the model. Valid values -2147483648 to 2147483647
     * @param value Value to set for the modelDeviceCount property.
     * @return a void
     */
    public void setModelDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._modelDeviceCount = value;
    }
    /**
     * Sets the windowsScore property value. The user experience work from anywhere windows score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the windowsScore property.
     * @return a void
     */
    public void setWindowsScore(@javax.annotation.Nullable final Double value) {
        this._windowsScore = value;
    }
    /**
     * Sets the workFromAnywhereScore property value. The user experience work from anywhere overall score for the model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the workFromAnywhereScore property.
     * @return a void
     */
    public void setWorkFromAnywhereScore(@javax.annotation.Nullable final Double value) {
        this._workFromAnywhereScore = value;
    }
}
