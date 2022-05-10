package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DriveItemSource implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Enumeration value that indicates the source application where the file was created. */
    private DriveItemSourceApplication _application;
    /** The external identifier for the drive item from the source. */
    private String _externalId;
    /**
     * Instantiates a new driveItemSource and sets the default values.
     * @return a void
     */
    public DriveItemSource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a driveItemSource
     */
    @javax.annotation.Nonnull
    public static DriveItemSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveItemSource();
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
     * Gets the application property value. Enumeration value that indicates the source application where the file was created.
     * @return a driveItemSourceApplication
     */
    @javax.annotation.Nullable
    public DriveItemSourceApplication getApplication() {
        return this._application;
    }
    /**
     * Gets the externalId property value. The external identifier for the drive item from the source.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DriveItemSource currentObject = this;
        return new HashMap<>(2) {{
            this.put("application", (n) -> { currentObject.setApplication(n.getEnumValue(DriveItemSourceApplication.class)); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("application", this.getApplication());
        writer.writeStringValue("externalId", this.getExternalId());
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
     * Sets the application property value. Enumeration value that indicates the source application where the file was created.
     * @param value Value to set for the application property.
     * @return a void
     */
    public void setApplication(@javax.annotation.Nullable final DriveItemSourceApplication value) {
        this._application = value;
    }
    /**
     * Sets the externalId property value. The external identifier for the drive item from the source.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
}
