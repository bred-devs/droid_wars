# Droid wars

## Rating

### Initial rating

Every player will be given rating of 1000 in the beginning.

### Change after a fight

Assuming RA and RB are pre-fight ratings for the player A and the player B respectively, new ratings are:


RA' = RA + 16 * (WA - E)

RB' = RB + 16 * (E - WA)


where:

* WA is whether the player A won the fight: 1 if they won, 0 if they lost.
* E = 1 / (1 + Math.pow(10, (RB - RA) / 400))

## Experience

Each fight gives up to 3 experience points (EXP) for each of the participants.

* 1 EXP is given for participation in the fight.
* Additional 1 EXP is given for winning.
* Another 1 EXP is given for winning against the opponent with higher rating.
