// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.EdiscoverySearch;
import com.microsoft.graph.security.models.CaseOperation;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Estimate Operation.
 */
public class EdiscoveryEstimateOperation extends CaseOperation implements IJsonBackedObject {


    /**
     * The Indexed Item Count.
     * 
     */
    @SerializedName(value = "indexedItemCount", alternate = {"IndexedItemCount"})
    @Expose
	@Nullable
    public Long indexedItemCount;

    /**
     * The Indexed Items Size.
     * 
     */
    @SerializedName(value = "indexedItemsSize", alternate = {"IndexedItemsSize"})
    @Expose
	@Nullable
    public Long indexedItemsSize;

    /**
     * The Mailbox Count.
     * 
     */
    @SerializedName(value = "mailboxCount", alternate = {"MailboxCount"})
    @Expose
	@Nullable
    public Integer mailboxCount;

    /**
     * The Site Count.
     * 
     */
    @SerializedName(value = "siteCount", alternate = {"SiteCount"})
    @Expose
	@Nullable
    public Integer siteCount;

    /**
     * The Unindexed Item Count.
     * 
     */
    @SerializedName(value = "unindexedItemCount", alternate = {"UnindexedItemCount"})
    @Expose
	@Nullable
    public Long unindexedItemCount;

    /**
     * The Unindexed Items Size.
     * 
     */
    @SerializedName(value = "unindexedItemsSize", alternate = {"UnindexedItemsSize"})
    @Expose
	@Nullable
    public Long unindexedItemsSize;

    /**
     * The Search.
     * 
     */
    @SerializedName(value = "search", alternate = {"Search"})
    @Expose
	@Nullable
    public EdiscoverySearch search;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
