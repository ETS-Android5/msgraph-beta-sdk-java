package microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item;

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
import microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.additionalsources.AdditionalSourcesRequestBuilder;
import microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.addtoreviewsetoperation.AddToReviewSetOperationRequestBuilder;
import microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.custodiansources.CustodianSourcesRequestBuilder;
import microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.estimatestatistics.EstimateStatisticsRequestBuilder;
import microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.lastestimatestatisticsoperation.LastEstimateStatisticsOperationRequestBuilder;
import microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.noncustodialsources.item.NoncustodialDataSourceItemRequestBuilder;
import microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.noncustodialsources.NoncustodialSourcesRequestBuilder;
import microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.purgedata.PurgeDataRequestBuilder;
import microsoft.graph.models.ediscovery.SourceCollection;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the sourceCollections property of the microsoft.graph.ediscovery.case entity. */
public class SourceCollectionItemRequestBuilder {
    /** The additionalSources property */
    @javax.annotation.Nonnull
    public AdditionalSourcesRequestBuilder additionalSources() {
        return new AdditionalSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The addToReviewSetOperation property */
    @javax.annotation.Nonnull
    public AddToReviewSetOperationRequestBuilder addToReviewSetOperation() {
        return new AddToReviewSetOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The custodianSources property */
    @javax.annotation.Nonnull
    public CustodianSourcesRequestBuilder custodianSources() {
        return new CustodianSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The estimateStatistics property */
    @javax.annotation.Nonnull
    public EstimateStatisticsRequestBuilder estimateStatistics() {
        return new EstimateStatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The lastEstimateStatisticsOperation property */
    @javax.annotation.Nonnull
    public LastEstimateStatisticsOperationRequestBuilder lastEstimateStatisticsOperation() {
        return new LastEstimateStatisticsOperationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The noncustodialSources property */
    @javax.annotation.Nonnull
    public NoncustodialSourcesRequestBuilder noncustodialSources() {
        return new NoncustodialSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The purgeData property */
    @javax.annotation.Nonnull
    public PurgeDataRequestBuilder purgeData() {
        return new PurgeDataRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Gets an item from the Microsoft.Graph.compliance.ediscovery.cases.item.sourceCollections.item.additionalSources.item collection
     * @param id Unique identifier of the item
     * @return a dataSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.additionalsources.item.DataSourceItemRequestBuilder additionalSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dataSource%2Did", id);
        return new microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.additionalsources.item.DataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SourceCollectionItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public SourceCollectionItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/sourceCollections/{sourceCollection%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new SourceCollectionItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public SourceCollectionItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/sourceCollections/{sourceCollection%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property sourceCollections for compliance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property sourceCollections for compliance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<SourceCollectionItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final SourceCollectionItemRequestBuilderDeleteRequestConfiguration requestConfig = new SourceCollectionItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a list of sourceCollection objects associated with this case.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Returns a list of sourceCollection objects associated with this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<SourceCollectionItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final SourceCollectionItemRequestBuilderGetRequestConfiguration requestConfig = new SourceCollectionItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property sourceCollections in compliance
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final SourceCollection body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property sourceCollections in compliance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final SourceCollection body, @javax.annotation.Nullable final java.util.function.Consumer<SourceCollectionItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final SourceCollectionItemRequestBuilderPatchRequestConfiguration requestConfig = new SourceCollectionItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.compliance.ediscovery.cases.item.sourceCollections.item.custodianSources.item collection
     * @param id Unique identifier of the item
     * @return a dataSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.custodiansources.item.DataSourceItemRequestBuilder custodianSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dataSource%2Did", id);
        return new microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.custodiansources.item.DataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property sourceCollections for compliance
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
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
     * Delete navigation property sourceCollections for compliance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<SourceCollectionItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
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
     * Delete navigation property sourceCollections for compliance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<SourceCollectionItemRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
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
     * Returns a list of sourceCollection objects associated with this case.
     * @return a CompletableFuture of sourceCollection
     */
    public java.util.concurrent.CompletableFuture<SourceCollection> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, SourceCollection::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Returns a list of sourceCollection objects associated with this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of sourceCollection
     */
    public java.util.concurrent.CompletableFuture<SourceCollection> get(@javax.annotation.Nullable final java.util.function.Consumer<SourceCollectionItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, SourceCollection::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Returns a list of sourceCollection objects associated with this case.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of sourceCollection
     */
    public java.util.concurrent.CompletableFuture<SourceCollection> get(@javax.annotation.Nullable final java.util.function.Consumer<SourceCollectionItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, SourceCollection::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.compliance.ediscovery.cases.item.sourceCollections.item.noncustodialSources.item collection
     * @param id Unique identifier of the item
     * @return a noncustodialDataSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public NoncustodialDataSourceItemRequestBuilder noncustodialSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("noncustodialDataSource%2Did", id);
        return new NoncustodialDataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property sourceCollections in compliance
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final SourceCollection body) {
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
     * Update the navigation property sourceCollections in compliance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final SourceCollection body, @javax.annotation.Nullable final java.util.function.Consumer<SourceCollectionItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
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
     * Update the navigation property sourceCollections in compliance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final SourceCollection body, @javax.annotation.Nullable final java.util.function.Consumer<SourceCollectionItemRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class SourceCollectionItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new sourceCollectionItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public SourceCollectionItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Returns a list of sourceCollection objects associated with this case. */
    public class SourceCollectionItemRequestBuilderGetQueryParameters {
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
    public class SourceCollectionItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public SourceCollectionItemRequestBuilderGetQueryParameters queryParameters = new SourceCollectionItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new sourceCollectionItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public SourceCollectionItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class SourceCollectionItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new sourceCollectionItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public SourceCollectionItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
