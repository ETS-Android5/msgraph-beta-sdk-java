// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EndpointSecurityConfigurationApplicablePlatform;
import com.microsoft.graph.models.generated.EndpointSecurityConfigurationType;
import com.microsoft.graph.models.generated.EndpointSecurityConfigurationProfileType;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.VulnerableManagedDevice;
import com.microsoft.graph.models.extensions.DeviceAppManagementTask;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Configuration Task.
 */
public class SecurityConfigurationTask extends DeviceAppManagementTask implements IJsonBackedObject {


    /**
     * The Applicable Platform.
     * The applicable platform.
     */
    @SerializedName(value = "applicablePlatform", alternate = {"ApplicablePlatform"})
    @Expose
    public EndpointSecurityConfigurationApplicablePlatform applicablePlatform;

    /**
     * The Endpoint Security Policy.
     * The endpoint security policy type.
     */
    @SerializedName(value = "endpointSecurityPolicy", alternate = {"EndpointSecurityPolicy"})
    @Expose
    public EndpointSecurityConfigurationType endpointSecurityPolicy;

    /**
     * The Endpoint Security Policy Profile.
     * The endpoint security policy profile.
     */
    @SerializedName(value = "endpointSecurityPolicyProfile", alternate = {"EndpointSecurityPolicyProfile"})
    @Expose
    public EndpointSecurityConfigurationProfileType endpointSecurityPolicyProfile;

    /**
     * The Insights.
     * Information about the mitigation.
     */
    @SerializedName(value = "insights", alternate = {"Insights"})
    @Expose
    public String insights;

    /**
     * The Intended Settings.
     * The intended settings and their values.
     */
    @SerializedName(value = "intendedSettings", alternate = {"IntendedSettings"})
    @Expose
    public java.util.List<KeyValuePair> intendedSettings;

    /**
     * The Managed Device Count.
     * The number of vulnerable devices.
     */
    @SerializedName(value = "managedDeviceCount", alternate = {"ManagedDeviceCount"})
    @Expose
    public Integer managedDeviceCount;

    /**
     * The Managed Devices.
     * The vulnerable managed devices.
     */
    @SerializedName(value = "managedDevices", alternate = {"ManagedDevices"})
    @Expose
    public VulnerableManagedDeviceCollectionPage managedDevices;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("managedDevices")) {
            managedDevices = serializer.deserializeObject(json.get("managedDevices").toString(), VulnerableManagedDeviceCollectionPage.class);
        }
    }
}
