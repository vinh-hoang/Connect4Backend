import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.4"
	id("io.spring.dependency-management") version "1.1.0"
	id("org.jetbrains.kotlin.plugin.jpa") version "1.8.20-RC"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	//hibernate
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("io.hypersistence:hypersistence-utils-hibernate-60:3.2.0")

	implementation("com.fasterxml.jackson.module:jackson-module-jakarta-xmlbind-annotations")

	//liquibase
	implementation("org.liquibase:liquibase-core:4.20.0")

	//postgres jdbc driver
	implementation("org.postgresql:postgresql:42.5.4")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
