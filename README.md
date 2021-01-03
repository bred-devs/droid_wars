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
