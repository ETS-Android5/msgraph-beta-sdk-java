package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsProtectionState extends Entity implements Parsable {
    /** Current anti malware version */
    private String _antiMalwareVersion;
    /** Device malware list */
    private java.util.List<WindowsDeviceMalwareState> _detectedMalwareState;
    /** Computer's state (like clean or pending full scan or pending reboot etc). Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical. */
    private WindowsDeviceHealthState _deviceState;
    /** Current endpoint protection engine's version */
    private String _engineVersion;
    /** Full scan overdue or not? */
    private Boolean _fullScanOverdue;
    /** Full scan required or not? */
    private Boolean _fullScanRequired;
    /** Indicates whether the device is a virtual machine. */
    private Boolean _isVirtualMachine;
    /** Last quick scan datetime */
    private OffsetDateTime _lastFullScanDateTime;
    /** Last full scan signature version */
    private String _lastFullScanSignatureVersion;
    /** Last quick scan datetime */
    private OffsetDateTime _lastQuickScanDateTime;
    /** Last quick scan signature version */
    private String _lastQuickScanSignatureVersion;
    /** Last device health status reported time */
    private OffsetDateTime _lastReportedDateTime;
    /** Anti malware is enabled or not */
    private Boolean _malwareProtectionEnabled;
    /** Network inspection system enabled or not? */
    private Boolean _networkInspectionSystemEnabled;
    /** Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall. */
    private WindowsDefenderProductStatus _productStatus;
    /** Quick scan overdue or not? */
    private Boolean _quickScanOverdue;
    /** Real time protection is enabled or not? */
    private Boolean _realTimeProtectionEnabled;
    /** Reboot required or not? */
    private Boolean _rebootRequired;
    /** Signature out of date or not? */
    private Boolean _signatureUpdateOverdue;
    /** Current malware definitions version */
    private String _signatureVersion;
    /** Indicates whether the Windows Defender tamper protection feature is enabled. */
    private Boolean _tamperProtectionEnabled;
    /**
     * Instantiates a new windowsProtectionState and sets the default values.
     * @return a void
     */
    public WindowsProtectionState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsProtectionState
     */
    @javax.annotation.Nonnull
    public static WindowsProtectionState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsProtectionState();
    }
    /**
     * Gets the antiMalwareVersion property value. Current anti malware version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAntiMalwareVersion() {
        return this._antiMalwareVersion;
    }
    /**
     * Gets the detectedMalwareState property value. Device malware list
     * @return a windowsDeviceMalwareState
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDeviceMalwareState> getDetectedMalwareState() {
        return this._detectedMalwareState;
    }
    /**
     * Gets the deviceState property value. Computer's state (like clean or pending full scan or pending reboot etc). Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     * @return a windowsDeviceHealthState
     */
    @javax.annotation.Nullable
    public WindowsDeviceHealthState getDeviceState() {
        return this._deviceState;
    }
    /**
     * Gets the engineVersion property value. Current endpoint protection engine's version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEngineVersion() {
        return this._engineVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsProtectionState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("antiMalwareVersion", (n) -> { currentObject.setAntiMalwareVersion(n.getStringValue()); });
            this.put("detectedMalwareState", (n) -> { currentObject.setDetectedMalwareState(n.getCollectionOfObjectValues(WindowsDeviceMalwareState::createFromDiscriminatorValue)); });
            this.put("deviceState", (n) -> { currentObject.setDeviceState(n.getEnumValue(WindowsDeviceHealthState.class)); });
            this.put("engineVersion", (n) -> { currentObject.setEngineVersion(n.getStringValue()); });
            this.put("fullScanOverdue", (n) -> { currentObject.setFullScanOverdue(n.getBooleanValue()); });
            this.put("fullScanRequired", (n) -> { currentObject.setFullScanRequired(n.getBooleanValue()); });
            this.put("isVirtualMachine", (n) -> { currentObject.setIsVirtualMachine(n.getBooleanValue()); });
            this.put("lastFullScanDateTime", (n) -> { currentObject.setLastFullScanDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastFullScanSignatureVersion", (n) -> { currentObject.setLastFullScanSignatureVersion(n.getStringValue()); });
            this.put("lastQuickScanDateTime", (n) -> { currentObject.setLastQuickScanDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastQuickScanSignatureVersion", (n) -> { currentObject.setLastQuickScanSignatureVersion(n.getStringValue()); });
            this.put("lastReportedDateTime", (n) -> { currentObject.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
            this.put("malwareProtectionEnabled", (n) -> { currentObject.setMalwareProtectionEnabled(n.getBooleanValue()); });
            this.put("networkInspectionSystemEnabled", (n) -> { currentObject.setNetworkInspectionSystemEnabled(n.getBooleanValue()); });
            this.put("productStatus", (n) -> { currentObject.setProductStatus(n.getEnumValue(WindowsDefenderProductStatus.class)); });
            this.put("quickScanOverdue", (n) -> { currentObject.setQuickScanOverdue(n.getBooleanValue()); });
            this.put("realTimeProtectionEnabled", (n) -> { currentObject.setRealTimeProtectionEnabled(n.getBooleanValue()); });
            this.put("rebootRequired", (n) -> { currentObject.setRebootRequired(n.getBooleanValue()); });
            this.put("signatureUpdateOverdue", (n) -> { currentObject.setSignatureUpdateOverdue(n.getBooleanValue()); });
            this.put("signatureVersion", (n) -> { currentObject.setSignatureVersion(n.getStringValue()); });
            this.put("tamperProtectionEnabled", (n) -> { currentObject.setTamperProtectionEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the fullScanOverdue property value. Full scan overdue or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullScanOverdue() {
        return this._fullScanOverdue;
    }
    /**
     * Gets the fullScanRequired property value. Full scan required or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullScanRequired() {
        return this._fullScanRequired;
    }
    /**
     * Gets the isVirtualMachine property value. Indicates whether the device is a virtual machine.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsVirtualMachine() {
        return this._isVirtualMachine;
    }
    /**
     * Gets the lastFullScanDateTime property value. Last quick scan datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastFullScanDateTime() {
        return this._lastFullScanDateTime;
    }
    /**
     * Gets the lastFullScanSignatureVersion property value. Last full scan signature version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastFullScanSignatureVersion() {
        return this._lastFullScanSignatureVersion;
    }
    /**
     * Gets the lastQuickScanDateTime property value. Last quick scan datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastQuickScanDateTime() {
        return this._lastQuickScanDateTime;
    }
    /**
     * Gets the lastQuickScanSignatureVersion property value. Last quick scan signature version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastQuickScanSignatureVersion() {
        return this._lastQuickScanSignatureVersion;
    }
    /**
     * Gets the lastReportedDateTime property value. Last device health status reported time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this._lastReportedDateTime;
    }
    /**
     * Gets the malwareProtectionEnabled property value. Anti malware is enabled or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMalwareProtectionEnabled() {
        return this._malwareProtectionEnabled;
    }
    /**
     * Gets the networkInspectionSystemEnabled property value. Network inspection system enabled or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkInspectionSystemEnabled() {
        return this._networkInspectionSystemEnabled;
    }
    /**
     * Gets the productStatus property value. Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     * @return a windowsDefenderProductStatus
     */
    @javax.annotation.Nullable
    public WindowsDefenderProductStatus getProductStatus() {
        return this._productStatus;
    }
    /**
     * Gets the quickScanOverdue property value. Quick scan overdue or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQuickScanOverdue() {
        return this._quickScanOverdue;
    }
    /**
     * Gets the realTimeProtectionEnabled property value. Real time protection is enabled or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRealTimeProtectionEnabled() {
        return this._realTimeProtectionEnabled;
    }
    /**
     * Gets the rebootRequired property value. Reboot required or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRebootRequired() {
        return this._rebootRequired;
    }
    /**
     * Gets the signatureUpdateOverdue property value. Signature out of date or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSignatureUpdateOverdue() {
        return this._signatureUpdateOverdue;
    }
    /**
     * Gets the signatureVersion property value. Current malware definitions version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignatureVersion() {
        return this._signatureVersion;
    }
    /**
     * Gets the tamperProtectionEnabled property value. Indicates whether the Windows Defender tamper protection feature is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTamperProtectionEnabled() {
        return this._tamperProtectionEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("antiMalwareVersion", this.getAntiMalwareVersion());
        writer.writeCollectionOfObjectValues("detectedMalwareState", this.getDetectedMalwareState());
        writer.writeEnumValue("deviceState", this.getDeviceState());
        writer.writeStringValue("engineVersion", this.getEngineVersion());
        writer.writeBooleanValue("fullScanOverdue", this.getFullScanOverdue());
        writer.writeBooleanValue("fullScanRequired", this.getFullScanRequired());
        writer.writeBooleanValue("isVirtualMachine", this.getIsVirtualMachine());
        writer.writeOffsetDateTimeValue("lastFullScanDateTime", this.getLastFullScanDateTime());
        writer.writeStringValue("lastFullScanSignatureVersion", this.getLastFullScanSignatureVersion());
        writer.writeOffsetDateTimeValue("lastQuickScanDateTime", this.getLastQuickScanDateTime());
        writer.writeStringValue("lastQuickScanSignatureVersion", this.getLastQuickScanSignatureVersion());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeBooleanValue("malwareProtectionEnabled", this.getMalwareProtectionEnabled());
        writer.writeBooleanValue("networkInspectionSystemEnabled", this.getNetworkInspectionSystemEnabled());
        writer.writeEnumValue("productStatus", this.getProductStatus());
        writer.writeBooleanValue("quickScanOverdue", this.getQuickScanOverdue());
        writer.writeBooleanValue("realTimeProtectionEnabled", this.getRealTimeProtectionEnabled());
        writer.writeBooleanValue("rebootRequired", this.getRebootRequired());
        writer.writeBooleanValue("signatureUpdateOverdue", this.getSignatureUpdateOverdue());
        writer.writeStringValue("signatureVersion", this.getSignatureVersion());
        writer.writeBooleanValue("tamperProtectionEnabled", this.getTamperProtectionEnabled());
    }
    /**
     * Sets the antiMalwareVersion property value. Current anti malware version
     * @param value Value to set for the antiMalwareVersion property.
     * @return a void
     */
    public void setAntiMalwareVersion(@javax.annotation.Nullable final String value) {
        this._antiMalwareVersion = value;
    }
    /**
     * Sets the detectedMalwareState property value. Device malware list
     * @param value Value to set for the detectedMalwareState property.
     * @return a void
     */
    public void setDetectedMalwareState(@javax.annotation.Nullable final java.util.List<WindowsDeviceMalwareState> value) {
        this._detectedMalwareState = value;
    }
    /**
     * Sets the deviceState property value. Computer's state (like clean or pending full scan or pending reboot etc). Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     * @param value Value to set for the deviceState property.
     * @return a void
     */
    public void setDeviceState(@javax.annotation.Nullable final WindowsDeviceHealthState value) {
        this._deviceState = value;
    }
    /**
     * Sets the engineVersion property value. Current endpoint protection engine's version
     * @param value Value to set for the engineVersion property.
     * @return a void
     */
    public void setEngineVersion(@javax.annotation.Nullable final String value) {
        this._engineVersion = value;
    }
    /**
     * Sets the fullScanOverdue property value. Full scan overdue or not?
     * @param value Value to set for the fullScanOverdue property.
     * @return a void
     */
    public void setFullScanOverdue(@javax.annotation.Nullable final Boolean value) {
        this._fullScanOverdue = value;
    }
    /**
     * Sets the fullScanRequired property value. Full scan required or not?
     * @param value Value to set for the fullScanRequired property.
     * @return a void
     */
    public void setFullScanRequired(@javax.annotation.Nullable final Boolean value) {
        this._fullScanRequired = value;
    }
    /**
     * Sets the isVirtualMachine property value. Indicates whether the device is a virtual machine.
     * @param value Value to set for the isVirtualMachine property.
     * @return a void
     */
    public void setIsVirtualMachine(@javax.annotation.Nullable final Boolean value) {
        this._isVirtualMachine = value;
    }
    /**
     * Sets the lastFullScanDateTime property value. Last quick scan datetime
     * @param value Value to set for the lastFullScanDateTime property.
     * @return a void
     */
    public void setLastFullScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastFullScanDateTime = value;
    }
    /**
     * Sets the lastFullScanSignatureVersion property value. Last full scan signature version
     * @param value Value to set for the lastFullScanSignatureVersion property.
     * @return a void
     */
    public void setLastFullScanSignatureVersion(@javax.annotation.Nullable final String value) {
        this._lastFullScanSignatureVersion = value;
    }
    /**
     * Sets the lastQuickScanDateTime property value. Last quick scan datetime
     * @param value Value to set for the lastQuickScanDateTime property.
     * @return a void
     */
    public void setLastQuickScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastQuickScanDateTime = value;
    }
    /**
     * Sets the lastQuickScanSignatureVersion property value. Last quick scan signature version
     * @param value Value to set for the lastQuickScanSignatureVersion property.
     * @return a void
     */
    public void setLastQuickScanSignatureVersion(@javax.annotation.Nullable final String value) {
        this._lastQuickScanSignatureVersion = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last device health status reported time
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastReportedDateTime = value;
    }
    /**
     * Sets the malwareProtectionEnabled property value. Anti malware is enabled or not
     * @param value Value to set for the malwareProtectionEnabled property.
     * @return a void
     */
    public void setMalwareProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._malwareProtectionEnabled = value;
    }
    /**
     * Sets the networkInspectionSystemEnabled property value. Network inspection system enabled or not?
     * @param value Value to set for the networkInspectionSystemEnabled property.
     * @return a void
     */
    public void setNetworkInspectionSystemEnabled(@javax.annotation.Nullable final Boolean value) {
        this._networkInspectionSystemEnabled = value;
    }
    /**
     * Sets the productStatus property value. Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     * @param value Value to set for the productStatus property.
     * @return a void
     */
    public void setProductStatus(@javax.annotation.Nullable final WindowsDefenderProductStatus value) {
        this._productStatus = value;
    }
    /**
     * Sets the quickScanOverdue property value. Quick scan overdue or not?
     * @param value Value to set for the quickScanOverdue property.
     * @return a void
     */
    public void setQuickScanOverdue(@javax.annotation.Nullable final Boolean value) {
        this._quickScanOverdue = value;
    }
    /**
     * Sets the realTimeProtectionEnabled property value. Real time protection is enabled or not?
     * @param value Value to set for the realTimeProtectionEnabled property.
     * @return a void
     */
    public void setRealTimeProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._realTimeProtectionEnabled = value;
    }
    /**
     * Sets the rebootRequired property value. Reboot required or not?
     * @param value Value to set for the rebootRequired property.
     * @return a void
     */
    public void setRebootRequired(@javax.annotation.Nullable final Boolean value) {
        this._rebootRequired = value;
    }
    /**
     * Sets the signatureUpdateOverdue property value. Signature out of date or not?
     * @param value Value to set for the signatureUpdateOverdue property.
     * @return a void
     */
    public void setSignatureUpdateOverdue(@javax.annotation.Nullable final Boolean value) {
        this._signatureUpdateOverdue = value;
    }
    /**
     * Sets the signatureVersion property value. Current malware definitions version
     * @param value Value to set for the signatureVersion property.
     * @return a void
     */
    public void setSignatureVersion(@javax.annotation.Nullable final String value) {
        this._signatureVersion = value;
    }
    /**
     * Sets the tamperProtectionEnabled property value. Indicates whether the Windows Defender tamper protection feature is enabled.
     * @param value Value to set for the tamperProtectionEnabled property.
     * @return a void
     */
    public void setTamperProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._tamperProtectionEnabled = value;
    }
}
