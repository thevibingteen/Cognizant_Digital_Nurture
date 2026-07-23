# Check Git version
git --version

# Configure Git
git config --global user.name "Your Name"
git config --global user.email "your@email.com"

# Verify configuration
git config --list

# Configure Notepad++
git config --global core.editor "notepad++"

# Create project
mkdir GitDemo
cd GitDemo

# Initialize repository
git init

# Create file
echo Welcome to Git Hands-On Lab > welcome.txt

# Verify
dir
type welcome.txt

# Check status
git status

# Stage file
git add welcome.txt

# Commit
git commit

# View status
git status

# Add remote
git remote add origin https://github.com/<username>/GitDemo.git

# Pull
git pull origin main

# Push
git push -u origin main