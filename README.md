# Scala Template for Competitive Programming

Contains simple input/output code using buffered stdin reader.

## Install Scala

Install Scala as explained on the [website](https://www.scala-lang.org/download/):
```sh
brew install coursier/formulas/coursier && cs setup
```

### Using Intellij IDEA + Scala Plugin

Open this folder.

### Using command line

Use this command to run the program: `scala main.scala`.

If you don't want to type in the input on every run, keep it in a file and route it to stdin. The command would then look somewhat like this: `scala main.scala <input.txt`.

It's uncommon to write tests in competitive programming but you might want to make sure some units work as expected.
To run tests, use command `scala test main.test.scala`.
