# DesignPatterns
ICA7

Link to Github Repository : https://github.com/SrikruthiV/DesignPatterns

Facade Pattern : To compile and execute, the FacadePatternDemo should be used. The FacadePatternDemo class holds the main class. The class LayoutFacade has the objects of subclasses & calls all the methods using those objects. The subclasses WindowsPc, Tablet, MacOS has their own layout methods defined. In this Pattern, all the job is done just by calling the LayoutFacade method in the FacadePatternDemo main class but all the details are abstract for user.

Builder Pattern : To compile and execute, the SyllabusBuilderPattern.java should be executed. Import all the java fies in the Builder JavaCode zip file into a folder. In the command line go to that folder location and compile the SyllabusBuilderPattern.java file. The SyllabusBuilder class will be automatically compiled since it is instantiated by SyllabusBuilderPattern class and SyllabusBuilder class instanciates the Syllabus class. Thus execution of SyllabusBuilderPatten.java is enough for the syllabus creation.Go to the folder location in command line and command "Javac SyllabusBuilderPattern.java" will compile the java code and command "Java SyllabusBuilderPattern" will run the java program.

Adapter Pattern : Adapter Class is used to execute the code. The Adapter class consists the instances of Canvas and Moodle classes. The Adapter class is working as bridge between Canvas and Moodle classes. The Adapter class consists of CanvasAdapter and MoodleAdapter functions that assign the APIs to the corresponding Canvas and Moodle objects. It will assign the APIs and return the Canvas and Moodle learning management systems.  

Decorator Pattern: Decoraor Pattern will execute, By running decoratorPatternDemo.java file. We  have to import all java files in the java zip code for the execution of the pattern. Go to the folder location in command line and command "Javac decoratorPatternDemo.java" will compile the java code and command "Java decoratorPatternDemo" will run the java program.
