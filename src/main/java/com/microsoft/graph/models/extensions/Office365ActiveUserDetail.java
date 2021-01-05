// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office365Active User Detail.
 */
public class Office365ActiveUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Assigned Products.
     * 
     */
    @SerializedName(value = "assignedProducts", alternate = {"AssignedProducts"})
    @Expose
    public java.util.List<String> assignedProducts;

    /**
     * The Deleted Date.
     * 
     */
    @SerializedName(value = "deletedDate", alternate = {"DeletedDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly deletedDate;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Exchange Last Activity Date.
     * 
     */
    @SerializedName(value = "exchangeLastActivityDate", alternate = {"ExchangeLastActivityDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly exchangeLastActivityDate;

    /**
     * The Exchange License Assign Date.
     * 
     */
    @SerializedName(value = "exchangeLicenseAssignDate", alternate = {"ExchangeLicenseAssignDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly exchangeLicenseAssignDate;

    /**
     * The Has Exchange License.
     * 
     */
    @SerializedName(value = "hasExchangeLicense", alternate = {"HasExchangeLicense"})
    @Expose
    public Boolean hasExchangeLicense;

    /**
     * The Has One Drive License.
     * 
     */
    @SerializedName(value = "hasOneDriveLicense", alternate = {"HasOneDriveLicense"})
    @Expose
    public Boolean hasOneDriveLicense;

    /**
     * The Has Share Point License.
     * 
     */
    @SerializedName(value = "hasSharePointLicense", alternate = {"HasSharePointLicense"})
    @Expose
    public Boolean hasSharePointLicense;

    /**
     * The Has Skype For Business License.
     * 
     */
    @SerializedName(value = "hasSkypeForBusinessLicense", alternate = {"HasSkypeForBusinessLicense"})
    @Expose
    public Boolean hasSkypeForBusinessLicense;

    /**
     * The Has Teams License.
     * 
     */
    @SerializedName(value = "hasTeamsLicense", alternate = {"HasTeamsLicense"})
    @Expose
    public Boolean hasTeamsLicense;

    /**
     * The Has Yammer License.
     * 
     */
    @SerializedName(value = "hasYammerLicense", alternate = {"HasYammerLicense"})
    @Expose
    public Boolean hasYammerLicense;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName(value = "isDeleted", alternate = {"IsDeleted"})
    @Expose
    public Boolean isDeleted;

    /**
     * The One Drive Last Activity Date.
     * 
     */
    @SerializedName(value = "oneDriveLastActivityDate", alternate = {"OneDriveLastActivityDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly oneDriveLastActivityDate;

    /**
     * The One Drive License Assign Date.
     * 
     */
    @SerializedName(value = "oneDriveLicenseAssignDate", alternate = {"OneDriveLicenseAssignDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly oneDriveLicenseAssignDate;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Share Point Last Activity Date.
     * 
     */
    @SerializedName(value = "sharePointLastActivityDate", alternate = {"SharePointLastActivityDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly sharePointLastActivityDate;

    /**
     * The Share Point License Assign Date.
     * 
     */
    @SerializedName(value = "sharePointLicenseAssignDate", alternate = {"SharePointLicenseAssignDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly sharePointLicenseAssignDate;

    /**
     * The Skype For Business Last Activity Date.
     * 
     */
    @SerializedName(value = "skypeForBusinessLastActivityDate", alternate = {"SkypeForBusinessLastActivityDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly skypeForBusinessLastActivityDate;

    /**
     * The Skype For Business License Assign Date.
     * 
     */
    @SerializedName(value = "skypeForBusinessLicenseAssignDate", alternate = {"SkypeForBusinessLicenseAssignDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly skypeForBusinessLicenseAssignDate;

    /**
     * The Teams Last Activity Date.
     * 
     */
    @SerializedName(value = "teamsLastActivityDate", alternate = {"TeamsLastActivityDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly teamsLastActivityDate;

    /**
     * The Teams License Assign Date.
     * 
     */
    @SerializedName(value = "teamsLicenseAssignDate", alternate = {"TeamsLicenseAssignDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly teamsLicenseAssignDate;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The Yammer Last Activity Date.
     * 
     */
    @SerializedName(value = "yammerLastActivityDate", alternate = {"YammerLastActivityDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly yammerLastActivityDate;

    /**
     * The Yammer License Assign Date.
     * 
     */
    @SerializedName(value = "yammerLicenseAssignDate", alternate = {"YammerLicenseAssignDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly yammerLicenseAssignDate;


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

    }
}
