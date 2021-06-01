// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.CertificateIssuanceStates;
import com.microsoft.graph.models.KeyStorageProviderOption;
import com.microsoft.graph.models.KeyUsages;
import com.microsoft.graph.models.CertificateRevocationStatus;
import com.microsoft.graph.models.SubjectAlternativeNameType;
import com.microsoft.graph.models.SubjectNameFormat;
import com.microsoft.graph.models.CertificateValidityPeriodScale;
import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

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
	@Nullable
    public String certificateEnhancedKeyUsage;

    /**
     * The Certificate Error Code.
     * Error code
     */
    @SerializedName(value = "certificateErrorCode", alternate = {"CertificateErrorCode"})
    @Expose
	@Nullable
    public Integer certificateErrorCode;

    /**
     * The Certificate Expiration Date Time.
     * Certificate expiry date
     */
    @SerializedName(value = "certificateExpirationDateTime", alternate = {"CertificateExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime certificateExpirationDateTime;

    /**
     * The Certificate Issuance Date Time.
     * Issuance date
     */
    @SerializedName(value = "certificateIssuanceDateTime", alternate = {"CertificateIssuanceDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime certificateIssuanceDateTime;

    /**
     * The Certificate Issuance State.
     * Issuance State. Possible values are: unknown, challengeIssued, challengeIssueFailed, requestCreationFailed, requestSubmitFailed, challengeValidationSucceeded, challengeValidationFailed, issueFailed, issuePending, issued, responseProcessingFailed, responsePending, enrollmentSucceeded, enrollmentNotNeeded, revoked, removedFromCollection, renewVerified, installFailed, installed, deleteFailed, deleted, renewalRequested, requested.
     */
    @SerializedName(value = "certificateIssuanceState", alternate = {"CertificateIssuanceState"})
    @Expose
	@Nullable
    public CertificateIssuanceStates certificateIssuanceState;

    /**
     * The Certificate Issuer.
     * Issuer
     */
    @SerializedName(value = "certificateIssuer", alternate = {"CertificateIssuer"})
    @Expose
	@Nullable
    public String certificateIssuer;

    /**
     * The Certificate Key Length.
     * Key length
     */
    @SerializedName(value = "certificateKeyLength", alternate = {"CertificateKeyLength"})
    @Expose
	@Nullable
    public Integer certificateKeyLength;

    /**
     * The Certificate Key Storage Provider.
     * Key Storage Provider. Possible values are: useTpmKspOtherwiseUseSoftwareKsp, useTpmKspOtherwiseFail, usePassportForWorkKspOtherwiseFail, useSoftwareKsp.
     */
    @SerializedName(value = "certificateKeyStorageProvider", alternate = {"CertificateKeyStorageProvider"})
    @Expose
	@Nullable
    public KeyStorageProviderOption certificateKeyStorageProvider;

    /**
     * The Certificate Key Usage.
     * Key usage. Possible values are: keyEncipherment, digitalSignature.
     */
    @SerializedName(value = "certificateKeyUsage", alternate = {"CertificateKeyUsage"})
    @Expose
	@Nullable
    public EnumSet<KeyUsages> certificateKeyUsage;

    /**
     * The Certificate Last Issuance State Changed Date Time.
     * Last certificate issuance state change
     */
    @SerializedName(value = "certificateLastIssuanceStateChangedDateTime", alternate = {"CertificateLastIssuanceStateChangedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime certificateLastIssuanceStateChangedDateTime;

    /**
     * The Certificate Profile Display Name.
     * Certificate profile display name
     */
    @SerializedName(value = "certificateProfileDisplayName", alternate = {"CertificateProfileDisplayName"})
    @Expose
	@Nullable
    public String certificateProfileDisplayName;

    /**
     * The Certificate Revoke Status.
     * Revoke status. Possible values are: none, pending, issued, failed, revoked.
     */
    @SerializedName(value = "certificateRevokeStatus", alternate = {"CertificateRevokeStatus"})
    @Expose
	@Nullable
    public CertificateRevocationStatus certificateRevokeStatus;

    /**
     * The Certificate Serial Number.
     * Serial number
     */
    @SerializedName(value = "certificateSerialNumber", alternate = {"CertificateSerialNumber"})
    @Expose
	@Nullable
    public String certificateSerialNumber;

    /**
     * The Certificate Subject Alternative Name Format.
     * Subject alternative name format. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     */
    @SerializedName(value = "certificateSubjectAlternativeNameFormat", alternate = {"CertificateSubjectAlternativeNameFormat"})
    @Expose
	@Nullable
    public EnumSet<SubjectAlternativeNameType> certificateSubjectAlternativeNameFormat;

    /**
     * The Certificate Subject Alternative Name Format String.
     * Subject alternative name format string for custom formats
     */
    @SerializedName(value = "certificateSubjectAlternativeNameFormatString", alternate = {"CertificateSubjectAlternativeNameFormatString"})
    @Expose
	@Nullable
    public String certificateSubjectAlternativeNameFormatString;

    /**
     * The Certificate Subject Name Format.
     * Subject name format. Possible values are: commonName, commonNameIncludingEmail, commonNameAsEmail, custom, commonNameAsIMEI, commonNameAsSerialNumber, commonNameAsAadDeviceId, commonNameAsIntuneDeviceId, commonNameAsDurableDeviceId.
     */
    @SerializedName(value = "certificateSubjectNameFormat", alternate = {"CertificateSubjectNameFormat"})
    @Expose
	@Nullable
    public SubjectNameFormat certificateSubjectNameFormat;

    /**
     * The Certificate Subject Name Format String.
     * Subject name format string for custom subject name formats
     */
    @SerializedName(value = "certificateSubjectNameFormatString", alternate = {"CertificateSubjectNameFormatString"})
    @Expose
	@Nullable
    public String certificateSubjectNameFormatString;

    /**
     * The Certificate Thumbprint.
     * Thumbprint
     */
    @SerializedName(value = "certificateThumbprint", alternate = {"CertificateThumbprint"})
    @Expose
	@Nullable
    public String certificateThumbprint;

    /**
     * The Certificate Validity Period.
     * Validity period
     */
    @SerializedName(value = "certificateValidityPeriod", alternate = {"CertificateValidityPeriod"})
    @Expose
	@Nullable
    public Integer certificateValidityPeriod;

    /**
     * The Certificate Validity Period Units.
     * Validity period units. Possible values are: days, months, years.
     */
    @SerializedName(value = "certificateValidityPeriodUnits", alternate = {"CertificateValidityPeriodUnits"})
    @Expose
	@Nullable
    public CertificateValidityPeriodScale certificateValidityPeriodUnits;

    /**
     * The Device Display Name.
     * Device display name
     */
    @SerializedName(value = "deviceDisplayName", alternate = {"DeviceDisplayName"})
    @Expose
	@Nullable
    public String deviceDisplayName;

    /**
     * The Device Platform.
     * Device platform. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown, androidAOSP.
     */
    @SerializedName(value = "devicePlatform", alternate = {"DevicePlatform"})
    @Expose
	@Nullable
    public DevicePlatformType devicePlatform;

    /**
     * The Last Certificate State Change Date Time.
     * Last certificate issuance state change
     */
    @SerializedName(value = "lastCertificateStateChangeDateTime", alternate = {"LastCertificateStateChangeDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastCertificateStateChangeDateTime;

    /**
     * The User Display Name.
     * User display name
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
	@Nullable
    public String userDisplayName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
