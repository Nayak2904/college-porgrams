#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    int value;
    struct node *next;
};
void print(struct node *p)
{
    while (p != NULL)
    {
        printf("%d", p->value);
        p = p->next;
    }
}

void main()
{
    struct node *head;
    struct node *one = NULL;
    struct node *two = NULL;
    struct node *three = NULL;

    one = malloc(sizeof(struct node));
    two = malloc(sizeof(struct node));
    three = malloc(sizeof(struct node));

    one->data = 1;
    two->data = 2;
    three->data = 3;

    one->next = two;
    two->next = three;
    three->next = NULL;

    head = one;
    printf("head");
}