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
import com.microsoft.graph.models.ContentTypeInfo;
import com.microsoft.graph.models.DocumentSetContent;
import com.microsoft.graph.models.ColumnDefinition;
import com.microsoft.graph.requests.ColumnDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Document Set.
 */
public class DocumentSet implements IJsonBackedObject {

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
     * The Allowed Content Types.
     * Content types allowed in document set.
     */
    @SerializedName(value = "allowedContentTypes", alternate = {"AllowedContentTypes"})
    @Expose
	@Nullable
    public java.util.List<ContentTypeInfo> allowedContentTypes;

    /**
     * The Default Contents.
     * Default contents of document set.
     */
    @SerializedName(value = "defaultContents", alternate = {"DefaultContents"})
    @Expose
	@Nullable
    public java.util.List<DocumentSetContent> defaultContents;

    /**
     * The Propagate Welcome Page Changes.
     * Specifies whether to push welcome page changes to inherited content types.
     */
    @SerializedName(value = "propagateWelcomePageChanges", alternate = {"PropagateWelcomePageChanges"})
    @Expose
	@Nullable
    public Boolean propagateWelcomePageChanges;

    /**
     * The Should Prefix Name To File.
     * Add the name of the document set to each file name.
     */
    @SerializedName(value = "shouldPrefixNameToFile", alternate = {"ShouldPrefixNameToFile"})
    @Expose
	@Nullable
    public Boolean shouldPrefixNameToFile;

    /**
     * The Welcome Page Url.
     * Welcome page absolute URL.
     */
    @SerializedName(value = "welcomePageUrl", alternate = {"WelcomePageUrl"})
    @Expose
	@Nullable
    public String welcomePageUrl;

    /**
     * The Shared Columns.
     * 
     */
    @SerializedName(value = "sharedColumns", alternate = {"SharedColumns"})
    @Expose
	@Nullable
    public ColumnDefinitionCollectionPage sharedColumns;

    /**
     * The Welcome Page Columns.
     * 
     */
    @SerializedName(value = "welcomePageColumns", alternate = {"WelcomePageColumns"})
    @Expose
	@Nullable
    public ColumnDefinitionCollectionPage welcomePageColumns;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
