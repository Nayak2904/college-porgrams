#include<stdio.h>
#include<stdlib.h>

struct node {
    int item;
    struct node* left;
    struct node* right;
};

void inorderTrversal(struct node* root){
    if(root == NULL) return;
    inorderTrversal(root->left);
    printf("%d ->", root->item);
    inorderTrversal(root->right);
}
void preorderTrversal(struct node* root){
    if(root == NULL) return;
    printf("%d ->", root->item);  
    inorderTrversal(root->left);
    inorderTrversal(root->right);
}
void postorderTrversal(struct node* root){
    if(root == NULL) return;
    inorderTrversal(root->right);
    inorderTrversal(root->left);
    printf("%d ->", root->item);
}
struct node* createNode(int value){
    struct node* newNode = malloc(sizeof(struct node));
    newNode->item = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}
struct node* insertLeft(struct node* root, int value){
    root->left = createNode(value);
    return root->left;
}
struct node* insertRight(struct node* root, int value){
    root->right = createNode(value);
    return root->right;
}

int main(){
    struct node* root = createNode(1);
    insertLeft(root, 12);
    insertRight(root, 9);

    insertLeft(root->left, 5);
    insertRight(root->left, 6);

    printf("InorderTravesal\n");
    inorderTrversal(root);
    printf("\nPreorderTravesal\n");
    preorderTrversal(root);
    printf("\nPostrderTravesal\n");
    postorderTrversal(root);
    return 0;
}