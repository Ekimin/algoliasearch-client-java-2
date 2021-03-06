package com.algolia.search;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.annotation.Nonnull;

public final class AsyncHttpAPIClientBuilder extends AsyncAPIClientBuilder {

  public AsyncHttpAPIClientBuilder(@Nonnull String applicationId, @Nonnull String apiKey) {
    super(applicationId, apiKey);
  }

  @Override
  protected AsyncAPIClient build(@Nonnull AsyncAPIClientConfiguration configuration) {
    return new AsyncAPIClient(new AsyncHttpClient(configuration), configuration);
  }

  @Override
  public AsyncHttpAPIClientBuilder setUserAgent(@Nonnull String customAgent, @Nonnull String customAgentVersion) {
    super.setUserAgent(customAgent, customAgentVersion);
    return this;
  }

  @Override
  public AsyncHttpAPIClientBuilder setExtraHeader(@Nonnull String key, String value) {
    super.setExtraHeader(key, value);
    return this;
  }

  @Override
  public AsyncHttpAPIClientBuilder setConnectTimeout(int connectTimeout) {
    super.setConnectTimeout(connectTimeout);
    return this;
  }

  @Override
  public AsyncHttpAPIClientBuilder setReadTimeout(int readTimeout) {
    super.setReadTimeout(readTimeout);
    return this;
  }

  @Override
  public AsyncHttpAPIClientBuilder setHostDownTimeout(int hostDownTimeout) {
    super.setHostDownTimeout(hostDownTimeout);
    return this;
  }

  @Override
  public AsyncHttpAPIClientBuilder setObjectMapper(@Nonnull ObjectMapper objectMapper) {
    super.setObjectMapper(objectMapper);
    return this;
  }

}
