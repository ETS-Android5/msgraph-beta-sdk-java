// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.ediscovery.models.LegalHoldStatus;
import com.microsoft.graph.ediscovery.models.SiteSource;
import com.microsoft.graph.ediscovery.models.UnifiedGroupSource;
import com.microsoft.graph.ediscovery.models.UserSource;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.ediscovery.requests.SiteSourceCollectionPage;
import com.microsoft.graph.ediscovery.requests.UnifiedGroupSourceCollectionPage;
import com.microsoft.graph.ediscovery.requests.UserSourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Legal Hold.
 */
public class LegalHold extends Entity implements IJsonBackedObject {


    /**
     * The Content Query.
     * 
     */
    @SerializedName(value = "contentQuery", alternate = {"ContentQuery"})
    @Expose
	@Nullable
    public String contentQuery;

    /**
     * The Created By.
     * 
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Errors.
     * 
     */
    @SerializedName(value = "errors", alternate = {"Errors"})
    @Expose
	@Nullable
    public java.util.List<String> errors;

    /**
     * The Is Enabled.
     * 
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
	@Nullable
    public Boolean isEnabled;

    /**
     * The Last Modified By.
     * 
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public LegalHoldStatus status;

    /**
     * The Site Sources.
     * 
     */
    @SerializedName(value = "siteSources", alternate = {"SiteSources"})
    @Expose
	@Nullable
    public SiteSourceCollectionPage siteSources;

    /**
     * The Unified Group Sources.
     * 
     */
    @SerializedName(value = "unifiedGroupSources", alternate = {"UnifiedGroupSources"})
    @Expose
	@Nullable
    public UnifiedGroupSourceCollectionPage unifiedGroupSources;

    /**
     * The User Sources.
     * 
     */
    @SerializedName(value = "userSources", alternate = {"UserSources"})
    @Expose
	@Nullable
    public UserSourceCollectionPage userSources;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("siteSources")) {
            siteSources = serializer.deserializeObject(json.get("siteSources"), SiteSourceCollectionPage.class);
        }

        if (json.has("unifiedGroupSources")) {
            unifiedGroupSources = serializer.deserializeObject(json.get("unifiedGroupSources"), UnifiedGroupSourceCollectionPage.class);
        }

        if (json.has("userSources")) {
            userSources = serializer.deserializeObject(json.get("userSources"), UserSourceCollectionPage.class);
        }
    }
}
