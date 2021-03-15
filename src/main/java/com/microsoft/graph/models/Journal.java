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
import com.microsoft.graph.models.Account;
import com.microsoft.graph.models.JournalLine;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.JournalLineCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Journal.
 */
public class Journal extends Entity implements IJsonBackedObject {


    /**
     * The Balancing Account Id.
     * 
     */
    @SerializedName(value = "balancingAccountId", alternate = {"BalancingAccountId"})
    @Expose
	@Nullable
    public java.util.UUID balancingAccountId;

    /**
     * The Balancing Account Number.
     * 
     */
    @SerializedName(value = "balancingAccountNumber", alternate = {"BalancingAccountNumber"})
    @Expose
	@Nullable
    public String balancingAccountNumber;

    /**
     * The Code.
     * 
     */
    @SerializedName(value = "code", alternate = {"Code"})
    @Expose
	@Nullable
    public String code;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Account.
     * 
     */
    @SerializedName(value = "account", alternate = {"Account"})
    @Expose
	@Nullable
    public Account account;

    /**
     * The Journal Lines.
     * 
     */
    @SerializedName(value = "journalLines", alternate = {"JournalLines"})
    @Expose
	@Nullable
    public JournalLineCollectionPage journalLines;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("journalLines")) {
            journalLines = serializer.deserializeObject(json.get("journalLines"), JournalLineCollectionPage.class);
        }
    }
}
