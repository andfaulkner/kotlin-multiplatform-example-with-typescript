# kotlin-multiplatform-example-with-typescript
Kotlin 1.2.* multi-platform experiments


Locations
=========
Shared/multiplatform code: ./src
JS-specific code: ./src-js
Java-specific code: ./src-jvm
Typescript code (consumes the JS-specific code's output): ./ts


Installation
============
Install modules:

    yarn

Perform your initial build:

    npm run start


Build and run
=============
### To build start->end then immediately run the module:

    npm run start

...OR:

    npm run buildrun-full

### To just perform the Kotlin build:
    ./gradlew build

...OR:

    npm run build-kotlin

### To perform only the Typescript build:

    npm run build-typescript

### To run the (fully built) JS code:

    npm run run-js

### To watch the kotlin-js, kotlin-shared, & typescript dirs, and rebuild on code change:

    npm run watch-buildrun-full


How it works
============
```
  ==================================================
 // Multiplatform library/module written in Kotlin \\
||===================================================================
|| [./src]                                          [./src-js]     ||
|| Common code ------------shared with------------> Kotlin-JS code ||
||                                                                 ||
|| [./src-jvm]                                      [./src]        ||
|| Kotlin-Java code --implements requirements of--> Common code    ||
||                                                                 ||
|| [./src-js]                                       [./src]        ||
|| Kotlin-JS code ---implements requirements- of--> Common code    ||
=====================================================================
             /\                                  /\
             ||                                  ||
     [consumes/imports]                  [consumes/imports]
             ||                                  ||
        =============             ================================
        || [./ts]  ||             || [./java] (not implemented) ||
        || TS code ||             || Runnable Java code         ||
        =============             ================================ [1]
             ||                                  ||
       [transpiles to]                           \/
             ||                            Displays output
             \/
  =========================
  || [./src-js/build/js] ||
  || Runnable JS code    ||
  =========================
             ||
             \/
       Displays output 

 -------------JS-------------    ---------------Java---------------

[1] Different code from the Kotlin-Java code mentioned in the multiplatform
    library/module block at the top of the diagram
```


Links
=====
[Much thanks to this tutorial for getting this started](https://vividcode.io/Kotlin-1-2-Multiplatform-Projects/)
