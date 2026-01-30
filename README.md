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


##ADDING CODES TO FILE NAME ONE PLUS 
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


##making a branch name vivo and add codes to it 

>>>MOVE INTO GITHUB REPOSITORY 
>>>cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes\Codes-"

>>>CREATE A NEW BRANCH NAMED VIVO 
git checkout -b vivo

>>>COPY FILES INTO REPO AND ADD ALL FILES AT ONCE
cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes"
Copy-Item -Path "largestcalculator.java","evenodd.java","fibonacci.java","inputnumber.java","largest3no.java","largestnumber.java" -Destination "Codes-\" -Force
gir add.

>>>COMMIT ALL FILES AT ONCE
git commit -m "Add largest calculator, evenodd, fibonacci, input number, largest3no, largestnumber"

>>>PUSH BRANCH TO GITHUB
git push -u origin vivo


##make a branch name lava and code to it 

>>>cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes\Codes-"

>>>git checkout -b lava

>>>cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes"
   Copy-Item -Path       "LargestCalculator.java","evenodd.java","fibonacci.java","inputnumber.java","largest3no.java","largestnumber.java" -Destination "Codes-\" -Force

>>>git add .
>>>git commit -m "Add LargestCalculator, evenodd, fibonacci, inputnumber, largest3no, largestnumber"

>>>git push -u origin lava

##make branch name apple and add code to it 

>>>cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes\Codes-"

>>>git checkout -b apple
>>>cd "C:\Users\bhanu\OneDrive\Desktop\Java Codes"
>>>Copy-Item -Path "BinarySearch.java","armstrongnumber.java","casecheck.java","conditioning.java","demo.java" -Destination "Codes-\" -Force

>>>git add .
>>>git commit -m "Add BinarySearch, armstrongnumber, casecheck, conditioning, demo"

>>>git push -u origin apple


##COMMAND TO PUSH ANY CODE FROM FOLDER IN GITHUB BRANCH INSIDE A PARTICULAR FOLDER 
cd..                                                        // this backs us to desktop 
git clone https://github.com/Techfixer2608/Codes-.git      // this clone the repository 
cd Codes-                                                 // Codes is my repository name 
git checkout apple                           // switch to branch name apple inside Codes- folder
copy "..\Java Codes\Primenumber.java" .                 // copy file from java codes folder 
git add Primenumber.java                               // add codes named Primenumber
git commit -m "Added Primenumber Java file"           // commit
git add Primenumber.java                             // push

























