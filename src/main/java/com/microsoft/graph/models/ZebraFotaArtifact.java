package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ZebraFotaArtifact extends Entity implements Parsable {
    /** The version of the Board Support Package. */
    private String _boardSupportPackageVersion;
    /** Artifact device model. */
    private String _deviceModel;
    /** Artifact OS version. */
    private String _osVersion;
    /** Artifact patch version. */
    private String _patchVersion;
    /** Artifact release notes URL. */
    private String _releaseNotesUrl;
    /**
     * Instantiates a new zebraFotaArtifact and sets the default values.
     * @return a void
     */
    public ZebraFotaArtifact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a zebraFotaArtifact
     */
    @javax.annotation.Nonnull
    public static ZebraFotaArtifact createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaArtifact();
    }
    /**
     * Gets the boardSupportPackageVersion property value. The version of the Board Support Package.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBoardSupportPackageVersion() {
        return this._boardSupportPackageVersion;
    }
    /**
     * Gets the deviceModel property value. Artifact device model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this._deviceModel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ZebraFotaArtifact currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("boardSupportPackageVersion", (n) -> { currentObject.setBoardSupportPackageVersion(n.getStringValue()); });
            this.put("deviceModel", (n) -> { currentObject.setDeviceModel(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("patchVersion", (n) -> { currentObject.setPatchVersion(n.getStringValue()); });
            this.put("releaseNotesUrl", (n) -> { currentObject.setReleaseNotesUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the osVersion property value. Artifact OS version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the patchVersion property value. Artifact patch version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPatchVersion() {
        return this._patchVersion;
    }
    /**
     * Gets the releaseNotesUrl property value. Artifact release notes URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReleaseNotesUrl() {
        return this._releaseNotesUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("boardSupportPackageVersion", this.getBoardSupportPackageVersion());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("patchVersion", this.getPatchVersion());
        writer.writeStringValue("releaseNotesUrl", this.getReleaseNotesUrl());
    }
    /**
     * Sets the boardSupportPackageVersion property value. The version of the Board Support Package.
     * @param value Value to set for the boardSupportPackageVersion property.
     * @return a void
     */
    public void setBoardSupportPackageVersion(@javax.annotation.Nullable final String value) {
        this._boardSupportPackageVersion = value;
    }
    /**
     * Sets the deviceModel property value. Artifact device model.
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this._deviceModel = value;
    }
    /**
     * Sets the osVersion property value. Artifact OS version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the patchVersion property value. Artifact patch version.
     * @param value Value to set for the patchVersion property.
     * @return a void
     */
    public void setPatchVersion(@javax.annotation.Nullable final String value) {
        this._patchVersion = value;
    }
    /**
     * Sets the releaseNotesUrl property value. Artifact release notes URL.
     * @param value Value to set for the releaseNotesUrl property.
     * @return a void
     */
    public void setReleaseNotesUrl(@javax.annotation.Nullable final String value) {
        this._releaseNotesUrl = value;
    }
}
