# kotlin-multiplatform-example-with-typescript
Kotlin 1.2.* multi-platform experiments


Locations
=========
Shared/multiplatform code: ./src
JS-specific code: ./calculator-js
Java-specific code: ./calculator-jvm
Typescript code (consumes the JS-specific code's output): ./ts


Installation
============
Install modules:

    yarn

Perform your initial build:

    npm run start


Build and run
=============
## To build start->end then immediately run the module:

    npm run start

...OR:

    npm run buildrun-full

## To just perform the Kotlin build:
    ./gradlew build

...OR:

    npm run build-kotlin

## To perform only the Typescript build:

    npm run build-typescript

## To run the (fully built) JS code:

    npm run run-js

## To watch the kotlin-js, kotlin-shared, & typescript dirs, and rebuild on code change:

    npm run watch-buildrun-full


How it works
============
```
  ==================================================
 // Multiplatform library/module written in Kotlin \\
||=================================================================
|| [./src-js]                                     [./src]        ||
|| Kotlin-JS code --implements requirements of--> Common code    ||
||                                                               ||
||    Common code ---------shared with----------> Kotlin-JS code ||
===================================================================
             /\                                  /\
             ||                                  ||
      [consumes/imports]                 [consumes/imports]
             ||                                  ||
        =============             ================================
        || [./ts]  ||             || [./java] (not implemented) ||
        || TS code ||             || Runnable Java code         ||
        =============             ================================
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
```


Links
=====
[Much thanks to this vividcode tutorial for getting me started](https://vividcode.io/Kotlin-1-2-Multiplatform-Projects/)
