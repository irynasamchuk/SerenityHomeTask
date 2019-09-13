Lookup a definition
Narrative:
In order to talk better
As an English student
I want to look up word definitions

Scenario: Looking up the translation of the 'apple'
Given the user is on the google translate page
And selected languages from 'английский' to 'украинский'
When the user looks up the translation of the word 'apple'
Then they should see the translation 'яблоко'
