# Material-Masterpieces

Material Masterpieces is an Android application designed to showcase beautifully crafted UI components dynamically. Instead of requiring users to update the app for new UI elements, this host application allows users to download, install, and manage UI plugins seamlessly.

## Features
- **Dynamic UI Showcase:** View different UI components without updating the app.
- **Plugin System:** Install and remove UI components as separate plugin APKs.
- **GitHub-Based Distribution:** Download UI plugins directly from GitHub.
- **Seamless Integration:** Loaded plugins appear within the host app without launching separate activities.

## How It Works
1. The host app lists available UI plugins from a GitHub repository.
2. Users can download and install plugins within the app.
3. Installed plugins are loaded dynamically and displayed inside the host app.
4. Users can remove plugins when they are no longer needed.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Akshar062/MaterialMasterpieces.git
   ```
2. Open the project in Android Studio.
3. Build and run the app on an emulator or device.

## Roadmap
- [ ] Implement dynamic UI loading using `DexClassLoader` or `PathClassLoader`.
- [ ] Secure plugin downloads.
- [ ] Improve UI to manage installed plugins.
- [ ] Add more custom UI components.

## Contribution
Contributions are welcome! If you have UI components you'd like to share, feel free to submit a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Credits
Special thanks to [sinasamaki](https://github.com/sinasamaki) for creating the guide to create wonderful UI. Check out his [YouTube channel](https://www.youtube.com/@sinasamaki) and [website](https://www.sinasamaki.com/) for more amazing content. If you find his work helpful, consider buying a subscription on his [premium website](https://www.sinasamaki.com/premium/).

## Continuous Integration
This project uses GitHub Actions for continuous integration. The workflow file `build-and-release.yml` is located in the `.github/workflows/` directory. It verifies the Android Jetpack Compose app, builds the APK if the pull request title starts with "releases", and releases the APK if the pull request title starts with "releases".

## Continuous Integration Workflow

### Workflow Steps
1. **Verify Job**:
   - Checkout code
   - Set up JDK 17
   - Check commit message format
   - Grant execute permission for Gradlew
   - Run lint checks
   - Run unit tests

2. **Build and Draft Release Job**:
   - Needs: verify
   - If: contains(github.event.head_commit.message, 'release:')
   - Checkout code
   - Set up JDK 11
   - Build APK
   - Upload APK
   - Create draft release
   - Upload release asset

3. **Manual Approval Job**:
   - Needs: build-and-draft-release
   - Wait for manual approval

4. **Publish Release Job**:
   - Needs: manual-approval
   - Publish draft release

### Commit Message Conventions
- Use the following prefixes for commit messages:
  - `feat`: A new feature
  - `fix`: A bug fix
  - `chore`: Changes to the build process or auxiliary tools and libraries
  - `docs`: Documentation only changes
  - `style`: Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)
  - `refactor`: A code change that neither fixes a bug nor adds a feature
  - `perf`: A code change that improves performance
  - `test`: Adding missing tests or correcting existing tests
  - `release`: Changes related to releasing the APK

### Manual Approval Step
- The workflow includes a manual approval step before publishing the release. This step ensures that a human reviews and approves the release before it goes live.

### Step-by-Step Guide
1. **Commit Changes**: Ensure your commit messages follow the conventions mentioned above.
2. **Push to Main Branch**: Push your changes to the `main` branch.
3. **Verify Job**: The workflow will automatically start the `verify` job.
4. **Build and Draft Release Job**: If your commit message contains `release:`, the `build-and-draft-release` job will run.
5. **Manual Approval**: Wait for manual approval to proceed with the release.
6. **Publish Release**: Once approved, the `publish-release` job will publish the draft release.
