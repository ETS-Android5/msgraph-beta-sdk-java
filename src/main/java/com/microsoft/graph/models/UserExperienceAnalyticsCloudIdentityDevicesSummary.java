package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics work from anywhere cloud identity devices summary. */
public class UserExperienceAnalyticsCloudIdentityDevicesSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The count of devices that are not cloud identity. */
    private Integer _deviceWithoutCloudIdentityCount;
    /**
     * Instantiates a new userExperienceAnalyticsCloudIdentityDevicesSummary and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsCloudIdentityDevicesSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsCloudIdentityDevicesSummary
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsCloudIdentityDevicesSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsCloudIdentityDevicesSummary();
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
     * Gets the deviceWithoutCloudIdentityCount property value. The count of devices that are not cloud identity.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceWithoutCloudIdentityCount() {
        return this._deviceWithoutCloudIdentityCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsCloudIdentityDevicesSummary currentObject = this;
        return new HashMap<>(1) {{
            this.put("deviceWithoutCloudIdentityCount", (n) -> { currentObject.setDeviceWithoutCloudIdentityCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("deviceWithoutCloudIdentityCount", this.getDeviceWithoutCloudIdentityCount());
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
     * Sets the deviceWithoutCloudIdentityCount property value. The count of devices that are not cloud identity.
     * @param value Value to set for the deviceWithoutCloudIdentityCount property.
     * @return a void
     */
    public void setDeviceWithoutCloudIdentityCount(@javax.annotation.Nullable final Integer value) {
        this._deviceWithoutCloudIdentityCount = value;
    }
}
