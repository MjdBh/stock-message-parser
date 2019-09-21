package com.example.trade.exception;

public class ParserCompileException extends RuntimeException {


        public ParserCompileException() {
            super();
        }

        public ParserCompileException(String message) {
            super(message);
        }

        public ParserCompileException(String message, Throwable cause) {
            super(message, cause);
        }

        public ParserCompileException(Throwable cause) {
            super(cause);
        }
}
