package microsoft.graph.devicemanagement.deviceconfigurations.item.windowsprivacyaccesscontrols;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
/** Provides operations to call the windowsPrivacyAccessControls method. */
public class WindowsPrivacyAccessControlsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The windowsPrivacyAccessControls property */
    private java.util.List<WindowsPrivacyDataAccessControlItem> _windowsPrivacyAccessControls;
    /**
     * Instantiates a new windowsPrivacyAccessControlsRequestBody and sets the default values.
     * @return a void
     */
    public WindowsPrivacyAccessControlsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsPrivacyAccessControlsRequestBody
     */
    @javax.annotation.Nonnull
    public static WindowsPrivacyAccessControlsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPrivacyAccessControlsRequestBody();
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
        final WindowsPrivacyAccessControlsRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("windowsPrivacyAccessControls", (n) -> { currentObject.setWindowsPrivacyAccessControls(n.getCollectionOfObjectValues(WindowsPrivacyDataAccessControlItem::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the windowsPrivacyAccessControls property value. The windowsPrivacyAccessControls property
     * @return a windowsPrivacyDataAccessControlItem
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsPrivacyDataAccessControlItem> getWindowsPrivacyAccessControls() {
        return this._windowsPrivacyAccessControls;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("windowsPrivacyAccessControls", this.getWindowsPrivacyAccessControls());
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
     * Sets the windowsPrivacyAccessControls property value. The windowsPrivacyAccessControls property
     * @param value Value to set for the windowsPrivacyAccessControls property.
     * @return a void
     */
    public void setWindowsPrivacyAccessControls(@javax.annotation.Nullable final java.util.List<WindowsPrivacyDataAccessControlItem> value) {
        this._windowsPrivacyAccessControls = value;
    }
}
