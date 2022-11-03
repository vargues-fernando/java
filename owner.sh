#!/bin/bash

git filter-branch -f --env-filter '
OLD_NAME="guillermo.galeano"
OLD_EMAIL="guillermo.galeano@ask.com"
NEW_NAME="vargues-fernando"
NEW_EMAIL="vargues.fernando@gmail.com"
if [ "$GIT_COMMITTER_NAME" = "$OLD_NAME" ]
then
  export GIT_COMMITTER_NAME="$NEW_NAME"
  export GIT_COMMITTER_EMAIL="$NEW_EMAIL"
fi
if [ "$GIT_COMMITTER_EMAIL" = "$OLD_EMAIL" ]
then
  export GIT_COMMITTER_NAME="$NEW_NAME"
  export GIT_COMMITTER_EMAIL="$NEW_EMAIL"
fi
if [ "$GIT_AUTHOR_EMAIL" = "$OLD_EMAIL" ]
then
  export GIT_AUTHOR_NAME="$NEW_NAME"
  export GIT_AUTHOR_EMAIL="$NEW_EMAIL"
fi
' --tag-name-filter cat -- --branches --tags
