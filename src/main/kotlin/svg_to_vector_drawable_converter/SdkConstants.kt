package svg_to_vector_drawable_converter

import java.io.File

/**
 * Constant definition class.<br></br>
 * <br></br>
 * Most constants have a prefix defining the content.
 *
 *  * `OS_` OS path constant. These paths are different depending on the platform.
 *  * `FN_` File name constant.
 *  * `FD_` Folder name constant.
 *  * `TAG_` XML element tag name
 *  * `ATTR_` XML attribute name
 *  * `VALUE_` XML attribute value
 *  * `CLASS_` Class name
 *  * `DOT_` File name extension, including the dot
 *  * `EXT_` File name extension, without the dot
 *
 */
@Suppress("unused") // Not documenting all the fields here

object SdkConstants {
    const val PLATFORM_UNKNOWN = 0
    const val PLATFORM_LINUX = 1
    const val PLATFORM_WINDOWS = 2
    const val PLATFORM_DARWIN = 3

    /**
     * Returns current platform, one of [.PLATFORM_WINDOWS], [.PLATFORM_DARWIN],
     * [.PLATFORM_LINUX] or [.PLATFORM_UNKNOWN].
     */
    val CURRENT_PLATFORM = currentPlatform()

    /** Environment variable that specifies the path of an Android SDK.  */
    const val ANDROID_HOME_ENV = "ANDROID_HOME"

    /** Property in local.properties file that specifies the path of the Android SDK.   */
    const val SDK_DIR_PROPERTY = "sdk.dir"

    /** Property in local.properties file that specifies the path of the Android NDK.   */
    const val NDK_DIR_PROPERTY = "ndk.dir"

    /** Property in gradle-wrapper.properties file that specifies the URL to the correct Gradle distribution.  */
    const val GRADLE_DISTRIBUTION_URL_PROPERTY = "distributionUrl" //$NON-NLS-1$

    /**
     * The encoding we strive to use for all files we write.
     *
     *
     * When possible, use the APIs which take a [java.nio.charset.Charset] and pass in
     * [com.google.common.base.Charsets.UTF_8] instead of using the String encoding
     * method.
     */
    const val UTF_8 = "UTF-8" //$NON-NLS-1$

    /**
     * Charset for the ini file handled by the SDK.
     */
    const val INI_CHARSET = UTF_8

    /** Path separator used by Gradle  */
    const val GRADLE_PATH_SEPARATOR = ":" //$NON-NLS-1$

    /** An SDK Project's AndroidManifest.xml file  */
    const val FN_ANDROID_MANIFEST_XML = "AndroidManifest.xml" //$NON-NLS-1$

    /** pre-dex jar filename. i.e. "classes.jar"  */
    const val FN_CLASSES_JAR = "classes.jar" //$NON-NLS-1$

    /** Dex filename inside the APK. i.e. "classes.dex"  */
    const val FN_APK_CLASSES_DEX = "classes.dex" //$NON-NLS-1$

    /** Dex filename inside the APK. i.e. "classes.dex"  */
    const val FN_APK_CLASSES_N_DEX = "classes%d.dex" //$NON-NLS-1$

    /** An SDK Project's build.xml file  */
    const val FN_BUILD_XML = "build.xml" //$NON-NLS-1$

    /** An SDK Project's build.gradle file  */
    const val FN_BUILD_GRADLE = "build.gradle" //$NON-NLS-1$

    /** An SDK Project's settings.gradle file  */
    const val FN_SETTINGS_GRADLE = "settings.gradle" //$NON-NLS-1$

    /** An SDK Project's gradle.properties file  */
    const val FN_GRADLE_PROPERTIES = "gradle.properties" //$NON-NLS-1$

    /** An SDK Project's gradle daemon executable  */
    const val FN_GRADLE_UNIX = "gradle" //$NON-NLS-1$

    /** An SDK Project's gradle.bat daemon executable (gradle for windows)  */
    const val FN_GRADLE_WIN = FN_GRADLE_UNIX + ".bat" //$NON-NLS-1$

    /** An SDK Project's gradlew file  */
    const val FN_GRADLE_WRAPPER_UNIX = "gradlew" //$NON-NLS-1$

    /** An SDK Project's gradlew.bat file (gradlew for windows)  */
    const val FN_GRADLE_WRAPPER_WIN = FN_GRADLE_WRAPPER_UNIX + ".bat" //$NON-NLS-1$

    /** An SDK Project's gradle wrapper library  */
    const val FN_GRADLE_WRAPPER_JAR = "gradle-wrapper.jar" //$NON-NLS-1$

    /** Name of the framework library, i.e. "android.jar"  */
    const val FN_FRAMEWORK_LIBRARY = "android.jar" //$NON-NLS-1$

    /** Name of the framework library, i.e. "uiautomator.jar"  */
    const val FN_UI_AUTOMATOR_LIBRARY = "uiautomator.jar" //$NON-NLS-1$

    /** Name of the layout attributes, i.e. "attrs.xml"  */
    const val FN_ATTRS_XML = "attrs.xml" //$NON-NLS-1$

    /** Name of the layout attributes, i.e. "attrs_manifest.xml"  */
    const val FN_ATTRS_MANIFEST_XML = "attrs_manifest.xml" //$NON-NLS-1$

    /** framework aidl import file  */
    const val FN_FRAMEWORK_AIDL = "framework.aidl" //$NON-NLS-1$

    /** framework renderscript folder  */
    const val FN_FRAMEWORK_RENDERSCRIPT = "renderscript" //$NON-NLS-1$

    /** framework include folder  */
    const val FN_FRAMEWORK_INCLUDE = "include" //$NON-NLS-1$

    /** framework include (clang) folder  */
    const val FN_FRAMEWORK_INCLUDE_CLANG = "clang-include" //$NON-NLS-1$

    /** layoutlib.jar file  */
    const val FN_LAYOUTLIB_JAR = "layoutlib.jar" //$NON-NLS-1$

    /** widget list file  */
    const val FN_WIDGETS = "widgets.txt" //$NON-NLS-1$

    /** Intent activity actions list file  */
    const val FN_INTENT_ACTIONS_ACTIVITY = "activity_actions.txt" //$NON-NLS-1$

    /** Intent broadcast actions list file  */
    const val FN_INTENT_ACTIONS_BROADCAST = "broadcast_actions.txt" //$NON-NLS-1$

    /** Intent service actions list file  */
    const val FN_INTENT_ACTIONS_SERVICE = "service_actions.txt" //$NON-NLS-1$

    /** Intent category list file  */
    const val FN_INTENT_CATEGORIES = "categories.txt" //$NON-NLS-1$

    /** annotations support jar  */
    const val FN_ANNOTATIONS_JAR = "annotations.jar" //$NON-NLS-1$

    /** platform build property file  */
    const val FN_BUILD_PROP = "build.prop" //$NON-NLS-1$

    /** plugin properties file  */
    const val FN_PLUGIN_PROP = "plugin.prop" //$NON-NLS-1$

    /** add-on manifest file  */
    const val FN_MANIFEST_INI = "manifest.ini" //$NON-NLS-1$

    /** add-on layout device XML file.  */
    const val FN_DEVICES_XML = "devices.xml" //$NON-NLS-1$

    /** hardware properties definition file  */
    const val FN_HARDWARE_INI = "hardware-properties.ini" //$NON-NLS-1$

    /** project property file  */
    const val FN_PROJECT_PROPERTIES = "project.properties" //$NON-NLS-1$

    /** project local property file  */
    const val FN_LOCAL_PROPERTIES = "local.properties" //$NON-NLS-1$

    /** project ant property file  */
    const val FN_ANT_PROPERTIES = "ant.properties" //$NON-NLS-1$

    /** project local property file  */
    const val FN_GRADLE_WRAPPER_PROPERTIES = "gradle-wrapper.properties" //$NON-NLS-1$

    /** Skin layout file  */
    const val FN_SKIN_LAYOUT = "layout" //$NON-NLS-1$

    /** dx.jar file  */
    const val FN_DX_JAR = "dx.jar" //$NON-NLS-1$

    /** dx executable (with extension for the current OS)  */
    val FN_DX = "dx" + ext(".bat", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** aapt executable (with extension for the current OS)  */
    val FN_AAPT = "aapt" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** aidl executable (with extension for the current OS)  */
    val FN_AIDL = "aidl" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** renderscript executable (with extension for the current OS)  */
    val FN_RENDERSCRIPT = "llvm-rs-cc" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** renderscript support exe (with extension for the current OS)  */
    val FN_BCC_COMPAT = "bcc_compat" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** renderscript support linker for ARM (with extension for the current OS)  */
    val FN_LD_ARM = "arm-linux-androideabi-ld" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** renderscript support linker for X86 (with extension for the current OS)  */
    val FN_LD_X86 = "i686-linux-android-ld" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** renderscript support linker for MIPS (with extension for the current OS)  */
    val FN_LD_MIPS = "mipsel-linux-android-ld" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** adb executable (with extension for the current OS)  */
    val FN_ADB = "adb" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** emulator executable for the current OS  */
    val FN_EMULATOR = "emulator" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** zipalign executable (with extension for the current OS)  */
    val FN_ZIPALIGN = "zipalign" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** dexdump executable (with extension for the current OS)  */
    val FN_DEXDUMP = "dexdump" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** proguard executable (with extension for the current OS)  */
    val FN_PROGUARD = "proguard" + ext(".bat", ".sh") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** find_lock for Windows (with extension for the current OS)  */
    val FN_FIND_LOCK = "find_lock" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** hprof-conv executable (with extension for the current OS)  */
    val FN_HPROF_CONV = "hprof-conv" + ext(".exe", "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /** jack.jar  */
    const val FN_JACK = "jack.jar" //$NON-NLS-1$

    /** jill.jar  */
    const val FN_JILL = "jill.jar" //$NON-NLS-1$

    /** split-select  */
    val FN_SPLIT_SELECT = "split-select" + ext(".exe", "")

    /** properties file for SDK Updater packages  */
    const val FN_SOURCE_PROP = "source.properties" //$NON-NLS-1$

    /** properties file for content hash of installed packages  */
    const val FN_CONTENT_HASH_PROP = "content_hash.properties" //$NON-NLS-1$

    /** properties file for the SDK  */
    const val FN_SDK_PROP = "sdk.properties" //$NON-NLS-1$
    const val FN_RENDERSCRIPT_V8_JAR = "renderscript-v8.jar" //$NON-NLS-1$

    /**
     * filename for gdbserver.
     */
    const val FN_GDBSERVER = "gdbserver" //$NON-NLS-1$
    const val FN_GDB_SETUP = "gdb.setup" //$NON-NLS-1$

    /** global Android proguard config file  */
    const val FN_ANDROID_PROGUARD_FILE = "proguard-android.txt" //$NON-NLS-1$

    /** global Android proguard config file with optimization enabled  */
    const val FN_ANDROID_OPT_PROGUARD_FILE = "proguard-android-optimize.txt" //$NON-NLS-1$

    /** default proguard config file with new file extension (for project specific stuff)  */
    const val FN_PROJECT_PROGUARD_FILE = "proguard-project.txt" //$NON-NLS-1$
    /* Folder Names for Android Projects . */
    /** Resources folder name, i.e. "res".  */
    const val FD_RESOURCES = "res" //$NON-NLS-1$

    /** Assets folder name, i.e. "assets"  */
    const val FD_ASSETS = "assets" //$NON-NLS-1$

    /** Default source folder name in an SDK project, i.e. "src".
     *
     *
     * Note: this is not the same as [.FD_PKG_SOURCES]
     * which is an SDK sources folder for packages.  */
    const val FD_SOURCES = "src" //$NON-NLS-1$

    /** Default main source set folder name, i.e. "main"  */
    const val FD_MAIN = "main" //$NON-NLS-1$

    /** Default test source set folder name, i.e. "androidTest"  */
    const val FD_TEST = "androidTest" //$NON-NLS-1$

    /** Default java code folder name, i.e. "java"  */
    const val FD_JAVA = "java" //$NON-NLS-1$

    /** Default native code folder name, i.e. "jni"  */
    const val FD_JNI = "jni" //$NON-NLS-1$

    /** Default gradle folder name, i.e. "gradle"  */
    const val FD_GRADLE = "gradle" //$NON-NLS-1$

    /** Default gradle wrapper folder name, i.e. "gradle/wrapper"  */
    val FD_GRADLE_WRAPPER = FD_GRADLE + File.separator + "wrapper" //$NON-NLS-1$

    /** Default generated source folder name, i.e. "gen"  */
    const val FD_GEN_SOURCES = "gen" //$NON-NLS-1$

    /** Default native library folder name inside the project, i.e. "libs"
     * While the folder inside the .apk is "lib", we call that one libs because
     * that's what we use in ant for both .jar and .so and we need to make the 2 development ways
     * compatible.  */
    const val FD_NATIVE_LIBS = "libs" //$NON-NLS-1$

    /** Native lib folder inside the APK: "lib"  */
    const val FD_APK_NATIVE_LIBS = "lib" //$NON-NLS-1$

    /** Default output folder name, i.e. "bin"  */
    const val FD_OUTPUT = "bin" //$NON-NLS-1$

    /** Classes output folder name, i.e. "classes"  */
    const val FD_CLASSES_OUTPUT = "classes" //$NON-NLS-1$

    /** proguard output folder for mapping, etc.. files  */
    const val FD_PROGUARD = "proguard" //$NON-NLS-1$

    /** aidl output folder for copied aidl files  */
    const val FD_AIDL = "aidl" //$NON-NLS-1$

    /** rs Libs output folder for support mode  */
    const val FD_RS_LIBS = "rsLibs" //$NON-NLS-1$

    /** rs Libs output folder for support mode  */
    const val FD_RS_OBJ = "rsObj" //$NON-NLS-1$

    /** jars folder  */
    const val FD_JARS = "jars" //$NON-NLS-1$
    /* Folder Names for the Android SDK */
    /** Name of the SDK platforms folder.  */
    const val FD_PLATFORMS = "platforms" //$NON-NLS-1$

    /** Name of the SDK addons folder.  */
    const val FD_ADDONS = "add-ons" //$NON-NLS-1$

    /** Name of the SDK system-images folder.  */
    const val FD_SYSTEM_IMAGES = "system-images" //$NON-NLS-1$

    /** Name of the SDK sources folder where source packages are installed.
     *
     *
     * Note this is not the same as [.FD_SOURCES] which is the folder name where sources
     * are installed inside a project.  */
    const val FD_PKG_SOURCES = "sources" //$NON-NLS-1$

    /** Name of the SDK tools folder.  */
    const val FD_TOOLS = "tools" //$NON-NLS-1$

    /** Name of the SDK tools/support folder.  */
    const val FD_SUPPORT = "support" //$NON-NLS-1$

    /** Name of the SDK platform tools folder.  */
    const val FD_PLATFORM_TOOLS = "platform-tools" //$NON-NLS-1$

    /** Name of the SDK build tools folder.  */
    const val FD_BUILD_TOOLS = "build-tools" //$NON-NLS-1$

    /** Name of the SDK tools/lib folder.  */
    const val FD_LIB = "lib" //$NON-NLS-1$

    /** Name of the SDK docs folder.  */
    const val FD_DOCS = "docs" //$NON-NLS-1$

    /** Name of the doc folder containing API reference doc (javadoc)  */
    const val FD_DOCS_REFERENCE = "reference" //$NON-NLS-1$

    /** Name of the SDK images folder.  */
    const val FD_IMAGES = "images" //$NON-NLS-1$

    /** Name of the ABI to support.  */
    const val ABI_ARMEABI = "armeabi" //$NON-NLS-1$
    const val ABI_ARMEABI_V7A = "armeabi-v7a" //$NON-NLS-1$
    const val ABI_ARM64_V8A = "arm64-v8a" //$NON-NLS-1$
    const val ABI_INTEL_ATOM = "x86" //$NON-NLS-1$
    const val ABI_INTEL_ATOM64 = "x86_64" //$NON-NLS-1$
    const val ABI_MIPS = "mips" //$NON-NLS-1$
    const val ABI_MIPS64 = "mips64" //$NON-NLS-1$

    /** Name of the CPU arch to support.  */
    const val CPU_ARCH_ARM = "arm" //$NON-NLS-1$
    const val CPU_ARCH_ARM64 = "arm64" //$NON-NLS-1$
    const val CPU_ARCH_INTEL_ATOM = "x86" //$NON-NLS-1$
    const val CPU_ARCH_INTEL_ATOM64 = "x86_64" //$NON-NLS-1$
    const val CPU_ARCH_MIPS = "mips" //$NON-NLS-1$

    /** TODO double-check this is appropriate value for mips64  */
    const val CPU_ARCH_MIPS64 = "mips64" //$NON-NLS-1$

    /** Name of the CPU model to support.  */
    const val CPU_MODEL_CORTEX_A8 = "cortex-a8" //$NON-NLS-1$

    /** Name of the SDK skins folder.  */
    const val FD_SKINS = "skins" //$NON-NLS-1$

    /** Name of the SDK samples folder.  */
    const val FD_SAMPLES = "samples" //$NON-NLS-1$

    /** Name of the SDK extras folder.  */
    const val FD_EXTRAS = "extras" //$NON-NLS-1$
    const val FD_M2_REPOSITORY = "m2repository" //$NON-NLS-1$
    const val FD_NDK = "ndk-bundle" //$NON-NLS-1$

    /**
     * Name of an extra's sample folder.
     * Ideally extras should have one [.FD_SAMPLES] folder containing
     * one or more sub-folders (one per sample). However some older extras
     * might contain a single "sample" folder with directly the samples files
     * in it. When possible we should encourage extras' owners to move to the
     * multi-samples format.
     */
    const val FD_SAMPLE = "sample" //$NON-NLS-1$

    /** Name of the SDK templates folder, i.e. "templates"  */
    const val FD_TEMPLATES = "templates" //$NON-NLS-1$

    /** Name of the SDK Ant folder, i.e. "ant"  */
    const val FD_ANT = "ant" //$NON-NLS-1$

    /** Name of the SDK data folder, i.e. "data"  */
    const val FD_DATA = "data" //$NON-NLS-1$

    /** Name of the SDK renderscript folder, i.e. "rs"  */
    const val FD_RENDERSCRIPT = "rs" //$NON-NLS-1$

    /** Name of the Java resources folder, i.e. "resources"  */
    const val FD_JAVA_RES = "resources" //$NON-NLS-1$

    /** Name of the SDK resources folder, i.e. "res"  */
    const val FD_RES = "res" //$NON-NLS-1$

    /** Name of the SDK font folder, i.e. "fonts"  */
    const val FD_FONTS = "fonts" //$NON-NLS-1$

    /** Name of the android sources directory and the root of the SDK sources package folder.  */
    const val FD_ANDROID_SOURCES = "sources" //$NON-NLS-1$

    /** Name of the addon libs folder.  */
    const val FD_ADDON_LIBS = "libs" //$NON-NLS-1$

    /** Name of the cache folder in the $HOME/.android.  */
    const val FD_CACHE = "cache" //$NON-NLS-1$

    /** API codename of a release (non preview) system image or platform.  */
    const val CODENAME_RELEASE = "REL" //$NON-NLS-1$

    /** Namespace for the resource XML, i.e. "http://schemas.android.com/apk/res/android"  */
    const val NS_RESOURCES = "http://schemas.android.com/apk/res/android" //$NON-NLS-1$

    /**
     * Namespace pattern for the custom resource XML, i.e. "http://schemas.android.com/apk/res/%s"
     *
     *
     * This string contains a %s. It must be combined with the desired Java package, e.g.:
     * <pre>
     * String.format(SdkConstants.NS_CUSTOM_RESOURCES_S, "android");
     * String.format(SdkConstants.NS_CUSTOM_RESOURCES_S, "com.test.mycustomapp");
    </pre> *
     *
     * Note: if you need an URI specifically for the "android" namespace, consider using
     * [SdkConstants.NS_RESOURCES] instead.
     */
    const val NS_CUSTOM_RESOURCES_S = "http://schemas.android.com/apk/res/%1\$s" //$NON-NLS-1$

    /** The name of the uses-library that provides "android.test.runner"  */
    const val ANDROID_TEST_RUNNER_LIB = "android.test.runner" //$NON-NLS-1$
    /* Folder path relative to the SDK root */
    /** Path of the documentation directory relative to the sdk folder.
     * This is an OS path, ending with a separator.  */
    val OS_SDK_DOCS_FOLDER = FD_DOCS + File.separator

    /** Path of the tools directory relative to the sdk folder, or to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_SDK_TOOLS_FOLDER = FD_TOOLS + File.separator

    /** Path of the lib directory relative to the sdk folder, or to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_SDK_TOOLS_LIB_FOLDER = OS_SDK_TOOLS_FOLDER + FD_LIB + File.separator

    /**
     * Path of the lib directory relative to the sdk folder, or to a platform
     * folder. This is an OS path, ending with a separator.
     */
    val OS_SDK_TOOLS_LIB_EMULATOR_FOLDER = (OS_SDK_TOOLS_LIB_FOLDER
            + "emulator" + File.separator) //$NON-NLS-1$

    /** Path of the platform tools directory relative to the sdk folder.
     * This is an OS path, ending with a separator.  */
    val OS_SDK_PLATFORM_TOOLS_FOLDER = FD_PLATFORM_TOOLS + File.separator

    /** Path of the build tools directory relative to the sdk folder.
     * This is an OS path, ending with a separator.  */
    val OS_SDK_BUILD_TOOLS_FOLDER = FD_BUILD_TOOLS + File.separator

    /** Path of the Platform tools Lib directory relative to the sdk folder.
     * This is an OS path, ending with a separator.  */
    val OS_SDK_PLATFORM_TOOLS_LIB_FOLDER = OS_SDK_PLATFORM_TOOLS_FOLDER + FD_LIB + File.separator

    /** Path of the bin folder of proguard folder relative to the sdk folder.
     * This is an OS path, ending with a separator.  */
    val OS_SDK_TOOLS_PROGUARD_BIN_FOLDER = OS_SDK_TOOLS_FOLDER +
            "proguard" + File.separator +  //$NON-NLS-1$
            "bin" + File.separator //$NON-NLS-1$

    /** Path of the template gradle wrapper folder relative to the sdk folder.
     * This is an OS path, ending with a separator.  */
    val OS_SDK_TOOLS_TEMPLATES_GRADLE_WRAPPER_FOLDER =
        OS_SDK_TOOLS_FOLDER + FD_TEMPLATES + File.separator + FD_GRADLE_WRAPPER + File.separator
    /* Folder paths relative to a platform or add-on folder */
    /** Path of the images directory relative to a platform or addon folder.
     * This is an OS path, ending with a separator.  */
    val OS_IMAGES_FOLDER = FD_IMAGES + File.separator

    /** Path of the skin directory relative to a platform or addon folder.
     * This is an OS path, ending with a separator.  */
    val OS_SKINS_FOLDER = FD_SKINS + File.separator
    /* Folder paths relative to a Platform folder */
    /** Path of the data directory relative to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_PLATFORM_DATA_FOLDER = FD_DATA + File.separator

    /** Path of the renderscript directory relative to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_PLATFORM_RENDERSCRIPT_FOLDER = FD_RENDERSCRIPT + File.separator

    /** Path of the samples directory relative to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_PLATFORM_SAMPLES_FOLDER = FD_SAMPLES + File.separator

    /** Path of the resources directory relative to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_PLATFORM_RESOURCES_FOLDER = OS_PLATFORM_DATA_FOLDER + FD_RES + File.separator

    /** Path of the fonts directory relative to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_PLATFORM_FONTS_FOLDER = OS_PLATFORM_DATA_FOLDER + FD_FONTS + File.separator

    /** Path of the android source directory relative to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_PLATFORM_SOURCES_FOLDER = FD_ANDROID_SOURCES + File.separator

    /** Path of the android templates directory relative to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_PLATFORM_TEMPLATES_FOLDER = FD_TEMPLATES + File.separator

    /** Path of the Ant build rules directory relative to a platform folder.
     * This is an OS path, ending with a separator.  */
    val OS_PLATFORM_ANT_FOLDER = FD_ANT + File.separator

    /** Path of the attrs.xml file relative to a platform folder.  */
    val OS_PLATFORM_ATTRS_XML = OS_PLATFORM_RESOURCES_FOLDER + "values" + File.separator +
            FN_ATTRS_XML

    /** Path of the attrs_manifest.xml file relative to a platform folder.  */
    val OS_PLATFORM_ATTRS_MANIFEST_XML = OS_PLATFORM_RESOURCES_FOLDER + "values" + File.separator +
            FN_ATTRS_MANIFEST_XML

    /** Path of the layoutlib.jar file relative to a platform folder.  */
    val OS_PLATFORM_LAYOUTLIB_JAR = OS_PLATFORM_DATA_FOLDER + FN_LAYOUTLIB_JAR

    /** Path of the renderscript include folder relative to a platform folder.  */
    val OS_FRAMEWORK_RS = FN_FRAMEWORK_RENDERSCRIPT + File.separator + FN_FRAMEWORK_INCLUDE

    /** Path of the renderscript (clang) include folder relative to a platform folder.  */
    val OS_FRAMEWORK_RS_CLANG = FN_FRAMEWORK_RENDERSCRIPT + File.separator + FN_FRAMEWORK_INCLUDE_CLANG
    /* Folder paths relative to a addon folder */
    /** Path of the images directory relative to a folder folder.
     * This is an OS path, ending with a separator.  */
    val OS_ADDON_LIBS_FOLDER = FD_ADDON_LIBS + File.separator

    /** Skin default  */
    const val SKIN_DEFAULT = "default" //$NON-NLS-1$

    /** SDK property: ant templates revision  */
    const val PROP_SDK_ANT_TEMPLATES_REVISION = "sdk.ant.templates.revision" //$NON-NLS-1$

    /** SDK property: default skin  */
    const val PROP_SDK_DEFAULT_SKIN = "sdk.skin.default" //$NON-NLS-1$

    /* Android Class Constants */
    const val CLASS_ACTIVITY = "android.app.Activity" //$NON-NLS-1$
    const val CLASS_APPLICATION = "android.app.Application" //$NON-NLS-1$
    const val CLASS_SERVICE = "android.app.Service" //$NON-NLS-1$
    const val CLASS_BROADCASTRECEIVER = "android.content.BroadcastReceiver" //$NON-NLS-1$
    const val CLASS_CONTENTPROVIDER = "android.content.ContentProvider" //$NON-NLS-1$
    const val CLASS_ATTRIBUTE_SET = "android.util.AttributeSet" //$NON-NLS-1$
    const val CLASS_INSTRUMENTATION = "android.app.Instrumentation" //$NON-NLS-1$
    const val CLASS_INSTRUMENTATION_RUNNER = "android.test.InstrumentationTestRunner" //$NON-NLS-1$
    const val CLASS_BUNDLE = "android.os.Bundle" //$NON-NLS-1$
    const val CLASS_R = "android.R" //$NON-NLS-1$
    const val CLASS_R_PREFIX = CLASS_R + "." //$NON-NLS-1$
    const val CLASS_MANIFEST_PERMISSION = "android.Manifest\$permission" //$NON-NLS-1$
    const val CLASS_INTENT = "android.content.Intent" //$NON-NLS-1$
    const val CLASS_CONTEXT = "android.content.Context" //$NON-NLS-1$
    const val CLASS_VIEW = "android.view.View" //$NON-NLS-1$
    const val CLASS_VIEWGROUP = "android.view.ViewGroup" //$NON-NLS-1$
    const val CLASS_NAME_LAYOUTPARAMS = "LayoutParams" //$NON-NLS-1$
    const val CLASS_VIEWGROUP_LAYOUTPARAMS = CLASS_VIEWGROUP + "$" + CLASS_NAME_LAYOUTPARAMS //$NON-NLS-1$
    const val CLASS_NAME_FRAMELAYOUT = "FrameLayout" //$NON-NLS-1$
    const val CLASS_FRAMELAYOUT = "android.widget." + CLASS_NAME_FRAMELAYOUT //$NON-NLS-1$
    const val CLASS_PREFERENCE = "android.preference.Preference" //$NON-NLS-1$
    const val CLASS_NAME_PREFERENCE_SCREEN = "PreferenceScreen" //$NON-NLS-1$
    const val CLASS_PREFERENCES = "android.preference." + CLASS_NAME_PREFERENCE_SCREEN //$NON-NLS-1$
    const val CLASS_PREFERENCEGROUP = "android.preference.PreferenceGroup" //$NON-NLS-1$
    const val CLASS_PARCELABLE = "android.os.Parcelable" //$NON-NLS-1$
    const val CLASS_PARCEL = "android.os.Parcel" //$NON-NLS-1$
    const val CLASS_FRAGMENT = "android.app.Fragment" //$NON-NLS-1$
    const val CLASS_V4_FRAGMENT = "android.support.v4.app.Fragment" //$NON-NLS-1$
    const val CLASS_ACTION_PROVIDER = "android.view.ActionProvider" //$NON-NLS-1$
    const val CLASS_BACKUP_AGENT = "android.app.backup.BackupAgent" //$NON-NLS-1$

    /** MockView is part of the layoutlib bridge and used to display classes that have
     * no rendering in the graphical layout editor.  */
    const val CLASS_MOCK_VIEW = "com.android.layoutlib.bridge.MockView" //$NON-NLS-1$
    const val CLASS_LAYOUT_INFLATER = "android.view.LayoutInflater" //$NON-NLS-1$

    /* Android Design Support Class Constants */
    const val CLASS_COORDINATOR_LAYOUT = "android.support.design.widget.CoordinatorLayout" //$NON-NLS-1$
    const val CLASS_APP_BAR_LAYOUT = "android.support.design.widget.AppBarLayout" //$NON-NLS-1$
    const val CLASS_FLOATING_ACTION_BUTTON = "android.support.design.widget.FloatingActionButton" //$NON-NLS-1$
    const val CLASS_COLLAPSING_TOOLBAR_LAYOUT = "android.support.design.widget.CollapsingToolbarLayout" //$NON-NLS-1$
    const val CLASS_NAVIGATION_VIEW = "android.support.design.widget.NavigationView" //$NON-NLS-1$
    const val CLASS_SNACKBAR = "android.support.design.widget.Snackbar" //$NON-NLS-1$
    const val CLASS_TAB_LAYOUT = "android.support.design.widget.TabLayout" //$NON-NLS-1$
    const val CLASS_TEXT_INPUT_LAYOUT = "android.support.design.widget.TextInputLayout" //$NON-NLS-1$
    const val CLASS_NESTED_SCROLL_VIEW = "android.support.v4.widget.NestedScrollView" //$NON-NLS-1$

    /** Returns the appropriate name for the 'android' command, which is 'android.exe' for
     * Windows and 'android' for all other platforms.  */
    fun androidCmdName(): String {
        val os = System.getProperty("os.name") //$NON-NLS-1$
        var cmd = "android" //$NON-NLS-1$
        if (os.startsWith("Windows")) {                     //$NON-NLS-1$
            cmd += ".bat" //$NON-NLS-1$
        }
        return cmd
    }

    /** Returns the appropriate name for the 'mksdcard' command, which is 'mksdcard.exe' for
     * Windows and 'mkdsdcard' for all other platforms.  */
    fun mkSdCardCmdName(): String {
        val os = System.getProperty("os.name") //$NON-NLS-1$
        var cmd = "mksdcard" //$NON-NLS-1$
        if (os.startsWith("Windows")) {                     //$NON-NLS-1$
            cmd += ".exe" //$NON-NLS-1$
        }
        return cmd
    }

    /**
     * Returns current platform
     *
     * @return one of [.PLATFORM_WINDOWS], [.PLATFORM_DARWIN],
     * [.PLATFORM_LINUX] or [.PLATFORM_UNKNOWN].
     */
    fun currentPlatform(): Int {
        val os = System.getProperty("os.name") //$NON-NLS-1$
        if (os.startsWith("Mac OS")) {                      //$NON-NLS-1$
            return PLATFORM_DARWIN
        } else if (os.startsWith("Windows")) {              //$NON-NLS-1$
            return PLATFORM_WINDOWS
        } else if (os.startsWith("Linux")) {                //$NON-NLS-1$
            return PLATFORM_LINUX
        }
        return PLATFORM_UNKNOWN
    }

    /**
     * Returns current platform's UI name
     *
     * @return one of "Windows", "Mac OS X", "Linux" or "other".
     */
    fun currentPlatformName(): String {
        val os = System.getProperty("os.name") //$NON-NLS-1$
        if (os.startsWith("Mac OS")) {                      //$NON-NLS-1$
            return "Mac OS X" //$NON-NLS-1$
        } else if (os.startsWith("Windows")) {              //$NON-NLS-1$
            return "Windows" //$NON-NLS-1$
        } else if (os.startsWith("Linux")) {                //$NON-NLS-1$
            return "Linux" //$NON-NLS-1$
        }
        return "Other"
    }

    private fun ext(windowsExtension: String, nonWindowsExtension: String): String {
        return if (CURRENT_PLATFORM == PLATFORM_WINDOWS) {
            windowsExtension
        } else {
            nonWindowsExtension
        }
    }

    /** Default anim resource folder name, i.e. "anim"  */
    const val FD_RES_ANIM = "anim" //$NON-NLS-1$

    /** Default animator resource folder name, i.e. "animator"  */
    const val FD_RES_ANIMATOR = "animator" //$NON-NLS-1$

    /** Default color resource folder name, i.e. "color"  */
    const val FD_RES_COLOR = "color" //$NON-NLS-1$

    /** Default drawable resource folder name, i.e. "drawable"  */
    const val FD_RES_DRAWABLE = "drawable" //$NON-NLS-1$

    /** Default interpolator resource folder name, i.e. "interpolator"  */
    const val FD_RES_INTERPOLATOR = "interpolator" //$NON-NLS-1$

    /** Default layout resource folder name, i.e. "layout"  */
    const val FD_RES_LAYOUT = "layout" //$NON-NLS-1$

    /** Default menu resource folder name, i.e. "menu"  */
    const val FD_RES_MENU = "menu" //$NON-NLS-1$

    /** Default menu resource folder name, i.e. "mipmap"  */
    const val FD_RES_MIPMAP = "mipmap" //$NON-NLS-1$

    /** Default values resource folder name, i.e. "values"  */
    private const val FD_RES_VALUES = "values" //$NON-NLS-1$

    /** Default xml resource folder name, i.e. "xml"  */
    const val FD_RES_XML = "xml" //$NON-NLS-1$

    /** Default raw resource folder name, i.e. "raw"  */
    const val FD_RES_RAW = "raw" //$NON-NLS-1$

    /** Separator between the resource folder qualifier.  */
    const val RES_QUALIFIER_SEP = "-" //$NON-NLS-1$
    /** Namespace used in XML files for Android attributes  */ // ---- XML ----
    /** URI of the reserved "xmlns"  prefix  */
    const val XMLNS_URI = "http://www.w3.org/2000/xmlns/" //$NON-NLS-1$

    /** The "xmlns" attribute name  */
    const val XMLNS = "xmlns" //$NON-NLS-1$

    /** The default prefix used for the [.XMLNS_URI]  */
    const val XMLNS_PREFIX = "xmlns:" //$NON-NLS-1$

    /** Qualified name of the xmlns android declaration element  */
    const val XMLNS_ANDROID = "xmlns:android" //$NON-NLS-1$

    /** The default prefix used for the [.ANDROID_URI] name space  */
    const val ANDROID_NS_NAME = "android" //$NON-NLS-1$

    /** The default prefix used for the [.ANDROID_URI] name space including the colon   */
    const val ANDROID_NS_NAME_PREFIX = "android:" //$NON-NLS-1$
    const val ANDROID_NS_NAME_PREFIX_LEN = ANDROID_NS_NAME_PREFIX.length

    /** The default prefix used for the app  */
    const val APP_PREFIX = "app" //$NON-NLS-1$

    /** The entity for the ampersand character  */
    const val AMP_ENTITY = "&amp;" //$NON-NLS-1$

    /** The entity for the quote character  */
    const val QUOT_ENTITY = "&quot;" //$NON-NLS-1$

    /** The entity for the apostrophe character  */
    const val APOS_ENTITY = "&apos;" //$NON-NLS-1$

    /** The entity for the less than character  */
    const val LT_ENTITY = "&lt;" //$NON-NLS-1$

    /** The entity for the greater than character  */
    const val GT_ENTITY = "&gt;" //$NON-NLS-1$
    // ---- Elements and Attributes ----
    /** Namespace prefix used for all resources  */
    const val URI_PREFIX = "http://schemas.android.com/apk/res/" //$NON-NLS-1$

    /** Namespace used in XML files for Android attributes  */
    const val ANDROID_URI = "http://schemas.android.com/apk/res/android" //$NON-NLS-1$

    /** Namespace used in XML files for Android Tooling attributes  */
    const val TOOLS_URI = "http://schemas.android.com/tools" //$NON-NLS-1$

    /** Namespace used for auto-adjusting namespaces  */
    const val AUTO_URI = "http://schemas.android.com/apk/res-auto" //$NON-NLS-1$

    /** Default prefix used for tools attributes  */
    const val TOOLS_PREFIX = "tools" //$NON-NLS-1$
    const val R_CLASS = "R" //$NON-NLS-1$
    const val ANDROID_PKG = "android" //$NON-NLS-1$

    // Tags: Manifest
    const val TAG_SERVICE = "service" //$NON-NLS-1$
    const val TAG_PERMISSION = "permission" //$NON-NLS-1$
    const val TAG_USES_FEATURE = "uses-feature" //$NON-NLS-1$
    const val TAG_USES_PERMISSION = "uses-permission" //$NON-NLS-1$
    const val TAG_USES_LIBRARY = "uses-library" //$NON-NLS-1$
    const val TAG_APPLICATION = "application" //$NON-NLS-1$
    const val TAG_INTENT_FILTER = "intent-filter" //$NON-NLS-1$
    const val TAG_USES_SDK = "uses-sdk" //$NON-NLS-1$
    const val TAG_ACTIVITY = "activity" //$NON-NLS-1$
    const val TAG_RECEIVER = "receiver" //$NON-NLS-1$
    const val TAG_PROVIDER = "provider" //$NON-NLS-1$
    const val TAG_GRANT_PERMISSION = "grant-uri-permission" //$NON-NLS-1$
    const val TAG_PATH_PERMISSION = "path-permission" //$NON-NLS-1$

    // Tags: Resources
    const val TAG_RESOURCES = "resources" //$NON-NLS-1$
    const val TAG_STRING = "string" //$NON-NLS-1$
    const val TAG_ARRAY = "array" //$NON-NLS-1$
    const val TAG_STYLE = "style" //$NON-NLS-1$
    const val TAG_ITEM = "item" //$NON-NLS-1$
    const val TAG_GROUP = "group" //$NON-NLS-1$
    const val TAG_STRING_ARRAY = "string-array" //$NON-NLS-1$
    const val TAG_PLURALS = "plurals" //$NON-NLS-1$
    const val TAG_INTEGER_ARRAY = "integer-array" //$NON-NLS-1$
    const val TAG_COLOR = "color" //$NON-NLS-1$
    const val TAG_DIMEN = "dimen" //$NON-NLS-1$
    const val TAG_DRAWABLE = "drawable" //$NON-NLS-1$
    const val TAG_MENU = "menu" //$NON-NLS-1$
    const val TAG_ENUM = "enum" //$NON-NLS-1$
    const val TAG_FLAG = "flag" //$NON-NLS-1$
    const val TAG_ATTR = "attr" //$NON-NLS-1$
    const val TAG_DECLARE_STYLEABLE = "declare-styleable" //$NON-NLS-1$
    const val TAG_EAT_COMMENT = "eat-comment" //$NON-NLS-1$
    const val TAG_SKIP = "skip" //$NON-NLS-1$
    const val TAG_SELECTOR = "selector" //$NON-NLS-1$

    // Tags: XML
    const val TAG_HEADER = "header" //$NON-NLS-1$
    const val TAG_APPWIDGET_PROVIDER = "appwidget-provider" //$NON-NLS-1$
    const val TAG_PREFERENCE_SCREEN = "PreferenceScreen" //$NON-NLS-1$

    // Tags: Layouts
    const val VIEW_TAG = "view" //$NON-NLS-1$
    const val VIEW_INCLUDE = "include" //$NON-NLS-1$
    const val VIEW_MERGE = "merge" //$NON-NLS-1$
    const val VIEW_FRAGMENT = "fragment" //$NON-NLS-1$
    const val REQUEST_FOCUS = "requestFocus" //$NON-NLS-1$
    const val TAG = "tag" //$NON-NLS-1$
    const val VIEW = "View" //$NON-NLS-1$
    const val VIEW_GROUP = "ViewGroup" //$NON-NLS-1$
    const val FRAME_LAYOUT = "FrameLayout" //$NON-NLS-1$
    const val LINEAR_LAYOUT = "LinearLayout" //$NON-NLS-1$
    const val RELATIVE_LAYOUT = "RelativeLayout" //$NON-NLS-1$
    const val GRID_LAYOUT = "GridLayout" //$NON-NLS-1$
    const val SCROLL_VIEW = "ScrollView" //$NON-NLS-1$
    const val BUTTON = "Button" //$NON-NLS-1$
    const val COMPOUND_BUTTON = "CompoundButton" //$NON-NLS-1$
    const val ADAPTER_VIEW = "AdapterView" //$NON-NLS-1$
    const val GALLERY = "Gallery" //$NON-NLS-1$
    const val GRID_VIEW = "GridView" //$NON-NLS-1$
    const val TAB_HOST = "TabHost" //$NON-NLS-1$
    const val RADIO_GROUP = "RadioGroup" //$NON-NLS-1$
    const val RADIO_BUTTON = "RadioButton" //$NON-NLS-1$
    const val SWITCH = "Switch" //$NON-NLS-1$
    const val EDIT_TEXT = "EditText" //$NON-NLS-1$
    const val LIST_VIEW = "ListView" //$NON-NLS-1$
    const val TEXT_VIEW = "TextView" //$NON-NLS-1$
    const val CHECKED_TEXT_VIEW = "CheckedTextView" //$NON-NLS-1$
    const val IMAGE_VIEW = "ImageView" //$NON-NLS-1$
    const val SURFACE_VIEW = "SurfaceView" //$NON-NLS-1$
    const val ABSOLUTE_LAYOUT = "AbsoluteLayout" //$NON-NLS-1$
    const val TABLE_LAYOUT = "TableLayout" //$NON-NLS-1$
    const val TABLE_ROW = "TableRow" //$NON-NLS-1$
    const val TAB_WIDGET = "TabWidget" //$NON-NLS-1$
    const val IMAGE_BUTTON = "ImageButton" //$NON-NLS-1$
    const val SEEK_BAR = "SeekBar" //$NON-NLS-1$
    const val VIEW_STUB = "ViewStub" //$NON-NLS-1$
    const val SPINNER = "Spinner" //$NON-NLS-1$
    const val WEB_VIEW = "WebView" //$NON-NLS-1$
    const val TOGGLE_BUTTON = "ToggleButton" //$NON-NLS-1$
    const val CHECK_BOX = "CheckBox" //$NON-NLS-1$
    const val ABS_LIST_VIEW = "AbsListView" //$NON-NLS-1$
    const val PROGRESS_BAR = "ProgressBar" //$NON-NLS-1$
    const val ABS_SPINNER = "AbsSpinner" //$NON-NLS-1$
    const val ABS_SEEK_BAR = "AbsSeekBar" //$NON-NLS-1$
    const val VIEW_ANIMATOR = "ViewAnimator" //$NON-NLS-1$
    const val VIEW_SWITCHER = "ViewSwitcher" //$NON-NLS-1$
    const val EXPANDABLE_LIST_VIEW = "ExpandableListView" //$NON-NLS-1$
    const val HORIZONTAL_SCROLL_VIEW = "HorizontalScrollView" //$NON-NLS-1$
    const val MULTI_AUTO_COMPLETE_TEXT_VIEW = "MultiAutoCompleteTextView" //$NON-NLS-1$
    const val AUTO_COMPLETE_TEXT_VIEW = "AutoCompleteTextView" //$NON-NLS-1$
    const val CHECKABLE = "Checkable" //$NON-NLS-1$
    const val TEXTURE_VIEW = "TextureView" //$NON-NLS-1$

    /* Android Design Support Tag Constants */
    const val COORDINATOR_LAYOUT = CLASS_COORDINATOR_LAYOUT
    const val APP_BAR_LAYOUT = CLASS_APP_BAR_LAYOUT
    const val FLOATING_ACTION_BUTTON = CLASS_FLOATING_ACTION_BUTTON
    const val COLLAPSING_TOOLBAR_LAYOUT = CLASS_COLLAPSING_TOOLBAR_LAYOUT
    const val NAVIGATION_VIEW = CLASS_NAVIGATION_VIEW
    const val SNACKBAR = CLASS_SNACKBAR
    const val TAB_LAYOUT = CLASS_TAB_LAYOUT
    const val TEXT_INPUT_LAYOUT = CLASS_TEXT_INPUT_LAYOUT

    // Tags: Drawables
    const val TAG_BITMAP = "bitmap" //$NON-NLS-1$

    // Tags: Data-Binding
    const val TAG_LAYOUT = "layout" //$NON-NLS-1$
    const val TAG_DATA = "data" //$NON-NLS-1$
    const val TAG_VARIABLE = "variable" //$NON-NLS-1$
    const val TAG_IMPORT = "import" //$NON-NLS-1$

    // Attributes: Manifest
    const val ATTR_EXPORTED = "exported" //$NON-NLS-1$
    const val ATTR_PERMISSION = "permission" //$NON-NLS-1$
    const val ATTR_MIN_SDK_VERSION = "minSdkVersion" //$NON-NLS-1$
    const val ATTR_TARGET_SDK_VERSION = "targetSdkVersion" //$NON-NLS-1$
    const val ATTR_ICON = "icon" //$NON-NLS-1$
    const val ATTR_PACKAGE = "package" //$NON-NLS-1$
    const val ATTR_CORE_APP = "coreApp" //$NON-NLS-1$
    const val ATTR_THEME = "theme" //$NON-NLS-1$
    const val ATTR_SCHEME = "scheme" //$NON_NLS-1$
    const val ATTR_HOST = "host" //$NON_NLS-1$
    const val ATTR_PATH = "path" //$NON-NLS-1$
    const val ATTR_PATH_PREFIX = "pathPrefix" //$NON-NLS-1$
    const val ATTR_PATH_PATTERN = "pathPattern" //$NON-NLS-1$
    const val ATTR_ALLOW_BACKUP = "allowBackup" //$NON_NLS-1$
    const val ATTR_DEBUGGABLE = "debuggable" //$NON-NLS-1$
    const val ATTR_READ_PERMISSION = "readPermission" //$NON_NLS-1$
    const val ATTR_WRITE_PERMISSION = "writePermission" //$NON_NLS-1$
    const val ATTR_VERSION_CODE = "versionCode" //$NON_NLS-1$
    const val ATTR_VERSION_NAME = "versionName" //$NON_NLS-1$

    // Attributes: Resources
    const val ATTR_NAME = "name" //$NON-NLS-1$
    const val ATTR_FRAGMENT = "fragment" //$NON-NLS-1$
    const val ATTR_TYPE = "type" //$NON-NLS-1$
    const val ATTR_PARENT = "parent" //$NON-NLS-1$
    const val ATTR_TRANSLATABLE = "translatable" //$NON-NLS-1$
    const val ATTR_COLOR = "color" //$NON-NLS-1$
    const val ATTR_DRAWABLE = "drawable" //$NON-NLS-1$
    const val ATTR_VALUE = "value" //$NON-NLS-1$
    const val ATTR_QUANTITY = "quantity" //$NON-NLS-1$
    const val ATTR_FORMAT = "format" //$NON-NLS-1$
    const val ATTR_PREPROCESSING = "preprocessing" //$NON-NLS-1$

    // Attributes: Data-Binding
    const val ATTR_ALIAS = "alias" //$NON-NLS-1$

    // Attributes: Layout
    const val ATTR_LAYOUT_RESOURCE_PREFIX = "layout_" //$NON-NLS-1$
    const val ATTR_CLASS = "class" //$NON-NLS-1$
    const val ATTR_STYLE = "style" //$NON-NLS-1$
    const val ATTR_CONTEXT = "context" //$NON-NLS-1$
    const val ATTR_ID = "id" //$NON-NLS-1$
    const val ATTR_TEXT = "text" //$NON-NLS-1$
    const val ATTR_TEXT_SIZE = "textSize" //$NON-NLS-1$
    const val ATTR_LABEL = "label" //$NON-NLS-1$
    const val ATTR_HINT = "hint" //$NON-NLS-1$
    const val ATTR_PROMPT = "prompt" //$NON-NLS-1$
    const val ATTR_ON_CLICK = "onClick" //$NON-NLS-1$
    const val ATTR_INPUT_TYPE = "inputType" //$NON-NLS-1$
    const val ATTR_INPUT_METHOD = "inputMethod" //$NON-NLS-1$
    const val ATTR_LAYOUT_GRAVITY = "layout_gravity" //$NON-NLS-1$
    const val ATTR_LAYOUT_WIDTH = "layout_width" //$NON-NLS-1$
    const val ATTR_LAYOUT_HEIGHT = "layout_height" //$NON-NLS-1$
    const val ATTR_LAYOUT_WEIGHT = "layout_weight" //$NON-NLS-1$
    const val ATTR_PADDING = "padding" //$NON-NLS-1$
    const val ATTR_PADDING_BOTTOM = "paddingBottom" //$NON-NLS-1$
    const val ATTR_PADDING_TOP = "paddingTop" //$NON-NLS-1$
    const val ATTR_PADDING_RIGHT = "paddingRight" //$NON-NLS-1$
    const val ATTR_PADDING_LEFT = "paddingLeft" //$NON-NLS-1$
    const val ATTR_PADDING_START = "paddingStart" //$NON-NLS-1$
    const val ATTR_PADDING_END = "paddingEnd" //$NON-NLS-1$
    const val ATTR_FOREGROUND = "foreground" //$NON-NLS-1$
    const val ATTR_BACKGROUND = "background" //$NON-NLS-1$
    const val ATTR_ORIENTATION = "orientation" //$NON-NLS-1$
    const val ATTR_LAYOUT = "layout" //$NON-NLS-1$
    const val ATTR_ROW_COUNT = "rowCount" //$NON-NLS-1$
    const val ATTR_COLUMN_COUNT = "columnCount" //$NON-NLS-1$
    const val ATTR_LABEL_FOR = "labelFor" //$NON-NLS-1$
    const val ATTR_BASELINE_ALIGNED = "baselineAligned" //$NON-NLS-1$
    const val ATTR_CONTENT_DESCRIPTION = "contentDescription" //$NON-NLS-1$
    const val ATTR_IME_ACTION_LABEL = "imeActionLabel" //$NON-NLS-1$
    const val ATTR_PRIVATE_IME_OPTIONS = "privateImeOptions" //$NON-NLS-1$
    const val VALUE_NONE = "none" //$NON-NLS-1$
    const val VALUE_NO = "no" //$NON-NLS-1$
    const val ATTR_NUMERIC = "numeric" //$NON-NLS-1$
    const val ATTR_IME_ACTION_ID = "imeActionId" //$NON-NLS-1$
    const val ATTR_IME_OPTIONS = "imeOptions" //$NON-NLS-1$
    const val ATTR_FREEZES_TEXT = "freezesText" //$NON-NLS-1$
    const val ATTR_EDITOR_EXTRAS = "editorExtras" //$NON-NLS-1$
    const val ATTR_EDITABLE = "editable" //$NON-NLS-1$
    const val ATTR_DIGITS = "digits" //$NON-NLS-1$
    const val ATTR_CURSOR_VISIBLE = "cursorVisible" //$NON-NLS-1$
    const val ATTR_CAPITALIZE = "capitalize" //$NON-NLS-1$
    const val ATTR_PHONE_NUMBER = "phoneNumber" //$NON-NLS-1$
    const val ATTR_PASSWORD = "password" //$NON-NLS-1$
    const val ATTR_BUFFER_TYPE = "bufferType" //$NON-NLS-1$
    const val ATTR_AUTO_TEXT = "autoText" //$NON-NLS-1$
    const val ATTR_ENABLED = "enabled" //$NON-NLS-1$
    const val ATTR_SINGLE_LINE = "singleLine" //$NON-NLS-1$
    const val ATTR_SCALE_TYPE = "scaleType" //$NON-NLS-1$
    const val ATTR_VISIBILITY = "visibility" //$NON-NLS-1$
    const val ATTR_TEXT_IS_SELECTABLE = "textIsSelectable" //$NON-NLS-1$
    const val ATTR_IMPORTANT_FOR_ACCESSIBILITY = "importantForAccessibility" //$NON-NLS-1$
    const val ATTR_LIST_PREFERRED_ITEM_PADDING_LEFT = "listPreferredItemPaddingLeft" //$NON-NLS-1$
    const val ATTR_LIST_PREFERRED_ITEM_PADDING_RIGHT = "listPreferredItemPaddingRight" //$NON-NLS-1$
    const val ATTR_LIST_PREFERRED_ITEM_PADDING_START = "listPreferredItemPaddingStart" //$NON-NLS-1$
    const val ATTR_LIST_PREFERRED_ITEM_PADDING_END = "listPreferredItemPaddingEnd" //$NON-NLS-1$
    const val ATTR_INDEX = "index" //$NON-NLS-1$

    // AbsoluteLayout layout params
    const val ATTR_LAYOUT_Y = "layout_y" //$NON-NLS-1$
    const val ATTR_LAYOUT_X = "layout_x" //$NON-NLS-1$

    // GridLayout layout params
    const val ATTR_LAYOUT_ROW = "layout_row" //$NON-NLS-1$
    const val ATTR_LAYOUT_ROW_SPAN = "layout_rowSpan" //$NON-NLS-1$
    const val ATTR_LAYOUT_COLUMN = "layout_column" //$NON-NLS-1$
    const val ATTR_LAYOUT_COLUMN_SPAN = "layout_columnSpan" //$NON-NLS-1$

    // TableRow
    const val ATTR_LAYOUT_SPAN = "layout_span" //$NON-NLS-1$

    // RelativeLayout layout params:
    const val ATTR_LAYOUT_ALIGN_LEFT = "layout_alignLeft" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_RIGHT = "layout_alignRight" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_START = "layout_alignStart" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_END = "layout_alignEnd" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_TOP = "layout_alignTop" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_BOTTOM = "layout_alignBottom" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_PARENT_LEFT = "layout_alignParentLeft" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_PARENT_RIGHT = "layout_alignParentRight" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_PARENT_START = "layout_alignParentStart" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_PARENT_END = "layout_alignParentEnd" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_PARENT_TOP = "layout_alignParentTop" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_PARENT_BOTTOM = "layout_alignParentBottom" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_WITH_PARENT_MISSING = "layout_alignWithParentIfMissing" //$NON-NLS-1$
    const val ATTR_LAYOUT_ALIGN_BASELINE = "layout_alignBaseline" //$NON-NLS-1$
    const val ATTR_LAYOUT_CENTER_IN_PARENT = "layout_centerInParent" //$NON-NLS-1$
    const val ATTR_LAYOUT_CENTER_VERTICAL = "layout_centerVertical" //$NON-NLS-1$
    const val ATTR_LAYOUT_CENTER_HORIZONTAL = "layout_centerHorizontal" //$NON-NLS-1$
    const val ATTR_LAYOUT_TO_RIGHT_OF = "layout_toRightOf" //$NON-NLS-1$
    const val ATTR_LAYOUT_TO_LEFT_OF = "layout_toLeftOf" //$NON-NLS-1$
    const val ATTR_LAYOUT_TO_START_OF = "layout_toStartOf" //$NON-NLS-1$
    const val ATTR_LAYOUT_TO_END_OF = "layout_toEndOf" //$NON-NLS-1$
    const val ATTR_LAYOUT_BELOW = "layout_below" //$NON-NLS-1$
    const val ATTR_LAYOUT_ABOVE = "layout_above" //$NON-NLS-1$

    // Margins
    const val ATTR_LAYOUT_MARGIN = "layout_margin" //$NON-NLS-1$
    const val ATTR_LAYOUT_MARGIN_LEFT = "layout_marginLeft" //$NON-NLS-1$
    const val ATTR_LAYOUT_MARGIN_RIGHT = "layout_marginRight" //$NON-NLS-1$
    const val ATTR_LAYOUT_MARGIN_START = "layout_marginStart" //$NON-NLS-1$
    const val ATTR_LAYOUT_MARGIN_END = "layout_marginEnd" //$NON-NLS-1$
    const val ATTR_LAYOUT_MARGIN_TOP = "layout_marginTop" //$NON-NLS-1$
    const val ATTR_LAYOUT_MARGIN_BOTTOM = "layout_marginBottom" //$NON-NLS-1$

    // Attributes: Drawables
    const val ATTR_TILE_MODE = "tileMode" //$NON-NLS-1$

    // Attributes: CoordinatorLayout
    const val ATTR_LAYOUT_ANCHOR = "layout_anchor" //$NON-NLS-1$
    const val ATTR_LAYOUT_ANCHOR_GRAVITY = "layout_anchorGravity" //$NON-NLS-1$
    const val ATTR_LAYOUT_BEHAVIOR = "layout_behavior" //$NON-NLS-1$
    const val ATTR_LAYOUT_KEYLINE = "layout_keyline" //$NON-NLS-1$

    // Values: Manifest
    const val VALUE_SPLIT_ACTION_BAR_WHEN_NARROW = "splitActionBarWhenNarrow" // NON-NLS-$1

    // Values: Layouts
    const val VALUE_FILL_PARENT = "fill_parent" //$NON-NLS-1$
    const val VALUE_MATCH_PARENT = "match_parent" //$NON-NLS-1$
    const val VALUE_VERTICAL = "vertical" //$NON-NLS-1$
    const val VALUE_TRUE = "true" //$NON-NLS-1$
    const val VALUE_EDITABLE = "editable" //$NON-NLS-1$
    const val VALUE_AUTO_FIT = "auto_fit" //$NON-NLS-1$
    const val VALUE_SELECTABLE_ITEM_BACKGROUND = "?android:attr/selectableItemBackground" //$NON-NLS-1$

    // Values: Resources
    const val VALUE_ID = "id" //$NON-NLS-1$

    // Values: Drawables
    const val VALUE_DISABLED = "disabled" //$NON-NLS-1$
    const val VALUE_CLAMP = "clamp" //$NON-NLS-1$

    // Menus
    const val ATTR_SHOW_AS_ACTION = "showAsAction" //$NON-NLS-1$
    const val ATTR_TITLE = "title" //$NON-NLS-1$
    const val ATTR_VISIBLE = "visible" //$NON-NLS-1$
    const val VALUE_IF_ROOM = "ifRoom" //$NON-NLS-1$
    const val VALUE_ALWAYS = "always" //$NON-NLS-1$

    // Units
    const val UNIT_DP = "dp" //$NON-NLS-1$
    const val UNIT_DIP = "dip" //$NON-NLS-1$
    const val UNIT_SP = "sp" //$NON-NLS-1$
    const val UNIT_PX = "px" //$NON-NLS-1$
    const val UNIT_IN = "in" //$NON-NLS-1$
    const val UNIT_MM = "mm" //$NON-NLS-1$
    const val UNIT_PT = "pt" //$NON-NLS-1$

    // Filenames and folder names
    const val ANDROID_MANIFEST_XML = "AndroidManifest.xml" //$NON-NLS-1$
    const val OLD_PROGUARD_FILE = "proguard.cfg" //$NON-NLS-1$
    val CLASS_FOLDER = "bin" + File.separator + "classes" //$NON-NLS-1$ //$NON-NLS-2$
    const val GEN_FOLDER = "gen" //$NON-NLS-1$
    const val SRC_FOLDER = "src" //$NON-NLS-1$
    const val LIBS_FOLDER = "libs" //$NON-NLS-1$
    const val BIN_FOLDER = "bin" //$NON-NLS-1$
    const val RES_FOLDER = "res" //$NON-NLS-1$
    const val DOT_XML = ".xml" //$NON-NLS-1$
    const val DOT_XSD = ".xsd" //$NON-NLS-1$
    const val DOT_GIF = ".gif" //$NON-NLS-1$
    const val DOT_JPG = ".jpg" //$NON-NLS-1$
    const val DOT_JPEG = ".jpeg" //$NON-NLS-1$
    const val DOT_WEBP = ".webp" //$NON-NLS-1$
    const val DOT_PNG = ".png" //$NON-NLS-1$
    const val DOT_9PNG = ".9.png" //$NON-NLS-1$
    const val DOT_JAVA = ".java" //$NON-NLS-1$
    const val DOT_CLASS = ".class" //$NON-NLS-1$
    const val DOT_JAR = ".jar" //$NON-NLS-1$
    const val DOT_GRADLE = ".gradle" //$NON-NLS-1$
    const val DOT_PROPERTIES = ".properties" //$NON-NLS-1$

    /** Extension of the Application package Files, i.e. "apk".  */
    const val EXT_ANDROID_PACKAGE = "apk" //$NON-NLS-1$

    /** Extension of java files, i.e. "java"  */
    const val EXT_JAVA = "java" //$NON-NLS-1$

    /** Extension of compiled java files, i.e. "class"  */
    const val EXT_CLASS = "class" //$NON-NLS-1$

    /** Extension of xml files, i.e. "xml"  */
    const val EXT_XML = "xml" //$NON-NLS-1$

    /** Extension of gradle files, i.e. "gradle"  */
    const val EXT_GRADLE = "gradle" //$NON-NLS-1$

    /** Extension of jar files, i.e. "jar"  */
    const val EXT_JAR = "jar" //$NON-NLS-1$

    /** Extension of ZIP files, i.e. "zip"  */
    const val EXT_ZIP = "zip" //$NON-NLS-1$

    /** Extension of aidl files, i.e. "aidl"  */
    const val EXT_AIDL = "aidl" //$NON-NLS-1$

    /** Extension of Renderscript files, i.e. "rs"  */
    const val EXT_RS = "rs" //$NON-NLS-1$

    /** Extension of Renderscript files, i.e. "rsh"  */
    const val EXT_RSH = "rsh" //$NON-NLS-1$

    /** Extension of FilterScript files, i.e. "fs"  */
    const val EXT_FS = "fs" //$NON-NLS-1$

    /** Extension of Renderscript bitcode files, i.e. "bc"  */
    const val EXT_BC = "bc" //$NON-NLS-1$

    /** Extension of dependency files, i.e. "d"  */
    const val EXT_DEP = "d" //$NON-NLS-1$

    /** Extension of native libraries, i.e. "so"  */
    const val EXT_NATIVE_LIB = "so" //$NON-NLS-1$

    /** Extension of dex files, i.e. "dex"  */
    const val EXT_DEX = "dex" //$NON-NLS-1$

    /** Extension for temporary resource files, ie "ap_  */
    const val EXT_RES = "ap_" //$NON-NLS-1$

    /** Extension for pre-processable images. Right now pngs  */
    const val EXT_PNG = "png" //$NON-NLS-1$

    /** Extension for Android archive files  */
    const val EXT_AAR = "aar" //$NON-NLS-1$

    /** Extension for Java heap dumps.  */
    const val EXT_HPROF = "hprof" //$NON-NLS-1$
    private const val DOT = "." //$NON-NLS-1$

    /** Dot-Extension of the Application package Files, i.e. ".apk".  */
    const val DOT_ANDROID_PACKAGE = DOT + EXT_ANDROID_PACKAGE

    /** Dot-Extension of aidl files, i.e. ".aidl"  */
    const val DOT_AIDL = DOT + EXT_AIDL

    /** Dot-Extension of renderscript files, i.e. ".rs"  */
    const val DOT_RS = DOT + EXT_RS

    /** Dot-Extension of renderscript header files, i.e. ".rsh"  */
    const val DOT_RSH = DOT + EXT_RSH

    /** Dot-Extension of FilterScript files, i.e. ".fs"  */
    const val DOT_FS = DOT + EXT_FS

    /** Dot-Extension of renderscript bitcode files, i.e. ".bc"  */
    const val DOT_BC = DOT + EXT_BC

    /** Dot-Extension of dependency files, i.e. ".d"  */
    const val DOT_DEP = DOT + EXT_DEP

    /** Dot-Extension of dex files, i.e. ".dex"  */
    const val DOT_DEX = DOT + EXT_DEX

    /** Dot-Extension for temporary resource files, ie "ap_  */
    const val DOT_RES = DOT + EXT_RES

    /** Dot-Extension for BMP files, i.e. ".bmp"  */
    const val DOT_BMP = ".bmp" //$NON-NLS-1$

    /** Dot-Extension for SVG files, i.e. ".svg"  */
    const val DOT_SVG = ".svg" //$NON-NLS-1$

    /** Dot-Extension for template files  */
    const val DOT_FTL = ".ftl" //$NON-NLS-1$

    /** Dot-Extension of text files, i.e. ".txt"  */
    const val DOT_TXT = ".txt" //$NON-NLS-1$

    /** Dot-Extension for Android archive files  */
    const val DOT_AAR = DOT + EXT_AAR //$NON-NLS-1$

    /** Dot-Extension for Java heap dumps.  */
    const val DOT_HPROF = DOT + EXT_HPROF //$NON-NLS-1$

    /** Resource base name for java files and classes  */
    const val FN_RESOURCE_BASE = "R" //$NON-NLS-1$

    /** Resource java class  filename, i.e. "R.java"  */
    const val FN_RESOURCE_CLASS = FN_RESOURCE_BASE + DOT_JAVA

    /** Resource class file  filename, i.e. "R.class"  */
    const val FN_COMPILED_RESOURCE_CLASS = FN_RESOURCE_BASE + DOT_CLASS

    /** Resource text filename, i.e. "R.txt"  */
    const val FN_RESOURCE_TEXT = FN_RESOURCE_BASE + DOT_TXT

    /** Filename for public resources in AAR archives  */
    const val FN_PUBLIC_TXT = "public.txt"

    /** Generated manifest class name  */
    const val FN_MANIFEST_BASE = "Manifest" //$NON-NLS-1$

    /** Generated BuildConfig class name  */
    const val FN_BUILD_CONFIG_BASE = "BuildConfig" //$NON-NLS-1$

    /** Manifest java class filename, i.e. "Manifest.java"  */
    const val FN_MANIFEST_CLASS = FN_MANIFEST_BASE + DOT_JAVA

    /** BuildConfig java class filename, i.e. "BuildConfig.java"  */
    const val FN_BUILD_CONFIG = FN_BUILD_CONFIG_BASE + DOT_JAVA
    const val DRAWABLE_FOLDER = "drawable" //$NON-NLS-1$
    const val DRAWABLE_XHDPI = "drawable-xhdpi" //$NON-NLS-1$
    const val DRAWABLE_XXHDPI = "drawable-xxhdpi" //$NON-NLS-1$
    const val DRAWABLE_XXXHDPI = "drawable-xxxhdpi" //$NON-NLS-1$
    const val DRAWABLE_HDPI = "drawable-hdpi" //$NON-NLS-1$
    const val DRAWABLE_MDPI = "drawable-mdpi" //$NON-NLS-1$
    const val DRAWABLE_LDPI = "drawable-ldpi" //$NON-NLS-1$

    // Resources
    const val PREFIX_RESOURCE_REF = "@" //$NON-NLS-1$
    const val PREFIX_THEME_REF = "?" //$NON-NLS-1$
    const val PREFIX_BINDING_EXPR = "@{" //$NON-NLS-1$
    const val ANDROID_PREFIX = "@android:" //$NON-NLS-1$
    const val ANDROID_THEME_PREFIX = "?android:" //$NON-NLS-1$
    const val LAYOUT_RESOURCE_PREFIX = "@layout/" //$NON-NLS-1$
    const val STYLE_RESOURCE_PREFIX = "@style/" //$NON-NLS-1$
    const val COLOR_RESOURCE_PREFIX = "@color/" //$NON-NLS-1$
    const val NEW_ID_PREFIX = "@+id/" //$NON-NLS-1$
    const val ID_PREFIX = "@id/" //$NON-NLS-1$
    const val DRAWABLE_PREFIX = "@drawable/" //$NON-NLS-1$
    const val STRING_PREFIX = "@string/" //$NON-NLS-1$
    const val DIMEN_PREFIX = "@dimen/" //$NON-NLS-1$
    const val MIPMAP_PREFIX = "@mipmap/" //$NON-NLS-1$
    const val ANDROID_LAYOUT_RESOURCE_PREFIX = "@android:layout/" //$NON-NLS-1$
    const val ANDROID_STYLE_RESOURCE_PREFIX = "@android:style/" //$NON-NLS-1$
    const val ANDROID_COLOR_RESOURCE_PREFIX = "@android:color/" //$NON-NLS-1$
    const val ANDROID_NEW_ID_PREFIX = "@android:+id/" //$NON-NLS-1$
    const val ANDROID_ID_PREFIX = "@android:id/" //$NON-NLS-1$
    const val ANDROID_DRAWABLE_PREFIX = "@android:drawable/" //$NON-NLS-1$
    const val ANDROID_STRING_PREFIX = "@android:string/" //$NON-NLS-1$
    const val RESOURCE_CLZ_ID = "id" //$NON-NLS-1$
    const val RESOURCE_CLZ_COLOR = "color" //$NON-NLS-1$
    const val RESOURCE_CLZ_ARRAY = "array" //$NON-NLS-1$
    const val RESOURCE_CLZ_ATTR = "attr" //$NON-NLS-1$
    const val RESOURCE_CLR_STYLEABLE = "styleable" //$NON-NLS-1$
    const val NULL_RESOURCE = "@null" //$NON-NLS-1$
    const val TRANSPARENT_COLOR = "@android:color/transparent" //$NON-NLS-1$
    const val REFERENCE_STYLE = "style/" //$NON-NLS-1$
    const val PREFIX_ANDROID = "android:" //$NON-NLS-1$

    // Resource Types
    const val DRAWABLE_TYPE = "drawable" //$NON-NLS-1$
    const val MENU_TYPE = "menu" //$NON-NLS-1$

    // Packages
    const val ANDROID_PKG_PREFIX = "android." //$NON-NLS-1$
    const val WIDGET_PKG_PREFIX = "android.widget." //$NON-NLS-1$
    const val VIEW_PKG_PREFIX = "android.view." //$NON-NLS-1$

    // Project properties
    const val ANDROID_LIBRARY = "android.library" //$NON-NLS-1$
    const val PROGUARD_CONFIG = "proguard.config" //$NON-NLS-1$
    const val ANDROID_LIBRARY_REFERENCE_FORMAT = "android.library.reference.%1\$d" //$NON-NLS-1$
    const val PROJECT_PROPERTIES = "project.properties" //$NON-NLS-1$

    // Java References
    const val ATTR_REF_PREFIX = "?attr/" //$NON-NLS-1$
    const val R_PREFIX = "R." //$NON-NLS-1$
    const val R_ID_PREFIX = "R.id." //$NON-NLS-1$
    const val R_LAYOUT_RESOURCE_PREFIX = "R.layout." //$NON-NLS-1$
    const val R_DRAWABLE_PREFIX = "R.drawable." //$NON-NLS-1$
    const val R_STYLEABLE_PREFIX = "R.styleable." //$NON-NLS-1$
    const val R_ATTR_PREFIX = "R.attr." //$NON-NLS-1$

    // Attributes related to tools
    const val ATTR_IGNORE = "ignore" //$NON-NLS-1$
    const val ATTR_LOCALE = "locale" //$NON-NLS-1$

    // SuppressLint
    const val SUPPRESS_ALL = "all" //$NON-NLS-1$
    const val SUPPRESS_LINT = "SuppressLint" //$NON-NLS-1$
    const val TARGET_API = "TargetApi" //$NON-NLS-1$
    const val ATTR_TARGET_API = "targetApi" //$NON-NLS-1$
    const val FQCN_SUPPRESS_LINT = "android.annotation." + SUPPRESS_LINT //$NON-NLS-1$
    const val FQCN_TARGET_API = "android.annotation." + TARGET_API //$NON-NLS-1$

    // Class Names
    const val CONSTRUCTOR_NAME = "<init>" //$NON-NLS-1$
    const val CLASS_CONSTRUCTOR = "<clinit>" //$NON-NLS-1$
    const val FRAGMENT = "android/app/Fragment" //$NON-NLS-1$
    const val FRAGMENT_V4 = "android/support/v4/app/Fragment" //$NON-NLS-1$
    const val ANDROID_APP_ACTIVITY = "android/app/Activity" //$NON-NLS-1$
    const val ANDROID_APP_SERVICE = "android/app/Service" //$NON-NLS-1$
    const val ANDROID_CONTENT_CONTENT_PROVIDER = "android/content/ContentProvider" //$NON-NLS-1$
    const val ANDROID_CONTENT_BROADCAST_RECEIVER = "android/content/BroadcastReceiver" //$NON-NLS-1$
    const val ANDROID_VIEW_VIEW = "android/view/View" //$NON-NLS-1$

    // Method Names
    const val FORMAT_METHOD = "format" //$NON-NLS-1$
    const val GET_STRING_METHOD = "getString" //$NON-NLS-1$
    const val ATTR_TAG = "tag" //$NON-NLS-1$
    const val ATTR_NUM_COLUMNS = "numColumns" //$NON-NLS-1$

    // Some common layout element names
    const val CALENDAR_VIEW = "CalendarView" //$NON-NLS-1$
    const val SPACE = "Space" //$NON-NLS-1$
    const val GESTURE_OVERLAY_VIEW = "GestureOverlayView" //$NON-NLS-1$
    const val ATTR_HANDLE = "handle" //$NON-NLS-1$
    const val ATTR_CONTENT = "content" //$NON-NLS-1$
    const val ATTR_CHECKED = "checked" //$NON-NLS-1$

    // TextView
    const val ATTR_DRAWABLE_RIGHT = "drawableRight" //$NON-NLS-1$
    const val ATTR_DRAWABLE_LEFT = "drawableLeft" //$NON-NLS-1$
    const val ATTR_DRAWABLE_START = "drawableStart" //$NON-NLS-1$
    const val ATTR_DRAWABLE_END = "drawableEnd" //$NON-NLS-1$
    const val ATTR_DRAWABLE_BOTTOM = "drawableBottom" //$NON-NLS-1$
    const val ATTR_DRAWABLE_TOP = "drawableTop" //$NON-NLS-1$
    const val ATTR_DRAWABLE_PADDING = "drawablePadding" //$NON-NLS-1$
    const val ATTR_USE_DEFAULT_MARGINS = "useDefaultMargins" //$NON-NLS-1$
    const val ATTR_MARGINS_INCLUDED_IN_ALIGNMENT = "marginsIncludedInAlignment" //$NON-NLS-1$
    const val VALUE_WRAP_CONTENT = "wrap_content" //$NON-NLS-1$
    const val VALUE_FALSE = "false" //$NON-NLS-1$
    const val VALUE_N_DP = "%ddp" //$NON-NLS-1$
    const val VALUE_ZERO_DP = "0dp" //$NON-NLS-1$
    const val VALUE_ONE_DP = "1dp" //$NON-NLS-1$
    const val VALUE_TOP = "top" //$NON-NLS-1$
    const val VALUE_BOTTOM = "bottom" //$NON-NLS-1$
    const val VALUE_CENTER_VERTICAL = "center_vertical" //$NON-NLS-1$
    const val VALUE_CENTER_HORIZONTAL = "center_horizontal" //$NON-NLS-1$
    const val VALUE_FILL_HORIZONTAL = "fill_horizontal" //$NON-NLS-1$
    const val VALUE_FILL_VERTICAL = "fill_vertical" //$NON-NLS-1$
    const val VALUE_0 = "0" //$NON-NLS-1$
    const val VALUE_1 = "1" //$NON-NLS-1$

    // Gravity values. These have the GRAVITY_ prefix in front of value because we already
    // have VALUE_CENTER_HORIZONTAL defined for layouts, and its definition conflicts
    // (centerHorizontal versus center_horizontal)
    const val GRAVITY_VALUE_ = "center" //$NON-NLS-1$
    const val GRAVITY_VALUE_CENTER = "center" //$NON-NLS-1$
    const val GRAVITY_VALUE_LEFT = "left" //$NON-NLS-1$
    const val GRAVITY_VALUE_RIGHT = "right" //$NON-NLS-1$
    const val GRAVITY_VALUE_START = "start" //$NON-NLS-1$
    const val GRAVITY_VALUE_END = "end" //$NON-NLS-1$
    const val GRAVITY_VALUE_BOTTOM = "bottom" //$NON-NLS-1$
    const val GRAVITY_VALUE_TOP = "top" //$NON-NLS-1$
    const val GRAVITY_VALUE_FILL_HORIZONTAL = "fill_horizontal" //$NON-NLS-1$
    const val GRAVITY_VALUE_FILL_VERTICAL = "fill_vertical" //$NON-NLS-1$
    const val GRAVITY_VALUE_CENTER_HORIZONTAL = "center_horizontal" //$NON-NLS-1$
    const val GRAVITY_VALUE_CENTER_VERTICAL = "center_vertical" //$NON-NLS-1$
    const val GRAVITY_VALUE_FILL = "fill" //$NON-NLS-1$

    /**
     * The top level android package as a prefix, "android.".
     */
    const val ANDROID_SUPPORT_PKG_PREFIX = ANDROID_PKG_PREFIX + "support." //$NON-NLS-1$

    /** The android.view. package prefix  */
    const val ANDROID_VIEW_PKG = ANDROID_PKG_PREFIX + "view." //$NON-NLS-1$

    /** The android.widget. package prefix  */
    const val ANDROID_WIDGET_PREFIX = ANDROID_PKG_PREFIX + "widget." //$NON-NLS-1$

    /** The android.webkit. package prefix  */
    const val ANDROID_WEBKIT_PKG = ANDROID_PKG_PREFIX + "webkit." //$NON-NLS-1$

    /** The LayoutParams inner-class name suffix, .LayoutParams  */
    const val DOT_LAYOUT_PARAMS = ".LayoutParams" //$NON-NLS-1$

    /** The fully qualified class name of an EditText view  */
    const val FQCN_EDIT_TEXT = "android.widget.EditText" //$NON-NLS-1$

    /** The fully qualified class name of a LinearLayout view  */
    const val FQCN_LINEAR_LAYOUT = "android.widget.LinearLayout" //$NON-NLS-1$

    /** The fully qualified class name of a RelativeLayout view  */
    const val FQCN_RELATIVE_LAYOUT = "android.widget.RelativeLayout" //$NON-NLS-1$

    /** The fully qualified class name of a RelativeLayout view  */
    const val FQCN_GRID_LAYOUT = "android.widget.GridLayout" //$NON-NLS-1$
    const val FQCN_GRID_LAYOUT_V7 = "android.support.v7.widget.GridLayout" //$NON-NLS-1$

    /** The fully qualified class name of a FrameLayout view  */
    const val FQCN_FRAME_LAYOUT = "android.widget.FrameLayout" //$NON-NLS-1$

    /** The fully qualified class name of a TableRow view  */
    const val FQCN_TABLE_ROW = "android.widget.TableRow" //$NON-NLS-1$

    /** The fully qualified class name of a TableLayout view  */
    const val FQCN_TABLE_LAYOUT = "android.widget.TableLayout" //$NON-NLS-1$

    /** The fully qualified class name of a GridView view  */
    const val FQCN_GRID_VIEW = "android.widget.GridView" //$NON-NLS-1$

    /** The fully qualified class name of a TabWidget view  */
    const val FQCN_TAB_WIDGET = "android.widget.TabWidget" //$NON-NLS-1$

    /** The fully qualified class name of a Button view  */
    const val FQCN_BUTTON = "android.widget.Button" //$NON-NLS-1$

    /** The fully qualified class name of a RadioButton view  */
    const val FQCN_RADIO_BUTTON = "android.widget.RadioButton" //$NON-NLS-1$

    /** The fully qualified class name of a ToggleButton view  */
    const val FQCN_TOGGLE_BUTTON = "android.widget.ToggleButton" //$NON-NLS-1$

    /** The fully qualified class name of a Spinner view  */
    const val FQCN_SPINNER = "android.widget.Spinner" //$NON-NLS-1$

    /** The fully qualified class name of an AdapterView  */
    const val FQCN_ADAPTER_VIEW = "android.widget.AdapterView" //$NON-NLS-1$

    /** The fully qualified class name of a ListView  */
    const val FQCN_LIST_VIEW = "android.widget.ListView" //$NON-NLS-1$

    /** The fully qualified class name of an ExpandableListView  */
    const val FQCN_EXPANDABLE_LIST_VIEW = "android.widget.ExpandableListView" //$NON-NLS-1$

    /** The fully qualified class name of a GestureOverlayView  */
    const val FQCN_GESTURE_OVERLAY_VIEW = "android.gesture.GestureOverlayView" //$NON-NLS-1$

    /** The fully qualified class name of a DatePicker  */
    const val FQCN_DATE_PICKER = "android.widget.DatePicker" //$NON-NLS-1$

    /** The fully qualified class name of a TimePicker  */
    const val FQCN_TIME_PICKER = "android.widget.TimePicker" //$NON-NLS-1$

    /** The fully qualified class name of a RadioGroup  */
    const val FQCN_RADIO_GROUP = "android.widgets.RadioGroup" //$NON-NLS-1$

    /** The fully qualified class name of a Space  */
    const val FQCN_SPACE = "android.widget.Space" //$NON-NLS-1$
    const val FQCN_SPACE_V7 = "android.support.v7.widget.Space" //$NON-NLS-1$

    /** The fully qualified class name of a TextView view  */
    const val FQCN_TEXT_VIEW = "android.widget.TextView" //$NON-NLS-1$

    /** The fully qualified class name of an ImageView view  */
    const val FQCN_IMAGE_VIEW = "android.widget.ImageView" //$NON-NLS-1$
    const val ATTR_SRC = "src" //$NON-NLS-1$
    const val ATTR_GRAVITY = "gravity" //$NON-NLS-1$
    const val ATTR_WEIGHT_SUM = "weightSum" //$NON-NLS-1$
    const val ATTR_EMS = "ems" //$NON-NLS-1$
    const val VALUE_HORIZONTAL = "horizontal" //$NON-NLS-1$
    const val GRADLE_PLUGIN_NAME = "com.android.tools.build:gradle:"
    const val GRADLE_MINIMUM_VERSION = "2.2.1"
    const val GRADLE_LATEST_VERSION = "2.4"
    const val GRADLE_PLUGIN_MINIMUM_VERSION = "1.0.0"
    const val GRADLE_PLUGIN_RECOMMENDED_VERSION = "1.3.0"
    const val GRADLE_PLUGIN_LATEST_VERSION = GRADLE_PLUGIN_RECOMMENDED_VERSION
    const val MIN_BUILD_TOOLS_VERSION = "19.1.0"
    const val SUPPORT_LIB_ARTIFACT = "com.android.support:support-v4"
    const val APPCOMPAT_LIB_ARTIFACT = "com.android.support:appcompat-v7"

    // Annotations
    const val SUPPORT_ANNOTATIONS_PREFIX = "android.support.annotation."
    const val INT_DEF_ANNOTATION = SUPPORT_ANNOTATIONS_PREFIX + "IntDef"
    const val STRING_DEF_ANNOTATION = SUPPORT_ANNOTATIONS_PREFIX + "StringDef"
    const val TYPE_DEF_VALUE_ATTRIBUTE = "value"
    const val TYPE_DEF_FLAG_ATTRIBUTE = "flag"
    const val FN_ANNOTATIONS_ZIP = "annotations.zip"

    // Data Binding MISC
    const val DATA_BINDING_LIB_ARTIFACT = "com.android.databinding:library"
    val TAGS_DATA_BINDING = arrayOf(
        TAG_VARIABLE,
        TAG_IMPORT, TAG_LAYOUT, TAG_DATA
    )
    val ATTRS_DATA_BINDING = arrayOf(
        ATTR_NAME,
        ATTR_TYPE, ATTR_CLASS, ATTR_ALIAS
    )
}