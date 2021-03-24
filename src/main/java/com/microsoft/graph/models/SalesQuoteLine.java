// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Account;
import com.microsoft.graph.models.Item;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Quote Line.
 */
public class SalesQuoteLine extends Entity implements IJsonBackedObject {


    /**
     * The Account Id.
     * 
     */
    @SerializedName(value = "accountId", alternate = {"AccountId"})
    @Expose
	@Nullable
    public java.util.UUID accountId;

    /**
     * The Amount Excluding Tax.
     * 
     */
    @SerializedName(value = "amountExcludingTax", alternate = {"AmountExcludingTax"})
    @Expose
	@Nullable
    public java.math.BigDecimal amountExcludingTax;

    /**
     * The Amount Including Tax.
     * 
     */
    @SerializedName(value = "amountIncludingTax", alternate = {"AmountIncludingTax"})
    @Expose
	@Nullable
    public java.math.BigDecimal amountIncludingTax;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Discount Amount.
     * 
     */
    @SerializedName(value = "discountAmount", alternate = {"DiscountAmount"})
    @Expose
	@Nullable
    public java.math.BigDecimal discountAmount;

    /**
     * The Discount Applied Before Tax.
     * 
     */
    @SerializedName(value = "discountAppliedBeforeTax", alternate = {"DiscountAppliedBeforeTax"})
    @Expose
	@Nullable
    public Boolean discountAppliedBeforeTax;

    /**
     * The Discount Percent.
     * 
     */
    @SerializedName(value = "discountPercent", alternate = {"DiscountPercent"})
    @Expose
	@Nullable
    public java.math.BigDecimal discountPercent;

    /**
     * The Document Id.
     * 
     */
    @SerializedName(value = "documentId", alternate = {"DocumentId"})
    @Expose
	@Nullable
    public java.util.UUID documentId;

    /**
     * The Item Id.
     * 
     */
    @SerializedName(value = "itemId", alternate = {"ItemId"})
    @Expose
	@Nullable
    public java.util.UUID itemId;

    /**
     * The Line Type.
     * 
     */
    @SerializedName(value = "lineType", alternate = {"LineType"})
    @Expose
	@Nullable
    public String lineType;

    /**
     * The Net Amount.
     * 
     */
    @SerializedName(value = "netAmount", alternate = {"NetAmount"})
    @Expose
	@Nullable
    public java.math.BigDecimal netAmount;

    /**
     * The Net Amount Including Tax.
     * 
     */
    @SerializedName(value = "netAmountIncludingTax", alternate = {"NetAmountIncludingTax"})
    @Expose
	@Nullable
    public java.math.BigDecimal netAmountIncludingTax;

    /**
     * The Net Tax Amount.
     * 
     */
    @SerializedName(value = "netTaxAmount", alternate = {"NetTaxAmount"})
    @Expose
	@Nullable
    public java.math.BigDecimal netTaxAmount;

    /**
     * The Quantity.
     * 
     */
    @SerializedName(value = "quantity", alternate = {"Quantity"})
    @Expose
	@Nullable
    public java.math.BigDecimal quantity;

    /**
     * The Sequence.
     * 
     */
    @SerializedName(value = "sequence", alternate = {"Sequence"})
    @Expose
	@Nullable
    public Integer sequence;

    /**
     * The Tax Code.
     * 
     */
    @SerializedName(value = "taxCode", alternate = {"TaxCode"})
    @Expose
	@Nullable
    public String taxCode;

    /**
     * The Tax Percent.
     * 
     */
    @SerializedName(value = "taxPercent", alternate = {"TaxPercent"})
    @Expose
	@Nullable
    public java.math.BigDecimal taxPercent;

    /**
     * The Total Tax Amount.
     * 
     */
    @SerializedName(value = "totalTaxAmount", alternate = {"TotalTaxAmount"})
    @Expose
	@Nullable
    public java.math.BigDecimal totalTaxAmount;

    /**
     * The Unit Of Measure Id.
     * 
     */
    @SerializedName(value = "unitOfMeasureId", alternate = {"UnitOfMeasureId"})
    @Expose
	@Nullable
    public java.util.UUID unitOfMeasureId;

    /**
     * The Unit Price.
     * 
     */
    @SerializedName(value = "unitPrice", alternate = {"UnitPrice"})
    @Expose
	@Nullable
    public java.math.BigDecimal unitPrice;

    /**
     * The Account.
     * 
     */
    @SerializedName(value = "account", alternate = {"Account"})
    @Expose
	@Nullable
    public Account account;

    /**
     * The Item.
     * 
     */
    @SerializedName(value = "item", alternate = {"Item"})
    @Expose
	@Nullable
    public Item item;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
