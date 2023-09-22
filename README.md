# jlox: A Lox Interpreter in Java

This is my implementation of the Lox interpreter from the book [Crafting Interpreters](https://craftinginterpreters.com/). This project is an ongoing development of the interpreter, implemented in Java, as part of a self-learning exercise to understand the deeper concepts of interpreters and programming languages.

The development process is structured by chapters, with each chapter residing in its own branch. Every individual section within a chapter has its own commit, making it easy to follow the progress and understand the changes.

## Additional Features

While the book, Crafting Interpreters, provides an excellent guide for implementing a robust interpreter, I have decided to further enhance the project by incorporating additional features that are not covered in the book. As I progress through the book, I'll continue to identify and add new features to this list. Here are the enhancements made thus far:

- **Advanced Error Reporting:** The interpreter implements advanced error reporting to provide precise issue tracking and enhance debugging efficiency.
- **Optimized REPL Mode:** The REPL (Read-Eval-Print-Loop) mode is designed to handle multi-line inputs, similar to Python, improving user interaction and usability.


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.
