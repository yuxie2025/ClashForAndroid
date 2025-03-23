## Clash for Android

A Graphical user interface of [clash] for Android

### Requirement

- Android 5.0+ (minimum)
- Android 7.0+ (recommend)
- `armeabi-v7a` , `arm64-v8a`, `x86` or `x86_64` Architecture

### License

See also [LICENSE](./LICENSE) and [NOTICE](./NOTICE)

### Privacy Policy

See also [PRIVACY_POLICY.md](./PRIVACY_POLICY.md)

### Build

1. Install **OpenJDK 11**, **Android SDK**

2. Create `local.properties` in project root with

   ```properties
   sdk.dir=/path/to/android-sdk
   ```

3. Create `signing.properties` in project root with

   ```properties
   keystore.path=/path/to/keystore/file
   keystore.password=<key store password>
   key.alias=<key alias>
   key.password=<key password>
   ```

4. Build

   ```bash
   ./gradlew app:assemblePremiumRelease
   ```

6. Pick `app-<version>-premium-<arch>-release.apk` in `app/build/outputs/apk/premium/release/`
