#include <stdio.h>
int main()
{
    int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
    int searchelement = 1;
    int start = 0;
    int end = sizeof(a) / sizeof(a[0]) - 1;
    int mid;

    // for(int i=0; i<end; i++){}
    while (start <= end)
    {
        mid = (start + end) / 2;
        if (a[mid] == searchelement)
        {
            printf("Element %d found in index %d\n", searchelement, mid);
            break;
        }
        else if (a[mid] < searchelement)
        {
            start = mid + 1;
        }
        else
        {
            end = mid + 1;
        }
    }
    printf("Element %d found in index %d\n", searchelement, mid);

    return 0;
}
