// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Attestation State.
 */
public class DeviceHealthAttestationState implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Attestation Identity Key.
     * TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key (EK) certificate.
     */
    @SerializedName(value = "attestationIdentityKey", alternate = {"AttestationIdentityKey"})
    @Expose
	@Nullable
    public String attestationIdentityKey;

    /**
     * The Bit Locker Status.
     * On or Off of BitLocker Drive Encryption
     */
    @SerializedName(value = "bitLockerStatus", alternate = {"BitLockerStatus"})
    @Expose
	@Nullable
    public String bitLockerStatus;

    /**
     * The Boot App Security Version.
     * The security version number of the Boot Application
     */
    @SerializedName(value = "bootAppSecurityVersion", alternate = {"BootAppSecurityVersion"})
    @Expose
	@Nullable
    public String bootAppSecurityVersion;

    /**
     * The Boot Debugging.
     * When bootDebugging is enabled, the device is used in development and testing
     */
    @SerializedName(value = "bootDebugging", alternate = {"BootDebugging"})
    @Expose
	@Nullable
    public String bootDebugging;

    /**
     * The Boot Manager Security Version.
     * The security version number of the Boot Application
     */
    @SerializedName(value = "bootManagerSecurityVersion", alternate = {"BootManagerSecurityVersion"})
    @Expose
	@Nullable
    public String bootManagerSecurityVersion;

    /**
     * The Boot Manager Version.
     * The version of the Boot Manager
     */
    @SerializedName(value = "bootManagerVersion", alternate = {"BootManagerVersion"})
    @Expose
	@Nullable
    public String bootManagerVersion;

    /**
     * The Boot Revision List Info.
     * The Boot Revision List that was loaded during initial boot on the attested device
     */
    @SerializedName(value = "bootRevisionListInfo", alternate = {"BootRevisionListInfo"})
    @Expose
	@Nullable
    public String bootRevisionListInfo;

    /**
     * The Code Integrity.
     *  When code integrity is enabled, code execution is restricted to integrity verified code
     */
    @SerializedName(value = "codeIntegrity", alternate = {"CodeIntegrity"})
    @Expose
	@Nullable
    public String codeIntegrity;

    /**
     * The Code Integrity Check Version.
     * The version of the Boot Manager
     */
    @SerializedName(value = "codeIntegrityCheckVersion", alternate = {"CodeIntegrityCheckVersion"})
    @Expose
	@Nullable
    public String codeIntegrityCheckVersion;

    /**
     * The Code Integrity Policy.
     * The Code Integrity policy that is controlling the security of the boot environment
     */
    @SerializedName(value = "codeIntegrityPolicy", alternate = {"CodeIntegrityPolicy"})
    @Expose
	@Nullable
    public String codeIntegrityPolicy;

    /**
     * The Content Namespace Url.
     * The DHA report version. (Namespace version)
     */
    @SerializedName(value = "contentNamespaceUrl", alternate = {"ContentNamespaceUrl"})
    @Expose
	@Nullable
    public String contentNamespaceUrl;

    /**
     * The Content Version.
     * The HealthAttestation state schema version
     */
    @SerializedName(value = "contentVersion", alternate = {"ContentVersion"})
    @Expose
	@Nullable
    public String contentVersion;

    /**
     * The Data Excution Policy.
     * DEP Policy defines a set of hardware and software technologies that perform additional checks on memory 
     */
    @SerializedName(value = "dataExcutionPolicy", alternate = {"DataExcutionPolicy"})
    @Expose
	@Nullable
    public String dataExcutionPolicy;

    /**
     * The Device Health Attestation Status.
     * The DHA report version. (Namespace version)
     */
    @SerializedName(value = "deviceHealthAttestationStatus", alternate = {"DeviceHealthAttestationStatus"})
    @Expose
	@Nullable
    public String deviceHealthAttestationStatus;

    /**
     * The Early Launch Anti Malware Driver Protection.
     * ELAM provides protection for the computers in your network when they start up
     */
    @SerializedName(value = "earlyLaunchAntiMalwareDriverProtection", alternate = {"EarlyLaunchAntiMalwareDriverProtection"})
    @Expose
	@Nullable
    public String earlyLaunchAntiMalwareDriverProtection;

    /**
     * The Health Attestation Supported Status.
     * This attribute indicates if DHA is supported for the device
     */
    @SerializedName(value = "healthAttestationSupportedStatus", alternate = {"HealthAttestationSupportedStatus"})
    @Expose
	@Nullable
    public String healthAttestationSupportedStatus;

    /**
     * The Health Status Mismatch Info.
     * This attribute appears if DHA-Service detects an integrity issue
     */
    @SerializedName(value = "healthStatusMismatchInfo", alternate = {"HealthStatusMismatchInfo"})
    @Expose
	@Nullable
    public String healthStatusMismatchInfo;

    /**
     * The Issued Date Time.
     * The DateTime when device was evaluated or issued to MDM
     */
    @SerializedName(value = "issuedDateTime", alternate = {"IssuedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime issuedDateTime;

    /**
     * The Last Update Date Time.
     * The Timestamp of the last update.
     */
    @SerializedName(value = "lastUpdateDateTime", alternate = {"LastUpdateDateTime"})
    @Expose
	@Nullable
    public String lastUpdateDateTime;

    /**
     * The Operating System Kernel Debugging.
     * When operatingSystemKernelDebugging is enabled, the device is used in development and testing
     */
    @SerializedName(value = "operatingSystemKernelDebugging", alternate = {"OperatingSystemKernelDebugging"})
    @Expose
	@Nullable
    public String operatingSystemKernelDebugging;

    /**
     * The Operating System Rev List Info.
     * The Operating System Revision List that was loaded during initial boot on the attested device
     */
    @SerializedName(value = "operatingSystemRevListInfo", alternate = {"OperatingSystemRevListInfo"})
    @Expose
	@Nullable
    public String operatingSystemRevListInfo;

    /**
     * The Pcr0.
     * The measurement that is captured in PCR[0]
     */
    @SerializedName(value = "pcr0", alternate = {"Pcr0"})
    @Expose
	@Nullable
    public String pcr0;

    /**
     * The Pcr Hash Algorithm.
     * Informational attribute that identifies the HASH algorithm that was used by TPM
     */
    @SerializedName(value = "pcrHashAlgorithm", alternate = {"PcrHashAlgorithm"})
    @Expose
	@Nullable
    public String pcrHashAlgorithm;

    /**
     * The Reset Count.
     * The number of times a PC device has hibernated or resumed
     */
    @SerializedName(value = "resetCount", alternate = {"ResetCount"})
    @Expose
	@Nullable
    public Long resetCount;

    /**
     * The Restart Count.
     * The number of times a PC device has rebooted
     */
    @SerializedName(value = "restartCount", alternate = {"RestartCount"})
    @Expose
	@Nullable
    public Long restartCount;

    /**
     * The Safe Mode.
     * Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
     */
    @SerializedName(value = "safeMode", alternate = {"SafeMode"})
    @Expose
	@Nullable
    public String safeMode;

    /**
     * The Secure Boot.
     * When Secure Boot is enabled, the core components must have the correct cryptographic signatures
     */
    @SerializedName(value = "secureBoot", alternate = {"SecureBoot"})
    @Expose
	@Nullable
    public String secureBoot;

    /**
     * The Secure Boot Configuration Policy Finger Print.
     * Fingerprint of the Custom Secure Boot Configuration Policy
     */
    @SerializedName(value = "secureBootConfigurationPolicyFingerPrint", alternate = {"SecureBootConfigurationPolicyFingerPrint"})
    @Expose
	@Nullable
    public String secureBootConfigurationPolicyFingerPrint;

    /**
     * The Test Signing.
     * When test signing is allowed, the device does not enforce signature validation during boot
     */
    @SerializedName(value = "testSigning", alternate = {"TestSigning"})
    @Expose
	@Nullable
    public String testSigning;

    /**
     * The Tpm Version.
     * The security version number of the Boot Application
     */
    @SerializedName(value = "tpmVersion", alternate = {"TpmVersion"})
    @Expose
	@Nullable
    public String tpmVersion;

    /**
     * The Virtual Secure Mode.
     * VSM is a container that protects high value assets from a compromised kernel
     */
    @SerializedName(value = "virtualSecureMode", alternate = {"VirtualSecureMode"})
    @Expose
	@Nullable
    public String virtualSecureMode;

    /**
     * The Windows PE.
     * Operating system running with limited services that is used to prepare a computer for Windows
     */
    @SerializedName(value = "windowsPE", alternate = {"WindowsPE"})
    @Expose
	@Nullable
    public String windowsPE;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
