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
 * The class for the Payment Term.
 */
public class PaymentTerm extends Entity implements IJsonBackedObject {


    /**
     * The Calculate Discount On Credit Memos.
     * 
     */
    @SerializedName(value = "calculateDiscountOnCreditMemos", alternate = {"CalculateDiscountOnCreditMemos"})
    @Expose
    public Boolean calculateDiscountOnCreditMemos;

    /**
     * The Code.
     * 
     */
    @SerializedName(value = "code", alternate = {"Code"})
    @Expose
    public String code;

    /**
     * The Discount Date Calculation.
     * 
     */
    @SerializedName(value = "discountDateCalculation", alternate = {"DiscountDateCalculation"})
    @Expose
    public String discountDateCalculation;

    /**
     * The Discount Percent.
     * 
     */
    @SerializedName(value = "discountPercent", alternate = {"DiscountPercent"})
    @Expose
    public java.math.BigDecimal discountPercent;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Due Date Calculation.
     * 
     */
    @SerializedName(value = "dueDateCalculation", alternate = {"DueDateCalculation"})
    @Expose
    public String dueDateCalculation;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;


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
