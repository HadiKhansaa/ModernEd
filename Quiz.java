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

        } else if (category.equals("Trigo")) {


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

    }



}

