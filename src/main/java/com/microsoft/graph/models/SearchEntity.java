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
import com.microsoft.graph.search.models.Acronym;
import com.microsoft.graph.search.models.Bookmark;
import com.microsoft.graph.search.models.Qna;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.search.requests.AcronymCollectionPage;
import com.microsoft.graph.search.requests.BookmarkCollectionPage;
import com.microsoft.graph.search.requests.QnaCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Entity.
 */
public class SearchEntity extends Entity implements IJsonBackedObject {


    /**
     * The Acronyms.
     * 
     */
    @SerializedName(value = "acronyms", alternate = {"Acronyms"})
    @Expose
	@Nullable
    public AcronymCollectionPage acronyms;

    /**
     * The Bookmarks.
     * 
     */
    @SerializedName(value = "bookmarks", alternate = {"Bookmarks"})
    @Expose
	@Nullable
    public BookmarkCollectionPage bookmarks;

    /**
     * The Qnas.
     * 
     */
    @SerializedName(value = "qnas", alternate = {"Qnas"})
    @Expose
	@Nullable
    public QnaCollectionPage qnas;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("acronyms")) {
            acronyms = serializer.deserializeObject(json.get("acronyms"), AcronymCollectionPage.class);
        }

        if (json.has("bookmarks")) {
            bookmarks = serializer.deserializeObject(json.get("bookmarks"), BookmarkCollectionPage.class);
        }

        if (json.has("qnas")) {
            qnas = serializer.deserializeObject(json.get("qnas"), QnaCollectionPage.class);
        }
    }
}
