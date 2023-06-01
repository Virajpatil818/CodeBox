#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
struct tree 
{
  
char data;
   
struct tree *left, *right;
 
};

int top = -1;

struct tree *stack[20];

struct tree *root1;

void
push (struct tree *root) 
{
  
top = top + 1;
  
stack[top] = root;

} 
struct tree *

pop (void) 
{
  
return (stack[top--]);

}


void
inorder (struct tree *root) 
{
  
if (root == NULL)
    
    {
      
return;
    
}
  
  else
    
    {
      
if (root != NULL)
	
	{
	  
inorder (root->left);
	
}
      
printf (" %c", root->data);
      
inorder (root->right);
    
}

}


void
inorderTraversal (struct tree *root) 
{
  
struct tree *stack[1000];
  
int top = -1;
  
struct tree *current = root;
  
while (current != NULL || top != -1)
    
    {
      
while (current != NULL)
	
	{
	  
stack[++top] = current;
	  
current = current->left;
	
}
      
current = stack[top--];
      
printf ("%c ", current->data);
      
current = current->right;
    
}

}


void
preorder (struct tree *root) 
{
  
if (root == NULL)
    
    {
      
return;
    
}
  
  else
    
    {
      
if (root != NULL)
	
	{
	  
printf (" %c", root->data);
	
}
      
inorder (root->left);
      
inorder (root->right);
    
}

}


void
preorderTraversal (struct tree *root) 
{
  
struct tree *stack[1000];
  
int top = -1;
  
struct tree *current = root;
  
while (current != NULL || top != -1)
    
    {
      
while (current != NULL)
	
	{
	  
printf ("%c ", current->data);
	  
stack[++top] = current;
	  
current = current->left;
	
}
      
current = stack[top--];
      
current = current->right;
    
}

}


void
postorder (struct tree *root) 
{
  
if (root == NULL)
    
    {
      
return;
    
}
  
  else
    
    {
      
if (root != NULL)
	
	{
	  
inorder (root->left);
	
}
      
inorder (root->right);
      
printf (" %c", root->data);
    
}

}


void
postorderTraversal (struct tree *root) 
{
  
struct tree *stack1[1000];
  
struct tree *stack2[1000];
  
int top1 = -1, top2 = -1;
  
struct tree *current = root;
  
stack1[++top1] = current;
  
while (top1 != -1)
    
    {
      
current = stack1[top1--];
      
stack2[++top2] = current;
      
if (current->left != NULL)
	
	{
	  
stack1[++top1] = current->left;
	
}
      
if (current->right != NULL)
	
	{
	  
stack1[++top1] = current->right;
	
}
    
}
  
while (top2 != -1)
    
    {
      
current = stack2[top2--];
      
printf ("%c ", current->data);
    
}

}


void
operand (char b) 
{
  
struct tree *root;
  
root = (struct tree *) malloc (sizeof (struct tree));
  
root->data = b;
  
root->left = NULL;
  
root->right = NULL;
  
push (root);

} 
void

operators (char a) 
{
  
struct tree *root;
  
root = (struct tree *) malloc (sizeof (struct tree));
  
root->data = a;
  
root->right = pop ();
  
root->left = pop ();
  
push (root);

} 
void

main () 
{
  
int i = 0;
  
char s[20];
  
printf ("Enter the expression in postfix form \n");
  
scanf ("%s", s);
  
while (s[i] != '\0')
    
    {
      
if (isalnum (s[i]))
	
	{
	  
operand (s[i]);
	
}
      
      else
	
	{
	  
operators (s[i]);
	
}
      
i++;
    
}
  
printf ("\nThe inorder traversal of the tree is \n");
  
inorder (stack[top]);
  
printf ("\n");
  
inorderTraversal (stack[top]);
  
printf ("\nThe preorder traversal of the tree is \n");
  
preorder (stack[top]);
  
printf ("\n");
  
preorderTraversal (stack[top]);
  
printf ("\nThe postorder traversal of the tree is \n");
  
postorder (stack[top]);
  
printf ("\n");
  
postorderTraversal (stack[top]);

}
