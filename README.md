Spring boot sample project for building and testing java with maven

git remote add origin <your repository https url>

git add .

git commit -m "intializing project"

git push origin <your branch name, ex. master>


git init 

This step creates a hidden .git directory in your project folder, which the git software recognizes and uses to store all the metadata and version history for the project.
-------------

git add .

The git add command is used to tell git which files to include in a commit, and the -A (or --all) argument means “include all”.
------------

git commit -m 'Added my project'

The git commit command creates a new commit with all files that have been “added”. The -m (or --message) sets the message that will be included alongside the commit, used for future reference to understand the commit. In this case, the message is: 'Added my project'.
----------------

git remote add origin git@github.com:ramesh204dev/springboot.git

In git, a “remote” refers to a remote version of the same repository, which is typically on a server somewhere (in this case, GitHub). “origin” is the default name git gives to a remote server (you can have multiple remotes), so git remote add origin instructs git to add the URL of the default remote server for this repo.
----------------

git push -u origin main

git push -u -f origin main

The -u (or --set-upstream) flag sets the remote origin as the upstream reference. This allows you to later perform git push and git pull commands without having to specify an origin since we always want GitHub in this case.
The -f (or --force) flag stands for force. This will automatically overwrite everything in the remote directory. We’re using it here to overwrite the default README that GitHub automatically initialized.
---------
ref --> https://www.digitalocean.com/community/tutorials/how-to-push-an-existing-project-to-github
