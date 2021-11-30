// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WiFiProxySetting;
import com.microsoft.graph.models.WiFiSecurityType;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSWi Fi Configuration.
 */
public class MacOSWiFiConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Connect Automatically.
     * Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network.
     */
    @SerializedName(value = "connectAutomatically", alternate = {"ConnectAutomatically"})
    @Expose
	@Nullable
    public Boolean connectAutomatically;

    /**
     * The Connect When Network Name Is Hidden.
     * Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     */
    @SerializedName(value = "connectWhenNetworkNameIsHidden", alternate = {"ConnectWhenNetworkNameIsHidden"})
    @Expose
	@Nullable
    public Boolean connectWhenNetworkNameIsHidden;

    /**
     * The Network Name.
     * Network Name
     */
    @SerializedName(value = "networkName", alternate = {"NetworkName"})
    @Expose
	@Nullable
    public String networkName;

    /**
     * The Pre Shared Key.
     * This is the pre-shared key for WPA Personal Wi-Fi network.
     */
    @SerializedName(value = "preSharedKey", alternate = {"PreSharedKey"})
    @Expose
	@Nullable
    public String preSharedKey;

    /**
     * The Proxy Automatic Configuration Url.
     * URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     */
    @SerializedName(value = "proxyAutomaticConfigurationUrl", alternate = {"ProxyAutomaticConfigurationUrl"})
    @Expose
	@Nullable
    public String proxyAutomaticConfigurationUrl;

    /**
     * The Proxy Manual Address.
     * IP Address or DNS hostname of the proxy server when manual configuration is selected.
     */
    @SerializedName(value = "proxyManualAddress", alternate = {"ProxyManualAddress"})
    @Expose
	@Nullable
    public String proxyManualAddress;

    /**
     * The Proxy Manual Port.
     * Port of the proxy server when manual configuration is selected.
     */
    @SerializedName(value = "proxyManualPort", alternate = {"ProxyManualPort"})
    @Expose
	@Nullable
    public Integer proxyManualPort;

    /**
     * The Proxy Settings.
     * Proxy Type for this Wi-Fi connection. Possible values are: none, manual, automatic.
     */
    @SerializedName(value = "proxySettings", alternate = {"ProxySettings"})
    @Expose
	@Nullable
    public WiFiProxySetting proxySettings;

    /**
     * The Ssid.
     * This is the name of the Wi-Fi network that is broadcast to all devices.
     */
    @SerializedName(value = "ssid", alternate = {"Ssid"})
    @Expose
	@Nullable
    public String ssid;

    /**
     * The Wi Fi Security Type.
     * Indicates whether Wi-Fi endpoint uses an EAP based security type. Possible values are: open, wpaPersonal, wpaEnterprise, wep, wpa2Personal, wpa2Enterprise.
     */
    @SerializedName(value = "wiFiSecurityType", alternate = {"WiFiSecurityType"})
    @Expose
	@Nullable
    public WiFiSecurityType wiFiSecurityType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
