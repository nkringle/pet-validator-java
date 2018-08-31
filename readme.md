Pet Validator

We are building an application that will use cat and dog images.
 
 
 # Set Up
 
 ### Prerequisites:
 [Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 
 [Maven](https://www.baeldung.com/install-maven-on-windows-linux-mac)
 
 1. Clone this repository locally: `git clone ` or, download the source files as a zip and unzip them. 
 2. From your terminal (or IDE if it's built in), run `mvn clean install`
 3. You can use whatever IDE/text editor you feel comfortable with.
 4. To compile, `mvn compile`
 5. To run your tests, `mvn test`
 6. To start the app, `mvn start`
 
 We've included an HTTP Client to make REST easier, [Unirest](http://unirest.io/java.html)
 
 # Instructions
 
Get this repository cloned locally, dependencies installed, and run the tests. Starting out, one should pass and one should fail. 
 
 # Acceptance Criteria
 
### AC 1
 
*Given* We have API credentials

*When* We we use the get dog/cat picture API

*Then* We save the image file locally. 
 
 ### AC 2
 
*Given* We have pet images

*When* We analyze the objects in the images

*And* We only accept images with confidence levels greater than 70%

*Then* we report on the objects in the images

*And* We report on the frequency of the objects: Most common, least common, and their average confidence level.

 ### AC 3

*Given* We have pet images

*When* We analyze the descriptions in the images

*And* We only accept images with confidence levels greater than 70%

*Then* we report on the objects in the images

*And* We report on the frequency of the objects: Most common, least common, and their average confidence level.

 ### AC 4

*Given* We have pet images

*When* We analyze the descriptions in the images

*And* We only accept images with confidence levels greater than 70%

*Then* we report on the objects in the images

*And* We report on the frequency of the objects: Most common, least common, and their average confidence level.

 ### AC 5

*Given* We have pet images

*When* We analyze the objects in the images

*And* We only accept images with confidence levels greater than 70%

*And* We draw boxes around each of the identified objects

*Then* we store the new images locally.

 
 
 # APIs
 - [Cats](https://thecatapi.com/) | [Docs](https://documenter.getpostman.com/view/4016432/RWToRJCq#intro)
 - [Dogs](https://thedogapi.com/?image_id=r1xXEgcNX) | [Docs](https://documenter.getpostman.com/view/4016432/the-dog-api/RW81vZ4Z)
 - [Image Recognition](https://www.cloudmersive.com/image-recognition-and-processing-api) | [Docs](https://api.cloudmersive.com/docs/image.asp)
 
 # Readings you may be interested in later
- [Maven in 5 Steps](https://github.com/in28minutes/getting-started-in-5-steps/tree/master/maven-in-5-steps)
- [JUnit in 5 Steps](https://github.com/in28minutes/getting-started-in-5-steps/tree/master/junit-in-5-steps)
- [Mockito in 5 Steps](https://github.com/in28minutes/getting-started-in-5-steps/tree/master/mockito-in-5-steps)
- [SpringBoot in 10 Steps](https://github.com/in28minutes/getting-started-in-5-steps/tree/master/springboot-in-10-steps)
