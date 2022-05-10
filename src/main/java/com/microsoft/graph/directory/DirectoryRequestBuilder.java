package microsoft.graph.directory;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.directory.administrativeunits.AdministrativeUnitsRequestBuilder;
import microsoft.graph.directory.administrativeunits.item.AdministrativeUnitItemRequestBuilder;
import microsoft.graph.directory.attributesets.AttributeSetsRequestBuilder;
import microsoft.graph.directory.attributesets.item.AttributeSetItemRequestBuilder;
import microsoft.graph.directory.customsecurityattributedefinitions.CustomSecurityAttributeDefinitionsRequestBuilder;
import microsoft.graph.directory.customsecurityattributedefinitions.item.CustomSecurityAttributeDefinitionItemRequestBuilder;
import microsoft.graph.directory.deleteditems.DeletedItemsRequestBuilder;
import microsoft.graph.directory.deleteditems.item.DirectoryObjectItemRequestBuilder;
import microsoft.graph.directory.featurerolloutpolicies.FeatureRolloutPoliciesRequestBuilder;
import microsoft.graph.directory.featurerolloutpolicies.item.FeatureRolloutPolicyItemRequestBuilder;
import microsoft.graph.directory.federationconfigurations.FederationConfigurationsRequestBuilder;
import microsoft.graph.directory.federationconfigurations.item.IdentityProviderBaseItemRequestBuilder;
import microsoft.graph.directory.impactedresources.ImpactedResourcesRequestBuilder;
import microsoft.graph.directory.impactedresources.item.RecommendationResourceItemRequestBuilder;
import microsoft.graph.directory.inboundshareduserprofiles.InboundSharedUserProfilesRequestBuilder;
import microsoft.graph.directory.inboundshareduserprofiles.item.InboundSharedUserProfileItemRequestBuilder;
import microsoft.graph.directory.outboundshareduserprofiles.item.OutboundSharedUserProfileItemRequestBuilder;
import microsoft.graph.directory.outboundshareduserprofiles.OutboundSharedUserProfilesRequestBuilder;
import microsoft.graph.directory.recommendations.item.RecommendationItemRequestBuilder;
import microsoft.graph.directory.recommendations.RecommendationsRequestBuilder;
import microsoft.graph.directory.sharedemaildomains.item.SharedEmailDomainItemRequestBuilder;
import microsoft.graph.directory.sharedemaildomains.SharedEmailDomainsRequestBuilder;
import microsoft.graph.models.Directory;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the directory singleton. */
public class DirectoryRequestBuilder {
    /** The administrativeUnits property */
    @javax.annotation.Nonnull
    public AdministrativeUnitsRequestBuilder administrativeUnits() {
        return new AdministrativeUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The attributeSets property */
    @javax.annotation.Nonnull
    public AttributeSetsRequestBuilder attributeSets() {
        return new AttributeSetsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The customSecurityAttributeDefinitions property */
    @javax.annotation.Nonnull
    public CustomSecurityAttributeDefinitionsRequestBuilder customSecurityAttributeDefinitions() {
        return new CustomSecurityAttributeDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deletedItems property */
    @javax.annotation.Nonnull
    public DeletedItemsRequestBuilder deletedItems() {
        return new DeletedItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The featureRolloutPolicies property */
    @javax.annotation.Nonnull
    public FeatureRolloutPoliciesRequestBuilder featureRolloutPolicies() {
        return new FeatureRolloutPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The federationConfigurations property */
    @javax.annotation.Nonnull
    public FederationConfigurationsRequestBuilder federationConfigurations() {
        return new FederationConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The impactedResources property */
    @javax.annotation.Nonnull
    public ImpactedResourcesRequestBuilder impactedResources() {
        return new ImpactedResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The inboundSharedUserProfiles property */
    @javax.annotation.Nonnull
    public InboundSharedUserProfilesRequestBuilder inboundSharedUserProfiles() {
        return new InboundSharedUserProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The outboundSharedUserProfiles property */
    @javax.annotation.Nonnull
    public OutboundSharedUserProfilesRequestBuilder outboundSharedUserProfiles() {
        return new OutboundSharedUserProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The recommendations property */
    @javax.annotation.Nonnull
    public RecommendationsRequestBuilder recommendations() {
        return new RecommendationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The sharedEmailDomains property */
    @javax.annotation.Nonnull
    public SharedEmailDomainsRequestBuilder sharedEmailDomains() {
        return new SharedEmailDomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Gets an item from the Microsoft.Graph.directory.administrativeUnits.item collection
     * @param id Unique identifier of the item
     * @return a administrativeUnitItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AdministrativeUnitItemRequestBuilder administrativeUnits(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("administrativeUnit%2Did", id);
        return new AdministrativeUnitItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.attributeSets.item collection
     * @param id Unique identifier of the item
     * @return a attributeSetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AttributeSetItemRequestBuilder attributeSets(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attributeSet%2Did", id);
        return new AttributeSetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DirectoryRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/directory{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DirectoryRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/directory{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get directory
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DirectoryRequestBuilderGetRequestConfiguration requestConfig = new DirectoryRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update directory
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Directory body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update directory
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Directory body, @javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DirectoryRequestBuilderPatchRequestConfiguration requestConfig = new DirectoryRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.customSecurityAttributeDefinitions.item collection
     * @param id Unique identifier of the item
     * @return a customSecurityAttributeDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustomSecurityAttributeDefinitionItemRequestBuilder customSecurityAttributeDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customSecurityAttributeDefinition%2Did", id);
        return new CustomSecurityAttributeDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.deletedItems.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryObjectItemRequestBuilder deletedItems(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.featureRolloutPolicies.item collection
     * @param id Unique identifier of the item
     * @return a featureRolloutPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FeatureRolloutPolicyItemRequestBuilder featureRolloutPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("featureRolloutPolicy%2Did", id);
        return new FeatureRolloutPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.federationConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a identityProviderBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IdentityProviderBaseItemRequestBuilder federationConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityProviderBase%2Did", id);
        return new IdentityProviderBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get directory
     * @return a CompletableFuture of directory
     */
    public java.util.concurrent.CompletableFuture<Directory> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directory
     */
    public java.util.concurrent.CompletableFuture<Directory> get(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of directory
     */
    public java.util.concurrent.CompletableFuture<Directory> get(@javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.impactedResources.item collection
     * @param id Unique identifier of the item
     * @return a recommendationResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RecommendationResourceItemRequestBuilder impactedResources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("recommendationResource%2Did", id);
        return new RecommendationResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.inboundSharedUserProfiles.item collection
     * @param id Unique identifier of the item
     * @return a inboundSharedUserProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public InboundSharedUserProfileItemRequestBuilder inboundSharedUserProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("inboundSharedUserProfile%2DuserId", id);
        return new InboundSharedUserProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.outboundSharedUserProfiles.item collection
     * @param id Unique identifier of the item
     * @return a outboundSharedUserProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OutboundSharedUserProfileItemRequestBuilder outboundSharedUserProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("outboundSharedUserProfile%2DuserId", id);
        return new OutboundSharedUserProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update directory
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Directory body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update directory
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Directory body, @javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update directory
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final Directory body, @javax.annotation.Nullable final java.util.function.Consumer<DirectoryRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.recommendations.item collection
     * @param id Unique identifier of the item
     * @return a recommendationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RecommendationItemRequestBuilder recommendations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("recommendation%2Did", id);
        return new RecommendationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.directory.sharedEmailDomains.item collection
     * @param id Unique identifier of the item
     * @return a sharedEmailDomainItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SharedEmailDomainItemRequestBuilder sharedEmailDomains(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sharedEmailDomain%2Did", id);
        return new SharedEmailDomainItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get directory */
    public class DirectoryRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DirectoryRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DirectoryRequestBuilderGetQueryParameters queryParameters = new DirectoryRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new directoryRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public DirectoryRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DirectoryRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new directoryRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public DirectoryRequestBuilderPatchRequestConfiguration() {
        }
    }
}
