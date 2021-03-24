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
import com.microsoft.graph.models.DeliveryOptimizationBandwidth;
import com.microsoft.graph.models.WindowsDeliveryOptimizationMode;
import com.microsoft.graph.models.DeliveryOptimizationGroupIdSource;
import com.microsoft.graph.models.DeliveryOptimizationMaxCacheSize;
import com.microsoft.graph.models.DeliveryOptimizationRestrictPeerSelectionByOptions;
import com.microsoft.graph.models.Enablement;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Delivery Optimization Configuration.
 */
public class WindowsDeliveryOptimizationConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Background Download From Http Delay In Seconds.
     * Specifies number of seconds to delay an HTTP source in a background download that is allowed to use peer-to-peer. Valid values 0 to 4294967295
     */
    @SerializedName(value = "backgroundDownloadFromHttpDelayInSeconds", alternate = {"BackgroundDownloadFromHttpDelayInSeconds"})
    @Expose
	@Nullable
    public Long backgroundDownloadFromHttpDelayInSeconds;

    /**
     * The Bandwidth Mode.
     * Specifies foreground and background bandwidth usage using percentages, absolutes, or hours.
     */
    @SerializedName(value = "bandwidthMode", alternate = {"BandwidthMode"})
    @Expose
	@Nullable
    public DeliveryOptimizationBandwidth bandwidthMode;

    /**
     * The Cache Server Background Download Fallback To Http Delay In Seconds.
     * Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a background download. Valid values 0 to 2592000.
     */
    @SerializedName(value = "cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds", alternate = {"CacheServerBackgroundDownloadFallbackToHttpDelayInSeconds"})
    @Expose
	@Nullable
    public Integer cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds;

    /**
     * The Cache Server Foreground Download Fallback To Http Delay In Seconds.
     * Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a foreground download. Valid values 0 to 2592000.​
     */
    @SerializedName(value = "cacheServerForegroundDownloadFallbackToHttpDelayInSeconds", alternate = {"CacheServerForegroundDownloadFallbackToHttpDelayInSeconds"})
    @Expose
	@Nullable
    public Integer cacheServerForegroundDownloadFallbackToHttpDelayInSeconds;

    /**
     * The Cache Server Host Names.
     * Specifies cache servers host names.
     */
    @SerializedName(value = "cacheServerHostNames", alternate = {"CacheServerHostNames"})
    @Expose
	@Nullable
    public java.util.List<String> cacheServerHostNames;

    /**
     * The Delivery Optimization Mode.
     * Specifies the download method that delivery optimization can use to manage network bandwidth consumption for large content distribution scenarios. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
     */
    @SerializedName(value = "deliveryOptimizationMode", alternate = {"DeliveryOptimizationMode"})
    @Expose
	@Nullable
    public WindowsDeliveryOptimizationMode deliveryOptimizationMode;

    /**
     * The Foreground Download From Http Delay In Seconds.
     * Specifying 0 sets Delivery Optimization to manage this setting using the cloud service. Valid values 0 to 86400
     */
    @SerializedName(value = "foregroundDownloadFromHttpDelayInSeconds", alternate = {"ForegroundDownloadFromHttpDelayInSeconds"})
    @Expose
	@Nullable
    public Long foregroundDownloadFromHttpDelayInSeconds;

    /**
     * The Group Id Source.
     * The options set in this policy only apply to Delivery Optimization mode Group (2) download mode. If Group (2) isn't set as Download mode, this policy will be ignored. For option 3 - DHCP Option ID, the client will query DHCP Option ID 234 and use the returned GUID value as the Group ID.
     */
    @SerializedName(value = "groupIdSource", alternate = {"GroupIdSource"})
    @Expose
	@Nullable
    public DeliveryOptimizationGroupIdSource groupIdSource;

    /**
     * The Maximum Cache Age In Days.
     * Specifies the maximum time in days that each file is held in the Delivery Optimization cache after downloading successfully (0-3650). Valid values 0 to 3650
     */
    @SerializedName(value = "maximumCacheAgeInDays", alternate = {"MaximumCacheAgeInDays"})
    @Expose
	@Nullable
    public Integer maximumCacheAgeInDays;

    /**
     * The Maximum Cache Size.
     * Specifies the maximum cache size that Delivery Optimization either as a percentage or in GB.
     */
    @SerializedName(value = "maximumCacheSize", alternate = {"MaximumCacheSize"})
    @Expose
	@Nullable
    public DeliveryOptimizationMaxCacheSize maximumCacheSize;

    /**
     * The Minimum Battery Percentage Allowed To Upload.
     * The default value is 0. The value 0 (zero) means "not limited" and the cloud service default value will be used. Valid values 0 to 100
     */
    @SerializedName(value = "minimumBatteryPercentageAllowedToUpload", alternate = {"MinimumBatteryPercentageAllowedToUpload"})
    @Expose
	@Nullable
    public Integer minimumBatteryPercentageAllowedToUpload;

    /**
     * The Minimum Disk Size Allowed To Peer In Gigabytes.
     * Recommended values: 64 GB to 256 GB. Valid values 1 to 100000
     */
    @SerializedName(value = "minimumDiskSizeAllowedToPeerInGigabytes", alternate = {"MinimumDiskSizeAllowedToPeerInGigabytes"})
    @Expose
	@Nullable
    public Integer minimumDiskSizeAllowedToPeerInGigabytes;

    /**
     * The Minimum File Size To Cache In Megabytes.
     * Recommended values: 1 MB to 100,000 MB. Valid values 1 to 100000
     */
    @SerializedName(value = "minimumFileSizeToCacheInMegabytes", alternate = {"MinimumFileSizeToCacheInMegabytes"})
    @Expose
	@Nullable
    public Integer minimumFileSizeToCacheInMegabytes;

    /**
     * The Minimum Ram Allowed To Peer In Gigabytes.
     * Specifies the minimum RAM size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     */
    @SerializedName(value = "minimumRamAllowedToPeerInGigabytes", alternate = {"MinimumRamAllowedToPeerInGigabytes"})
    @Expose
	@Nullable
    public Integer minimumRamAllowedToPeerInGigabytes;

    /**
     * The Modify Cache Location.
     * Specifies the drive that Delivery Optimization should use for its cache.
     */
    @SerializedName(value = "modifyCacheLocation", alternate = {"ModifyCacheLocation"})
    @Expose
	@Nullable
    public String modifyCacheLocation;

    /**
     * The Restrict Peer Selection By.
     * Option 1 (Subnet mask) only applies to Delivery Optimization modes Download Mode LAN (1) and Group (2).
     */
    @SerializedName(value = "restrictPeerSelectionBy", alternate = {"RestrictPeerSelectionBy"})
    @Expose
	@Nullable
    public DeliveryOptimizationRestrictPeerSelectionByOptions restrictPeerSelectionBy;

    /**
     * The Vpn Peer Caching.
     * Specifies whether the device is allowed to participate in Peer Caching while connected via VPN to the domain network.
     */
    @SerializedName(value = "vpnPeerCaching", alternate = {"VpnPeerCaching"})
    @Expose
	@Nullable
    public Enablement vpnPeerCaching;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
