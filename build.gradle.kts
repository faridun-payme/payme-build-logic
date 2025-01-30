plugins {
    `kotlin-dsl`
}

group = "uz.payme"
version = "1.0.0"

gradlePlugin {
    plugins {
        create("samplePlugin") {
            id = "payme.sample.plugin"
            implementationClass = "com.payme.buildlogic.SamplePlugin"
        }
    }
}