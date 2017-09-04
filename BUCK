java_library(
  name = 'buckaroo-java-example',
  srcs = [
    'Hello.java',
  ],
  visibility = [
    'PUBLIC',
  ],
)

java_binary(
  name = 'app',
  main_class = 'Hello',
  deps = [
    ':buckaroo-java-example',
  ],
)
