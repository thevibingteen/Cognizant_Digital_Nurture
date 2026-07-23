# Create a new branch
git branch GitNewBranch

# List branches
git branch -a

# Switch to the new branch
git checkout GitNewBranch

# Create a file
echo Branch File > branch.txt

# Stage file
git add .

# Commit changes
git commit -m "Add branch file"

# Check status
git status

# Switch back to main
git checkout main

# Compare branches
git diff main GitNewBranch

# Merge branch
git merge GitNewBranch

# View commit history
git log --oneline --graph --decorate

# Delete merged branch
git branch -d GitNewBranch

# Verify status
git status