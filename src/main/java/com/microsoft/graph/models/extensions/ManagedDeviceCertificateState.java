// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CertificateIssuanceStates;
import com.microsoft.graph.models.generated.KeyStorageProviderOption;
import com.microsoft.graph.models.generated.KeyUsages;
import com.microsoft.graph.models.generated.CertificateRevocationStatus;
import com.microsoft.graph.models.generated.SubjectAlternativeNameType;
import com.microsoft.graph.models.generated.SubjectNameFormat;
import com.microsoft.graph.models.generated.CertificateValidityPeriodScale;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Certificate State.
 */
public class ManagedDeviceCertificateState extends Entity implements IJsonBackedObject {


    /**
     * The Certificate Enhanced Key Usage.
     * Extended key usage
     */
    @SerializedName(value = "certificateEnhancedKeyUsage", alternate = {"CertificateEnhancedKeyUsage"})
    @Expose
    public String certificateEnhancedKeyUsage;

    /**
     * The Certificate Error Code.
     * Error code
     */
    @SerializedName(value = "certificateErrorCode", alternate = {"CertificateErrorCode"})
    @Expose
    public Integer certificateErrorCode;

    /**
     * The Certificate Expiration Date Time.
     * Certificate expiry date
     */
    @SerializedName(value = "certificateExpirationDateTime", alternate = {"CertificateExpirationDateTime"})
    @Expose
    public java.util.Calendar certificateExpirationDateTime;

    /**
     * The Certificate Issuance Date Time.
     * Issuance date
     */
    @SerializedName(value = "certificateIssuanceDateTime", alternate = {"CertificateIssuanceDateTime"})
    @Expose
    public java.util.Calendar certificateIssuanceDateTime;

    /**
     * The Certificate Issuance State.
     * Issuance State
     */
    @SerializedName(value = "certificateIssuanceState", alternate = {"CertificateIssuanceState"})
    @Expose
    public CertificateIssuanceStates certificateIssuanceState;

    /**
     * The Certificate Issuer.
     * Issuer
     */
    @SerializedName(value = "certificateIssuer", alternate = {"CertificateIssuer"})
    @Expose
    public String certificateIssuer;

    /**
     * The Certificate Key Length.
     * Key length
     */
    @SerializedName(value = "certificateKeyLength", alternate = {"CertificateKeyLength"})
    @Expose
    public Integer certificateKeyLength;

    /**
     * The Certificate Key Storage Provider.
     * Key Storage Provider
     */
    @SerializedName(value = "certificateKeyStorageProvider", alternate = {"CertificateKeyStorageProvider"})
    @Expose
    public KeyStorageProviderOption certificateKeyStorageProvider;

    /**
     * The Certificate Key Usage.
     * Key usage
     */
    @SerializedName(value = "certificateKeyUsage", alternate = {"CertificateKeyUsage"})
    @Expose
    public EnumSet<KeyUsages> certificateKeyUsage;

    /**
     * The Certificate Last Issuance State Changed Date Time.
     * Last certificate issuance state change
     */
    @SerializedName(value = "certificateLastIssuanceStateChangedDateTime", alternate = {"CertificateLastIssuanceStateChangedDateTime"})
    @Expose
    public java.util.Calendar certificateLastIssuanceStateChangedDateTime;

    /**
     * The Certificate Profile Display Name.
     * Certificate profile display name
     */
    @SerializedName(value = "certificateProfileDisplayName", alternate = {"CertificateProfileDisplayName"})
    @Expose
    public String certificateProfileDisplayName;

    /**
     * The Certificate Revoke Status.
     * Revoke status
     */
    @SerializedName(value = "certificateRevokeStatus", alternate = {"CertificateRevokeStatus"})
    @Expose
    public CertificateRevocationStatus certificateRevokeStatus;

    /**
     * The Certificate Serial Number.
     * Serial number
     */
    @SerializedName(value = "certificateSerialNumber", alternate = {"CertificateSerialNumber"})
    @Expose
    public String certificateSerialNumber;

    /**
     * The Certificate Subject Alternative Name Format.
     * Subject alternative name format
     */
    @SerializedName(value = "certificateSubjectAlternativeNameFormat", alternate = {"CertificateSubjectAlternativeNameFormat"})
    @Expose
    public EnumSet<SubjectAlternativeNameType> certificateSubjectAlternativeNameFormat;

    /**
     * The Certificate Subject Alternative Name Format String.
     * Subject alternative name format string for custom formats
     */
    @SerializedName(value = "certificateSubjectAlternativeNameFormatString", alternate = {"CertificateSubjectAlternativeNameFormatString"})
    @Expose
    public String certificateSubjectAlternativeNameFormatString;

    /**
     * The Certificate Subject Name Format.
     * Subject name format
     */
    @SerializedName(value = "certificateSubjectNameFormat", alternate = {"CertificateSubjectNameFormat"})
    @Expose
    public SubjectNameFormat certificateSubjectNameFormat;

    /**
     * The Certificate Subject Name Format String.
     * Subject name format string for custom subject name formats
     */
    @SerializedName(value = "certificateSubjectNameFormatString", alternate = {"CertificateSubjectNameFormatString"})
    @Expose
    public String certificateSubjectNameFormatString;

    /**
     * The Certificate Thumbprint.
     * Thumbprint
     */
    @SerializedName(value = "certificateThumbprint", alternate = {"CertificateThumbprint"})
    @Expose
    public String certificateThumbprint;

    /**
     * The Certificate Validity Period.
     * Validity period
     */
    @SerializedName(value = "certificateValidityPeriod", alternate = {"CertificateValidityPeriod"})
    @Expose
    public Integer certificateValidityPeriod;

    /**
     * The Certificate Validity Period Units.
     * Validity period units
     */
    @SerializedName(value = "certificateValidityPeriodUnits", alternate = {"CertificateValidityPeriodUnits"})
    @Expose
    public CertificateValidityPeriodScale certificateValidityPeriodUnits;

    /**
     * The Device Display Name.
     * Device display name
     */
    @SerializedName(value = "deviceDisplayName", alternate = {"DeviceDisplayName"})
    @Expose
    public String deviceDisplayName;

    /**
     * The Device Platform.
     * Device platform
     */
    @SerializedName(value = "devicePlatform", alternate = {"DevicePlatform"})
    @Expose
    public DevicePlatformType devicePlatform;

    /**
     * The Last Certificate State Change Date Time.
     * Last certificate issuance state change
     */
    @SerializedName(value = "lastCertificateStateChangeDateTime", alternate = {"LastCertificateStateChangeDateTime"})
    @Expose
    public java.util.Calendar lastCertificateStateChangeDateTime;

    /**
     * The User Display Name.
     * User display name
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
    public String userDisplayName;


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
