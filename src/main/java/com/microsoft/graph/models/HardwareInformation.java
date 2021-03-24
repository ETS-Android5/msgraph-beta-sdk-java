// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.DeviceGuardLocalSystemAuthorityCredentialGuardState;
import com.microsoft.graph.models.DeviceGuardVirtualizationBasedSecurityHardwareRequirementState;
import com.microsoft.graph.models.DeviceGuardVirtualizationBasedSecurityState;
import com.microsoft.graph.models.SharedAppleDeviceUser;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Hardware Information.
 */
public class HardwareInformation implements IJsonBackedObject {

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
     * The Battery Charge Cycles.
     * The number of charge cycles the device’s current battery has gone through. Valid values 0 to 2147483647
     */
    @SerializedName(value = "batteryChargeCycles", alternate = {"BatteryChargeCycles"})
    @Expose
	@Nullable
    public Integer batteryChargeCycles;

    /**
     * The Battery Health Percentage.
     * The device’s current battery’s health percentage. Valid values 0 to 100
     */
    @SerializedName(value = "batteryHealthPercentage", alternate = {"BatteryHealthPercentage"})
    @Expose
	@Nullable
    public Integer batteryHealthPercentage;

    /**
     * The Battery Serial Number.
     * The serial number of the device’s current battery
     */
    @SerializedName(value = "batterySerialNumber", alternate = {"BatterySerialNumber"})
    @Expose
	@Nullable
    public String batterySerialNumber;

    /**
     * The Cellular Technology.
     * Cellular technology of the device
     */
    @SerializedName(value = "cellularTechnology", alternate = {"CellularTechnology"})
    @Expose
	@Nullable
    public String cellularTechnology;

    /**
     * The Device Full Qualified Domain Name.
     * Returns the fully qualified domain name of the device (if any). If the device is not domain-joined, it returns an empty string.
     */
    @SerializedName(value = "deviceFullQualifiedDomainName", alternate = {"DeviceFullQualifiedDomainName"})
    @Expose
	@Nullable
    public String deviceFullQualifiedDomainName;

    /**
     * The Device Guard Local System Authority Credential Guard State.
     * Local System Authority (LSA) credential guard status. . Possible values are: running, rebootRequired, notLicensed, notConfigured, virtualizationBasedSecurityNotRunning.
     */
    @SerializedName(value = "deviceGuardLocalSystemAuthorityCredentialGuardState", alternate = {"DeviceGuardLocalSystemAuthorityCredentialGuardState"})
    @Expose
	@Nullable
    public DeviceGuardLocalSystemAuthorityCredentialGuardState deviceGuardLocalSystemAuthorityCredentialGuardState;

    /**
     * The Device Guard Virtualization Based Security Hardware Requirement State.
     * Virtualization-based security hardware requirement status. Possible values are: meetHardwareRequirements, secureBootRequired, dmaProtectionRequired, hyperVNotSupportedForGuestVM, hyperVNotAvailable.
     */
    @SerializedName(value = "deviceGuardVirtualizationBasedSecurityHardwareRequirementState", alternate = {"DeviceGuardVirtualizationBasedSecurityHardwareRequirementState"})
    @Expose
	@Nullable
    public DeviceGuardVirtualizationBasedSecurityHardwareRequirementState deviceGuardVirtualizationBasedSecurityHardwareRequirementState;

    /**
     * The Device Guard Virtualization Based Security State.
     * Virtualization-based security status. . Possible values are: running, rebootRequired, require64BitArchitecture, notLicensed, notConfigured, doesNotMeetHardwareRequirements, other.
     */
    @SerializedName(value = "deviceGuardVirtualizationBasedSecurityState", alternate = {"DeviceGuardVirtualizationBasedSecurityState"})
    @Expose
	@Nullable
    public DeviceGuardVirtualizationBasedSecurityState deviceGuardVirtualizationBasedSecurityState;

    /**
     * The Free Storage Space.
     * Free storage space of the device.
     */
    @SerializedName(value = "freeStorageSpace", alternate = {"FreeStorageSpace"})
    @Expose
	@Nullable
    public Long freeStorageSpace;

    /**
     * The Imei.
     * IMEI
     */
    @SerializedName(value = "imei", alternate = {"Imei"})
    @Expose
	@Nullable
    public String imei;

    /**
     * The Ip Address V4.
     * IPAddressV4
     */
    @SerializedName(value = "ipAddressV4", alternate = {"IpAddressV4"})
    @Expose
	@Nullable
    public String ipAddressV4;

    /**
     * The Is Encrypted.
     * Encryption status of the device
     */
    @SerializedName(value = "isEncrypted", alternate = {"IsEncrypted"})
    @Expose
	@Nullable
    public Boolean isEncrypted;

    /**
     * The Is Shared Device.
     * Shared iPad
     */
    @SerializedName(value = "isSharedDevice", alternate = {"IsSharedDevice"})
    @Expose
	@Nullable
    public Boolean isSharedDevice;

    /**
     * The Is Supervised.
     * Supervised mode of the device
     */
    @SerializedName(value = "isSupervised", alternate = {"IsSupervised"})
    @Expose
	@Nullable
    public Boolean isSupervised;

    /**
     * The Manufacturer.
     * Manufacturer of the device
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Meid.
     * MEID
     */
    @SerializedName(value = "meid", alternate = {"Meid"})
    @Expose
	@Nullable
    public String meid;

    /**
     * The Model.
     * Model of the device
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Operating System Edition.
     * String that specifies the OS edition.
     */
    @SerializedName(value = "operatingSystemEdition", alternate = {"OperatingSystemEdition"})
    @Expose
	@Nullable
    public String operatingSystemEdition;

    /**
     * The Operating System Language.
     * Operating system language of the device
     */
    @SerializedName(value = "operatingSystemLanguage", alternate = {"OperatingSystemLanguage"})
    @Expose
	@Nullable
    public String operatingSystemLanguage;

    /**
     * The Operating System Product Type.
     * Int that specifies the Windows Operating System ProductType. More details here https://go.microsoft.com/fwlink/?linkid=2126950. Valid values 0 to 2147483647
     */
    @SerializedName(value = "operatingSystemProductType", alternate = {"OperatingSystemProductType"})
    @Expose
	@Nullable
    public Integer operatingSystemProductType;

    /**
     * The Os Build Number.
     * Operating System Build Number on Android device
     */
    @SerializedName(value = "osBuildNumber", alternate = {"OsBuildNumber"})
    @Expose
	@Nullable
    public String osBuildNumber;

    /**
     * The Phone Number.
     * Phone number of the device
     */
    @SerializedName(value = "phoneNumber", alternate = {"PhoneNumber"})
    @Expose
	@Nullable
    public String phoneNumber;

    /**
     * The Serial Number.
     * Serial number.
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
	@Nullable
    public String serialNumber;

    /**
     * The Shared Device Cached Users.
     * All users on the shared Apple device
     */
    @SerializedName(value = "sharedDeviceCachedUsers", alternate = {"SharedDeviceCachedUsers"})
    @Expose
	@Nullable
    public java.util.List<SharedAppleDeviceUser> sharedDeviceCachedUsers;

    /**
     * The Subnet Address.
     * SubnetAddress
     */
    @SerializedName(value = "subnetAddress", alternate = {"SubnetAddress"})
    @Expose
	@Nullable
    public String subnetAddress;

    /**
     * The Subscriber Carrier.
     * Subscriber carrier of the device
     */
    @SerializedName(value = "subscriberCarrier", alternate = {"SubscriberCarrier"})
    @Expose
	@Nullable
    public String subscriberCarrier;

    /**
     * The Total Storage Space.
     * Total storage space of the device.
     */
    @SerializedName(value = "totalStorageSpace", alternate = {"TotalStorageSpace"})
    @Expose
	@Nullable
    public Long totalStorageSpace;

    /**
     * The Tpm Specification Version.
     * String that specifies the specification version.
     */
    @SerializedName(value = "tpmSpecificationVersion", alternate = {"TpmSpecificationVersion"})
    @Expose
	@Nullable
    public String tpmSpecificationVersion;

    /**
     * The Wifi Mac.
     * WiFi MAC address of the device
     */
    @SerializedName(value = "wifiMac", alternate = {"WifiMac"})
    @Expose
	@Nullable
    public String wifiMac;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
