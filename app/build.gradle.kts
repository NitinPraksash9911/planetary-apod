import org.jetbrains.kotlin.konan.properties.Properties
import java.io.FileInputStream

plugins {
  id(BuildPlugins.androidApplication)
  id(BuildPlugins.kotlinAndroid)
  id(BuildPlugins.Kapt)
  id(BuildPlugins.hiltPlugin)

}

val localProperties = Properties()
localProperties.load(FileInputStream(rootProject.file("local.properties")))

android {
  compileSdkVersion(ConfigVersions.compileSDK)

  defaultConfig {
    applicationId("com.example.planetaryapod")
    minSdkVersion(ConfigVersions.minSdk)
    targetSdkVersion(ConfigVersions.targetSdk)
    versionCode(ConfigVersions.versionCode)
    versionName(ConfigVersions.versionName)
    testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = true
      isShrinkResources = true
      buildConfigField("String", "BASE_URL", "\"https://api.nasa.gov/\"")
      buildConfigField("String", "API_KEY", localProperties.getProperty("apiKey"))

      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
    getByName("debug") {
      isMinifyEnabled = false
      buildConfigField("String", "BASE_URL", "\"https://api.nasa.gov/\"")
      buildConfigField("String", "API_KEY", localProperties.getProperty("apiKey"))
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
  }

  java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
      jvmTarget = "1.8"
    }
  }


  buildFeatures {
    dataBinding = true
  }
}


dependencies {
  implementation(Deps.core_ktx)
  implementation(Deps.app_compat_x)
  implementation(Deps.material_x)
  implementation(Deps.constraintlayout)
  implementation(Deps.app_compat_x)
  implementation(Deps.recyclerView)
  implementation(Deps.material_x)
  implementation(Deps.app_compat_x)
  implementation(Deps.core_ktx)
  implementation(Deps.constraintlayout)

  implementation(Deps.Glide.glide)
  annotationProcessor(Deps.Glide.glide_processor)

  implementation(Deps.Coroutines.core)
  implementation(Deps.Coroutines.android)
  implementation(Deps.Coroutines.common)
  implementation(Deps.Coroutines.common)


  implementation(Deps.AndroidX.lifecycle_viewmodel_extensions)
  implementation(Deps.AndroidX.lifecycle_livedata_extensions)
  implementation(Deps.AndroidX.lifecycle_extensions)
  implementation(Deps.AndroidX.fragment)


  implementation(Deps.Retrofit.retrofit)
  implementation(Deps.Retrofit.retrofit_gson)
  implementation(Deps.gson)
  implementation(Deps.OkHttp.logging)


  implementation(Deps.Room.room_runtime)
  implementation(Deps.Room.room_ktx)
  kapt(Deps.Room.room_compiler)

  testImplementation(Deps.junit)
  testImplementation(Deps.AndroidXTest.core)
  testImplementation(Deps.Coroutines.test)
  testImplementation(Deps.AndroidXTest.junit)
  testImplementation(Deps.AndroidXTest.runner)
  testImplementation(Deps.mockk)

  testImplementation(Deps.junit)
  testImplementation(Deps.mockk)

  androidTestImplementation(Deps.AndroidXTest.core)
  androidTestImplementation(Deps.AndroidXTest.junit)
  androidTestImplementation(Deps.AndroidXTest.runner)
  androidTestImplementation(Deps.junit)
  androidTestImplementation(Deps.mockk_android)

  implementation(Deps.DI.hilt)
  kapt(Deps.DI.hiltCompiler)

}