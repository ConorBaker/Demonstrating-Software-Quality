# Demonstrating-Software-Quality

## Scrum Sprint Backlog and Task Estimation 
<br>

### Sprint 1
|  Task	| Estimation 	|  Priority |
|-	|-	|-	|
| Write Tests for Criterion Java Class	|  1	| 1 	|
| Implement Criterion Class     	| 2 	|  4	|
| Write Tests for Rubric Java Class 	|  1	| 2 	|
| Implement Rubric Class	|  2	| 5 	|
| Write Tests for Student Java Class 	| 1 	| 3 	|
| Implement Student Class	|  2	|  6	|

<br>
Velocity = 9
<br>
<br>

### Sprint 2
|  Task	| Estimation 	|  Priority |
|-	|-	|-	|
| Create Skeleton Controller Class	|  1	|  1	|
| Write Tests for adding new Rubric and assigning Criterion	| 1 	| 2 	|
| Implement Rubric and Criterion Methods 	|  2	|  5	|
| Write Tests for creating a new Student and assigning Grades	|  1	| 3 	|
| Implement Student and Grades Methods 	|  2	|  6	|
| Write Tests for calculating Summary Calculations for Students	| 2 	| 4 	|
| Implement Summary Calculations Methods 	|  3	|  6	|

<br>
Velocity = 12
<br>
<br>

Each item was taken from the backlog and assessed briefly, a temporarily estimate was then assigned to the item. This estimate was then compared to others and final estimates were assigned. For example to compare the "Create Skeleton Controller Class" task and the "Implement Summary Calculations Methods" task in Sprint 2, these two have very different estimations. Creating the skeleton class will be quite straight forward to do so it has a low estimation, while the Summary Calculations will be more complex with math algorithms.

The velocity is looked at the end of each sprint to see the work competed in that sprint and to estimate the work that can be done in the next one.

<br> 
<br>

## Unit testing and Test-Driven development
<br>
Test Driven Development is a software development approach in which test cases are developed to specify and validate what the code will do. This means for each method that is made in the code a corresponding test is made for it. 

<br>
<br>

[Here](https://github.com/ConorBaker/Demonstrating-Software-Quality/commit/07788efa997ebc5917d5adc95e0004d48fd722c8 "Github Commit") you can see a commit that I made for the Criterion Class and Criterion Test Class. Each method inside of Criterion is tested inside in the test class.

<br>

## Test coverage metric
<br>
The coverage tool I chose to use for this project is JUnit. JUnit is very useful
as it shows exactly how much of your project has been covered with tests.

![](https://i.imgur.com/KhNzEKv.png)

Above you can see I have ran the JUnit tool on my code and it has shown that I have 100% coverage throughout all my classses.

![](https://i.imgur.com/Tt8P26O.png)
Above is an example of if the gaps were not clossed and Criterion had missing tests for its methods.

<br>

## Team Version Control
<br>
I ensured I followed the GitFlow Processes throughout my entire project which each bit of work getting its own suitable branch.
The branches i used were,

1. Main
2. Develop
3. Criterion
4. Rubric
5. Student
6. Summary_Calculations
7. Caller


## Code - Review Checklist
<br>

When code reviewing a pull request there are five main things that should be taken into consideration.

<br>

### Code Design
This is the review of how well a bit of code is designed. This is something only a human can do and ensures that the change list makes sense and that the code belongs where its been put.

<br>

### Test Coverage
This is the review of how much of the code has been covered with tests correctly. This is important as it makes sure that the code being added has been tested and works as intended.

<br>

### Readability
This is the review of how easy the code submitted is to understand. While the code might make sense to someone who has written it its important that others understand it too.

<br>

### Documentation
This is the review of how well code has been documented. Its important for code to documented as its written as this is far more accurate than trying to document it at a later date.

[Here](https://github.com/ConorBaker/Demonstrating-Software-Quality/commit/07788efa997ebc5917d5adc95e0004d48fd722c8#diff-32d49112ca8c65ad226a8128c3e567e8f354468efde24c10ed9dcb7980e2387c "Github Commit") you can see a commit that I code reviewed.
   


