# Navigate to repository
cd GitDemo

# Create log file
echo Log File > sample.log

# Create log directory
mkdir log

# Create log inside directory
echo Application Log > log/app.log

# Create .gitignore
echo *.log > .gitignore
echo log/ >> .gitignore

# Check status
git status

# Stage tracked files
git add .

# Commit
git commit -m "Implement .gitignore"

# Verify
git status