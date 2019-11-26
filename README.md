# z3-clojure-attempt

3 birds 1 stone "Hello World!": Clojure + Z3 + Java

## Notes
Install 
- `openjdk-8-jre openjdk-8-jdk`
- [~Lenin~ Leiningen](https://github.com/technomancy/leiningen)

Build z3 from source and copy into `lib` directory
```
com.microsoft.z3.jar
libz3.so
libz3java.so
```

## Usage
```
export LD_LIBRARY_PATH=$(realpath ./lib)
lein run
```

# TODO's
1. Learn Clojure, lol
1. https://qiita.com/quentin-maisonneuve/items/4f32cf52293dc44ffc3d

# Resources
1. https://clojure.org/reference/java_interop
1. https://github.com/Z3Prover/z3/blob/master/examples/java/JavaExample.java
1. https://github.com/technomancy/leiningen/blob/stable/doc/TUTORIAL.md
