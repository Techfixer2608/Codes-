#Codes Repository

>>>CLONE REPO USING SSH 
(git clone git@github.com:USERNAME/REPO.git)
(cd REPO)

>>>FOR MAIN BRANCH
>(git checkout -b main
)

>>>CREATE README IN MAIN BRANCH
echo "# My Project" > README.md
git add README.md
git commit -m "Add README to main"
git push origin main


>>>Adding codes to file name one plus
cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes\Codes-"     // run command in powershell
git checkout -b oneplus                         // create and switch to new brnach named oneplus 

cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes"
Copy-Item -Path "SumofArray.java","sumoftwonumbers.java","SwitchDemo.java","temp.java","tempCodeRunnerFile.java","typecasting.java" -Destination "Codes-\" -Force

>>>git add.  // Stage all files together

git commit -m "Add Java files: SumofArray, sumoftwonumbers, SwitchDemo, temp, tempCodeRunnerFile, typecasting"


>>>git push -u origin oneplus         // push branch 





