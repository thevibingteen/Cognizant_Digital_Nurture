# Verify master is clean
git status

# Create branch
git checkout -b GitWork

# Create hello.xml
touch hello.xml

# Edit hello.xml

# Check status
git status

# Commit
git add .
git commit -m "Add hello.xml in GitWork"

# Switch to main
git checkout main

# Modify hello.xml
git add .
git commit -m "Modify hello.xml in main"

# View log
git log --oneline --graph --decorate --all

# Compare branches
git diff main GitWork

# Merge
git merge GitWork

# Resolve conflict

# Commit resolved conflict
git add .
git commit -m "Resolve merge conflict"

# Ignore backup file
echo *.bak > .gitignore

git add .gitignore
git commit -m "Ignore backup files"

# Delete merged branch
git branch -d GitWork