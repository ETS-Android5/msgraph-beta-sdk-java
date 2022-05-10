package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharingLink implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The app the link is associated with. */
    private Identity _application;
    /** The configuratorUrl property */
    private String _configuratorUrl;
    /** If true then the user can only use this link to view the item on the web, and cannot use it to download the contents of the item. Only for OneDrive for Business and SharePoint. */
    private Boolean _preventsDownload;
    /** The scope of the link represented by this permission. Value anonymous indicates the link is usable by anyone, organization indicates the link is only usable for users signed into the same tenant. */
    private String _scope;
    /** The type of the link created. */
    private String _type;
    /** For embed links, this property contains the HTML code for an <iframe> element that will embed the item in a webpage. */
    private String _webHtml;
    /** A URL that opens the item in the browser on the OneDrive website. */
    private String _webUrl;
    /**
     * Instantiates a new sharingLink and sets the default values.
     * @return a void
     */
    public SharingLink() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharingLink
     */
    @javax.annotation.Nonnull
    public static SharingLink createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharingLink();
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
     * Gets the application property value. The app the link is associated with.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getApplication() {
        return this._application;
    }
    /**
     * Gets the configuratorUrl property value. The configuratorUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfiguratorUrl() {
        return this._configuratorUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharingLink currentObject = this;
        return new HashMap<>(7) {{
            this.put("application", (n) -> { currentObject.setApplication(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("configuratorUrl", (n) -> { currentObject.setConfiguratorUrl(n.getStringValue()); });
            this.put("preventsDownload", (n) -> { currentObject.setPreventsDownload(n.getBooleanValue()); });
            this.put("scope", (n) -> { currentObject.setScope(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
            this.put("webHtml", (n) -> { currentObject.setWebHtml(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the preventsDownload property value. If true then the user can only use this link to view the item on the web, and cannot use it to download the contents of the item. Only for OneDrive for Business and SharePoint.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPreventsDownload() {
        return this._preventsDownload;
    }
    /**
     * Gets the scope property value. The scope of the link represented by this permission. Value anonymous indicates the link is usable by anyone, organization indicates the link is only usable for users signed into the same tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScope() {
        return this._scope;
    }
    /**
     * Gets the type property value. The type of the link created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Gets the webHtml property value. For embed links, this property contains the HTML code for an <iframe> element that will embed the item in a webpage.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebHtml() {
        return this._webHtml;
    }
    /**
     * Gets the webUrl property value. A URL that opens the item in the browser on the OneDrive website.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("application", this.getApplication());
        writer.writeStringValue("configuratorUrl", this.getConfiguratorUrl());
        writer.writeBooleanValue("preventsDownload", this.getPreventsDownload());
        writer.writeStringValue("scope", this.getScope());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("webHtml", this.getWebHtml());
        writer.writeStringValue("webUrl", this.getWebUrl());
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
     * Sets the application property value. The app the link is associated with.
     * @param value Value to set for the application property.
     * @return a void
     */
    public void setApplication(@javax.annotation.Nullable final Identity value) {
        this._application = value;
    }
    /**
     * Sets the configuratorUrl property value. The configuratorUrl property
     * @param value Value to set for the configuratorUrl property.
     * @return a void
     */
    public void setConfiguratorUrl(@javax.annotation.Nullable final String value) {
        this._configuratorUrl = value;
    }
    /**
     * Sets the preventsDownload property value. If true then the user can only use this link to view the item on the web, and cannot use it to download the contents of the item. Only for OneDrive for Business and SharePoint.
     * @param value Value to set for the preventsDownload property.
     * @return a void
     */
    public void setPreventsDownload(@javax.annotation.Nullable final Boolean value) {
        this._preventsDownload = value;
    }
    /**
     * Sets the scope property value. The scope of the link represented by this permission. Value anonymous indicates the link is usable by anyone, organization indicates the link is only usable for users signed into the same tenant.
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final String value) {
        this._scope = value;
    }
    /**
     * Sets the type property value. The type of the link created.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the webHtml property value. For embed links, this property contains the HTML code for an <iframe> element that will embed the item in a webpage.
     * @param value Value to set for the webHtml property.
     * @return a void
     */
    public void setWebHtml(@javax.annotation.Nullable final String value) {
        this._webHtml = value;
    }
    /**
     * Sets the webUrl property value. A URL that opens the item in the browser on the OneDrive website.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
