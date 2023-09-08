class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {

        // TODO: Currently, the Token class only tracks the line number
        // on which the token was found. 
        //  
        // We can also track the column number on which the token was
        // found. This will help us in reporting the exact location of
        // the error in the source code.

        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}