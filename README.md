# packetwrapper-jitpack

This repository aims to mirror the PacketWrapper repository from @lukalt on [jitpack.io](https://jitpack.io).

The reason that drove me to create this repository is that the maven repository of @lukalt isn't accessible to me for an unknown reason.

Current supported versions : `2.1.0 (mc 1.19.4)`, `2.1.1 (mc 1.19.4)`, `2.1.2 (mc 1.19.4)`, `2.2.0 (mc 1.20)`, `2.2.1 (mc 1.20 & 1.20.1)`

### Usage

#### I. as external dependency

This option will ask you to have the plugin `PacketWrapper` installed on your server as it will be loaded by the server in its classpath.

First of all, add it as dependency for your plugin in the `plugin.yml` like this:
```yaml
depend: [PacketWrapper] # Add also "ProtocolLib" as dependecy
```

Then add the dependency to your project :

<details>
    <summary>Maven</summary>

```xml
<repositories>
    
    <!-- JitPack repository -->
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>

</repositories>

<dependencies>
    
    <!-- packetwrapper-jitpack dependency -->
    <dependency>
        <groupId>com.github.onedevman-devmc</groupId>
        <artifactId>packetwrapper-jitpack</artifactId>
        <version>{version}-SNAPSHOT</version>
        <scope>provided</scope>
    </dependency>

</dependencies>
```
</details>

<details>
    <summary>Gradle</summary>

<details>
    <summary style="font-weight: bold; font-size: 0.8em;">Groovy</summary>

```groovy
repositories {
    
    // JitPack repository
    maven { url 'https://jitpack.io/' }

}

dependencies {

    // packetwrapper-jitpack dependency
    compileOnly 'com.github.onedevman-devmc:PacketWrapper:{version}-SNAPSHOT'

}
```
</details>

<details>
    <summary style="font-weight: bold; font-size: 0.8em;">Kotlin</summary>

```kotlin
repositories {

    // JitPack repository
    maven("https://jitpack.io/")

}

dependencies {

    // packetwrapper-jitpack dependency
    compileOnly("com.github.onedevman-devmc:PacketWrapper:{version}-SNAPSHOT")

}
```
</details>

</details>

#### II. as an embedded dependency (not recommended)

This option allows you to have a standalone plugin implementing directly `PacketWrapper` into your build.

For that, you'll need to use a package relocation plugin (to avoid conflict between plugins that also use `PacketWrapper`).

<details>
    <summary>Maven</summary>

If you're using Maven, you can use the [`Maven Shade Plugin`](https://maven.apache.org/plugins/maven-shade-plugin/) which offers a relocation feature :
```xml
<plugins>

    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-shade-plugin</artifactId>
        <version>{plugin-version}</version>
        <configuration>
            
            <relocations>
                
                <relocation>
                    <pattern>com.comphenix.packetwrapper</pattern>
                    <shadedPattern>{new-package-name}</shadedPattern> <!-- Example: <shadedPattern>me.myplugin.protocollib.packetwrapper</shadedPattern> -->
                </relocation>

              </relocations>
            
        </configuration>
        <executions>
            <execution>
            <phase>package</phase>
            <goals>
                <goal>shade</goal>
            </goals>
            </execution>
        </executions>
    </plugin>

</plugins>
```

Then you can add the dependency with `compile` scope, which will notice maven to include compiled classpath of the dependency into your build :
```xml
<repositories>
    
    <!-- JitPack repository -->
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>

</repositories>

<dependencies>
    
    <!-- packetwrapper-jitpack dependency -->
    <dependency>
        <groupId>com.github.onedevman-devmc</groupId>
        <artifactId>packetwrapper-jitpack</artifactId>
        <version>{version}-SNAPSHOT</version>
        <scope>compile</scope> <!-- This scope will include the compiled classpath into your build -->
    </dependency>

</dependencies>
```
</details>

<details>
    <summary>Gradle</summary>

If you're using Gradle, you can use the [`Gradle Shadow Plugin`](https://gradleup.com/shadow/) which offers a relocation feature :

<details>
    <summary style="font-weight: bold; font-size: 0.8em;">Groovy</summary>

```groovy
plugins {
    id 'com.gradleup.shadow' version '{plugin-version}'
    id 'java'
}

shadowJar {
    archiveBaseName.set("${project.name}-${project.version}-shadowed")
    archiveClassifier.set('')
    archiveVersion.set('')

    relocate 'com.comphenix.packetwrapper', '{new-package-name}'
}
```
</details>

<details>
    <summary style="font-weight: bold; font-size: 0.8em;">Kotlin</summary>

```kotlin
plugins {
    id("com.gradleup.shadow") version "{plugin-version}"
    id("java")
}

shadowJar {
    archiveBaseName.set("${project.name}-${project.version}-shadowed")
    archiveClassifier.set("")
    archiveVersion.set("")

    relocate "com.comphenix.packetwrapper", "{new-package-name}"
}
```
</details>
<br>

Then you can add the dependency to `implementation` configuration, which will notice gradle to litterally include the dependency as an implementation into your build :

<details>
    <summary style="font-weight: bold; font-size: 0.8em;">Groovy</summary>

```groovy
repositories {
    
    // JitPack repository
    maven { url 'https://jitpack.io/' }

}

dependencies {

    // packetwrapper-jitpack dependency
    implementation 'com.github.onedevman-devmc:PacketWrapper:{version}-SNAPSHOT'

}
```
</details>

<details>
    <summary style="font-weight: bold; font-size: 0.8em;">Kotlin</summary>

```kotlin
repositories {
    
    // JitPack repository
    maven("https://jitpack.io/")

}

dependencies {

    // packetwrapper-jitpack dependency
    implementation "com.github.onedevman-devmc:PacketWrapper:{version}-SNAPSHOT"

}
```
</details>

</details>