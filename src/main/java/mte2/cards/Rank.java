// Question: Q3 (mte2, gcis124, 2255)
// Package name: cards
// File name: Rank.java

package mte2.cards;

// An enumeration of the ranks in a standard deck of playing cards.

public enum Rank {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(1);

    private final int rankNumber;   // The rank number.

    /**
     * Creates a new rank with the specified number.
     * 
     * @param rankNumber The rank number.
     */
    private Rank(int rankNumber) {    this.rankNumber = rankNumber;    }

    /**
     * Returns the number for this rank.
     * @return The number for this rank.
     */
    public int getRankNumber() {    return this.rankNumber;    }
}
