object Versions {
    const val kotlinVersion = "1.4.31"
    const val core = "1.3.2"
    const val buildToolsVersion = "4.2.1"
    const val espresso = "3.3.0"
    const val hiltVersion = "2.35.1"
    const val fragmentVersion = "1.3.4"
    const val kotlin = "1.4.21"
    const val androidx_test = "1.2.0"
    const val androidXTestExt = "1.1.1"
    const val junit = "4.12"
    const val coroutines = "1.3.9-native-mt"
    const val lifecycle = "2.2.0"
    const val coreTesting = "1.1.1"
    const val glide = "4.11.0"
    const val mockkVersion = "1.10.5"
    const val retrofitVersion = "2.9.0"
    const val gson = "2.8.6"
    const val okhttpLogging = "3.11.0"
    const val room = "2.2.6"

}

object ConfigVersions {
    const val compileSDK = 30
    const val minSdk = 21
    const val targetSdk = 30
    const val versionCode = 1
    const val versionName = "1.0"
}

object BuildPlugins {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val Kapt = "kotlin-kapt"
    const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:2.35.1"
    const val hiltPlugin = "dagger.hilt.android.plugin"

}

object Deps {

    const val app_compat_x = "androidx.appcompat:appcompat:1.1.0"
    const val material_x = "com.google.android.material:material:1.1.0"
    const val core_ktx = "androidx.core:core-ktx:1.2.0"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
    const val junit = "junit:junit:${Versions.junit}"
    const val mockk = "io.mockk:mockk:${Versions.mockkVersion}"
    const val mockk_android = "io.mockk:mockk-android:${Versions.mockkVersion}"

    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    object AndroidXTest {
        const val core = "androidx.test:core:${Versions.androidx_test}"
        const val junit = "androidx.test.ext:junit:${Versions.androidXTestExt}"
        const val runner = "androidx.test:runner:${Versions.androidx_test}"
        const val rules = "androidx.test:rules:${Versions.androidx_test}"
    }


    object AndroidX {
        const val lifecycle_extensions =
            "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val lifecycle_viewmodel_extensions =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val lifecycle_livedata_extensions =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragmentVersion}"

    }

    object Coroutines {
        const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
        const val core = "android.arch.core:core-testing:${Versions.coreTesting}"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val glide_processor = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
        const val retrofit_gson =
            "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    }

    object OkHttp {
        const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
    }

    object Room {
        const val room_runtime = "androidx.room:room-runtime:${Versions.room}"
        const val room_compiler = "androidx.room:room-compiler:${Versions.room}"
        const val room_ktx = "androidx.room:room-ktx:${Versions.room}"
    }

    object DI {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hiltVersion}"
    }

}



