function() {
  var config = {};
  var env = karate.env;
  karate.log('karate.env system property is:', env);

  if (!env) {
    env = 'dev';
  }

  if (env == 'dev') {
    config.baseUrl = 'https://dev.example.com';
  } else if (env == 'qa') {
    config.baseUrl = 'https://qa.example.com';
  } else if (env == 'prod') {
    config.baseUrl = 'https://prod.example.com';
  }

  config.apiToken = 'some-auth-token';
  config.timeout = 5000;

  return config;
}
