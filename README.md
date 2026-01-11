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


>>>ADDING CODES TO FILE NAME ONE PLUS 
cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes\Codes-"     

 
 >>>CREATE AND SWITCH TO BRANCH
  git checkout -b oneplus                          


>>>COPY FILES
cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes"
Copy-Item -Path " MatrixMultiplication.java" "ReverseNumber.java" "palindrome.java"  "simpleinterest.java" "loops.java" ""SumofArray.java","sumoftwonumbers.java","SwitchDemo.java","temp.java","tempCodeRunnerFile.java","typecasting.java" -Destination "Codes-\" -Force



>>>STAGE ALL FILES TOGETHER
git add.
 

>>>COMMIT IN ONE MESSAGE
git commit -m "Add Java files: MatrixMultiplication ,ReverseNumber , palindrome , simpleinterest , loops,  SumofArray , sumoftwonumbers, SwitchDemo, temp, tempCodeRunnerFile, typecasting"  


>>>PUSH BRANCH
git push -u origin oneplus         










