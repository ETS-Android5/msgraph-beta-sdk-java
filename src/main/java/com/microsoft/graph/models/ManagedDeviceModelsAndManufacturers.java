package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Models and Manufactures meatadata for managed devices in the account */
public class ManagedDeviceModelsAndManufacturers implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of Manufactures for managed devices in the account */
    private java.util.List<String> _deviceManufacturers;
    /** List of Models for managed devices in the account */
    private java.util.List<String> _deviceModels;
    /**
     * Instantiates a new managedDeviceModelsAndManufacturers and sets the default values.
     * @return a void
     */
    public ManagedDeviceModelsAndManufacturers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceModelsAndManufacturers
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceModelsAndManufacturers createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceModelsAndManufacturers();
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
     * Gets the deviceManufacturers property value. List of Manufactures for managed devices in the account
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDeviceManufacturers() {
        return this._deviceManufacturers;
    }
    /**
     * Gets the deviceModels property value. List of Models for managed devices in the account
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDeviceModels() {
        return this._deviceModels;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDeviceModelsAndManufacturers currentObject = this;
        return new HashMap<>(2) {{
            this.put("deviceManufacturers", (n) -> { currentObject.setDeviceManufacturers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("deviceModels", (n) -> { currentObject.setDeviceModels(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("deviceManufacturers", this.getDeviceManufacturers());
        writer.writeCollectionOfPrimitiveValues("deviceModels", this.getDeviceModels());
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
     * Sets the deviceManufacturers property value. List of Manufactures for managed devices in the account
     * @param value Value to set for the deviceManufacturers property.
     * @return a void
     */
    public void setDeviceManufacturers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._deviceManufacturers = value;
    }
    /**
     * Sets the deviceModels property value. List of Models for managed devices in the account
     * @param value Value to set for the deviceModels property.
     * @return a void
     */
    public void setDeviceModels(@javax.annotation.Nullable final java.util.List<String> value) {
        this._deviceModels = value;
    }
}
