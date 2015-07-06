# android-jitpack-library-example

A example of a Jitpack integration with a library with multiple product flavours:
 - production (default)
 - sandbox

All variants are built and published with different filenames:
```gradle
repositories {
 maven { url "https://jitpack.io" }
}

dependencies {
  compile 'com.github.jitpack-io:android-jitpack-library-example:1.5:productionRelease@aar'  
  compile 'com.github.jitpack-io:android-jitpack-library-example:1.5:sandboxRelease@aar'
  compile 'com.github.jitpack-io:android-jitpack-library-example:1.5:sandboxDebug@aar'
  compile 'com.github.jitpack-io:android-jitpack-library-example:1.5:productionDebug@aar'
}
```

The default variant is 'productionRelease' and is set using the `defaultPublishConfig` property:
```gradle
dependencies {
  compile 'com.github.jitpack-io:android-jitpack-library-example:1.5'
}
```


