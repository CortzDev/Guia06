plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.loginproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.loginproject"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        dataBinding = true // Habilitar Data Binding
        viewBinding = true // Habilitar View Binding
    }
}

dependencies {
    // Dependencias básicas de la aplicación
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Dependencias de Firebase
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.google.firebase:firebase-auth:21.0.1")
    implementation("com.google.firebase:firebase-firestore:24.0.0")
        implementation("com.google.android.gms:play-services-auth:20.0.1")  // O la versión más reciente
    implementation("de.hdodenhof:circleimageview:3.1.0")



    // Dependencias adicionales
    implementation(libs.glide)
    annotationProcessor(libs.glide.compiler)

    // Dependencias para pruebas
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
