package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsManagementApp extends Entity implements Parsable {
    /** Windows management app available version. */
    private String _availableVersion;
    /** The list of health states for installed Windows management app. */
    private java.util.List<WindowsManagementAppHealthState> _healthStates;
    /** Managed Installer Status. Possible values are: disabled, enabled. */
    private ManagedInstallerStatus _managedInstaller;
    /** Managed Installer Configured Date Time */
    private String _managedInstallerConfiguredDateTime;
    /**
     * Instantiates a new windowsManagementApp and sets the default values.
     * @return a void
     */
    public WindowsManagementApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsManagementApp
     */
    @javax.annotation.Nonnull
    public static WindowsManagementApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsManagementApp();
    }
    /**
     * Gets the availableVersion property value. Windows management app available version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailableVersion() {
        return this._availableVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsManagementApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("availableVersion", (n) -> { currentObject.setAvailableVersion(n.getStringValue()); });
            this.put("healthStates", (n) -> { currentObject.setHealthStates(n.getCollectionOfObjectValues(WindowsManagementAppHealthState::createFromDiscriminatorValue)); });
            this.put("managedInstaller", (n) -> { currentObject.setManagedInstaller(n.getEnumValue(ManagedInstallerStatus.class)); });
            this.put("managedInstallerConfiguredDateTime", (n) -> { currentObject.setManagedInstallerConfiguredDateTime(n.getStringValue()); });
        }};
    }
    /**
     * Gets the healthStates property value. The list of health states for installed Windows management app.
     * @return a windowsManagementAppHealthState
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsManagementAppHealthState> getHealthStates() {
        return this._healthStates;
    }
    /**
     * Gets the managedInstaller property value. Managed Installer Status. Possible values are: disabled, enabled.
     * @return a managedInstallerStatus
     */
    @javax.annotation.Nullable
    public ManagedInstallerStatus getManagedInstaller() {
        return this._managedInstaller;
    }
    /**
     * Gets the managedInstallerConfiguredDateTime property value. Managed Installer Configured Date Time
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedInstallerConfiguredDateTime() {
        return this._managedInstallerConfiguredDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("availableVersion", this.getAvailableVersion());
        writer.writeCollectionOfObjectValues("healthStates", this.getHealthStates());
        writer.writeEnumValue("managedInstaller", this.getManagedInstaller());
        writer.writeStringValue("managedInstallerConfiguredDateTime", this.getManagedInstallerConfiguredDateTime());
    }
    /**
     * Sets the availableVersion property value. Windows management app available version.
     * @param value Value to set for the availableVersion property.
     * @return a void
     */
    public void setAvailableVersion(@javax.annotation.Nullable final String value) {
        this._availableVersion = value;
    }
    /**
     * Sets the healthStates property value. The list of health states for installed Windows management app.
     * @param value Value to set for the healthStates property.
     * @return a void
     */
    public void setHealthStates(@javax.annotation.Nullable final java.util.List<WindowsManagementAppHealthState> value) {
        this._healthStates = value;
    }
    /**
     * Sets the managedInstaller property value. Managed Installer Status. Possible values are: disabled, enabled.
     * @param value Value to set for the managedInstaller property.
     * @return a void
     */
    public void setManagedInstaller(@javax.annotation.Nullable final ManagedInstallerStatus value) {
        this._managedInstaller = value;
    }
    /**
     * Sets the managedInstallerConfiguredDateTime property value. Managed Installer Configured Date Time
     * @param value Value to set for the managedInstallerConfiguredDateTime property.
     * @return a void
     */
    public void setManagedInstallerConfiguredDateTime(@javax.annotation.Nullable final String value) {
        this._managedInstallerConfiguredDateTime = value;
    }
}
