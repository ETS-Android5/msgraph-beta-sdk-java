package microsoft.graph.devicemanagement.assignmentfilters.validatefilter;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DeviceAndAppManagementAssignmentFilter;
/** Provides operations to call the validateFilter method. */
public class ValidateFilterRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deviceAndAppManagementAssignmentFilter property */
    private DeviceAndAppManagementAssignmentFilter _deviceAndAppManagementAssignmentFilter;
    /**
     * Instantiates a new validateFilterRequestBody and sets the default values.
     * @return a void
     */
    public ValidateFilterRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validateFilterRequestBody
     */
    @javax.annotation.Nonnull
    public static ValidateFilterRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateFilterRequestBody();
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
     * Gets the deviceAndAppManagementAssignmentFilter property value. The deviceAndAppManagementAssignmentFilter property
     * @return a deviceAndAppManagementAssignmentFilter
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilter getDeviceAndAppManagementAssignmentFilter() {
        return this._deviceAndAppManagementAssignmentFilter;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ValidateFilterRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("deviceAndAppManagementAssignmentFilter", (n) -> { currentObject.setDeviceAndAppManagementAssignmentFilter(n.getObjectValue(DeviceAndAppManagementAssignmentFilter::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("deviceAndAppManagementAssignmentFilter", this.getDeviceAndAppManagementAssignmentFilter());
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
     * Sets the deviceAndAppManagementAssignmentFilter property value. The deviceAndAppManagementAssignmentFilter property
     * @param value Value to set for the deviceAndAppManagementAssignmentFilter property.
     * @return a void
     */
    public void setDeviceAndAppManagementAssignmentFilter(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentFilter value) {
        this._deviceAndAppManagementAssignmentFilter = value;
    }
}
