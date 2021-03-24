// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Identity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sharing Link.
 */
public class SharingLink implements IJsonBackedObject {

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
     * The Application.
     * The app the link is associated with.
     */
    @SerializedName(value = "application", alternate = {"Application"})
    @Expose
	@Nullable
    public Identity application;

    /**
     * The Configurator Url.
     * 
     */
    @SerializedName(value = "configuratorUrl", alternate = {"ConfiguratorUrl"})
    @Expose
	@Nullable
    public String configuratorUrl;

    /**
     * The Prevents Download.
     * If true then the user can only use this link to view the item on the web, and cannot use it to download the contents of the item. Only for OneDrive for Business and SharePoint.
     */
    @SerializedName(value = "preventsDownload", alternate = {"PreventsDownload"})
    @Expose
	@Nullable
    public Boolean preventsDownload;

    /**
     * The Scope.
     * The scope of the link represented by this permission. Value anonymous indicates the link is usable by anyone, organization indicates the link is only usable for users signed into the same tenant.
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
	@Nullable
    public String scope;

    /**
     * The Type.
     * The type of the link created.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;

    /**
     * The Web Html.
     * For embed links, this property contains the HTML code for an &amp;lt;iframe&amp;gt; element that will embed the item in a webpage.
     */
    @SerializedName(value = "webHtml", alternate = {"WebHtml"})
    @Expose
	@Nullable
    public String webHtml;

    /**
     * The Web Url.
     * A URL that opens the item in the browser on the OneDrive website.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
