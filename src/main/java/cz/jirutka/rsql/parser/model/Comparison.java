/*
 * The MIT License
 *
 * Copyright 2013 Jakub Jirutka <jakub@jirutka.cz>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package cz.jirutka.rsql.parser.model;

/**
 * Comparison operator which is used in {@link ComparisonExpression}.
 * 
 * @author Jakub Jirutka <jakub@jirutka.cz>
 */
public enum Comparison {

    /** Equal to : "==" or "=" */
    EQUAL ("="),
    
    /** Not equal to : "!=" */
    NOT_EQUAL ("!="),
    
    /** Greater than operator : "=gt=" or ">" */
    GREATER_THAN (">"),
    
    /** Greater than or equal to: "=ge=" or ">=" */
    GREATER_EQUAL (">="),
    
    /** Less than : "=lt=" or "<" */
    LESS_THAN ("<"),
    
    /** Less than or equal to : "=le=" or "<=" */
    LESS_EQUAL ("<="),

    /** In : "=in=" */
    IN ("IN"),
    
    /** Not in : "=out=" */
    OUT ("NOT IN");
    
   
    private final String symbol;
    
    private Comparison(String symbol) {
        this.symbol = symbol;
    }

    
    @Override
    public String toString() {
        return symbol;
    }
    
}