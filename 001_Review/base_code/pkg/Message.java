package pkg;
import java.util.*;
import java.io.*;

public class Message {
	String author;
	String subject;
	String body;
	int i;
	ArrayList <Message> childList = new ArrayList<Message>;
	// Default Constructor
	public Message() {
		author = "";
		subject = "";
		body = "";
		i = 0;
	}
	
	// Parameterized Constructor
	public Message(String auth, String subj, String bod, int i) {
		author = auth;
		subject = subj;
		body = bod;
		this.i = i;
	}
	// print message and then recursively do the replies


	// This function is responsbile for printing the Message
	// (whether Topic or Reply), and all of the Message's "subtree" recursively:

	// After printing the Message with indentation n and appropriate format (see output details),
	// it will invoke itself recursively on all of the Replies inside its childList, 
	// incrementing the indentation value at each new level.

	// Note: Each indentation increment represents 2 spaces. e.g. if indentation ==  1, the reply should be indented 2 spaces, 
	// if it's 2, indent by 4 spaces, etc. 
	public void print(int indentation){
		System.out.println("--------------------------------------------");
		System.out.println("Message #" + i + ": " + "\"" + subject + "\"");
		System.out.println("From " + author + ": " + "\"" + body + "\"");
		while(){
			childList.get(indentation).print(indentation+1);

			if()
		}



		System.out.println("--------------------------------------------");
	}

	// Default function for inheritance
	public boolean isReply(){
		if(this instanceof Reply){
			return true;
		}
		return false;
	}

	// Returns the subject String
	public String getSubject(){
		return subject;
	} 

	// Returns the ID
	public int getId(){
		return i;
	}

	// Adds a child pointer to the parent's childList.
	public void addChild(Message child){
		
	}

}
