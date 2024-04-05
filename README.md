 Assignment 1 

 

Name: sohan seeth 

Student number: st10452402 

Subject: Introduction to mobile application development 

 

 

 

 

 

 

 

 

 

 

 

ESSAY  

 

Assignment 1 task was to create an application that could display information based on the input of the user. The task was to have a user select an age that brings up a famous person who had passed away in that age bracket. 

I had started with my design first which when I was introduced to the topic had an idea of an old theme, something classic with historical feeling to it. The idea is of a wooden table with an old scroll on it which the user would have the information appear on. I started with an “image view" and used the image below, a basic wood-textured image to have outer things except the text ly on. 

 

I used this image as a background for the buttons which complemented it as I changed their colour to blend in but not disappear allowing them to somewhat complement each other, make the user feel they were pressing a hidden button on a wooden table. The second “imageview”  was added as a background for the “edittext” and both “textviews”. The scroll image was chosen for its historical theme and feel, scrolls used a long time ago to write on and transfer messages to people as it was easier to transport . The scroll image background colours tainted white complemented the applications design and helped direct it into a direction. 

 

 

 

 

  

The first “textview” was used to provide information to the user and was put at the top of the screen as it would be the first thing you would see; the choice was made to help the application be as user friendly as possible so the user would not be lost or have a difficult time using the application. Directly next to it I had placed an “edittext” this would be used as an input section, using the directions presented the user would enter in an age ranging from 20-100 in the “edittext”. Below those 2 blocks placed I had placed a secondary “textview “, to the user there would be an empty space in the middle of the screen but once there was an input the empty space will be filled with one of many outputs I had coded.  

Below all this on the wooden background I had placed two buttons, one to accept the users input which states on the button "continue” and the second button states “clear” which purpose is to clear any text from the screen beside the directions in the top left. I changed the font to (Akaya Telivigala) have a more historical characteristic and blend into the background of the scroll image. Many of the decisions made was to make the design very user friendly and have that historical old school theme I was hoping to achieve, many errors occurred with the design in colours and layout which caused me you change a code in the themes file to: 

(<resources xmlns:tools="http://schemas.android.com/tools"> 

    <!-- Base application theme. --> 

    <style name="Base.Theme.Project1Final" parent="Theme.Material3.DayNight.NoActionBar"> 

        <!-- Customize your light theme here. --> 

        <!-- <item name="colorPrimary">@color/my_light_primary</item> --> 

    </style> 

  

    <style name="Theme.Project1Final" parent="Theme.Design.NoActionBar" /> 

</resources>) 

"Theme.Design.NoActionBar" this line was added to darken the background and remove the space around components. 

 

The coding itself was tedious and many drafts did not compute, I had settled on using the “if else statement”  

The code below helped implement the continue button:  

   conbtn1.setOnClickListener { 

            val age = agein1.text.toString().toIntOrNull() 

            if (age != null && age in 20..100) { 

                val output1 = customOutput(age) 

                dcrinfo.text = output1 

            }else{ 

                dcrinfo.text = "please enter a valid age which range from 20-100" 

 

Aswell as I had added a clear button which used:  

  crbtn2.setOnClickListener { 

            agein1.text.clear() 

            dcrinfo.text = "" 

 

This activates its and clears both the edittext and textview in the code I had created. Many famous historical figures were used in the code as an output form the user's first input. These figures are listed below in order of age of death: 

1 - Sophie Scholl 

2 - Henry Gwyn Jeffreys Moseley 

3 - Wolfgang Amadeus Mozart 

4 - Vincent Willem van Gogh 

5 - Francis Scott Fitzgerald 

6 - Alfred Wegener 

7 - William Shakespeare 

8 - Ludwig van Beethoven 

9 - Prince Rogers Nelson 

10 - Leonardo di ser Piero da Vinci 

11 - Charles Robert Darwin 

12 - Albert Einstein 

13 - Thomas Alva Edison 

14 - Nikola Tesla 

15 - Pablo Ruiz Picasso 

16 - Dave Bartholomew 

 

The figures that were chosen for their famous status and influence in their field of work are considered as role models and inspiration for many aspiring individuals. Their contributions and achievements have affected their respective fields and created a path for future generations to follow.   

Apart from Android Studio and how it allows us to create this code is GitHub, a coding community which shares patents, and ideas and helps to d and solve code. In our case, it is used for educators to view the work of students and help grade or teach via the GitHub infrastructure. To use GitHub, you must first have an account, create a student or student account with the name being your student number or formal work associated name. Once that has been done you will need to open up Android Studio and select from the drop-down menu VCS and then share that project to GitHub. Once that has been done you can open the GitHub application and login. You will see your project in your files, by clicking the project and opening it in a browser you will find a link which can then be sent to a teacher for projects or help.  

 

This project allowed for a creative take on designing the basic app and a variety of options, giving us free rein of design on the code and how to implement it. As well as introducing us to  GitHub a very useful Sofware for all many coding students.

video - https://eur03.safelinks.protection.outlook.com/?url=https%3A%2F%2Fyoutu.be%2F7pdbmefP2MI%3Fsi%3DiVkeU6R2RrUWqC8K&data=05%7C02%7CST10452402%40vcconnect.edu.za%7C61b5f61740d84ef3280508dc55a7e407%7Ce10c8f44f469448fbc0dd781288ff01b%7C0%7C0%7C638479426809713629%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C0%7C%7C%7C&sdata=oiZhhCDai8wUbSfxQV7UTe1zRR18%2B%2FqxoyoWV72ZxUs%3D&reserved=0
