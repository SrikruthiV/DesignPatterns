# DesignPatterns
ICA7

Facade Pattern : To compile and execute, the FacadePatternDemo should be used. The FacadePatternDemo class holds the main class. The class LayoutFacade has the objects of subclasses & calls all the methods using those objects. The subclasses WindowsPc, Tablet, MacOS has their own layout methods defined. In this Pattern, all the job is done just by calling the LayoutFacade method in the FacadePatternDemo main class but all the details are abstract for user.
