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
import com.microsoft.graph.models.IosDeviceType;
import com.microsoft.graph.models.VppLicensingType;
import com.microsoft.graph.models.IosVppAppRevokeLicensesActionResult;
import com.microsoft.graph.models.VppTokenAccountType;
import com.microsoft.graph.models.IosVppAppAssignedLicense;
import com.microsoft.graph.models.MobileApp;
import com.microsoft.graph.requests.IosVppAppAssignedLicenseCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp App.
 */
public class IosVppApp extends MobileApp implements IJsonBackedObject {


    /**
     * The Applicable Device Type.
     * The applicable iOS Device Type.
     */
    @SerializedName(value = "applicableDeviceType", alternate = {"ApplicableDeviceType"})
    @Expose
	@Nullable
    public IosDeviceType applicableDeviceType;

    /**
     * The App Store Url.
     * The store URL.
     */
    @SerializedName(value = "appStoreUrl", alternate = {"AppStoreUrl"})
    @Expose
	@Nullable
    public String appStoreUrl;

    /**
     * The Bundle Id.
     * The Identity Name.
     */
    @SerializedName(value = "bundleId", alternate = {"BundleId"})
    @Expose
	@Nullable
    public String bundleId;

    /**
     * The Licensing Type.
     * The supported License Type.
     */
    @SerializedName(value = "licensingType", alternate = {"LicensingType"})
    @Expose
	@Nullable
    public VppLicensingType licensingType;

    /**
     * The Release Date Time.
     * The VPP application release date and time.
     */
    @SerializedName(value = "releaseDateTime", alternate = {"ReleaseDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime releaseDateTime;

    /**
     * The Revoke License Action Results.
     * Results of revoke license actions on this app.
     */
    @SerializedName(value = "revokeLicenseActionResults", alternate = {"RevokeLicenseActionResults"})
    @Expose
	@Nullable
    public java.util.List<IosVppAppRevokeLicensesActionResult> revokeLicenseActionResults;

    /**
     * The Total License Count.
     * The total number of VPP licenses.
     */
    @SerializedName(value = "totalLicenseCount", alternate = {"TotalLicenseCount"})
    @Expose
	@Nullable
    public Integer totalLicenseCount;

    /**
     * The Used License Count.
     * The number of VPP licenses in use.
     */
    @SerializedName(value = "usedLicenseCount", alternate = {"UsedLicenseCount"})
    @Expose
	@Nullable
    public Integer usedLicenseCount;

    /**
     * The Vpp Token Account Type.
     * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     */
    @SerializedName(value = "vppTokenAccountType", alternate = {"VppTokenAccountType"})
    @Expose
	@Nullable
    public VppTokenAccountType vppTokenAccountType;

    /**
     * The Vpp Token Apple Id.
     * The Apple Id associated with the given Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "vppTokenAppleId", alternate = {"VppTokenAppleId"})
    @Expose
	@Nullable
    public String vppTokenAppleId;

    /**
     * The Vpp Token Id.
     * Identifier of the VPP token associated with this app.
     */
    @SerializedName(value = "vppTokenId", alternate = {"VppTokenId"})
    @Expose
	@Nullable
    public String vppTokenId;

    /**
     * The Vpp Token Organization Name.
     * The organization associated with the Apple Volume Purchase Program Token
     */
    @SerializedName(value = "vppTokenOrganizationName", alternate = {"VppTokenOrganizationName"})
    @Expose
	@Nullable
    public String vppTokenOrganizationName;

    /**
     * The Assigned Licenses.
     * The licenses assigned to this app.
     */
    @SerializedName(value = "assignedLicenses", alternate = {"AssignedLicenses"})
    @Expose
	@Nullable
    public IosVppAppAssignedLicenseCollectionPage assignedLicenses;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignedLicenses")) {
            assignedLicenses = serializer.deserializeObject(json.get("assignedLicenses"), IosVppAppAssignedLicenseCollectionPage.class);
        }
    }
}
