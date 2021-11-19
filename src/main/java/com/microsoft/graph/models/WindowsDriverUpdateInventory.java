// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DriverApprovalStatus;
import com.microsoft.graph.models.DriverCategory;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Driver Update Inventory.
 */
public class WindowsDriverUpdateInventory extends Entity implements IJsonBackedObject {


    /**
     * The Applicable Device Count.
     * The number of devices for which this driver is applicable.
     */
    @SerializedName(value = "applicableDeviceCount", alternate = {"ApplicableDeviceCount"})
    @Expose
	@Nullable
    public Integer applicableDeviceCount;

    /**
     * The Approval Status.
     * The approval status for this driver.
     */
    @SerializedName(value = "approvalStatus", alternate = {"ApprovalStatus"})
    @Expose
	@Nullable
    public DriverApprovalStatus approvalStatus;

    /**
     * The Category.
     * The category for this driver.
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
	@Nullable
    public DriverCategory category;

    /**
     * The Deploy Date Time.
     * The date time when a driver should be deployed if approvalStatus is approved.
     */
    @SerializedName(value = "deployDateTime", alternate = {"DeployDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime deployDateTime;

    /**
     * The Driver Class.
     * The class of the driver.
     */
    @SerializedName(value = "driverClass", alternate = {"DriverClass"})
    @Expose
	@Nullable
    public String driverClass;

    /**
     * The Manufacturer.
     * The manufacturer of the driver.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Name.
     * The name of the driver.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Release Date Time.
     * The release date time of the driver.
     */
    @SerializedName(value = "releaseDateTime", alternate = {"ReleaseDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime releaseDateTime;

    /**
     * The Version.
     * The version of the driver.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public String version;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
