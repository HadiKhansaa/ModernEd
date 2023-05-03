package application;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {


//    static HashMap<String,String> question1 = new HashMap<>();
    public static HashMap<String,String>[] questions = new HashMap[10];

    public static void setQuestions(String category) {

        if (category.equals("calculus")) {
            // Question 1
            questions[0] = new HashMap<String, String>();
            questions[0].put("question", "What is the limit of f(x) = x^2 + 3x + 2 as x approaches 2?");
            questions[0].put("answer1", "7");
            questions[0].put("answer2", "8");
            questions[0].put("answer3", "9");
            questions[0].put("answer4", "10");
            questions[0].put("correct", "8");

// Question 2
            questions[1] = new HashMap<String, String>();
            questions[1].put("question", "What is the derivative of f(x) = sin(x) - 2x?");
            questions[1].put("answer1", "cos(x) - 2");
            questions[1].put("answer2", "cos(x) - 1");
            questions[1].put("answer3", "sin(x) - 2");
            questions[1].put("answer4", "sin(x) - 1");
            questions[1].put("correct", "cos(x) - 2");

// Question 3
            questions[2] = new HashMap<String, String>();
            questions[2].put("question", "What is the integral of f(x) = 2x + 5?");
            questions[2].put("answer1", "x^2 + 5x + C");
            questions[2].put("answer2", "x^2 + 5");
            questions[2].put("answer3", "2x^2 + 5x + C");
            questions[2].put("answer4", "2x^2 + 5");
            questions[2].put("correct", "x^2 + 5x + C");

// Question 4
            questions[3] = new HashMap<String, String>();
            questions[3].put("question", "What is the slope of the tangent line to f(x) = x^3 + 2x - 1 at x = 2?");
            questions[3].put("answer1", "16");
            questions[3].put("answer2", "20");
            questions[3].put("answer3", "24");
            questions[3].put("answer4", "28");
            questions[3].put("correct", "28");

// Question 5
            questions[4] = new HashMap<String, String>();
            questions[4].put("question", "What is the second derivative of f(x) = 3x^2 - 5x + 1?");
            questions[4].put("answer1", "6x - 5");
            questions[4].put("answer2", "6x - 2");
            questions[4].put("answer3", "6x + 5");
            questions[4].put("answer4", "6x + 2");
            questions[4].put("correct", "6");

// Question 6
            questions[5] = new HashMap<String, String>();
            questions[5].put("question", "What is the equation of the line tangent to f(x) = ln(x) at x = 1?");
            questions[5].put("answer1", "y = 1");
            questions[5].put("answer2", "y = x - 1");
            questions[5].put("answer3", "y = x");
            questions[5].put("answer4", "y = x + 1");
            questions[5].put("correct", "y = x - 1");

//            questions[5] = new HashMap<String, String>();
//            questions[5].put("question", "What is the derivative of f(x) = x^2 + 3x - 5?");
//            questions[5].put("answer1", "2x");
//            questions[5].put("answer2", "2x + 3");
//            questions[5].put("answer3", "3x^2 + 2");
//            questions[5].put("answer4", "2x - 3");
//            questions[5].put("correct", "2x + 3");
// Question 7
            questions[6] = new HashMap<String, String>();
            questions[6].put("question", "What is the antiderivative of f(x) = 4x^3?");
            questions[6].put("answer1", "16x^2 + C");
            questions[6].put("answer2", "x^4 + C");
            questions[6].put("answer3", "3x^4 + C");
            questions[6].put("answer4", "x^3 + C");
            questions[6].put("correct", "x^4 + C");

// Question 8
            questions[7] = new HashMap<String, String>();
            questions[7].put("question", "What is the limit of f(x) = (x^2 - 1) / (x - 1) as x approaches 1?");
            questions[7].put("answer1", "0");
            questions[7].put("answer2", "1");
            questions[7].put("answer3", "2");
            questions[7].put("answer4", "undefined");
            questions[7].put("correct", "2");
// Question 9
            questions[8] = new HashMap<String, String>();
            questions[8].put("question", "What is the partial derivative of f(x,y) = x^2 + 2xy + y^2 with respect to x?");
            questions[8].put("answer1", "2x + y");
            questions[8].put("answer2", "2x");
            questions[8].put("answer3", "2y");
            questions[8].put("answer4", "2y + x");
            questions[8].put("correct", "2x + 2y");
// Question 10
            questions[9] = new HashMap<String, String>();
            questions[9].put("question", "What is the double integral of f(x,y) = x + y over the region bounded by y = x, y = x^2, x = 0, and x = 1?");
            questions[9].put("answer1", "3/4");
            questions[9].put("answer2", "1/2");
            questions[9].put("answer3", "1");
            questions[9].put("answer4", "3/2");
            questions[9].put("correct", "11/12");

            //////////////////////////////////////////////////////

        } else if (category.equals("trigonometry")) {


            questions[0] = new HashMap<String, String>();
            questions[0].put("question", "What is the definition of sine?");
            questions[0].put("answer1", "Opposite over adjacent");
            questions[0].put("answer2", "Adjacent over hypotenuse");
            questions[0].put("answer3", "Opposite over hypotenuse");
            questions[0].put("answer4", "Hypotenuse over adjacent");
            questions[0].put("correct", "Opposite over hypotenuse");

            questions[1] = new HashMap<String, String>();
            questions[1].put("question", "What is the definition of cosine?");
            questions[1].put("answer1", "Opposite over adjacent");
            questions[1].put("answer2", "Adjacent over hypotenuse");
            questions[1].put("answer3", "Opposite over hypotenuse");
            questions[1].put("answer4", "Hypotenuse over adjacent");
            questions[1].put("correct", "Adjacent over hypotenuse");

            questions[2] = new HashMap<String, String>();
            questions[2].put("question", "What is the definition of tangent?");
            questions[2].put("answer1", "Opposite over adjacent");
            questions[2].put("answer2", "Adjacent over hypotenuse");
            questions[2].put("answer3", "Opposite over hypotenuse");
            questions[2].put("answer4", "Hypotenuse over adjacent");
            questions[2].put("correct", "Opposite over adjacent");

            questions[3] = new HashMap<String, String>();
            questions[3].put("question", "What is the reciprocal of sine?");
            questions[3].put("answer1", "secant");
            questions[3].put("answer2", "cosecant");
            questions[3].put("answer3", "cotangent");
            questions[3].put("answer4", "tangent");
            questions[3].put("correct", "cosecant");

            questions[4] = new HashMap<String, String>();
            questions[4].put("question", "What is the reciprocal of cosine?");
            questions[4].put("answer1", "secant");
            questions[4].put("answer2", "cosecant");
            questions[4].put("answer3", "cotangent");
            questions[4].put("answer4", "tangent");
            questions[4].put("correct", "secant");

            questions[5] = new HashMap<String, String>();
            questions[5].put("question", "What is the reciprocal of tangent?");
            questions[5].put("answer1", "secant");
            questions[5].put("answer2", "cosecant");
            questions[5].put("answer3", "cotangent");
            questions[5].put("answer4", "tangent");
            questions[5].put("correct", "cotangent");

            questions[6] = new HashMap<String, String>();
            questions[6].put("question", "What is the Pythagorean theorem?");
            questions[6].put("answer1", "a^2 + b^2 = c^2");
            questions[6].put("answer2", "a^2 - b^2 = c^2");
            questions[6].put("answer3", "a^3 + b^3 = c^3");
            questions[6].put("answer4", "a^3 - b^3 = c^3");
            questions[6].put("correct", "a^2 + b^2 = c^2");

            questions[7] = new HashMap<String, String>();
            questions[7].put("question", "What is the derivative of sin(x)?");
            questions[7].put("answer1", "cos(x)");
            questions[7].put("answer2", "tan(x)");
            questions[7].put("answer3", "sec(x)");
            questions[7].put("answer4", "-cos(x)");
            questions[7].put("correct", "cos(x)");

            questions[8] = new HashMap<String, String>();
            questions[8].put("question", "What is the sum of sin(30°) and cos(60°)?");
            questions[8].put("answer1", "1/2");
            questions[8].put("answer2", "√3/2");
            questions[8].put("answer3", "1");
            questions[8].put("answer4", "2");
            questions[8].put("correct", "√2/2 + 1/2");

            questions[9] = new HashMap<String, String>();
            questions[9].put("question", "What is the amplitude of y = 4cos(2x) ?");
            questions[9].put("answer1", "2");
            questions[9].put("answer2", "4");
            questions[9].put("answer3", "1/2");
            questions[9].put("answer4", "1");
            questions[9].put("correct", "4");


        } else if (category.equals("grammar")) {
            questions[0] = new HashMap<String, String>();
            questions[0].put("question", "What is a noun in a sentence?");
            questions[0].put("answer1", "A person, place, thing, or idea.");
            questions[0].put("answer2", "A word that modifies a verb, adjective, or other adverb.");
            questions[0].put("answer3", "A word that shows the relationship between a noun or pronoun and other words in a sentence.");
            questions[0].put("answer4", "A word that connects words, phrases, or clauses.");
            questions[0].put("correct", "A person, place, thing, or idea.");

// Question 2
            questions[1] = new HashMap<String, String>();
            questions[1].put("question", "What is a verb in a sentence?");
            questions[1].put("answer1", "A person, place, thing, or idea.");
            questions[1].put("answer2", "A word that shows the relationship between a noun or pronoun and other words in a sentence.");
            questions[1].put("answer3", "A word that connects words, phrases, or clauses.");
            questions[1].put("answer4", "A word that expresses an action, occurrence, or state of being.");
            questions[1].put("correct", "A word that expresses an action, occurrence, or state of being.");

// Question 3
            questions[2] = new HashMap<String, String>();
            questions[2].put("question", "What is an adverb in a sentence?");
            questions[2].put("answer1", "A word that describes a noun or pronoun.");
            questions[2].put("answer2", "A word that modifies a verb, adjective, or other adverb.");
            questions[2].put("answer3", "A word that shows the relationship between a noun or pronoun and other words in a sentence.");
            questions[2].put("answer4", "A word that connects words, phrases, or clauses.");
            questions[2].put("correct", "A word that modifies a verb, adjective, or other adverb.");

// Question 4
            questions[3] = new HashMap<String, String>();
            questions[3].put("question", "What is an adjective in a sentence?");
            questions[3].put("answer1", "A word that modifies a verb, adjective, or other adverb.");
            questions[3].put("answer2", "A word that shows the relationship between a noun or pronoun and other words in a sentence.");
            questions[3].put("answer3", "A word that connects words, phrases, or clauses.");
            questions[3].put("answer4", "A word that describes a noun or pronoun.");
            questions[3].put("correct", "A word that describes a noun or pronoun.");

// Question 5
            questions[4] = new HashMap<String, String>();
            questions[4].put("question", "What is a subject in a sentence?");
            questions[4].put("answer1", "A word that describes a noun or pronoun.");
            questions[4].put("answer2", "A word that shows the relationship between a noun or pronoun and other words in a sentence.");
            questions[4].put("answer3", "The part of the sentence that performs the action or is being described.");
            questions[4].put("answer4", "A word that connects words, phrases, or clauses.");
            questions[4].put("correct", "The part of the sentence that performs the action or is being described.");

            // Question 6
            questions[5] = new HashMap<String, String>();
            questions[5].put("question", "What is an object in a sentence?");
            questions[5].put("answer1", "A word that describes a noun or pronoun.");
            questions[5].put("answer2", "The part of the sentence that performs the action or is being described.");
            questions[5].put("answer3", "A word that connects words, phrases, or clauses.");
            questions[5].put("answer4", "The person or thing that receives the action of the verb.");
            questions[5].put("correct", "The person or thing that receives the action of the verb.");

// Question 7
            questions[6] = new HashMap<String, String>();
            questions[6].put("question", "What is a conjunction in a sentence?");
            questions[6].put("answer1", "A word that connects words, phrases, or clauses.");
            questions[6].put("answer2", "A word that modifies a verb, adjective, or other adverb.");
            questions[6].put("answer3", "A word that shows the relationship between a noun or pronoun and other words in a sentence.");
            questions[6].put("answer4", "A word that expresses an action, occurrence, or state of being.");
            questions[6].put("correct", "A word that connects words, phrases, or clauses.");

// Question 8
            questions[7] = new HashMap<String, String>();
            questions[7].put("question", "What is a preposition in a sentence?");
            questions[7].put("answer1", "A word that describes a noun or pronoun.");
            questions[7].put("answer2", "A word that shows the relationship between a noun or pronoun and other words in a sentence.");
            questions[7].put("answer3", "A word that connects words, phrases, or clauses.");
            questions[7].put("answer4", "A word that modifies a verb, adjective, or other adverb.");
            questions[7].put("correct", "A word that shows the relationship between a noun or pronoun and other words in a sentence.");

// Question 9
            questions[8] = new HashMap<String, String>();
            questions[8].put("question", "What is a direct object in a sentence?");
            questions[8].put("answer1", "The person or thing that receives the action of the verb.");
            questions[8].put("answer2", "A word that describes a noun or pronoun.");
            questions[8].put("answer3", "The part of the sentence that performs the action or is being described.");
            questions[8].put("answer4", "A word that connects words, phrases, or clauses.");
            questions[8].put("correct", "The person or thing that receives the action of the verb.");

// Question 10
            questions[9] = new HashMap<String, String>();
            questions[9].put("question", "What is an indirect object in a sentence?");
            questions[9].put("answer1", "A word that describes a noun or pronoun.");
            questions[9].put("answer2", "The person or thing that receives the action of the verb.");
            questions[9].put("answer3", "The part of the sentence that performs the action or is being described.");
            questions[9].put("answer4", "A word that connects words, phrases, or clauses.");
            questions[9].put("correct", "The person or thing that receives the direct object of the verb.");

        }
        else if (category.equals("writing")) {
        	questions[0] = new HashMap<String, String>();
        	questions[0].put("question", "What is the definition of a metaphor?");
        	questions[0].put("answer1", "A figure of speech in which a word or phrase is applied to an object or action to which it is not literally applicable");
        	questions[0].put("answer2", "A figure of speech in which two unlike things are compared directly");
        	questions[0].put("answer3", "A figure of speech in which a word is used to represent something else");
        	questions[0].put("answer4", "A figure of speech in which one thing is described in terms of another");
        	questions[0].put("correct", "A figure of speech in which one thing is described in terms of another");

        	questions[1] = new HashMap<String, String>();
        	questions[1].put("question", "What is the purpose of a thesis statement?");
        	questions[1].put("answer1", "To summarize the main points of an essay");
        	questions[1].put("answer2", "To introduce the topic of an essay");
        	questions[1].put("answer3", "To provide evidence to support an argument");
        	questions[1].put("answer4", "To state the main idea or argument of an essay");
        	questions[1].put("correct", "To state the main idea or argument of an essay");

        	questions[2] = new HashMap<String, String>();
        	questions[2].put("question", "What is a run-on sentence?");
        	questions[2].put("answer1", "A sentence that is too short and lacks detail");
        	questions[2].put("answer2", "A sentence that contains a subject and a verb, but is missing a complete thought");
        	questions[2].put("answer3", "A sentence that contains multiple independent clauses without proper punctuation or conjunctions");
        	questions[2].put("answer4", "A sentence that is too long and difficult to read");
        	questions[2].put("correct", "A sentence that contains multiple independent clauses without proper punctuation or conjunctions");

        	questions[3] = new HashMap<String, String>();
        	questions[3].put("question", "What is the difference between active and passive voice?");
        	questions[3].put("answer1", "Active voice uses more descriptive words than passive voice");
        	questions[3].put("answer2", "Active voice is more direct and engaging, while passive voice is more distant and indirect");
        	questions[3].put("answer3", "Active voice is used for formal writing, while passive voice is used for informal writing");
        	questions[3].put("answer4", "Active voice is used for longer sentences, while passive voice is used for shorter sentences");
        	questions[3].put("correct", "Active voice is more direct and engaging, while passive voice is more distant and indirect");
        	
        	questions[4] = new HashMap<String, String>();
        	questions[4].put("question", "What is the difference between a metaphor and a simile?");
        	questions[4].put("answer1", "A metaphor compares two things directly, while a simile uses 'like' or 'as'");
        	questions[4].put("answer2", "A simile compares two things directly, while a metaphor uses 'like' or 'as'");
        	questions[4].put("answer3", "A metaphor compares two things indirectly, while a simile uses 'like' or 'as'");
        	questions[4].put("answer4", "A simile compares two things indirectly, while a metaphor uses 'like' or 'as'");
        	questions[4].put("correct", "A metaphor compares two things directly, while a simile uses 'like' or 'as'");
        	questions[5] = new HashMap<String, String>();
        	questions[5].put("question", "What is the difference between an adverb and an adjective?");
        	questions[5].put("answer1", "An adverb describes a noun, while an adjective describes a verb");
        	questions[5].put("answer2", "An adverb describes a verb, while an adjective describes a noun");
        	questions[5].put("answer3", "An adverb describes an adjective, while an adjective describes an adverb");
        	questions[5].put("answer4", "An adverb describes a noun, while an adjective describes an adjective");
        	questions[5].put("correct", "An adverb describes a verb, while an adjective describes a noun");
        	questions[6] = new HashMap<String, String>();
        	questions[6].put("question", "What is the difference between a dependent clause and an independent clause?");
        	questions[6].put("answer1", "A dependent clause can stand alone as a sentence, while an independent clause cannot");
        	questions[6].put("answer2", "An independent clause can stand alone as a sentence, while a dependent clause cannot");
        	questions[6].put("answer3", "A dependent clause is a complete sentence, while an independent clause is not");
        	questions[6].put("answer4", "An independent clause is a complete sentence, while a dependent clause is not");
        	questions[6].put("correct", "An independent clause can stand alone as a sentence, while a dependent clause cannot");
        	questions[7] = new HashMap<String, String>();
        	questions[7].put("question", "What is the purpose of a thesis statement in an essay?");
        	questions[7].put("answer1", "To provide background information on the topic");
        	questions[7].put("answer2", "To summarize the main points of the essay");
        	questions[7].put("answer3", "To introduce the essay topic and provide a roadmap for the reader");
        	questions[7].put("answer4", "To express the main idea or argument of the essay");
        	questions[7].put("correct", "To express the main idea or argument of the essay");
        	questions[8] = new HashMap<String, String>();
        	questions[8].put("question", "What is the purpose of a concluding paragraph in an essay?");
        	questions[8].put("answer1", "To introduce new information");
        	questions[8].put("answer2", "To restate the thesis statement");
        	questions[8].put("answer3", "To provide background information");
        	questions[8].put("answer4", "To present a counterargument");
        	questions[8].put("correct", "To restate the thesis statement");
        	
        	questions[9] = new HashMap<String, String>();
        	questions[9].put("question", "What is the difference between a metaphor and a simile?");
        	questions[9].put("answer1", "A metaphor is a comparison that doesn't use 'like' or 'as', while a simile does.");
        	questions[9].put("answer2", "A metaphor is a comparison that uses 'like' or 'as', while a simile does not.");
        	questions[9].put("answer3", "A metaphor is a type of animal, while a simile is a figure of speech.");
        	questions[9].put("answer4", "A metaphor is a type of figure of speech, while a simile is a type of animal.");
        	questions[9].put("correct", "A metaphor is a comparison that doesn't use 'like' or 'as', while a simile does.");
        
        
        }
        else if (category.equals("introToProgramming")) {

        	questions[0] = new HashMap<String, String>();
        	questions[0].put("question", "What is a programming language?");
        	questions[0].put("answer1", "A language spoken by computers");
        	questions[0].put("answer2", "A language spoken by programmers");
        	questions[0].put("answer3", "A language spoken by both programmers and computers");
        	questions[0].put("answer4", "None of the above");
        	questions[0].put("correct", "A language spoken by computers");

        	questions[1] = new HashMap<String, String>();
        	questions[1].put("question", "What is an algorithm?");
        	questions[1].put("answer1", "A program that runs on a computer");
        	questions[1].put("answer2", "A set of instructions for solving a problem");
        	questions[1].put("answer3", "A language used to communicate with computers");
        	questions[1].put("answer4", "None of the above");
        	questions[1].put("correct", "A set of instructions for solving a problem");

        	questions[2] = new HashMap<String, String>();
        	questions[2].put("question", "What is a variable?");
        	questions[2].put("answer1", "A type of data structure");
        	questions[2].put("answer2", "A value that can be changed");
        	questions[2].put("answer3", "A type of control structure");
        	questions[2].put("answer4", "A way to define new classes from existing classes");
        	questions[2].put("correct", "A value that can be changed");

        	questions[3] = new HashMap<String, String>();
        	questions[3].put("question", "What is a loop?");
        	questions[3].put("answer1", "A type of control structure");
        	questions[3].put("answer2", "A way to define new classes from existing classes");
        	questions[3].put("answer3", "A value that can be changed");
        	questions[3].put("answer4", "A program that runs on a computer");
        	questions[3].put("correct", "A type of control structure");

        	questions[4] = new HashMap<String, String>();
        	questions[4].put("question", "What is a function?");
        	questions[4].put("answer1", "A value that can be changed");
        	questions[4].put("answer2", "A type of control structure");
        	questions[4].put("answer3", "A set of instructions for solving a problem");
        	questions[4].put("answer4", "A way to define new classes from existing classes");
        	questions[4].put("correct", "A set of instructions for solving a problem");

        	questions[5] = new HashMap<String, String>();
        	questions[5].put("question", "What is an array?");
        	questions[5].put("answer1", "A type of data structure");
        	questions[5].put("answer2", "A way to define new classes from existing classes");
        	questions[5].put("answer3", "A set of instructions for solving a problem");
        	questions[5].put("answer4", "A value that can be changed");
        	questions[5].put("correct", "A type of data structure");

        	questions[6] = new HashMap<String, String>();
        	questions[6].put("question", "What is object-oriented programming?");
        	questions[6].put("answer1", "A programming paradigm that emphasizes functional programming");
        	questions[6].put("answer2", "A programming paradigm that emphasizes procedural programming");
        	questions[6].put("answer3", "A programming paradigm that emphasizes data structures");
        	questions[6].put("answer4", "A programming paradigm that emphasizes objects and their interactions");
        	questions[6].put("correct", "A programming paradigm that emphasizes objects and their interactions");

        	questions[7] = new HashMap<String, String>();
        	questions[7].put("question", "What is a class?");
        	questions[7].put("answer1", "A type of data structure");
        	questions[7].put("answer2", "A value that can be changed");
        	questions[7].put("answer3", "A way to define new functions from existing functions");
        	questions[7].put("answer4", "A way to define new objects from existing objects");
        	questions[7].put("correct", "A way to define new objects from existing objects");

        	questions[8] = new HashMap<String, String>();
        	questions[8].put("question", "What is debugging?");
        	questions[8].put("answer1", "The process of finding and fixing errors in a program");
        	questions[8].put("answer2", "The process of creating test cases for a program");
        	questions[8].put("answer3", "The process of improving the performance of a program");
        	questions[8].put("answer4", "The process of designing the architecture of a program");
        	questions[8].put("correct", "The process of finding and fixing errors in a program");

        	questions[9] = new HashMap<String, String>();
        	questions[9].put("question", "What is version control?");
        	questions[9].put("answer1", "The process of creating backups of a program");
        	questions[9].put("answer2", "The process of distributing a program to users");
        	questions[9].put("answer3", "The process of tracking changes to a program over time");
        	questions[9].put("answer4", "The process of testing a program before it is released");
        	questions[9].put("correct", "The process of tracking changes to a program over time");

        }
        else if(category.equals("oop")) {
        	questions[0] = new HashMap<String, String>();
        	questions[0].put("question", "What is an object in OOP?");
        	questions[0].put("answer1", "A type of control structure used in programming.");
        	questions[0].put("answer2", "A collection of related data and behavior.");
        	questions[0].put("answer3", "A way to create new classes from existing classes.");
        	questions[0].put("answer4", "A type of method that is used to initialize objects.");
        	questions[0].put("correct", "A collection of related data and behavior.");

        	questions[1] = new HashMap<String, String>();
        	questions[1].put("question", "What is inheritance in OOP?");
        	questions[1].put("answer1", "A way to create new objects from existing objects.");
        	questions[1].put("answer2", "A way to define new classes from existing classes.");
        	questions[1].put("answer3", "A way to store data and behavior in objects.");
        	questions[1].put("answer4", "A way to create new methods from existing methods.");
        	questions[1].put("correct", "A way to define new classes from existing classes.");

        	questions[2] = new HashMap<String, String>();
        	questions[2].put("question", "What is polymorphism in OOP?");
        	questions[2].put("answer1", "A way to create new objects from existing objects.");
        	questions[2].put("answer2", "A way to define new classes from existing classes.");
        	questions[2].put("answer3", "A way to store data and behavior in objects.");
        	questions[2].put("answer4", "A way to use a single interface to represent multiple types of objects.");
        	questions[2].put("correct", "A way to use a single interface to represent multiple types of objects.");

        	questions[3] = new HashMap<String, String>();
        	questions[3].put("question", "What is encapsulation in OOP?");
        	questions[3].put("answer1", "A way to create new objects from existing objects.");
        	questions[3].put("answer2", "A way to define new classes from existing classes.");
        	questions[3].put("answer3", "A way to store data and behavior in objects.");
        	questions[3].put("answer4", "A way to hide the implementation details of an object from the outside world.");
        	questions[3].put("correct", "A way to hide the implementation details of an object from the outside world.");

        	questions[4] = new HashMap<String, String>();
        	questions[4].put("question", "What is a constructor in OOP?");
        	questions[4].put("answer1", "A way to create new objects from existing objects.");
        	questions[4].put("answer2", "A way to define new classes from existing classes.");
        	questions[4].put("answer3", "A way to store data and behavior in objects.");
        	questions[4].put("answer4", "A special method that is used to initialize objects.");
        	questions[4].put("correct", "A special method that is used to initialize objects.");

        	questions[5] = new HashMap<String, String>();
        	questions[5].put("question", "What is a class in OOP?");
        	questions[5].put("answer1", "A collection of related data and behavior.");
        	questions[5].put("answer2", "A type of control structure used in programming.");
        	questions[5].put("answer3", "A way to create new objects from existing objects.");
        	questions[5].put("answer4", "A way to define new methods from existing methods.");
        	questions[5].put("correct", "A collection of related data and behavior.");

        	questions[6] = new HashMap<String, String>();
        	questions[6].put("question", "What is a method in OOP?");
        	questions[6].put("answer1", "A collection of related data and behavior.");
        	questions[6].put("answer2", "A type of control structure used in programming.");
        	questions[6].put("answer3", "A way to create new objects from existing objects.");
        	questions[6].put("answer4", "A block of code that performs a specific task.");
        	questions[6].put("correct", "A block of code that performs a specific task.");

        	questions[7] = new HashMap<String, String>();
        	questions[7].put("question", "What is a superclass in OOP?");
        	questions[7].put("answer1", "A way to create new objects from existing objects.");
        	questions[7].put("answer2", "A way to define new classes from existing classes.");
        	questions[7].put("answer3", "A class that is derived from another class.");
        	questions[7].put("answer4", "A class that is used to create new objects.");
        	questions[7].put("correct", "A class that is derived from another class.");

        	questions[8] = new HashMap<String, String>();
        	questions[8].put("question", "What is an interface in OOP?");
        	questions[8].put("answer1", "A way to define new classes from existing classes.");
        	questions[8].put("answer2", "A way to create new objects from existing objects.");
        	questions[8].put("answer3", "A way to store data and behavior in objects.");
        	questions[8].put("answer4", "A collection of abstract methods and constants.");
        	questions[8].put("correct", "A collection of abstract methods and constants.");

        	questions[9] = new HashMap<String, String>();
        	questions[9].put("question", "What is a static method in OOP?");
        	questions[9].put("answer1", "A method that can be called without creating an object of the class.");
        	questions[9].put("answer2", "A method that is used to initialize objects.");
        	questions[9].put("answer3", "A method that is used to create new objects.");
        	questions[9].put("answer4", "A method that is declared as final.");
        	questions[9].put("correct", "A method that can be called without creating an object of the class.");

        }

    }



}

