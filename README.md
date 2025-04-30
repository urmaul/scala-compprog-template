# Scala Template for Competitive Programming

Contains simple input/output code using buffered stdin reader. Uses Scala CLI to run.

## Installing Scala CLI

The way you install Scala CLI depends on your Scala version. Run `scala --version` to check it out.

### If you have Scala 3.5 or later

No need to do anything, just use your `scala` command.

### If you have older Scala or no Scala at all

For MacOS with Homebrew you can install it by running `brew install Virtuslab/scala-cli/scala-cli`. Use command `scala-cli` afterwards.

Installation instructions for other cases: https://scala-cli.virtuslab.org/install/

## Running

Use this command to run the program: `scala main.scala` (or `scala-cli main.scala` if you installed Scala CLI separately).

If you don't want to type in the input on every run, keep it in a file and route it to stdin. The command would then look somewhat like this: `scala main.scala <input.txt`.

## Testing

It's uncommon to write tests in competitive programming but you might want to make sure some units work as expected.

To run tests, use command `scala test main.test.scala`.
