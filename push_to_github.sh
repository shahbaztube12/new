#!/bin/bash

# Pull the latest changes from the repository
git pull origin main

# Add all changed files to git
git add .

# Commit the changes with an auto-generated message (you can customize this)
git commit -m "Auto-updated on $(date)"

git remote -v
# Push the changes to the remote repository
git push origin main
