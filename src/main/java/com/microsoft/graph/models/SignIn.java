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
import com.microsoft.graph.models.AppliedConditionalAccessPolicy;
import com.microsoft.graph.models.AuthenticationContext;
import com.microsoft.graph.models.AuthenticationDetail;
import com.microsoft.graph.models.KeyValue;
import com.microsoft.graph.models.ProtocolType;
import com.microsoft.graph.models.AuthenticationRequirementPolicy;
import com.microsoft.graph.models.ConditionalAccessStatus;
import com.microsoft.graph.models.SignInAccessType;
import com.microsoft.graph.models.DeviceDetail;
import com.microsoft.graph.models.IncomingTokenType;
import com.microsoft.graph.models.SignInLocation;
import com.microsoft.graph.models.MfaDetail;
import com.microsoft.graph.models.NetworkLocationDetail;
import com.microsoft.graph.models.PrivateLinkDetails;
import com.microsoft.graph.models.RiskDetail;
import com.microsoft.graph.models.RiskLevel;
import com.microsoft.graph.models.RiskState;
import com.microsoft.graph.models.SessionLifetimePolicy;
import com.microsoft.graph.models.SignInIdentifierType;
import com.microsoft.graph.models.SignInStatus;
import com.microsoft.graph.models.TokenIssuerType;
import com.microsoft.graph.models.SignInUserType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sign In.
 */
public class SignIn extends Entity implements IJsonBackedObject {


    /**
     * The App Display Name.
     * App name displayed in the Azure Portal. Supports $filter (eq and startsWith operators only).
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
	@Nullable
    public String appDisplayName;

    /**
     * The App Id.
     * Unique GUID representing the app ID in the Azure Active Directory. Supports $filter (eq operator only).
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
	@Nullable
    public String appId;

    /**
     * The Applied Conditional Access Policies.
     * A list of conditional access policies that are triggered by the corresponding sign-in activity.
     */
    @SerializedName(value = "appliedConditionalAccessPolicies", alternate = {"AppliedConditionalAccessPolicies"})
    @Expose
	@Nullable
    public java.util.List<AppliedConditionalAccessPolicy> appliedConditionalAccessPolicies;

    /**
     * The Authentication Context Class References.
     * Contains a collection of values that represent the conditional access authentication contexts applied to the sign-in.
     */
    @SerializedName(value = "authenticationContextClassReferences", alternate = {"AuthenticationContextClassReferences"})
    @Expose
	@Nullable
    public java.util.List<AuthenticationContext> authenticationContextClassReferences;

    /**
     * The Authentication Details.
     * The result of the authentication attempt and additional details on the authentication method.
     */
    @SerializedName(value = "authenticationDetails", alternate = {"AuthenticationDetails"})
    @Expose
	@Nullable
    public java.util.List<AuthenticationDetail> authenticationDetails;

    /**
     * The Authentication Methods Used.
     * The authentication methods used. Possible values: SMS, Authenticator App, App Verification code, Password, FIDO, PTA, or PHS.
     */
    @SerializedName(value = "authenticationMethodsUsed", alternate = {"AuthenticationMethodsUsed"})
    @Expose
	@Nullable
    public java.util.List<String> authenticationMethodsUsed;

    /**
     * The Authentication Processing Details.
     * Additional authentication processing details, such as the agent name in case of PTA/PHS or Server/farm name in case of federated authentication.
     */
    @SerializedName(value = "authenticationProcessingDetails", alternate = {"AuthenticationProcessingDetails"})
    @Expose
	@Nullable
    public java.util.List<KeyValue> authenticationProcessingDetails;

    /**
     * The Authentication Protocol.
     * Lists the protocol type or grant type used in the authentication. The possible values are: none, oAuth2, ropc, wsFederation, saml20, deviceCode, unknownFutureValue. For authentications that use protocols other than the possible values listed, the protocol type is listed as none.
     */
    @SerializedName(value = "authenticationProtocol", alternate = {"AuthenticationProtocol"})
    @Expose
	@Nullable
    public EnumSet<ProtocolType> authenticationProtocol;

    /**
     * The Authentication Requirement.
     * This holds the highest level of authentication needed through all the sign-in steps, for sign-in to succeed. Supports $filter (eq and startsWith operators only).
     */
    @SerializedName(value = "authenticationRequirement", alternate = {"AuthenticationRequirement"})
    @Expose
	@Nullable
    public String authenticationRequirement;

    /**
     * The Authentication Requirement Policies.
     * Sources of authentication requirement, such as conditional access, per-user MFA, identity protection, and security defaults.
     */
    @SerializedName(value = "authenticationRequirementPolicies", alternate = {"AuthenticationRequirementPolicies"})
    @Expose
	@Nullable
    public java.util.List<AuthenticationRequirementPolicy> authenticationRequirementPolicies;

    /**
     * The Autonomous System Number.
     * The Autonomous System Number (ASN) of the network used by the actor.
     */
    @SerializedName(value = "autonomousSystemNumber", alternate = {"AutonomousSystemNumber"})
    @Expose
	@Nullable
    public Integer autonomousSystemNumber;

    /**
     * The Azure Resource Id.
     * Contains a fully qualified Azure Resource Manager ID of an Azure resource accessed during the sign-in.
     */
    @SerializedName(value = "azureResourceId", alternate = {"AzureResourceId"})
    @Expose
	@Nullable
    public String azureResourceId;

    /**
     * The Client App Used.
     * Identifies the client used for the sign-in activity. Modern authentication clients include Browser and modern clients. Legacy authentication clients include Exchange ActiveSync, IMAP, MAPI, SMTP, POP, and other clients. Supports $filter (eq operator only).
     */
    @SerializedName(value = "clientAppUsed", alternate = {"ClientAppUsed"})
    @Expose
	@Nullable
    public String clientAppUsed;

    /**
     * The Conditional Access Status.
     * Reports status of an activated conditional access policy. Possible values are: success, failure, notApplied, and unknownFutureValue. Supports $filter (eq operator only).
     */
    @SerializedName(value = "conditionalAccessStatus", alternate = {"ConditionalAccessStatus"})
    @Expose
	@Nullable
    public ConditionalAccessStatus conditionalAccessStatus;

    /**
     * The Correlation Id.
     * The request ID sent from the client when the sign-in is initiated; used to troubleshoot sign-in activity. Supports $filter (eq operator only).
     */
    @SerializedName(value = "correlationId", alternate = {"CorrelationId"})
    @Expose
	@Nullable
    public String correlationId;

    /**
     * The Created Date Time.
     * Date and time (UTC) the sign-in was initiated. Example: midnight on Jan 1, 2014 is reported as 2014-01-01T00:00:00Z. Supports $orderby and $filter (eq, le, and ge operators only).
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Cross Tenant Access Type.
     * Describes the type of cross-tenant access used by the actor to access the resource. Possible values are: none, b2bCollaboration, b2bDirectConnect, microsoftSupport, serviceProvider, unknownFutureValue. If the sign in did not cross tenant boundaries, the value is none.
     */
    @SerializedName(value = "crossTenantAccessType", alternate = {"CrossTenantAccessType"})
    @Expose
	@Nullable
    public EnumSet<SignInAccessType> crossTenantAccessType;

    /**
     * The Device Detail.
     * Device information from where the sign-in occurred; includes device ID, operating system, and browser. Supports $filter (eq and startsWith operators only) on browser and operatingSytem properties.
     */
    @SerializedName(value = "deviceDetail", alternate = {"DeviceDetail"})
    @Expose
	@Nullable
    public DeviceDetail deviceDetail;

    /**
     * The Federated Credential Id.
     * Contains the identifier of an application's federated identity credential, if a federated identity credential was used to sign in.
     */
    @SerializedName(value = "federatedCredentialId", alternate = {"FederatedCredentialId"})
    @Expose
	@Nullable
    public String federatedCredentialId;

    /**
     * The Flagged For Review.
     * During a failed sign in, a user may click a button in the Azure portal to mark the failed event for tenant admins. If a user clicked the button to flag the failed sign in, this value is true.
     */
    @SerializedName(value = "flaggedForReview", alternate = {"FlaggedForReview"})
    @Expose
	@Nullable
    public Boolean flaggedForReview;

    /**
     * The Home Tenant Id.
     * The tenant identifier of the user initiating the sign in. Not applicable in Managed Identity or service principal sign ins.
     */
    @SerializedName(value = "homeTenantId", alternate = {"HomeTenantId"})
    @Expose
	@Nullable
    public String homeTenantId;

    /**
     * The Home Tenant Name.
     * For user sign ins, the identifier of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content.
     */
    @SerializedName(value = "homeTenantName", alternate = {"HomeTenantName"})
    @Expose
	@Nullable
    public String homeTenantName;

    /**
     * The Incoming Token Type.
     * Indicates the token types that were presented to Azure AD to authenticate the actor in the sign in. The possible values are: none, primaryRefreshToken, saml11, saml20, unknownFutureValue.  NOTE Azure AD may have also used token types not listed in this Enum type to authenticate the actor. Do not infer the lack of a token if it is not one of the types listed.
     */
    @SerializedName(value = "incomingTokenType", alternate = {"IncomingTokenType"})
    @Expose
	@Nullable
    public EnumSet<IncomingTokenType> incomingTokenType;

    /**
     * The Ip Address.
     * IP address of the client used to sign in. Supports $filter (eq and startsWith operators only).
     */
    @SerializedName(value = "ipAddress", alternate = {"IpAddress"})
    @Expose
	@Nullable
    public String ipAddress;

    /**
     * The Ip Address From Resource Provider.
     * The IP address a user used to reach a resource provider, used to determine Conditional Access compliance for some policies. For example, when a user interacts with Exchange Online, the IP address Exchange receives from the user may be recorded here. This value is often null.
     */
    @SerializedName(value = "ipAddressFromResourceProvider", alternate = {"IpAddressFromResourceProvider"})
    @Expose
	@Nullable
    public String ipAddressFromResourceProvider;

    /**
     * The Is Interactive.
     * Indicates if a sign-in is interactive or not.
     */
    @SerializedName(value = "isInteractive", alternate = {"IsInteractive"})
    @Expose
	@Nullable
    public Boolean isInteractive;

    /**
     * The Is Tenant Restricted.
     * Shows whether the sign in event was subject to an Azure AD tenant restriction policy.
     */
    @SerializedName(value = "isTenantRestricted", alternate = {"IsTenantRestricted"})
    @Expose
	@Nullable
    public Boolean isTenantRestricted;

    /**
     * The Location.
     * Provides the city, state, and country code where the sign-in originated. Supports $filter (eq and startsWith operators only) on city, state, and countryOrRegion properties.
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
	@Nullable
    public SignInLocation location;

    /**
     * The Mfa Detail.
     * 
     */
    @SerializedName(value = "mfaDetail", alternate = {"MfaDetail"})
    @Expose
	@Nullable
    public MfaDetail mfaDetail;

    /**
     * The Network Location Details.
     * The network location details including the type of network used and its names.
     */
    @SerializedName(value = "networkLocationDetails", alternate = {"NetworkLocationDetails"})
    @Expose
	@Nullable
    public java.util.List<NetworkLocationDetail> networkLocationDetails;

    /**
     * The Original Request Id.
     * The request identifier of the first request in the authentication sequence. Supports $filter (eq operator only).
     */
    @SerializedName(value = "originalRequestId", alternate = {"OriginalRequestId"})
    @Expose
	@Nullable
    public String originalRequestId;

    /**
     * The Private Link Details.
     * Contains information about the Azure AD Private Link policy that is associated with the sign in event.
     */
    @SerializedName(value = "privateLinkDetails", alternate = {"PrivateLinkDetails"})
    @Expose
	@Nullable
    public PrivateLinkDetails privateLinkDetails;

    /**
     * The Processing Time In Milliseconds.
     * The request processing time in milliseconds in AD STS.
     */
    @SerializedName(value = "processingTimeInMilliseconds", alternate = {"ProcessingTimeInMilliseconds"})
    @Expose
	@Nullable
    public Integer processingTimeInMilliseconds;

    /**
     * The Resource Display Name.
     * Name of the resource the user signed into. Supports $filter (eq operator only).
     */
    @SerializedName(value = "resourceDisplayName", alternate = {"ResourceDisplayName"})
    @Expose
	@Nullable
    public String resourceDisplayName;

    /**
     * The Resource Id.
     * ID of the resource that the user signed into. Supports $filter (eq operator only).
     */
    @SerializedName(value = "resourceId", alternate = {"ResourceId"})
    @Expose
	@Nullable
    public String resourceId;

    /**
     * The Resource Service Principal Id.
     * The identifier of the service principal representing the target resource in the sign-in event.
     */
    @SerializedName(value = "resourceServicePrincipalId", alternate = {"ResourceServicePrincipalId"})
    @Expose
	@Nullable
    public String resourceServicePrincipalId;

    /**
     * The Resource Tenant Id.
     * The tenant identifier of the resource referenced in the sign in.
     */
    @SerializedName(value = "resourceTenantId", alternate = {"ResourceTenantId"})
    @Expose
	@Nullable
    public String resourceTenantId;

    /**
     * The Risk Detail.
     * Provides the 'reason' behind a specific state of a risky user, sign-in or a risk event. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far.  Supports $filter (eq operator only).Note: Details for this property require an Azure AD Premium P2 license. Other licenses return the value hidden.
     */
    @SerializedName(value = "riskDetail", alternate = {"RiskDetail"})
    @Expose
	@Nullable
    public RiskDetail riskDetail;

    /**
     * The Risk Event Types_v2.
     * The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue. Supports $filter (eq and startsWith operators only).
     */
    @SerializedName(value = "riskEventTypes_v2", alternate = {"RiskEventTypes_v2"})
    @Expose
	@Nullable
    public java.util.List<String> riskEventTypes_v2;

    /**
     * The Risk Level Aggregated.
     * Aggregated risk level. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Supports $filter (eq operator only).  Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
     */
    @SerializedName(value = "riskLevelAggregated", alternate = {"RiskLevelAggregated"})
    @Expose
	@Nullable
    public RiskLevel riskLevelAggregated;

    /**
     * The Risk Level During Sign In.
     * Risk level during sign-in. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection.  Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
     */
    @SerializedName(value = "riskLevelDuringSignIn", alternate = {"RiskLevelDuringSignIn"})
    @Expose
	@Nullable
    public RiskLevel riskLevelDuringSignIn;

    /**
     * The Risk State.
     * Reports status of the risky user, sign-in, or a risk event. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue. Supports $filter (eq operator only).
     */
    @SerializedName(value = "riskState", alternate = {"RiskState"})
    @Expose
	@Nullable
    public RiskState riskState;

    /**
     * The Service Principal Credential Key Id.
     * The unique identifier of the key credential used by the service principal to authenticate.
     */
    @SerializedName(value = "servicePrincipalCredentialKeyId", alternate = {"ServicePrincipalCredentialKeyId"})
    @Expose
	@Nullable
    public String servicePrincipalCredentialKeyId;

    /**
     * The Service Principal Credential Thumbprint.
     * The certificate thumbprint of the certificate used by the service principal to authenticate.
     */
    @SerializedName(value = "servicePrincipalCredentialThumbprint", alternate = {"ServicePrincipalCredentialThumbprint"})
    @Expose
	@Nullable
    public String servicePrincipalCredentialThumbprint;

    /**
     * The Service Principal Id.
     * The application identifier used for sign-in. This field is populated when you are signing in using an application. Supports $filter (eq and startsWith operators only).
     */
    @SerializedName(value = "servicePrincipalId", alternate = {"ServicePrincipalId"})
    @Expose
	@Nullable
    public String servicePrincipalId;

    /**
     * The Service Principal Name.
     * The application name used for sign-in. This field is populated when you are signing in using an application. Supports $filter (eq and startsWith operators only).
     */
    @SerializedName(value = "servicePrincipalName", alternate = {"ServicePrincipalName"})
    @Expose
	@Nullable
    public String servicePrincipalName;

    /**
     * The Session Lifetime Policies.
     * Any conditional access session management policies that were applied during the sign-in event.
     */
    @SerializedName(value = "sessionLifetimePolicies", alternate = {"SessionLifetimePolicies"})
    @Expose
	@Nullable
    public java.util.List<SessionLifetimePolicy> sessionLifetimePolicies;

    /**
     * The Sign In Event Types.
     * Indicates the category of sign in that the event represents. For user sign ins, the category can be interactiveUser or nonInteractiveUser and corresponds to the value for the isInteractive property on the signin resource. For managed identity sign ins, the category is managedIdentity. For service principal sign ins, the category is servicePrincipal. Possible values are: interactiveUser, nonInteractiveUser, servicePrincipal, managedIdentity, unknownFutureValue. Supports $filter (eq operator only).
     */
    @SerializedName(value = "signInEventTypes", alternate = {"SignInEventTypes"})
    @Expose
	@Nullable
    public java.util.List<String> signInEventTypes;

    /**
     * The Sign In Identifier.
     * The identification that the user provided to sign in. It may be the userPrincipalName but it's also populated when a user signs in using other identifiers.
     */
    @SerializedName(value = "signInIdentifier", alternate = {"SignInIdentifier"})
    @Expose
	@Nullable
    public String signInIdentifier;

    /**
     * The Sign In Identifier Type.
     * The type of sign in identifier. Possible values are: userPrincipalName, phoneNumber, proxyAddress, qrCode, onPremisesUserPrincipalName, unknownFutureValue.
     */
    @SerializedName(value = "signInIdentifierType", alternate = {"SignInIdentifierType"})
    @Expose
	@Nullable
    public SignInIdentifierType signInIdentifierType;

    /**
     * The Status.
     * Sign-in status. Includes the error code and description of the error (in case of a sign-in failure). Supports $filter (eq operator only) on errorCode property.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public SignInStatus status;

    /**
     * The Token Issuer Name.
     * The name of the identity provider. For example, sts.microsoft.com. Supports $filter (eq operator only).
     */
    @SerializedName(value = "tokenIssuerName", alternate = {"TokenIssuerName"})
    @Expose
	@Nullable
    public String tokenIssuerName;

    /**
     * The Token Issuer Type.
     * The type of identity provider. The possible values are: AzureAD, ADFederationServices, UnknownFutureValue, AzureADBackupAuth, ADFederationServicesMFAAdapter, NPSExtension. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: AzureADBackupAuth , ADFederationServicesMFAAdapter , NPSExtension.
     */
    @SerializedName(value = "tokenIssuerType", alternate = {"TokenIssuerType"})
    @Expose
	@Nullable
    public TokenIssuerType tokenIssuerType;

    /**
     * The Unique Token Identifier.
     * A unique base64 encoded request identifier used to track tokens issued by Azure AD as they are redeemed at resource providers.
     */
    @SerializedName(value = "uniqueTokenIdentifier", alternate = {"UniqueTokenIdentifier"})
    @Expose
	@Nullable
    public String uniqueTokenIdentifier;

    /**
     * The User Agent.
     * The user agent information related to sign-in. Supports $filter (eq and startsWith operators only).
     */
    @SerializedName(value = "userAgent", alternate = {"UserAgent"})
    @Expose
	@Nullable
    public String userAgent;

    /**
     * The User Display Name.
     * Display name of the user that initiated the sign-in. Supports $filter (eq and startsWith operators only).
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
	@Nullable
    public String userDisplayName;

    /**
     * The User Id.
     * ID of the user that initiated the sign-in. Supports $filter (eq operator only).
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The User Principal Name.
     * User principal name of the user that initiated the sign-in. Supports $filter (eq and startsWith operators only).
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The User Type.
     * Identifies whether the user is a member or guest in the tenant. Possible values are: member, guest, unknownFutureValue.
     */
    @SerializedName(value = "userType", alternate = {"UserType"})
    @Expose
	@Nullable
    public SignInUserType userType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
